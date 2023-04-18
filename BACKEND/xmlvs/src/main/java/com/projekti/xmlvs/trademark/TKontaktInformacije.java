
package com.projekti.xmlvs.trademark;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TKontaktInformacije complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TKontaktInformacije">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="broj_telefona" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="broj_faksa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="e_posta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TKontaktInformacije", namespace = "http://www.ftn.uns.ac.rs/zig", propOrder = {
    "brojTelefona",
    "brojFaksa",
    "ePosta"
})
public class TKontaktInformacije {

    @XmlElement(name = "broj_telefona", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String brojTelefona;
    @XmlElement(name = "broj_faksa", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String brojFaksa;
    @XmlElement(name = "e_posta", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String ePosta;

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
