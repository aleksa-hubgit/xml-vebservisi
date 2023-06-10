package com.example.autorska.dto;

import com.example.autorska.model.Autorska;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;


@AllArgsConstructor
@NoArgsConstructor
public class TDetaljiPrijaveDTO {

    public String brojPrijave;
    public XMLGregorianCalendar datumPodnosenja;


    public TDetaljiPrijaveDTO(Autorska.TDetaljiPrijave prvobitnaPrijava) {
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
