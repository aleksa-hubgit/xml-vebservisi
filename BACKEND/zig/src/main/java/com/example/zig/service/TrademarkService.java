package com.example.zig.service;

import com.example.zig.dto.DecisionDTO;
import com.example.zig.dto.ReportDTO;
import com.example.zig.dto.TLiceDTO;
import com.example.zig.dto.TrademarkRequestDTO;
import com.example.zig.model.*;
import com.example.zig.model.decision.Decision;
import com.example.zig.repository.ZigRepository;
import com.example.zig.util.MarshallingUtils;
import com.example.zig.util.PdfTransformer;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Node;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Stream;

@Service
public class TrademarkService {


    @Autowired
    private ZigRepository zigRepository;



    public void createDocuments(String id) throws IOException, DocumentException {
        Node zig = zigRepository.getNode(id + ".xml");
        PdfTransformer pdfTransformer = new PdfTransformer();
        pdfTransformer.generateHTML(zig, id);
        pdfTransformer.generatePDF(id);
    }

    public void createRequest(TrademarkRequestDTO request) throws JAXBException, XMLDBException {
        Prijava prijava = this.createRequestFromDTO(request);
        this.save(prijava);

    }

    private void save(Prijava prijava) throws JAXBException, XMLDBException {
        MarshallingUtils marshallingUtils = new MarshallingUtils();
        OutputStream os = marshallingUtils.marshall(prijava);
        String id = generateNextId();
        zigRepository.save(os, id);
    }

    private String generateNextId() {
        return String.valueOf(zigRepository.getAll().size() + 1);

    }

    private Prijava createRequestFromDTO(TrademarkRequestDTO request) {
        Prijava prijava = new Prijava();
        Prijava.InformacijaZavoda informacijaZavoda = new Prijava.InformacijaZavoda();
        String id = generateNextId();
        informacijaZavoda.setBrojPrijave(id);
        Date date = new Date();
        XMLGregorianCalendar gregorianDate = createGregorianDate(date);
        informacijaZavoda.setDatumPodnosenja(gregorianDate);
        informacijaZavoda.setPrilozi(new TPrilozi(request.getPrilozi()));
        prijava.setInformacijeOZigu(new Prijava.InformacijeOZigu(request.getInformacijeOZigu()));
        prijava.setInformacijaZavoda(informacijaZavoda);
        prijava.setPravoPrvenstva(new Prijava.PravoPrvenstva(request.getPravoPrvenstva()));
        prijava.setTakse(new Prijava.Takse(request.getTakse()));

        prijava.setPunomocnik(createTLice(request.getPunomocnik()));
        prijava.setPodnosilacPrijave(createTLice(request.getPodnosilacPrijave()));
        prijava.setZajednickiPredstavnik(createTLice(request.getZajednickiPredstavnik()));

        return prijava;

    }



    private TLice createTLice(TLiceDTO zajednickiPredstavnik) {
        TAdresa adresa = new TAdresa(zajednickiPredstavnik.getAdresa());
        TKontaktInformacije kontaktInformacije = new TKontaktInformacije(zajednickiPredstavnik.getKontakt());
        if (zajednickiPredstavnik.getNaziv().equals("")){
            TFizickoLice lice = new TFizickoLice();
            lice.setIme(zajednickiPredstavnik.getIme());
            lice.setPrezime(zajednickiPredstavnik.getPrezime());
            lice.setAdresa(adresa);
            lice.setKontakt(kontaktInformacije);
            return lice;

        }
        else{
            TPravnoLice lice = new TPravnoLice();
            lice.setNaziv(zajednickiPredstavnik.getNaziv());
            lice.setAdresa(adresa);
            lice.setKontakt(kontaktInformacije);
            return lice;
        }
    }

    private XMLGregorianCalendar createGregorianDate(Date date) {
        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);

        try {
            xmlDate = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(gc);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return xmlDate;

    }

    public List<Prijava> getAll() {
        List<Prijava> prijavas = zigRepository.getAll();

        return prijavas;

    }

    public void createDecision(DecisionDTO decisionDTO) throws DatatypeConfigurationException, JAXBException, XMLDBException {
        Decision decision = new Decision();
        decision.setSifraZahteva(decisionDTO.requestId);
        decision.setOdobren(decisionDTO.approved);
        decision.setObrazlozenje(decisionDTO.reason);

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        XMLGregorianCalendar xCal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(cal);
        decision.setDatumRazresenja(xCal);
        this.save(decision);
    }

    private void save(Decision decision) throws JAXBException, XMLDBException {
        MarshallingUtils marshallingUtils = new MarshallingUtils();
        OutputStream os = marshallingUtils.marshall(decision);
        zigRepository.saveDecision(os,decision.getSifraZahteva());
    }

