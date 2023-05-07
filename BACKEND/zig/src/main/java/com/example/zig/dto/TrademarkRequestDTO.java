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
    private Prijava.InformacijeOZigu informacijeOZigu;
    private Prijava.PravoPrvenstva pravoPrvenstva;
    private Prijava.Takse takse;
    private TPrilozi prilozi;



    public TrademarkRequestDTO(Prijava prijava){

        this.podnosilacPrijave = new TLiceDTO(prijava.getPodnosilacPrijave());
        this.punomocnik = new TLiceDTO(prijava.getPunomocnik());
        this.zajednickiPredstavnik = new TLiceDTO(prijava.getZajednickiPredstavnik());
        this.informacijeOZigu = prijava.getInformacijeOZigu();
        this.pravoPrvenstva = prijava.getPravoPrvenstva();
        this.takse = prijava.getTakse();
        this.prilozi = prijava.getInformacijaZavoda().getPrilozi();

    }

}
