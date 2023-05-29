package com.example.autorska.dto;


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
    



}
