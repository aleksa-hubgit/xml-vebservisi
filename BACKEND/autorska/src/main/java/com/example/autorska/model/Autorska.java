
package com.example.autorska.model;

import com.example.autorska.dto.*;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


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
 *         <element name="podnosilac_prijave" type="{http://www.ftn.uns.ac.rs/autorksa}TPodnosilacPrijave"/>
 *         <element name="pseudonim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="punomocnik">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="podaci_o_naslovu">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="alternativni_naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="podaci_o_preradi">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="naslov" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   <element name="autor">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             <element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         <element name="vrsta_dela" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="podaci_o_autorima">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="autor" type="{http://www.ftn.uns.ac.rs/autorksa}TPodnosilacPrijave"/>
 *                     <element name="autori">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="autor" maxOccurs="unbounded">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         <element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         <element name="godina_smrti" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="anonimno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="radnom_odnosu" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="namena_dela" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="potpis" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pseudonim",
    "punomocnik",
    "podaciONaslovu",
    "podaciOPreradi",
    "vrstaDela",
    "podaciOAutorima",
    "radnomOdnosu",
    "namenaDela",
    "potpis",
    "detaljiPrijave"
})
@XmlRootElement(name = "autorksa")
public class Autorska {

    @XmlElement(name = "podnosilac_prijave", required = true)
    protected TLice podnosilacPrijave;
    @XmlElement(name="pseudonim")
    protected String pseudonim;
    @XmlElement(required = true)
    protected TLice punomocnik;
    @XmlElement(name = "podaci_o_naslovu", required = true)
    protected PodaciONaslovu podaciONaslovu;
    @XmlElement(name = "podaci_o_preradi", required = true)
    protected PodaciOPreradi podaciOPreradi;
    @XmlElement(name = "vrsta_dela", required = true)
    protected String vrstaDela;
    @XmlElement(name = "podaci_o_autorima", required = true)
    protected PodaciOAutorima podaciOAutorima;
    @XmlElement(name = "radnom_odnosu")
    protected boolean radnomOdnosu;
    @XmlElement(name = "namena_dela", required = true)
    protected String namenaDela;
    @XmlElement(required = true)
    protected String potpis;

    @XmlElement(name = "detalji_prijave", required = true)
    protected TDetaljiPrijave detaljiPrijave;

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
     * Gets the value of the pseudonim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudonim() {
        return pseudonim;
    }

    /**
     * Sets the value of the pseudonim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudonim(String value) {
        this.pseudonim = value;
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
     * Gets the value of the podaciONaslovu property.
     * 
     * @return
     *     possible object is
     *     {@link PodaciONaslovu }
     *     
     */
    public PodaciONaslovu getPodaciONaslovu() {
        return podaciONaslovu;
    }

    /**
     * Sets the value of the podaciONaslovu property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodaciONaslovu }
     *     
     */
    public void setPodaciONaslovu(PodaciONaslovu value) {
        this.podaciONaslovu = value;
    }

    /**
     * Gets the value of the podaciOPreradi property.
     * 
     * @return
     *     possible object is
     *     {@link PodaciOPreradi }
     *     
     */
    public PodaciOPreradi getPodaciOPreradi() {
        return podaciOPreradi;
    }

    /**
     * Sets the value of the podaciOPreradi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodaciOPreradi }
     *     
     */
    public void setPodaciOPreradi(PodaciOPreradi value) {
        this.podaciOPreradi = value;
    }

    /**
     * Gets the value of the vrstaDela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrstaDela() {
        return vrstaDela;
    }

    /**
     * Sets the value of the vrstaDela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrstaDela(String value) {
        this.vrstaDela = value;
    }

    /**
     * Gets the value of the podaciOAutorima property.
     * 
     * @return
     *     possible object is
     *     {@link PodaciOAutorima }
     *     
     */
    public PodaciOAutorima getPodaciOAutorima() {
        return podaciOAutorima;
    }

    /**
     * Sets the value of the podaciOAutorima property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodaciOAutorima }
     *     
     */
    public void setPodaciOAutorima(PodaciOAutorima value) {
        this.podaciOAutorima = value;
    }

