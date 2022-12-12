package com.projekti.xmlvs.z1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Prijava")
@XmlType(name = "", propOrder = {"applicant", "proxy","commonRepresentative","trademarkInfo","rightOfPrecedance","taxes","institutionInfo"})

public class Submission {
    @XmlElement(name = "Podnosilac_prijave", required = true)
    Person applicant;
    @XmlElement(name = "Punomocnik", required = true)
    Person proxy;
    @XmlElement(name = "Zajednicki_predstavnik", required = true)
    Person commonRepresentative;
    @XmlElement(name = "Informacije_o_zigu", required = true)
    TrademarkInfo trademarkInfo;
    @XmlElement(name = "Pravo_prvenstva", required = false)
    RightOfPrecedance rightOfPrecedance;
    @XmlElement(name = "Takse", required = true)
    Taxes taxes;
    @XmlElement(name = "Informacija_zavoda", required = true)
    InstitutionInfo institutionInfo;

}
