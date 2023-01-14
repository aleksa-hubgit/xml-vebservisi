package com.projekti.xmlvs.z1;


import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPrilozi", propOrder = {"sampleSign", "goodsAndFavours", "authority", "subsequentlySubmittedPowerOfAttorney", "generalAuthority", "generalAct", "proofOfRightForPrecedance","proofOfPaidTax"})
public class Contributions {
    @XmlElement(name = "Primerak_znaka", required = true)
    String sampleSign;
    @XmlElementWrapper(name = "Spisak_robe_i_usluga", required = true)
    @XmlElement(name = "Roba_ili_usluga", required = true)
    List<String> goodsAndFavours;
    @XmlElement(name = "Punomocje", required = true)
    String authority;
    @XmlElement(name = "Naknadno_dostavljeno_punomocje", required = true)
    Boolean subsequentlySubmittedPowerOfAttorney;
    @XmlElement(name = "Generalno_punomocje", required = true)
    String generalAuthority;
    @XmlElement(name = "Opsti_akt", required = true)
    String generalAct;
    @XmlElement(name = "Dokaz_o_pravu_prvenstva", required = true)
    String proofOfRightForPrecedance;
    @XmlElement(name = "Dokaz_o_uplati_takse", required = true)
    String proofOfPaidTax;
}
