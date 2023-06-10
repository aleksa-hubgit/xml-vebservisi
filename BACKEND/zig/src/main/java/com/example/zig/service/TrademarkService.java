package com.example.zig.service;

import com.example.zig.dto.DecisionDTO;
import com.example.zig.dto.TLiceDTO;
import com.example.zig.dto.TrademarkRequestDTO;
import com.example.zig.model.*;
import com.example.zig.model.decision.Decision;
import com.example.zig.repository.ZigRepository;
import com.example.zig.util.MarshallingUtils;
import com.example.zig.util.PdfTransformer;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Node;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class TrademarkService {


    public static final String INPUT_FILE = "./src/main/resources/data/5.xml";

    public static final String XSL_FILE = "./src/main/resources/data/z1.xsl";

    public static final String OUTPUT_FILE = "gen/bookstore.pdf";

    public static final String HTML_OUTPUT_FILE = "gen/bookstore.html";

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


}
