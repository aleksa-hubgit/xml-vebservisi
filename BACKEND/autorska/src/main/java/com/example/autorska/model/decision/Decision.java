package com.example.autorska.model.decision;


import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "datumRazresenja",
        "sifraZahteva",
        "obrazlozenje",
        "odobren"
})
@XmlRootElement(name = "Resenje")
@Getter
@Setter
public class Decision {
    @XmlElement(name="Datum_razresenja", required = true)
    protected XMLGregorianCalendar datumRazresenja;
    @XmlElement(name="Sifra_zahteva", required = true)
    protected String sifraZahteva;
    @XmlElement(name="Obrazlozenje", required = true)
    protected String obrazlozenje;
    @XmlElement(name="Odobren", required = true)
    protected boolean odobren;
}
