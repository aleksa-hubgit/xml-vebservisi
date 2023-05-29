package com.example.autorska.dto;


import com.example.autorska.model.Autorska;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="autorskaPrijava")
public class CopyrightRequestDTO {

    private TLiceDTO podnosilacPrijave;

    private String pseudonim;

    private TLiceDTO punomocnik;

    private PodaciONaslovuDTO podaciONaslovu;

    private PodaciOPreradiDTO podaciOPreradi;

    private String vrstaDela;

    private PodaciOAutorimaDTO podaciOAutorima;

    private boolean radnomOdnosu;

    private String namenaDela;

    private String potpis;


    public CopyrightRequestDTO(Autorska autorska){
        this.podnosilacPrijave = new TLiceDTO(autorska.getPodnosilacPrijave());
        this.pseudonim = autorska.getPseudonim();
        this.punomocnik = new TLiceDTO(autorska.getPunomocnik());
        this.podaciONaslovu = new PodaciONaslovuDTO(autorska.getPodaciONaslovu());
        this.podaciOPreradi = new PodaciOPreradiDTO(autorska.getPodaciOPreradi());
    }



}
