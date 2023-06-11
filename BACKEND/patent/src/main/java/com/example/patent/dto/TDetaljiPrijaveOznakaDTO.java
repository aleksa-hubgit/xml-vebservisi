package com.example.patent.dto;


import com.example.patent.model.TDetaljiPrijaveOznaka;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;

@AllArgsConstructor
@NoArgsConstructor
public class TDetaljiPrijaveOznakaDTO {

    public String dvoslovnaOznaka;
    public String brojPrijave;
    public XMLGregorianCalendar datumPodnosenja;

    public TDetaljiPrijaveOznakaDTO(TDetaljiPrijaveOznaka detaljiPrijaveOznaka) {
        this.dvoslovnaOznaka = detaljiPrijaveOznaka.getDvoslovnaOznaka();
        this.brojPrijave = detaljiPrijaveOznaka.getBrojPrijave();
        this.datumPodnosenja = detaljiPrijaveOznaka.getDatumPodnosenja();
    }

    @Override
    public String toString() {
        return "TDetaljiPrijaveOznakaDTO{" +
                "dvoslovnaOznaka='" + dvoslovnaOznaka + '\'' +
                ", brojPrijave=" + brojPrijave +
                ", datumPodnosenja=" + datumPodnosenja +
                '}';
    }
}
