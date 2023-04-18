
package com.example.zig.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TFizickoLice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TFizickoLice">
 *   <complexContent>
 *     <extension base="{http://www.ftn.uns.ac.rs/zig}TLice">
 *       <sequence>
 *         <element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFizickoLice", namespace = "http://www.ftn.uns.ac.rs/zig", propOrder = {
    "ime",
    "prezime"
})
public class TFizickoLice
    extends TLice
{

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String ime;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String prezime;

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the prezime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Sets the value of the prezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezime(String value) {
        this.prezime = value;
    }

}
