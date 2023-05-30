
package com.example.patent.model;

import com.example.patent.dto.TDetaljiPrijaveOznakaDTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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

    public TDetaljiPrijaveOznaka(TDetaljiPrijaveOznakaDTO tDetaljiPrijaveOznakaDTO) {
        super(tDetaljiPrijaveOznakaDTO);
        this.dvoslovnaOznaka = tDetaljiPrijaveOznakaDTO.dvoslovnaOznaka;
    }

    public TDetaljiPrijaveOznaka() {

    }


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
