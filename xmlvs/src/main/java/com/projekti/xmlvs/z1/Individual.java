package com.projekti.xmlvs.z1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFizickoLice", propOrder = {"name", "surname"})
public  class Individual extends Person{
    @XmlElement(name = "ime", required = true)
    private String name;
    @XmlElement(name = "prezime", required = true)
    private String surname;
}
