package com.projekti.xmlvs.z1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"street", "number", "postalNumber", "place", "country"})
public class Address {
    @XmlElement(name = "ulica", required = true)
    private String street;
    @XmlElement(name = "broj", required = true)
    private String number;
    @XmlElement(name = "postanski_broj", required = true)
    private int postalNumber;
    @XmlElement(name = "mesto", required = true)
    private String place;
    @XmlElement(name = "drzava", required = true)
    private String country;
}
