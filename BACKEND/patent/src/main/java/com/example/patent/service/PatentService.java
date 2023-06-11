package com.example.patent.service;


import com.example.patent.dto.DecisionDTO;
import com.example.patent.dto.PatentRequestDTO;
import com.example.patent.dto.ReportDTO;
import com.example.patent.dto.TLiceDTO;
import com.example.patent.model.*;
import com.example.patent.model.decision.Decision;
import com.example.patent.repository.PatentRepository;
import com.example.patent.util.MarshallingUtils;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Stream;

@Service
public class PatentService {

    @Autowired
    private PatentRepository patentRepository;
    public void createRequest(PatentRequestDTO request) throws DatatypeConfigurationException, JAXBException, XMLDBException {

        Prijava prijava = this.createRequestFromDTO(request);

        this.save(prijava);
    }

    private void save(Prijava prijava) throws XMLDBException, JAXBException {

        MarshallingUtils marshallingUtils = new MarshallingUtils();
        OutputStream os = marshallingUtils.marshall(prijava);
        String id = generateNextId();

        patentRepository.save(os, id);
    }

    private void save(Decision decision) throws JAXBException, XMLDBException {
        MarshallingUtils marshallingUtils = new MarshallingUtils();
        OutputStream os = marshallingUtils.marshall(decision);
        patentRepository.saveDecision(os,decision.getSifraZahteva());
    }

    public  String generateNextId() {
        return String.valueOf(patentRepository.getAll().size() + 1);

    }

    private Prijava createRequestFromDTO(PatentRequestDTO request) throws DatatypeConfigurationException {
        Prijava prijava = new Prijava();
        prijava.setDetaljiPrijave(getDetaljiPrijavePatent());
        TZahtev zahtev = new TZahtev();
        zahtev.setDodatniPodaci(request.isDodatniPodaci());
        zahtev.setNazivPronalaska(new TNazivPronalaska(request.getNazivPronalaska()));
        zahtev.setPodnosilacPrijave(this.createTLice(request.getPodnosilacPrijave()));
        zahtev.setPronalazac(this.createTLice(request.getPronalazac()));
        zahtev.setPunomocnik(this.createTLice(request.getPunomocnik()));
        zahtev.setAdresaZaDostavljanje(new TAdresa(request.getAdresaZaDostavljanje()));
        zahtev.setNacinDostavljanja(new TZahtev.NacinDostavljanja(request.getNacinDostavljanja()));
        zahtev.setTipPrijave(request.getTipPrijave());
        zahtev.setPrvobitnaPrijava(new TDetaljiPrijave(request.getPrvobitnaPrijava()));
        zahtev.setPrethodnePrijave(new TZahtev.PrethodnePrijave(request.getPrethodnePrijave()));
        zahtev.setDodatniPodaci(request.isDodatniPodaci());
        prijava.setZahtev(zahtev);
        return prijava;
    }


    private TLice createTLice(TLiceDTO zajednickiPredstavnik) {
        TAdresa adresa = new TAdresa(zajednickiPredstavnik.getAdresa());
        TKontaktInformacije kontaktInformacije = new TKontaktInformacije(zajednickiPredstavnik.getKontakt());
        if (zajednickiPredstavnik.getNaziv().equals("")){
            TPravnoLice lice = new TPravnoLice();
            lice.setNaziv(zajednickiPredstavnik.getNaziv());
            lice.setAdresa(adresa);
            lice.setKontakt(kontaktInformacije);
            return lice;
        }
        else{
            TFizickoLice lice = new TFizickoLice();
            lice.setIme(zajednickiPredstavnik.getIme());
            lice.setPrezime(zajednickiPredstavnik.getPrezime());
            lice.setAdresa(adresa);
            lice.setKontakt(kontaktInformacije);
            return lice;
        }
    }

    private  TDetaljiPrijavePatent getDetaljiPrijavePatent() throws DatatypeConfigurationException {
        TDetaljiPrijavePatent detaljiPrijave = new TDetaljiPrijavePatent();
        detaljiPrijave.setPotpis("potpis");

        String id = generateNextId();
        detaljiPrijave.setBrojPrijave(id);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        XMLGregorianCalendar xCal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(cal);
        detaljiPrijave.setDatumPodnosenja(xCal);
        detaljiPrijave.setPriznatiDatumPodnosenja(xCal);
        return detaljiPrijave;
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

    public List<Prijava> getAll() {
        List<Prijava> prijavas = patentRepository.getAll();

        return prijavas;
    }

    public Prijava getOneById(String id) {
        return patentRepository.getOneById(id);

    }

    public List<Prijava> getAllApproved() {
        List<Prijava> allRequests = patentRepository.getAll();
        List<Prijava> answeredRequests = new ArrayList<>();
        List<Decision> allDecisions = patentRepository.getAllDecisions();
        List<String> answeredRequestsIds = new ArrayList<>();

        for (Decision decision:allDecisions){
            answeredRequestsIds.add(decision.getSifraZahteva());
        }
        for (Prijava prijava:allRequests){
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

    public List<Prijava> getAllUnanswered() {
        List<Prijava> allRequests = patentRepository.getAll();
        List<Prijava> unansweredRequests = new ArrayList<>();
        List<Decision> allDecisions = patentRepository.getAllDecisions();
        List<String> answeredRequestsIds = new ArrayList<>();

        for (Decision decision:allDecisions){
            answeredRequestsIds.add(decision.getSifraZahteva());
        }
        for (Prijava prijava:allRequests){
            if(!answeredRequestsIds.contains(prijava.getDetaljiPrijave().getBrojPrijave())){
                unansweredRequests.add(prijava);
            }
        }
        return unansweredRequests;
    }

    public void generateReport(ReportDTO reportDTO) throws FileNotFoundException, DocumentException {
        String[] datum_delovi = reportDTO.startDate.split("-");
        GregorianCalendar gc = new GregorianCalendar(Integer.parseInt(datum_delovi[0]), Integer.parseInt(datum_delovi[1]),Integer.parseInt(datum_delovi[2]));
        XMLGregorianCalendar startDate = getDateXML(gc.getTime());

        datum_delovi = reportDTO.endDate.split("-");
        GregorianCalendar gc2 = new GregorianCalendar(Integer.parseInt(datum_delovi[0]), Integer.parseInt(datum_delovi[1]),Integer.parseInt(datum_delovi[2]));
        XMLGregorianCalendar endDate = getDateXML(gc2.getTime());


        List<Prijava> allRequests = patentRepository.getAll();
        List<Decision> allDecisions = patentRepository.getAllDecisions();


        int numberOfRequests = 0;
        int numberOfApproved = 0;
        int numberOfRejected = 0;
        for (Prijava request:allRequests){
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
