package com.projekti.xmlvs.z1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"phoneNumber", "faxNumber", "mail"})
public class ContactInformation {
    @XmlElement(name = "broj_telefona", required = true)
    private String phoneNumber;
    @XmlElement(name = "broj_faxa", required = true)
    private String faxNumber;
    @XmlElement(name = "e_posta", required = true)
    private String mail;
}
