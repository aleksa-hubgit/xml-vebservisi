
package com.example.patent.model;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDetaljiPrijavePatent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDetaljiPrijavePatent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/patent}TDetaljiPrijave"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priznati_datum_podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="potpis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDetaljiPrijavePatent", propOrder = {
    "priznatiDatumPodnosenja",
    "potpis"
})
public class TDetaljiPrijavePatent
    extends TDetaljiPrijave
{

    @XmlElement(name = "priznati_datum_podnosenja", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priznatiDatumPodnosenja;
    @XmlElement(required = true)
    protected String potpis;

    /**
     * Gets the value of the priznatiDatumPodnosenja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriznatiDatumPodnosenja() {
        return priznatiDatumPodnosenja;
    }

    /**
     * Sets the value of the priznatiDatumPodnosenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriznatiDatumPodnosenja(XMLGregorianCalendar value) {
        this.priznatiDatumPodnosenja = value;
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

}
