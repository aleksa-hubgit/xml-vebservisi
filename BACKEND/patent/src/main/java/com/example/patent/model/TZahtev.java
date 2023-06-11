
package com.example.patent.model;

import java.util.ArrayList;
import java.util.List;

import com.example.patent.dto.NacinDostavljanjaDTO;
import com.example.patent.dto.PrethodnePrijaveDTO;
import com.example.patent.dto.TDetaljiPrijaveOznakaDTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TZahtev complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TZahtev"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="naziv_pronalaska" type="{http://www.ftn.uns.ac.rs/patent}TNazivPronalaska"/&gt;
 *         &lt;element name="podnosilac_prijave" type="{http://www.ftn.uns.ac.rs/patent}TPodnosilacPrijave"/&gt;
 *         &lt;element name="pronalazac" type="{http://www.ftn.uns.ac.rs/patent}TPronalazac"/&gt;
 *         &lt;element name="punomocnik" type="{http://www.ftn.uns.ac.rs/patent}TPunomocnik"/&gt;
 *         &lt;element name="adresa_za_dostavljanje" type="{http://www.ftn.uns.ac.rs/patent}TAdresa"/&gt;
 *         &lt;element name="nacin_dostavljanja"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="elektronsko" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="papirno" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tip_prijave"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="DOPUNSKA"/&gt;
 *               &lt;enumeration value="IZDVOJENA"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="prvobitna_prijava" type="{http://www.ftn.uns.ac.rs/patent}TDetaljiPrijave"/&gt;
 *         &lt;element name="prethodne_prijave"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="prethodna_prijava" type="{http://www.ftn.uns.ac.rs/patent}TDetaljiPrijaveOznaka" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dodatni_podaci" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TZahtev", propOrder = {
    "nazivPronalaska",
    "podnosilacPrijave",
    "pronalazac",
    "punomocnik",
    "adresaZaDostavljanje",
    "nacinDostavljanja",
    "tipPrijave",
    "prvobitnaPrijava",
    "prethodnePrijave",
    "dodatniPodaci"
})
public class TZahtev {

    @XmlElement(name = "naziv_pronalaska", required = true)
    protected TNazivPronalaska nazivPronalaska;
    @XmlElement(name = "podnosilac_prijave", required = true)
    protected TLice podnosilacPrijave;
    @XmlElement(required = true)
    protected TLice pronalazac;
    @XmlElement(required = true)
    protected TLice punomocnik;
    @XmlElement(name = "adresa_za_dostavljanje", required = true)
    protected TAdresa adresaZaDostavljanje;
    @XmlElement(name = "nacin_dostavljanja", required = true)
    protected NacinDostavljanja nacinDostavljanja;
    @XmlElement(name = "tip_prijave", required = true)
    protected String tipPrijave;
    @XmlElement(name = "prvobitna_prijava", required = true)
    protected TDetaljiPrijave prvobitnaPrijava;
    @XmlElement(name = "prethodne_prijave", required = true)
    protected PrethodnePrijave prethodnePrijave;
    @XmlElement(name = "dodatni_podaci")
    protected boolean dodatniPodaci;


    public TZahtev() {
        this.prethodnePrijave = new PrethodnePrijave();
    }
    /**
     * Gets the value of the nazivPronalaska property.
     * 
     * @return
     *     possible object is
     *     {@link TNazivPronalaska }
     *     
     */
    public TNazivPronalaska getNazivPronalaska() {
        return nazivPronalaska;
    }

    /**
     * Sets the value of the nazivPronalaska property.
     * 
     * @param value
     *     allowed object is
     *     {@link TNazivPronalaska }
     *     
     */
    public void setNazivPronalaska(TNazivPronalaska value) {
        this.nazivPronalaska = value;
    }

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
     * Gets the value of the pronalazac property.
     * 
     * @return
     *     possible object is
     *     {@link TLice }
     *     
     */
    public TLice getPronalazac() {
        return pronalazac;
    }

