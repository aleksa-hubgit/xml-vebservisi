
package com.example.patent.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

import com.example.patent.dto.TDetaljiPrijaveDTO;
import com.example.patent.dto.TDetaljiPrijaveOznakaDTO;


/**
 * <p>Java class for TDetaljiPrijave complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDetaljiPrijave"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="broj_prijave" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="datum_podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDetaljiPrijave", propOrder = {
    "brojPrijave",
    "datumPodnosenja"
})
@XmlSeeAlso({
    TDetaljiPrijavePatent.class,
    TDetaljiPrijaveOznaka.class
})
public class TDetaljiPrijave {

    @XmlElement(name = "broj_prijave", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer brojPrijave;
    @XmlElement(name = "datum_podnosenja", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPodnosenja;

    public TDetaljiPrijave(TDetaljiPrijaveDTO prvobitnaPrijava) {
        this.brojPrijave = prvobitnaPrijava.brojPrijave;
        this.datumPodnosenja = prvobitnaPrijava.datumPodnosenja;
    }

    public TDetaljiPrijave() {
    }

    public TDetaljiPrijave(TDetaljiPrijaveOznakaDTO tDetaljiPrijaveOznakaDTO) {
        this.brojPrijave = tDetaljiPrijaveOznakaDTO.brojPrijave;
        this.datumPodnosenja = tDetaljiPrijaveOznakaDTO.datumPodnosenja;

    }

    /**
     * Gets the value of the brojPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getBrojPrijave() {
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
    public void setBrojPrijave(Integer value) {
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
