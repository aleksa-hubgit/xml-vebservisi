
package com.projekti.xmlvs.patent;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPunomocnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPunomocnik"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/patent}TLice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tip_punomocja"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="PUNOMOCNIK_ZA_ZASTUPANJE"/&gt;
 *               &lt;enumeration value="PUNOMOCNIK_ZA_PRIJEM_PISMENA"/&gt;
 *               &lt;enumeration value="ZAJEDNICKI_PREDSTAVNIK"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPunomocnik", propOrder = {
    "tipPunomocja"
})
public class TPunomocnik
    extends TLice
{

    @XmlElement(name = "tip_punomocja", required = true)
    protected String tipPunomocja;

    /**
     * Gets the value of the tipPunomocja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipPunomocja() {
        return tipPunomocja;
    }

    /**
     * Sets the value of the tipPunomocja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipPunomocja(String value) {
        this.tipPunomocja = value;
    }

}
