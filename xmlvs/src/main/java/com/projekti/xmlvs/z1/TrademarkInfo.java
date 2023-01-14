package com.projekti.xmlvs.z1;


import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"trademarkType","signType", "signLook","colors","signTransliteration", "signTranslation", "signDescription","NiceClassification"})
public class TrademarkInfo {
    @XmlElement(name = "Tip_ziga", required = true)
    TrademarkType trademarkType;
    @XmlElement(name = "Tip_znaka", required = true)
    SignType signType;
    @XmlElement(name = "Izgled_znaka", required = true)
    String signLook;
    @XmlElementWrapper(name = "Boje_znaka", required = true)
    @XmlElement(name = "Boja", required = true)
    List<String> colors;
    @XmlElement(name = "Transliteracija_znaka", required = false)
    String signTransliteration;
    @XmlElement(name = "Prevod_znaka", required = false)
    String signTranslation;
    @XmlElement(name = "Opis_znaka", required = true)
    String signDescription;
    @XmlElementWrapper(name = "Nicanska_klasifikacija", required = true)
    @XmlElement(name = "Klasa", required = true)
    List<Integer> NiceClassification;

}

