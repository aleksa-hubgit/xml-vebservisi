
package com.example.zig.model;

import com.example.zig.dto.*;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         <element name="Podnosilac_prijave" type="{http://www.ftn.uns.ac.rs/zig}TLice"/>
 *         <element name="Punomocnik" type="{http://www.ftn.uns.ac.rs/zig}TLice"/>
 *         <element name="Zajednicki_predstavnik" type="{http://www.ftn.uns.ac.rs/zig}TLice"/>
 *         <element name="Informacije_o_zigu">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Tip_ziga" type="{http://www.ftn.uns.ac.rs/zig}TTip_ziga"/>
 *                   <element name="Tip_znaka" type="{http://www.ftn.uns.ac.rs/zig}TTip_znaka"/>
 *                   <element name="Izgled_znaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Boje_znaka">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Boja" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Transliteracija_znaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="Prevod_znaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="Opis_znaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Nicanska_klasifikacija">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Klasa" maxOccurs="45">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                   <maxInclusive value="45"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Pravo_prvenstva" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Zatrazeno_pravo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Osnov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Takse">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Osnovna_taksa">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                         <minInclusive value="0"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Klasna_taksa" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Broj_klasa">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                   <maxInclusive value="45"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="Iznos">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                                   <minInclusive value="0"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Taksa_za_graficko_resenje" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                         <minInclusive value="0"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Ukupna_taksa">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                         <minInclusive value="0"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Informacija_zavoda">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Broj_prijave" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Datum_podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="Prilozi" type="{http://www.ftn.uns.ac.rs/zig}TPrilozi"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
    "podnosilacPrijave",
    "punomocnik",
    "zajednickiPredstavnik",
    "informacijeOZigu",
    "pravoPrvenstva",
    "takse",
    "informacijaZavoda"
})
@XmlRootElement(name = "Prijava", namespace = "http://www.ftn.uns.ac.rs/zig")
public class Prijava {

