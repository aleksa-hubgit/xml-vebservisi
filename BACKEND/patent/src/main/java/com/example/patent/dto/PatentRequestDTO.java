package com.example.patent.dto;


import com.example.patent.model.Prijava;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="patentPrijava")
public class PatentRequestDTO {

    private String potpis;
    private TNazivPronalaskaDTO nazivPronalaska;
    private TLiceDTO podnosilacPrijave;
    private TLiceDTO pronalazac;
    private TLiceDTO punomocnik;
    private AdresaDTO adresaZaDostavljanje;
    private NacinDostavljanjaDTO nacinDostavljanja;
    private String tipPrijave;
    private TDetaljiPrijaveDTO prvobitnaPrijava;
    private PrethodnePrijaveDTO prethodnePrijave;
    private boolean dodatniPodaci;

    public PatentRequestDTO(Prijava prijava){
        this.potpis = prijava.getDetaljiPrijave().getPotpis();
        this.nazivPronalaska = new TNazivPronalaskaDTO(prijava.getZahtev().getNazivPronalaska());
        this.podnosilacPrijave = new TLiceDTO(prijava.getZahtev().getPodnosilacPrijave());
        this.pronalazac = new TLiceDTO(prijava.getZahtev().getPronalazac());
        this.punomocnik = new TLiceDTO(prijava.getZahtev().getPunomocnik());
        this.adresaZaDostavljanje = new AdresaDTO(prijava.getZahtev().getAdresaZaDostavljanje());
        this.nacinDostavljanja = new NacinDostavljanjaDTO(prijava.getZahtev().getNacinDostavljanja());
        this.tipPrijave = prijava.getZahtev().getTipPrijave();
        this.prvobitnaPrijava = new TDetaljiPrijaveDTO(prijava.getZahtev().getPrvobitnaPrijava());
        this.prethodnePrijave = new PrethodnePrijaveDTO(prijava.getZahtev().getPrethodnePrijave());
        this.dodatniPodaci = prijava.getZahtev().isDodatniPodaci();


    }

    @Override
    public String toString() {
        return "PatentRequestDTO{" +
                "potpis='" + potpis + '\'' +
                ", nazivPronalaska=" + nazivPronalaska +
                ", podnosilacPrijave=" + podnosilacPrijave +
                ", pronalazac=" + pronalazac +
                ", punomocnik=" + punomocnik +
                ", adresaZaDostavljanje=" + adresaZaDostavljanje +
                ", nacinDostavljanja=" + nacinDostavljanja +
                ", tipPrijave='" + tipPrijave + '\'' +
                ", prvobitnaPrijava=" + prvobitnaPrijava +
                ", prethodnePrijave=" + prethodnePrijave +
                ", dodatniPodaci=" + dodatniPodaci +
                '}';
    }
}
