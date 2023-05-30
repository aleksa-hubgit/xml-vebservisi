
package com.example.patent.model;

import com.example.patent.dto.TNazivPronalaskaDTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TNazivPronalaska complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TNazivPronalaska"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="srpski_naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="engleski_naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNazivPronalaska", propOrder = {
    "srpskiNaziv",
    "engleskiNaziv"
})
public class TNazivPronalaska {

    @XmlElement(name = "srpski_naziv", required = true)
    protected String srpskiNaziv;
    @XmlElement(name = "engleski_naziv", required = true)
    protected String engleskiNaziv;

    public TNazivPronalaska(TNazivPronalaskaDTO nazivPronalaska) {
        this.srpskiNaziv = nazivPronalaska.srpskiNaziv;
        this.engleskiNaziv = nazivPronalaska.engleskiNaziv;
    }
    public TNazivPronalaska() {
    }

    /**
     * Gets the value of the srpskiNaziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrpskiNaziv() {
        return srpskiNaziv;
    }

    /**
     * Sets the value of the srpskiNaziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrpskiNaziv(String value) {
        this.srpskiNaziv = value;
    }

    /**
     * Gets the value of the engleskiNaziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngleskiNaziv() {
        return engleskiNaziv;
    }

    /**
     * Sets the value of the engleskiNaziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngleskiNaziv(String value) {
        this.engleskiNaziv = value;
    }

}
