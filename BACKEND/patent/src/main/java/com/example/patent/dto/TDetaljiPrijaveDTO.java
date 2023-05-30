package com.example.patent.dto;


import com.example.patent.model.TDetaljiPrijave;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;

@AllArgsConstructor
@NoArgsConstructor
public class TDetaljiPrijaveDTO {
    public Integer brojPrijave;
    public XMLGregorianCalendar datumPodnosenja;


    public TDetaljiPrijaveDTO(TDetaljiPrijave prvobitnaPrijava) {
        this.brojPrijave = prvobitnaPrijava.getBrojPrijave();
        this.datumPodnosenja = prvobitnaPrijava.getDatumPodnosenja();
    }

    @Override
    public String toString() {
        return "TDetaljiPrijaveDTO{" +
                "brojPrijave=" + brojPrijave +
                ", datumPodnosenja=" + datumPodnosenja +
                '}';
    }
}
