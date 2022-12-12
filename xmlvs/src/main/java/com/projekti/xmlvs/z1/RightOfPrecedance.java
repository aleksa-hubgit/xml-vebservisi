package com.projekti.xmlvs.z1;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"requestedRight", "reason"})

public class RightOfPrecedance {
    @XmlElement(name = "Zatrazeno_pravo", required = true)
    String requestedRight;
    @XmlElement(name = "Osnov", required = true)
    String reason;

}
