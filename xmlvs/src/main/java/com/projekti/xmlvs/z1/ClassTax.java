package com.projekti.xmlvs.z1;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"numberOfClasses", "amount"})
public class ClassTax {
    @XmlElement(name = "Broj_klasa", required = true)
    int numberOfClasses;
    @XmlElement(name = "Iznos", required = true)
    double amount;

}
