package com.example.autorska.service;


import com.example.autorska.dto.CopyrightRequestDTO;
import com.example.autorska.dto.TLiceDTO;
import com.example.autorska.model.*;
import com.example.autorska.repository.AutorskaRepository;
import com.example.autorska.util.MarshallingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import java.io.OutputStream;

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
        autorskaRepository.save(os, "2");
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
}
