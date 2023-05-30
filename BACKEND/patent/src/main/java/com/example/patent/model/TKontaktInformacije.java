
package com.example.patent.model;

import com.example.patent.dto.KontaktInformacijeDTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TKontaktInformacije complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TKontaktInformacije"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="broj_telefona" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="broj_faksa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="e_posta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TKontaktInformacije", propOrder = {
    "brojTelefona",
    "brojFaksa",
    "ePosta"
})
public class TKontaktInformacije {

    @XmlElement(name = "broj_telefona", required = true)
    protected String brojTelefona;
    @XmlElement(name = "broj_faksa", required = true)
    protected String brojFaksa;
    @XmlElement(name = "e_posta", required = true)
    protected String ePosta;

    public TKontaktInformacije(KontaktInformacijeDTO kontakt) {
        this.brojTelefona=kontakt.brojTelefona;
        this.brojFaksa=kontakt.brojFaksa;
        this.ePosta=kontakt.ePosta;
    }
    public TKontaktInformacije() {
    }

    /**
     * Gets the value of the brojTelefona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojTelefona() {
        return brojTelefona;
    }

    /**
     * Sets the value of the brojTelefona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojTelefona(String value) {
        this.brojTelefona = value;
    }

    /**
     * Gets the value of the brojFaksa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojFaksa() {
        return brojFaksa;
    }

    /**
     * Sets the value of the brojFaksa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojFaksa(String value) {
        this.brojFaksa = value;
    }

    /**
     * Gets the value of the ePosta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPosta() {
        return ePosta;
    }

    /**
     * Sets the value of the ePosta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPosta(String value) {
        this.ePosta = value;
    }

}
