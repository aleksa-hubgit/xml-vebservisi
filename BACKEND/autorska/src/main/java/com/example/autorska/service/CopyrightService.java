package com.example.autorska.service;


import com.example.autorska.dto.CopyrightRequestDTO;
import com.example.autorska.dto.DecisionDTO;
import com.example.autorska.dto.TLiceDTO;
import com.example.autorska.model.*;
import com.example.autorska.model.decision.Decision;
import com.example.autorska.repository.AutorskaRepository;
import com.example.autorska.util.MarshallingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class CopyrightService {



    @Autowired
    private AutorskaRepository autorskaRepository;
    public void createRequest(CopyrightRequestDTO request) throws JAXBException, XMLDBException {
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

    private Autorska createRequestFromDTO(CopyrightRequestDTO request) {
        Autorska autorska = new Autorska();
        autorska.setPseudonim(request.getPseudonim());
        autorska.setVrstaDela(request.getVrstaDela());
        autorska.setNamenaDela(request.getNamenaDela());
        autorska.setPotpis(request.getPotpis());
        autorska.setRadnomOdnosu(request.isRadnomOdnosu());
        autorska.setPodaciONaslovu(new Autorska.PodaciONaslovu(request.getPodaciONaslovu()));
        autorska.setPodaciOPreradi(new Autorska.PodaciOPreradi(request.getPodaciOPreradi()));

        TLice autor = createTLice(request.getPodaciOAutorima().autor);
        autorska.setPodaciOAutorima(new Autorska.PodaciOAutorima(request.getPodaciOAutorima(),autor));

        autorska.setPunomocnik(createTLice(request.getPunomocnik()));
        autorska.setPodnosilacPrijave(createTLice(request.getPodnosilacPrijave()));


        return autorska;
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
}