    public List<Prijava> getAllApproved() {
        List<Prijava> allRequests = zigRepository.getAll();
        List<Prijava> answeredRequests = new ArrayList<>();
        List<Decision> allDecisions = zigRepository.getAllDecisions();
        List<String> answeredRequestsIds = new ArrayList<>();

        for (Decision decision:allDecisions){
            answeredRequestsIds.add(decision.getSifraZahteva());
        }
        for (Prijava prijava:allRequests){
            String brojPrijave = prijava.getInformacijaZavoda().getBrojPrijave();
            if(answeredRequestsIds.contains(brojPrijave)){
                for (Decision decision:allDecisions){
                    if(decision.getSifraZahteva().equals(brojPrijave) && decision.isOdobren()){
                        answeredRequests.add(prijava);
                    }
                }
            }
        }
        return answeredRequests;
    }

    public List<Prijava> getAllUnanswered() {
        List<Prijava> allRequests = zigRepository.getAll();
        List<Prijava> unansweredRequests = new ArrayList<>();
        List<Decision> allDecisions = zigRepository.getAllDecisions();
        List<String> answeredRequestsIds = new ArrayList<>();

        for (Decision decision:allDecisions){
            answeredRequestsIds.add(decision.getSifraZahteva());
        }
        for (Prijava prijava:allRequests){
            if(!answeredRequestsIds.contains(prijava.getInformacijaZavoda().getBrojPrijave())){
                unansweredRequests.add(prijava);
            }
        }
        return unansweredRequests;

    }

    public Prijava getOneById(String id) {
        return zigRepository.getOneById(id);
    }


    public void generateReport(ReportDTO reportDTO) throws FileNotFoundException, DocumentException {
        String[] datum_delovi = reportDTO.startDate.split("-");
        GregorianCalendar gc = new GregorianCalendar(Integer.parseInt(datum_delovi[0]), Integer.parseInt(datum_delovi[1]),Integer.parseInt(datum_delovi[2]));
        XMLGregorianCalendar startDate = getDateXML(gc.getTime());

        datum_delovi = reportDTO.endDate.split("-");
        GregorianCalendar gc2 = new GregorianCalendar(Integer.parseInt(datum_delovi[0]), Integer.parseInt(datum_delovi[1]),Integer.parseInt(datum_delovi[2]));
        XMLGregorianCalendar endDate = getDateXML(gc2.getTime());


        List<Prijava> allRequests = zigRepository.getAll();
        List<Decision> allDecisions = zigRepository.getAllDecisions();


        int numberOfRequests = 0;
        int numberOfApproved = 0;
        int numberOfRejected = 0;
        for (Prijava request:allRequests){
            if(startDate.compare(request.getInformacijaZavoda().getDatumPodnosenja()) == DatatypeConstants.LESSER){
                if(endDate.compare(request.getInformacijaZavoda().getDatumPodnosenja()) == DatatypeConstants.GREATER){
                    numberOfRequests++;
                }
            }
        }

        for (Decision decision:allDecisions){
            if(startDate.compare(decision.getDatumRazresenja()) == DatatypeConstants.LESSER){
                if(endDate.compare(decision.getDatumRazresenja()) == DatatypeConstants.GREATER){
                    if(decision.isOdobren()){
                        numberOfApproved++;
                    }
                    else{
                        numberOfRejected++;
                    }
                }
            }
        }


        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("gen/izvestaj.pdf"));
        document.open();
        Font font = FontFactory.getFont(FontFactory.TIMES_BOLD, 20, BaseColor.BLACK);
        Chunk chunk = new Chunk("IZVESTAJ U PERIODU OD " + reportDTO.startDate + " DO " + reportDTO.endDate, font);
        document.add(chunk);
        document.add(new Paragraph("\n\n"));

        PdfPTable table = new PdfPTable(3);
        addTableHeader(table);
        table.addCell(String.valueOf(numberOfRequests));
        table.addCell(String.valueOf(numberOfApproved));
        table.addCell(String.valueOf(numberOfRejected));
        document.add(table);
        document.close();
    }


    private void addTableHeader(PdfPTable table) {
        Stream.of("Podneti zahtevi", "Prihvaceni zahtevi", "Odbijeni zahtevi")
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.GREEN);
                    header.setBorderWidth(1);
                    header.setPhrase(new Phrase(columnTitle));
                    table.addCell(header);
                });
    }
    private XMLGregorianCalendar getDateXML(Date datum) {
        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(datum);

        try {
            xmlDate = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(gc);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return xmlDate;
    }
}
