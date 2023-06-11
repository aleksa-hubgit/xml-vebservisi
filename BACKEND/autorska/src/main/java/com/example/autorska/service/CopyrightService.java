package com.example.autorska.service;


import com.example.autorska.dto.CopyrightRequestDTO;
import com.example.autorska.dto.DecisionDTO;
import com.example.autorska.dto.ReportDTO;
import com.example.autorska.dto.TLiceDTO;
import com.example.autorska.model.*;
import com.example.autorska.model.decision.Decision;
import com.example.autorska.repository.AutorskaRepository;
import com.example.autorska.util.MarshallingUtils;
import com.example.autorska.util.PdfTransformer;
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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Stream;

@Service
public class CopyrightService {



    @Autowired
    private AutorskaRepository autorskaRepository;
    public void createRequest(CopyrightRequestDTO request) throws JAXBException, XMLDBException, DatatypeConfigurationException {
        Autorska autorska = this.createRequestFromDTO(request);
        this.save(autorska);
    }

    private void save(Autorska autorska) throws JAXBException, XMLDBException {
        MarshallingUtils marshallingUtils = new MarshallingUtils();
        OutputStream os = marshallingUtils.marshall(autorska);
        String id = generateNextId();

        autorskaRepository.save(os, id);
    }

    private String generateNextId() {
        return String.valueOf(autorskaRepository.getAll().size() + 1);

    }

    private Autorska createRequestFromDTO(CopyrightRequestDTO request) throws DatatypeConfigurationException {
        Autorska autorska = new Autorska();
        autorska.setPseudonim(request.getPseudonim());
        autorska.setVrstaDela(request.getVrstaDela());
        autorska.setNamenaDela(request.getNamenaDela());
        autorska.setPotpis(request.getPotpis());
        autorska.setRadnomOdnosu(request.isRadnomOdnosu());
        autorska.setPodaciONaslovu(new Autorska.PodaciONaslovu(request.getPodaciONaslovu()));
        autorska.setPodaciOPreradi(new Autorska.PodaciOPreradi(request.getPodaciOPreradi()));




        autorska.setPodaciOAutorima(new Autorska.PodaciOAutorima(request.getPodaciOAutorima()));
        autorska.addAutor(request.getPodaciOAutorima().autor);

        autorska.setPunomocnik(createTLice(request.getPunomocnik()));
        autorska.setPodnosilacPrijave(createTLice(request.getPodnosilacPrijave()));


        String id = generateNextId();

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());

        XMLGregorianCalendar xCal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(cal);

        autorska.setDetaljiPrijave(new Autorska.TDetaljiPrijave(id, xCal));


        return autorska;
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
        autorskaRepository.saveDecision(os,decision.getSifraZahteva());
    }

    public List<Autorska> getAll() {
        List<Autorska> prijavas = autorskaRepository.getAll();

        return prijavas;
    }

    public Autorska getOneById(String id) {
        return autorskaRepository.getOneById(id);

    }

    public List<Autorska> getAllApproved() {
        List<Autorska> allRequests = autorskaRepository.getAll();
        List<Autorska> answeredRequests = new ArrayList<>();
        List<Decision> allDecisions = autorskaRepository.getAllDecisions();
        List<String> answeredRequestsIds = new ArrayList<>();

        for (Decision decision:allDecisions){
            answeredRequestsIds.add(decision.getSifraZahteva());
        }
        for (Autorska prijava:allRequests){
            String brojPrijave = prijava.getDetaljiPrijave().getBrojPrijave();
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

    public List<Autorska> getAllUnanswered() {
        List<Autorska> allRequests = autorskaRepository.getAll();
        List<Autorska> unansweredRequests = new ArrayList<>();
        List<Decision> allDecisions = autorskaRepository.getAllDecisions();
        List<String> answeredRequestsIds = new ArrayList<>();

        for (Decision decision:allDecisions){
            answeredRequestsIds.add(decision.getSifraZahteva());
        }
        for (Autorska prijava:allRequests){
            if(!answeredRequestsIds.contains(prijava.getDetaljiPrijave().getBrojPrijave())){
                unansweredRequests.add(prijava);
            }
        }
        return unansweredRequests;
    }

    public void createDocuments(String id) throws IOException, DocumentException {


        Node zig = autorskaRepository.getNode(id + ".xml");
        PdfTransformer pdfTransformer = new PdfTransformer();
        pdfTransformer.generateHTML(zig, id);
        pdfTransformer.generatePDF(id);
    }

    public void generateReport(ReportDTO reportDTO) throws FileNotFoundException, DocumentException {
        String[] datum_delovi = reportDTO.startDate.split("-");
        GregorianCalendar gc = new GregorianCalendar(Integer.parseInt(datum_delovi[0]), Integer.parseInt(datum_delovi[1]),Integer.parseInt(datum_delovi[2]));
        XMLGregorianCalendar startDate = getDateXML(gc.getTime());

        datum_delovi = reportDTO.endDate.split("-");
        GregorianCalendar gc2 = new GregorianCalendar(Integer.parseInt(datum_delovi[0]), Integer.parseInt(datum_delovi[1]),Integer.parseInt(datum_delovi[2]));
        XMLGregorianCalendar endDate = getDateXML(gc2.getTime());


        List<Autorska> allRequests = autorskaRepository.getAll();
        List<Decision> allDecisions = autorskaRepository.getAllDecisions();


        int numberOfRequests = 0;
        int numberOfApproved = 0;
        int numberOfRejected = 0;
        for (Autorska request:allRequests){
            if(startDate.compare(request.getDetaljiPrijave().getDatumPodnosenja()) == DatatypeConstants.LESSER){
                if(endDate.compare(request.getDetaljiPrijave().getDatumPodnosenja()) == DatatypeConstants.GREATER){
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
