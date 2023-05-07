
package com.example.zig.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAdresa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TAdresa">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ulica">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="200"/>
 *               <minLength value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="broj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="postanski_broj">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               <fractionDigits value="0"/>
 *               <minInclusive value="10000"/>
 *               <maxInclusive value="40000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="mesto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="drzava" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAdresa", namespace = "http://www.ftn.uns.ac.rs/zig", propOrder = {
    "ulica",
    "broj",
    "postanskiBroj",
    "mesto",
    "drzava"
})
public class TAdresa {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String ulica;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String broj;
    @XmlElement(name = "postanski_broj", namespace = "http://www.ftn.uns.ac.rs/zig")
    protected int postanskiBroj;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String mesto;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String drzava;

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the broj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroj() {
        return broj;
    }

    /**
     * Sets the value of the broj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroj(String value) {
        this.broj = value;
    }

    /**
     * Gets the value of the postanskiBroj property.
     * 
     */
    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    /**
     * Sets the value of the postanskiBroj property.
     * 
     */
    public void setPostanskiBroj(int value) {
        this.postanskiBroj = value;
    }

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesto(String value) {
        this.mesto = value;
    }

    /**
     * Gets the value of the drzava property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrzava() {
        return drzava;
    }

    /**
     * Sets the value of the drzava property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrzava(String value) {
        this.drzava = value;
    }

}