    /**
     * Sets the value of the pronalazac property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLice }
     *     
     */
    public void setPronalazac(TLice value) {
        this.pronalazac = value;
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
     * Gets the value of the adresaZaDostavljanje property.
     * 
     * @return
     *     possible object is
     *     {@link TAdresa }
     *     
     */
    public TAdresa getAdresaZaDostavljanje() {
        return adresaZaDostavljanje;
    }

    /**
     * Sets the value of the adresaZaDostavljanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdresa }
     *     
     */
    public void setAdresaZaDostavljanje(TAdresa value) {
        this.adresaZaDostavljanje = value;
    }

    /**
     * Gets the value of the nacinDostavljanja property.
     * 
     * @return
     *     possible object is
     *     {@link NacinDostavljanja }
     *     
     */
    public NacinDostavljanja getNacinDostavljanja() {
        return nacinDostavljanja;
    }

    /**
     * Sets the value of the nacinDostavljanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link NacinDostavljanja }
     *     
     */
    public void setNacinDostavljanja(NacinDostavljanja value) {
        this.nacinDostavljanja = value;
    }

    /**
     * Gets the value of the tipPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipPrijave() {
        return tipPrijave;
    }

    /**
     * Sets the value of the tipPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipPrijave(String value) {
        this.tipPrijave = value;
    }

    /**
     * Gets the value of the prvobitnaPrijava property.
     * 
     * @return
     *     possible object is
     *     {@link TDetaljiPrijave }
     *     
     */
    public TDetaljiPrijave getPrvobitnaPrijava() {
        return prvobitnaPrijava;
    }

    /**
     * Sets the value of the prvobitnaPrijava property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDetaljiPrijave }
     *     
     */
    public void setPrvobitnaPrijava(TDetaljiPrijave value) {
        this.prvobitnaPrijava = value;
    }

    /**
     * Gets the value of the prethodnePrijave property.
     * 
     * @return
     *     possible object is
     *     {@link PrethodnePrijave }
     *     
     */
    public PrethodnePrijave getPrethodnePrijave() {
        return prethodnePrijave;
    }

    /**
     * Sets the value of the prethodnePrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrethodnePrijave }
     *     
     */
    public void setPrethodnePrijave(PrethodnePrijave value) {
        this.prethodnePrijave = value;
    }

    /**
     * Gets the value of the dodatniPodaci property.
     * 
     */
    public boolean isDodatniPodaci() {
        return dodatniPodaci;
    }

    /**
     * Sets the value of the dodatniPodaci property.
     * 
     */
    public void setDodatniPodaci(boolean value) {
        this.dodatniPodaci = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="elektronsko" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="papirno" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "elektronsko",
        "papirno"
    })
    public static class NacinDostavljanja {

        protected boolean elektronsko;
        protected boolean papirno;

        public NacinDostavljanja(NacinDostavljanjaDTO nacinDostavljanja) {
            this.elektronsko = nacinDostavljanja.elektronsko;
            this.papirno = nacinDostavljanja.papirno;
        }

        public NacinDostavljanja() {
        }
        /**
         * Gets the value of the elektronsko property.
         * 
         */
        public boolean isElektronsko() {
            return elektronsko;
        }

        /**
         * Sets the value of the elektronsko property.
         * 
         */
        public void setElektronsko(boolean value) {
            this.elektronsko = value;
        }

        /**
         * Gets the value of the papirno property.
         * 
         */
        public boolean isPapirno() {
            return papirno;
        }

        /**
         * Sets the value of the papirno property.
         * 
         */
        public void setPapirno(boolean value) {
            this.papirno = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="prethodna_prijava" type="{http://www.ftn.uns.ac.rs/patent}TDetaljiPrijaveOznaka" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prethodnaPrijava"
    })
    public static class PrethodnePrijave {

        @XmlElement(name = "prethodna_prijava", required = true)
        protected List<TDetaljiPrijaveOznaka> prethodnaPrijava;

        public PrethodnePrijave(PrethodnePrijaveDTO prethodnePrijave) {
            for (TDetaljiPrijaveOznakaDTO tDetaljiPrijaveOznakaDTO : prethodnePrijave.detaljiPrijaveOznaka) {
                this.prethodnaPrijava.add(new TDetaljiPrijaveOznaka(tDetaljiPrijaveOznakaDTO));
            }
        }

        public PrethodnePrijave(){
            this.prethodnaPrijava = new ArrayList<>();
        }

        /**
         * Gets the value of the prethodnaPrijava property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the prethodnaPrijava property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrethodnaPrijava().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TDetaljiPrijaveOznaka }
         * 
         * 
         */
        public List<TDetaljiPrijaveOznaka> getPrethodnaPrijava() {
            if (prethodnaPrijava == null) {
                prethodnaPrijava = new ArrayList<TDetaljiPrijaveOznaka>();
            }
            return this.prethodnaPrijava;
        }

    }

}
