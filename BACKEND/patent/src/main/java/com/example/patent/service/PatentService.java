package com.example.patent.service;


import com.example.patent.dto.PatentRequestDTO;
import com.example.patent.dto.TLiceDTO;
import com.example.patent.model.*;
import com.example.patent.repository.PatentRepository;
import com.example.patent.util.MarshallingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

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
        patentRepository.save(os, "2");
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

    private static TDetaljiPrijavePatent getDetaljiPrijavePatent() throws DatatypeConfigurationException {
        TDetaljiPrijavePatent detaljiPrijave = new TDetaljiPrijavePatent();
        detaljiPrijave.setPotpis("potpis");
        detaljiPrijave.setBrojPrijave(1);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        XMLGregorianCalendar xCal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(cal);
        detaljiPrijave.setDatumPodnosenja(xCal);
        detaljiPrijave.setPriznatiDatumPodnosenja(xCal);
        return detaljiPrijave;
    }
}
