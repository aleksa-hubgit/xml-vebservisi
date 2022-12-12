package com.projekti.xmlvs.z1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPravnoLice", propOrder = {"name"})
public class LegalEntity extends Person{
    @XmlElement(name = "naziv", required = true)
    private String name;
}
