package com.projekti.xmlvs.z1;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"baseTax", "classTax","graphicSoulutionTax","totalTax"})
public class Taxes {
    @XmlElement(name = "Osnovna_taksa", required = true)
    double baseTax;
    @XmlElement(name = "Klasna_taksa", required = false)
    ClassTax classTax;
    @XmlElement(name = "Taksa_za_graficko_resenje", required = false)
    double graphicSoulutionTax;
    @XmlElement(name = "Ukupna_taksa", required = true)
    double totalTax;


}
