
package com.example.autorska.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TPravnoLice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TPravnoLice">
 *   <complexContent>
 *     <extension base="{http://www.ftn.uns.ac.rs/autorksa}TLice">
 *       <sequence>
 *         <element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sediste" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPravnoLice", propOrder = {
    "naziv",
    "sediste"
})
public class TPravnoLice
    extends TLice
{

    @XmlElement(required = true)
    protected String naziv;
    @XmlElement(required = true)
    protected String sediste;

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the sediste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSediste() {
        return sediste;
    }

    /**
     * Sets the value of the sediste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSediste(String value) {
        this.sediste = value;
    }

}
