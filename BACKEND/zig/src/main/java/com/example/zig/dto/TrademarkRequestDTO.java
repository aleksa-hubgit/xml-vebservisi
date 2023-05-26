package com.example.zig.dto;


import com.example.zig.model.Prijava;
import com.example.zig.model.TPrilozi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="prijavaZaZig")
public class TrademarkRequestDTO {


    private TLiceDTO podnosilacPrijave;
    private TLiceDTO punomocnik;
    private TLiceDTO zajednickiPredstavnik;
    private InformacijeOZiguDTO informacijeOZigu;
    private PravoPrvenstvaDTO pravoPrvenstva;
    private TakseDTO takse;
    private TPriloziDTO prilozi;



    public TrademarkRequestDTO(Prijava prijava){

        this.podnosilacPrijave = new TLiceDTO(prijava.getPodnosilacPrijave());
        this.punomocnik = new TLiceDTO(prijava.getPunomocnik());
        this.zajednickiPredstavnik = new TLiceDTO(prijava.getZajednickiPredstavnik());
        this.informacijeOZigu = new InformacijeOZiguDTO(prijava.getInformacijeOZigu());
        this.pravoPrvenstva = new PravoPrvenstvaDTO(prijava.getPravoPrvenstva());
        this.takse = new TakseDTO(prijava.getTakse());
        this.prilozi = new TPriloziDTO(prijava.getInformacijaZavoda().getPrilozi());

    }

    @Override
    public String toString() {
        return "TrademarkRequestDTO{" +
                "podnosilacPrijave=" + podnosilacPrijave +
                ", punomocnik=" + punomocnik +
                ", zajednickiPredstavnik=" + zajednickiPredstavnik +
                ", informacijeOZigu=" + informacijeOZigu +
                ", pravoPrvenstva=" + pravoPrvenstva +
                ", takse=" + takse +
                ", prilozi=" + prilozi +
                '}';
    }
}
