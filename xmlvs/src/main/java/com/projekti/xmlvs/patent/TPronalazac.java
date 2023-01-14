
package com.projekti.xmlvs.patent;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPronalazac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPronalazac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/patent}TFizickoLice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="naveden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="navedeni" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPronalazac", propOrder = {
    "naveden",
    "navedeni"
})
public class TPronalazac
    extends TFizickoLice
{

    protected boolean naveden;
    protected boolean navedeni;

    /**
     * Gets the value of the naveden property.
     * 
     */
    public boolean isNaveden() {
        return naveden;
    }

    /**
     * Sets the value of the naveden property.
     * 
     */
    public void setNaveden(boolean value) {
        this.naveden = value;
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

}
