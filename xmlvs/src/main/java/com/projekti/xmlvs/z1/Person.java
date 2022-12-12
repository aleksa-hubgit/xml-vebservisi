package com.projekti.xmlvs.z1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLice", propOrder = {"address", "contactInformation"})
public class Person {
    @XmlElement(name = "adresa", required = true)
    private Address address;
    @XmlElement(name = "kontakt", required = true)
    private ContactInformation contactInformation;
}

