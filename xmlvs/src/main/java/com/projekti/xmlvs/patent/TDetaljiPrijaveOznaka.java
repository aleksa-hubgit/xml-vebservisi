
package com.projekti.xmlvs.patent;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDetaljiPrijaveOznaka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDetaljiPrijaveOznaka"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/patent}TDetaljiPrijave"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dvoslovna_oznaka"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="2"/&gt;
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
@XmlType(name = "TDetaljiPrijaveOznaka", propOrder = {
    "dvoslovnaOznaka"
})
public class TDetaljiPrijaveOznaka
    extends TDetaljiPrijave
{

    @XmlElement(name = "dvoslovna_oznaka", required = true)
    protected String dvoslovnaOznaka;

    /**
     * Gets the value of the dvoslovnaOznaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvoslovnaOznaka() {
        return dvoslovnaOznaka;
    }

    /**
     * Sets the value of the dvoslovnaOznaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvoslovnaOznaka(String value) {
        this.dvoslovnaOznaka = value;
    }

}