    @XmlElement(name = "Podnosilac_prijave", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected TLice podnosilacPrijave;
    @XmlElement(name = "Punomocnik", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected TLice punomocnik;
    @XmlElement(name = "Zajednicki_predstavnik", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected TLice zajednickiPredstavnik;
    @XmlElement(name = "Informacije_o_zigu", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected Prijava.InformacijeOZigu informacijeOZigu;
    @XmlElement(name = "Pravo_prvenstva", namespace = "http://www.ftn.uns.ac.rs/zig")
    protected Prijava.PravoPrvenstva pravoPrvenstva;
    @XmlElement(name = "Takse", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected Prijava.Takse takse;
    @XmlElement(name = "Informacija_zavoda", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
    protected Prijava.InformacijaZavoda informacijaZavoda;

    /**
     * Gets the value of the podnosilacPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link TLice }
     *     
     */
    public TLice getPodnosilacPrijave() {
        return podnosilacPrijave;
    }

    /**
     * Sets the value of the podnosilacPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLice }
     *     
     */
    public void setPodnosilacPrijave(TLice value) {
        this.podnosilacPrijave = value;
    }

    /**
     * Gets the value of the punomocnik property.
     * 
     * @return
     *     possible object is
     *     {@link TLice }
     *     
     */
    public TLice getPunomocnik() {
        return punomocnik;
    }

    /**
     * Sets the value of the punomocnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLice }
     *     
     */
    public void setPunomocnik(TLice value) {
        this.punomocnik = value;
    }

    /**
     * Gets the value of the zajednickiPredstavnik property.
     * 
     * @return
     *     possible object is
     *     {@link TLice }
     *     
     */
    public TLice getZajednickiPredstavnik() {
        return zajednickiPredstavnik;
    }

    /**
     * Sets the value of the zajednickiPredstavnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLice }
     *     
     */
    public void setZajednickiPredstavnik(TLice value) {
        this.zajednickiPredstavnik = value;
    }

    /**
     * Gets the value of the informacijeOZigu property.
     * 
     * @return
     *     possible object is
     *     {@link Prijava.InformacijeOZigu }
     *     
     */
    public Prijava.InformacijeOZigu getInformacijeOZigu() {
        return informacijeOZigu;
    }

    /**
     * Sets the value of the informacijeOZigu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prijava.InformacijeOZigu }
     *     
     */
    public void setInformacijeOZigu(Prijava.InformacijeOZigu value) {
        this.informacijeOZigu = value;
    }

    /**
     * Gets the value of the pravoPrvenstva property.
     * 
     * @return
     *     possible object is
     *     {@link Prijava.PravoPrvenstva }
     *     
     */
    public Prijava.PravoPrvenstva getPravoPrvenstva() {
        return pravoPrvenstva;
    }

    /**
     * Sets the value of the pravoPrvenstva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prijava.PravoPrvenstva }
     *     
     */
    public void setPravoPrvenstva(Prijava.PravoPrvenstva value) {
        this.pravoPrvenstva = value;
    }

    /**
     * Gets the value of the takse property.
     * 
     * @return
     *     possible object is
     *     {@link Prijava.Takse }
     *     
     */
    public Prijava.Takse getTakse() {
        return takse;
    }

    /**
     * Sets the value of the takse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prijava.Takse }
     *     
     */
    public void setTakse(Prijava.Takse value) {
        this.takse = value;
    }

    /**
     * Gets the value of the informacijaZavoda property.
     * 
     * @return
     *     possible object is
     *     {@link Prijava.InformacijaZavoda }
     *     
     */
    public Prijava.InformacijaZavoda getInformacijaZavoda() {
        return informacijaZavoda;
    }

    /**
     * Sets the value of the informacijaZavoda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prijava.InformacijaZavoda }
     *     
     */
    public void setInformacijaZavoda(Prijava.InformacijaZavoda value) {
        this.informacijaZavoda = value;
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
     *         <element name="Broj_prijave" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Datum_podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="Prilozi" type="{http://www.ftn.uns.ac.rs/zig}TPrilozi"/>
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
        "brojPrijave",
        "datumPodnosenja",
        "prilozi"
    })
    public static class InformacijaZavoda {

        @XmlElement(name = "Broj_prijave", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        protected String brojPrijave;
        @XmlElement(name = "Datum_podnosenja", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumPodnosenja;
        @XmlElement(name = "Prilozi", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        protected TPrilozi prilozi;

        /**
         * Gets the value of the brojPrijave property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrojPrijave() {
            return brojPrijave;
        }

        /**
         * Sets the value of the brojPrijave property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrojPrijave(String value) {
            this.brojPrijave = value;
        }

        /**
         * Gets the value of the datumPodnosenja property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatumPodnosenja() {
            return datumPodnosenja;
        }

        /**
         * Sets the value of the datumPodnosenja property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatumPodnosenja(XMLGregorianCalendar value) {
            this.datumPodnosenja = value;
        }

        /**
         * Gets the value of the prilozi property.
         * 
         * @return
         *     possible object is
         *     {@link TPrilozi }
         *     
         */
        public TPrilozi getPrilozi() {
            return prilozi;
        }

        /**
         * Sets the value of the prilozi property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPrilozi }
         *     
         */
        public void setPrilozi(TPrilozi value) {
            this.prilozi = value;
        }

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
     *         <element name="Tip_ziga" type="{http://www.ftn.uns.ac.rs/zig}TTip_ziga"/>
     *         <element name="Tip_znaka" type="{http://www.ftn.uns.ac.rs/zig}TTip_znaka"/>
     *         <element name="Izgled_znaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Boje_znaka">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Boja" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Transliteracija_znaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="Prevod_znaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="Opis_znaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Nicanska_klasifikacija">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Klasa" maxOccurs="45">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                         <maxInclusive value="45"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "informacijeOZigu", propOrder = {
        "tipZiga",
        "tipZnaka",
        "izgledZnaka",
        "bojeZnaka",
        "transliteracijaZnaka",
        "prevodZnaka",
        "opisZnaka",
        "nicanskaKlasifikacija"
    })
    public static class InformacijeOZigu {

        @XmlElement(name = "tipZiga", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        @XmlSchemaType(name = "string")
        protected TTipZiga tipZiga;
        @XmlElement(name = "tipZnaka", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        @XmlSchemaType(name = "string")
        protected TTipZnaka tipZnaka;
        @XmlElement(name = "izgledZnaka", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        protected String izgledZnaka;
        @XmlElement(name = "bojeZnaka", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        protected Prijava.InformacijeOZigu.BojeZnaka bojeZnaka;
        @XmlElement(name = "transliteracijaZnaka", namespace = "http://www.ftn.uns.ac.rs/zig")
        protected String transliteracijaZnaka;
        @XmlElement(name = "prevodZnaka", namespace = "http://www.ftn.uns.ac.rs/zig")
        protected String prevodZnaka;
        @XmlElement(name = "opisZnaka", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        protected String opisZnaka;
        @XmlElement(name = "nicanskaKlasifikacija", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        protected Prijava.InformacijeOZigu.NicanskaKlasifikacija nicanskaKlasifikacija;

        public InformacijeOZigu(InformacijeOZiguDTO informacijeOZigu) {
            this.tipZiga = TTipZiga.valueOf(informacijeOZigu.tipZiga);
            this.tipZnaka = TTipZnaka.valueOf(informacijeOZigu.tipZnaka);
            this.izgledZnaka = informacijeOZigu.izgledZnaka;
            this.bojeZnaka = new BojeZnaka(informacijeOZigu.bojeZnaka);
            this.transliteracijaZnaka = informacijeOZigu.transliteracijaZnaka;
            this.prevodZnaka = informacijeOZigu.prevodZnaka;
            this.opisZnaka = informacijeOZigu.opisZnaka;
            this.nicanskaKlasifikacija = new NicanskaKlasifikacija(informacijeOZigu.nicanskaKlasifikacija);
        }
        public InformacijeOZigu() {
        }

        @Override
        public String toString() {
            return "InformacijeOZigu{" +
                    "tipZiga=" + tipZiga +
                    ", tipZnaka=" + tipZnaka +
                    ", izgledZnaka='" + izgledZnaka + '\'' +
                    ", bojeZnaka=" + bojeZnaka +
                    ", transliteracijaZnaka='" + transliteracijaZnaka + '\'' +
                    ", prevodZnaka='" + prevodZnaka + '\'' +
                    ", opisZnaka='" + opisZnaka + '\'' +
                    ", nicanskaKlasifikacija=" + nicanskaKlasifikacija +
                    '}';
        }

        /**
         * Gets the value of the tipZiga property.
         * 
         * @return
         *     possible object is
         *     {@link TTipZiga }
         *     
         */
        public TTipZiga getTipZiga() {
            return tipZiga;
        }

        /**
         * Sets the value of the tipZiga property.
         * 
         * @param value
         *     allowed object is
         *     {@link TTipZiga }
         *     
         */
        public void setTipZiga(TTipZiga value) {
            this.tipZiga = value;
        }

        /**
         * Gets the value of the tipZnaka property.
         * 
         * @return
         *     possible object is
         *     {@link TTipZnaka }
         *     
         */
        public TTipZnaka getTipZnaka() {
            return tipZnaka;
        }

        /**
         * Sets the value of the tipZnaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link TTipZnaka }
         *     
         */
        public void setTipZnaka(TTipZnaka value) {
            this.tipZnaka = value;
        }

        /**
         * Gets the value of the izgledZnaka property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIzgledZnaka() {
            return izgledZnaka;
        }

        /**
         * Sets the value of the izgledZnaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIzgledZnaka(String value) {
            this.izgledZnaka = value;
        }

        /**
         * Gets the value of the bojeZnaka property.
         * 
         * @return
         *     possible object is
         *     {@link Prijava.InformacijeOZigu.BojeZnaka }
         *     
         */
        public Prijava.InformacijeOZigu.BojeZnaka getBojeZnaka() {
            return bojeZnaka;
        }

        /**
         * Sets the value of the bojeZnaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prijava.InformacijeOZigu.BojeZnaka }
         *     
         */
        public void setBojeZnaka(Prijava.InformacijeOZigu.BojeZnaka value) {
            this.bojeZnaka = value;
        }

        /**
         * Gets the value of the transliteracijaZnaka property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransliteracijaZnaka() {
            return transliteracijaZnaka;
        }

        /**
         * Sets the value of the transliteracijaZnaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransliteracijaZnaka(String value) {
            this.transliteracijaZnaka = value;
        }

        /**
         * Gets the value of the prevodZnaka property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrevodZnaka() {
            return prevodZnaka;
        }

        /**
         * Sets the value of the prevodZnaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrevodZnaka(String value) {
            this.prevodZnaka = value;
        }

        /**
         * Gets the value of the opisZnaka property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpisZnaka() {
            return opisZnaka;
        }

        /**
         * Sets the value of the opisZnaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpisZnaka(String value) {
            this.opisZnaka = value;
        }

        /**
         * Gets the value of the nicanskaKlasifikacija property.
         * 
         * @return
         *     possible object is
         *     {@link Prijava.InformacijeOZigu.NicanskaKlasifikacija }
         *     
         */
        public Prijava.InformacijeOZigu.NicanskaKlasifikacija getNicanskaKlasifikacija() {
            return nicanskaKlasifikacija;
        }

        /**
         * Sets the value of the nicanskaKlasifikacija property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prijava.InformacijeOZigu.NicanskaKlasifikacija }
         *     
         */
        public void setNicanskaKlasifikacija(Prijava.InformacijeOZigu.NicanskaKlasifikacija value) {
            this.nicanskaKlasifikacija = value;
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
         *         <element name="Boja" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
            "boja"
        })
        public static class BojeZnaka {

            @XmlElement(name = "Boja", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
            protected List<String> boja;

            public BojeZnaka(BojeZnakaDTO bojeZnaka) {
                this.boja = bojeZnaka.boja;
            }

            public BojeZnaka(){

            }

            @Override
            public String toString() {
                return "BojeZnaka{" +
                        "boja=" + boja +
                        '}';
            }

            /**
             * Gets the value of the boja property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the boja property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBoja().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             * @return
             *     The value of the boja property.
             */
            public List<String> getBoja() {
                if (boja == null) {
                    boja = new ArrayList<>();
                }
                return this.boja;
            }

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
         *         <element name="Klasa" maxOccurs="45">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *               <maxInclusive value="45"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
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
            "klasa"
        })
        public static class NicanskaKlasifikacija {

            @XmlElement(name = "Klasa", namespace = "http://www.ftn.uns.ac.rs/zig", type = Integer.class)
            protected List<Integer> klasa;

            public NicanskaKlasifikacija(NicanskaKlasifikacijaDTO nicanskaKlasifikacija) {
                this.klasa = nicanskaKlasifikacija.klasa;
            }
            public NicanskaKlasifikacija(){

            }
            @Override
            public String toString() {
                return "NicanskaKlasifikacija{" +
                        "klasa=" + klasa +
                        '}';
            }

            /**
             * Gets the value of the klasa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the klasa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKlasa().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             * @return
             *     The value of the klasa property.
             */
            public List<Integer> getKlasa() {
                if (klasa == null) {
                    klasa = new ArrayList<>();
                }
                return this.klasa;
            }

        }

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
     *         <element name="Zatrazeno_pravo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Osnov" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "zatrazenoPravo",
        "osnov"
    })
    public static class PravoPrvenstva {

        @XmlElement(name = "Zatrazeno_pravo", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        protected String zatrazenoPravo;
        @XmlElement(name = "Osnov", namespace = "http://www.ftn.uns.ac.rs/zig", required = true)
        protected String osnov;

        public PravoPrvenstva(PravoPrvenstvaDTO pravoPrvenstva) {
            this.zatrazenoPravo = pravoPrvenstva.zatrazenoPravo;
            this.osnov = pravoPrvenstva.osnov;
        }

        public PravoPrvenstva(){

        }

        @Override
        public String toString() {
            return "PravoPrvenstva{" +
                    "zatrazenoPravo='" + zatrazenoPravo + '\'' +
                    ", osnov='" + osnov + '\'' +
                    '}';
        }

        /**
         * Gets the value of the zatrazenoPravo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZatrazenoPravo() {
            return zatrazenoPravo;
        }

        /**
         * Sets the value of the zatrazenoPravo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZatrazenoPravo(String value) {
            this.zatrazenoPravo = value;
        }

        /**
         * Gets the value of the osnov property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOsnov() {
            return osnov;
        }

        /**
         * Sets the value of the osnov property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOsnov(String value) {
            this.osnov = value;
        }

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
     *         <element name="Osnovna_taksa">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *               <minInclusive value="0"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Klasna_taksa" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Broj_klasa">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                         <maxInclusive value="45"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="Iznos">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *                         <minInclusive value="0"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Taksa_za_graficko_resenje" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *               <minInclusive value="0"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Ukupna_taksa">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *               <minInclusive value="0"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
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
        "osnovnaTaksa",
        "klasnaTaksa",
        "taksaZaGrafickoResenje",
        "ukupnaTaksa"
    })
    public static class Takse {

        @XmlElement(name = "Osnovna_taksa", namespace = "http://www.ftn.uns.ac.rs/zig")
        protected double osnovnaTaksa;
        @XmlElement(name = "Klasna_taksa", namespace = "http://www.ftn.uns.ac.rs/zig")
        protected Prijava.Takse.KlasnaTaksa klasnaTaksa;
        @XmlElement(name = "Taksa_za_graficko_resenje", namespace = "http://www.ftn.uns.ac.rs/zig")
        protected Double taksaZaGrafickoResenje;
        @XmlElement(name = "Ukupna_taksa", namespace = "http://www.ftn.uns.ac.rs/zig")
        protected double ukupnaTaksa;

        public Takse(TakseDTO takse) {
            this.osnovnaTaksa = takse.osnovnaTaksa;
            this.klasnaTaksa = new KlasnaTaksa(takse.klasnaTaksa);
            this.taksaZaGrafickoResenje = takse.taksaZaGrafickoResenje;
            this.ukupnaTaksa = takse.ukupnaTaksa;
        }

        public Takse(){

        }

        @Override
        public String toString() {
            return "Takse{" +
                    "osnovnaTaksa=" + osnovnaTaksa +
                    ", klasnaTaksa=" + klasnaTaksa +
                    ", taksaZaGrafickoResenje=" + taksaZaGrafickoResenje +
                    ", ukupnaTaksa=" + ukupnaTaksa +
                    '}';
        }

        /**
         * Gets the value of the osnovnaTaksa property.
         * 
         */
        public double getOsnovnaTaksa() {
            return osnovnaTaksa;
        }

        /**
         * Sets the value of the osnovnaTaksa property.
         * 
         */
        public void setOsnovnaTaksa(double value) {
            this.osnovnaTaksa = value;
        }

        /**
         * Gets the value of the klasnaTaksa property.
         * 
         * @return
         *     possible object is
         *     {@link Prijava.Takse.KlasnaTaksa }
         *     
         */
        public Prijava.Takse.KlasnaTaksa getKlasnaTaksa() {
            return klasnaTaksa;
        }

        /**
         * Sets the value of the klasnaTaksa property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prijava.Takse.KlasnaTaksa }
         *     
         */
        public void setKlasnaTaksa(Prijava.Takse.KlasnaTaksa value) {
            this.klasnaTaksa = value;
        }

        /**
         * Gets the value of the taksaZaGrafickoResenje property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getTaksaZaGrafickoResenje() {
            return taksaZaGrafickoResenje;
        }

        /**
         * Sets the value of the taksaZaGrafickoResenje property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setTaksaZaGrafickoResenje(Double value) {
            this.taksaZaGrafickoResenje = value;
        }

        /**
         * Gets the value of the ukupnaTaksa property.
         * 
         */
        public double getUkupnaTaksa() {
            return ukupnaTaksa;
        }

        /**
         * Sets the value of the ukupnaTaksa property.
         * 
         */
        public void setUkupnaTaksa(double value) {
            this.ukupnaTaksa = value;
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
         *         <element name="Broj_klasa">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *               <maxInclusive value="45"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Iznos">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
         *               <minInclusive value="0"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
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
            "brojKlasa",
            "iznos"
        })
        public static class KlasnaTaksa {

            @XmlElement(name = "Broj_klasa", namespace = "http://www.ftn.uns.ac.rs/zig")
            protected int brojKlasa;
            @XmlElement(name = "Iznos", namespace = "http://www.ftn.uns.ac.rs/zig")
            protected double iznos;

            public KlasnaTaksa(KlasnaTaksaDTO klasnaTaksa) {
                this.brojKlasa = klasnaTaksa.brojKlasa;
                this.iznos = klasnaTaksa.iznos;
            }
            public KlasnaTaksa(){

            }

            @Override
            public String toString() {
                return "KlasnaTaksa{" +
                        "brojKlasa=" + brojKlasa +
                        ", iznos=" + iznos +
                        '}';
            }

            /**
             * Gets the value of the brojKlasa property.
             * 
             */
            public int getBrojKlasa() {
                return brojKlasa;
            }

            /**
             * Sets the value of the brojKlasa property.
             * 
             */
            public void setBrojKlasa(int value) {
                this.brojKlasa = value;
            }

            /**
             * Gets the value of the iznos property.
             * 
             */
            public double getIznos() {
                return iznos;
            }

            /**
             * Sets the value of the iznos property.
             * 
             */
            public void setIznos(double value) {
                this.iznos = value;
            }

        }

    }

}
