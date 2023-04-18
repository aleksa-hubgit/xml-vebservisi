
package com.example.patent.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TLice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/patent}TAdresa"/&gt;
 *         &lt;element name="kontakt" type="{http://www.ftn.uns.ac.rs/patent}TKontaktInformacije"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLice", propOrder = {
    "adresa",
    "kontakt"
})
@XmlSeeAlso({
    TPravnoLice.class,
    TPodnosilacPrijave.class,
    TFizickoLice.class,
    TPunomocnik.class
})
public abstract class TLice {

    @XmlElement(required = true)
    protected TAdresa adresa;
    @XmlElement(required = true)
    protected TKontaktInformacije kontakt;

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link TAdresa }
     *     
     */
    public TAdresa getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdresa }
     *     
     */
    public void setAdresa(TAdresa value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the kontakt property.
     * 
     * @return
     *     possible object is
     *     {@link TKontaktInformacije }
     *     
     */
    public TKontaktInformacije getKontakt() {
        return kontakt;
    }

    /**
     * Sets the value of the kontakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TKontaktInformacije }
     *     
     */
    public void setKontakt(TKontaktInformacije value) {
        this.kontakt = value;
    }

}
