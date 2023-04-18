
package com.example.patent.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPodnosilacPrijave complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPodnosilacPrijave"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/patent}TLice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pronalazac" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="navedeni" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPodnosilacPrijave", propOrder = {
    "pronalazac",
    "navedeni",
    "drzavljanstvo"
})
public class TPodnosilacPrijave
    extends TLice
{

    protected boolean pronalazac;
    protected boolean navedeni;
    @XmlElement(required = true)
    protected String drzavljanstvo;

    /**
     * Gets the value of the pronalazac property.
     * 
     */
    public boolean isPronalazac() {
        return pronalazac;
    }

    /**
     * Sets the value of the pronalazac property.
     * 
     */
    public void setPronalazac(boolean value) {
        this.pronalazac = value;
    }

    /**
     * Gets the value of the navedeni property.
     * 
     */
    public boolean isNavedeni() {
        return navedeni;
    }

    /**
     * Sets the value of the navedeni property.
     * 
     */
    public void setNavedeni(boolean value) {
        this.navedeni = value;
    }

    /**
     * Gets the value of the drzavljanstvo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrzavljanstvo() {
        return drzavljanstvo;
    }

    /**
     * Sets the value of the drzavljanstvo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrzavljanstvo(String value) {
        this.drzavljanstvo = value;
    }

}
