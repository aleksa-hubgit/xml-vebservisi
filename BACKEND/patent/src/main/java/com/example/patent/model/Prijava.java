
package com.example.patent.model;


import javax.xml.bind.annotation.*;

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
 *         &lt;element name="detalji_prijave" type="{http://www.ftn.uns.ac.rs/patent}TDetaljiPrijavePatent"/&gt;
 *         &lt;element name="zahtev" type="{http://www.ftn.uns.ac.rs/patent}TZahtev"/&gt;
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
    "detaljiPrijave",
    "zahtev"
})
@XmlRootElement(name = "prijava")
public class Prijava {

    @XmlElement(name = "detalji_prijave", required = true)
    protected TDetaljiPrijavePatent detaljiPrijave;
    @XmlElement(required = true)
    protected TZahtev zahtev;

    /**
     * Gets the value of the detaljiPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link TDetaljiPrijavePatent }
     *     
     */
    public TDetaljiPrijavePatent getDetaljiPrijave() {
        return detaljiPrijave;
    }

    /**
     * Sets the value of the detaljiPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDetaljiPrijavePatent }
     *     
     */
    public void setDetaljiPrijave(TDetaljiPrijavePatent value) {
        this.detaljiPrijave = value;
    }

    /**
     * Gets the value of the zahtev property.
     * 
     * @return
     *     possible object is
     *     {@link TZahtev }
     *     
     */
    public TZahtev getZahtev() {
        return zahtev;
    }

    /**
     * Sets the value of the zahtev property.
     * 
     * @param value
     *     allowed object is
     *     {@link TZahtev }
     *     
     */
    public void setZahtev(TZahtev value) {
        this.zahtev = value;
    }

}