    /**
     * Gets the value of the radnomOdnosu property.
     * 
     */
    public boolean isRadnomOdnosu() {
        return radnomOdnosu;
    }

    /**
     * Sets the value of the radnomOdnosu property.
     * 
     */
    public void setRadnomOdnosu(boolean value) {
        this.radnomOdnosu = value;
    }

    /**
     * Gets the value of the namenaDela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamenaDela() {
        return namenaDela;
    }

    /**
     * Sets the value of the namenaDela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamenaDela(String value) {
        this.namenaDela = value;
    }

    /**
     * Gets the value of the potpis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotpis() {
        return potpis;
    }

    /**
     * Sets the value of the potpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotpis(String value) {
        this.potpis = value;
    }
    /**
     * Gets the value of the detaljiPrijave property.
     *
     * @return
     *     possible object is
     *     {@link TDetaljiPrijave }
     *
     */
    public TDetaljiPrijave getDetaljiPrijave() {
        return detaljiPrijave;
    }

    /**
     * Sets the value of the detaljiPrijave property.
     *
     * @param value
     *     allowed object is
     *     {@link TDetaljiPrijave }
     *
     */
    public void setDetaljiPrijave(TDetaljiPrijave value) {
        this.detaljiPrijave = value;
    }

    public void addAutor(TLiceDTO autor) throws DatatypeConfigurationException {

        this.podaciOAutorima.autori.autor.add(new PodaciOAutorima.Autori.Autor(autor));
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
     *         <choice>
     *           <element name="autor" type="{http://www.ftn.uns.ac.rs/autorksa}TPodnosilacPrijave"/>
     *           <element name="autori">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="autor" maxOccurs="unbounded">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               <element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               <element name="godina_smrti" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="anonimno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         </choice>
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
        "autori",
        "anonimno"
    })
    public static class PodaciOAutorima {

        protected Autori autori;
        protected boolean anonimno;

        public PodaciOAutorima(PodaciOAutorimaDTO podaciOAutorima) {
            this.autori = new Autori();
            this.anonimno = podaciOAutorima.anonimno;
            for(AutorDTO autorDTO : podaciOAutorima.autori) {
                this.autori.autor.add(new Autori.Autor(autorDTO));
            }


        }

        public PodaciOAutorima() {
        }


        /**
         * Gets the value of the autori property.
         * 
         * @return
         *     possible object is
         *     {@link Autori }
         *     
         */
        public Autori getAutori() {
            return autori;
        }

        /**
         * Sets the value of the autori property.
         * 
         * @param value
         *     allowed object is
         *     {@link Autori }
         *     
         */
        public void setAutori(Autori value) {
            this.autori = value;
        }

        /**
         * Gets the value of the anonimno property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAnonimno() {
            return anonimno;
        }

        /**
         * Sets the value of the anonimno property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAnonimno(boolean value) {
            this.anonimno = value;
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
         *         <element name="autor" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   <element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   <element name="godina_smrti" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "autor"
        })
        public static class Autori {

            @XmlElement(required = true)
            protected List<Autor> autor;

            public Autori(AutoriDTO autori) {
                this.autor = new ArrayList<>();
                for (AutorDTO autor : autori.autor) {
                    this.autor.add(new Autor(autor));
                }
            }
            public Autori(){
                this.autor = new ArrayList<>();
            }

            /**
             * Gets the value of the autor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the autor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAutor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Autor }
             * 
             * 
             * @return
             *     The value of the autor property.
             */
            public List<Autor> getAutor() {
                if (autor == null) {
                    autor = new ArrayList<>();
                }
                return this.autor;
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
             *         <element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         <element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         <element name="godina_smrti" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "ime",
                "prezime",
                "godinaSmrti"
            })
            public static class Autor {

                @XmlElement(required = true)
                protected String ime;
                @XmlElement(required = true)
                protected String prezime;
                @XmlElement(name = "godina_smrti", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar godinaSmrti;

                public Autor(AutorDTO autor) {
                    this.ime = autor.ime;
                    this.prezime = autor.prezime;
                    this.godinaSmrti = autor.godinaSmrti;
                }

                public Autor(){}

                public Autor(TLiceDTO autor) throws DatatypeConfigurationException {
                    this.ime = autor.getIme();
                    this.prezime = autor.getPrezime();
                    GregorianCalendar cal = new GregorianCalendar();
                    cal.setTime(new Date());

                    XMLGregorianCalendar xCal = DatatypeFactory.newInstance()
                            .newXMLGregorianCalendar(cal);

                    this.godinaSmrti = xCal;

                }

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

                /**
                 * Gets the value of the godinaSmrti property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getGodinaSmrti() {
                    return godinaSmrti;
                }

                /**
                 * Sets the value of the godinaSmrti property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setGodinaSmrti(XMLGregorianCalendar value) {
                    this.godinaSmrti = value;
                }

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
     *         <element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="alternativni_naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "naslov",
        "alternativniNaslov"
    })
    public static class PodaciONaslovu {

        @XmlElement(required = true)
        protected String naslov;
        @XmlElement(name = "alternativni_naslov", required = true)
        protected String alternativniNaslov;

        public PodaciONaslovu(PodaciONaslovuDTO podaciONaslovu) {
            this.naslov = podaciONaslovu.naslov;
            this.alternativniNaslov = podaciONaslovu.alternativniNaslov;
        }
        public PodaciONaslovu() {
        }

        /**
         * Gets the value of the naslov property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaslov() {
            return naslov;
        }

        /**
         * Sets the value of the naslov property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaslov(String value) {
            this.naslov = value;
        }

        /**
         * Gets the value of the alternativniNaslov property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternativniNaslov() {
            return alternativniNaslov;
        }

        /**
         * Sets the value of the alternativniNaslov property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternativniNaslov(String value) {
            this.alternativniNaslov = value;
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
     *         <element name="naslov" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         <element name="autor">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   <element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "naslov",
        "autor"
    })
    public static class PodaciOPreradi {

        @XmlElement(required = true)
        protected String naslov;
        @XmlElement(required = true)
        protected PodaciOAutorima.Autori.Autor autor;

        public PodaciOPreradi(PodaciOPreradiDTO podaciOPreradi) {
            this.naslov = podaciOPreradi.naslov;
            this.autor = new PodaciOAutorima.Autori.Autor(podaciOPreradi.autor);
        }

        public PodaciOPreradi() {
        }

        /**
         * Gets the value of the naslov property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public String getNaslov() {
            return naslov;
        }

        /**
         * Sets the value of the naslov property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNaslov(String value) {
            this.naslov = value;
        }

        /**
         * Gets the value of the autor property.
         * 
         * @return
         *     possible object is
         *     {@link PodaciOAutorima.Autori.Autor }
         *     
         */
        public PodaciOAutorima.Autori.Autor getAutor() {
            return autor;
        }

        /**
         * Sets the value of the autor property.
         * 
         * @param value
         *     allowed object is
         *     {@link PodaciOAutorima.Autori.Autor }
         *     
         */
        public void setAutor(PodaciOAutorima.Autori.Autor value) {
            this.autor = value;
        }




    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "TDetaljiPrijave", propOrder = {
            "brojPrijave",
            "datumPodnosenja"
    })

    public static class TDetaljiPrijave {

        @XmlElement(name = "broj_prijave", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected String brojPrijave;
        @XmlElement(name = "datum_podnosenja", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumPodnosenja;

        public TDetaljiPrijave(TDetaljiPrijaveDTO prvobitnaPrijava) {
            this.brojPrijave = prvobitnaPrijava.brojPrijave;
            this.datumPodnosenja = prvobitnaPrijava.datumPodnosenja;
        }

        public TDetaljiPrijave() {
        }

        public TDetaljiPrijave(String id, XMLGregorianCalendar xCal) {
            this.brojPrijave = id;
            this.datumPodnosenja = xCal;
        }


        /**
         * Gets the value of the brojPrijave property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
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
         *     {@link BigInteger }
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

    }




}
