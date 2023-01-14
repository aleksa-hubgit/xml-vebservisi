package com.projekti.xmlvs.z1;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"submissionNumber", "submissionDate","contributions"})
public class InstitutionInfo {
    @XmlElement(name = "Broj_prijave", required = true)
    String submissionNumber;
    @XmlElement(name = "Datum_podnosenja", required = true)
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    LocalDate submissionDate;
    @XmlElement(name = "Prilozi", required = true)
    Contributions contributions;
}
