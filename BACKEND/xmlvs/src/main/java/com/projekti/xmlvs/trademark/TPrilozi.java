
package com.projekti.xmlvs.trademark;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPrilozi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TPrilozi">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Primerak_znaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Spisak_robe_i_usluga">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Roba_ili_usluga" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Punomocje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Naknadno_dostavljeno_punomocje" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Generalno_punomocje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Opsti_akt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Dokaz_o_pravu_prvenstva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Dokaz_o_uplati_takse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPrilozi", namespace = "http://www.ftn.uns.ac.rs/zig", propOrder = {
    "primerakZnaka",
    "spisakRobeIUsluga",
    "punomocje",
    "naknadnoDostavljenoPunomocje",
    "generalnoPunomocje",
    "opstiAkt",
    "dokazOPravuPrvenstva",
    "dokazOUplatiTakse"
})
public class TPrilozi {

    @XmlElement(name = "Primerak_znaka", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String primerakZnaka;
    @XmlElement(name = "Spisak_robe_i_usluga", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected TPrilozi.SpisakRobeIUsluga spisakRobeIUsluga;
    @XmlElement(name = "Punomocje", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String punomocje;
    @XmlElement(name = "Naknadno_dostavljeno_punomocje", namespace = "http://www.ftn.uns.ac.rs/zig")
    protected boolean naknadnoDostavljenoPunomocje;
    @XmlElement(name = "Generalno_punomocje", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String generalnoPunomocje;
    @XmlElement(name = "Opsti_akt", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String opstiAkt;
    @XmlElement(name = "Dokaz_o_pravu_prvenstva", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String dokazOPravuPrvenstva;
    @XmlElement(name = "Dokaz_o_uplati_takse", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected String dokazOUplatiTakse;

    /**
     * Gets the value of the primerakZnaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerakZnaka() {
        return primerakZnaka;
    }

    /**
     * Sets the value of the primerakZnaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerakZnaka(String value) {
        this.primerakZnaka = value;
    }

    /**
     * Gets the value of the spisakRobeIUsluga property.
     * 
     * @return
     *     possible object is
     *     {@link TPrilozi.SpisakRobeIUsluga }
     *     
     */
    public TPrilozi.SpisakRobeIUsluga getSpisakRobeIUsluga() {
        return spisakRobeIUsluga;
    }

    /**
     * Sets the value of the spisakRobeIUsluga property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPrilozi.SpisakRobeIUsluga }
     *     
     */
    public void setSpisakRobeIUsluga(TPrilozi.SpisakRobeIUsluga value) {
        this.spisakRobeIUsluga = value;
    }

    /**
     * Gets the value of the punomocje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunomocje() {
        return punomocje;
    }

    /**
     * Sets the value of the punomocje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunomocje(String value) {
        this.punomocje = value;
    }

    /**
     * Gets the value of the naknadnoDostavljenoPunomocje property.
     * 
     */
    public boolean isNaknadnoDostavljenoPunomocje() {
        return naknadnoDostavljenoPunomocje;
    }

    /**
     * Sets the value of the naknadnoDostavljenoPunomocje property.
     * 
     */
    public void setNaknadnoDostavljenoPunomocje(boolean value) {
        this.naknadnoDostavljenoPunomocje = value;
    }

    /**
     * Gets the value of the generalnoPunomocje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralnoPunomocje() {
        return generalnoPunomocje;
    }

    /**
     * Sets the value of the generalnoPunomocje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralnoPunomocje(String value) {
        this.generalnoPunomocje = value;
    }

    /**
     * Gets the value of the opstiAkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpstiAkt() {
        return opstiAkt;
    }

    /**
     * Sets the value of the opstiAkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpstiAkt(String value) {
        this.opstiAkt = value;
    }

    /**
     * Gets the value of the dokazOPravuPrvenstva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokazOPravuPrvenstva() {
        return dokazOPravuPrvenstva;
    }

    /**
     * Sets the value of the dokazOPravuPrvenstva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokazOPravuPrvenstva(String value) {
        this.dokazOPravuPrvenstva = value;
    }

    /**
     * Gets the value of the dokazOUplatiTakse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokazOUplatiTakse() {
        return dokazOUplatiTakse;
    }

    /**
     * Sets the value of the dokazOUplatiTakse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokazOUplatiTakse(String value) {
        this.dokazOUplatiTakse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Roba_ili_usluga" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "robaIliUsluga"
    })
    public static class SpisakRobeIUsluga {

        @XmlElement(name = "Roba_ili_usluga", namespace = "http://www.ftn.uns.ac.rs/zig")
        protected List<String> robaIliUsluga;

        /**
         * Gets the value of the robaIliUsluga property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the robaIliUsluga property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRobaIliUsluga().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the robaIliUsluga property.
         */
        public List<String> getRobaIliUsluga() {
            if (robaIliUsluga == null) {
                robaIliUsluga = new ArrayList<>();
            }
            return this.robaIliUsluga;
        }

    }

}
