
package com.remoteanwalt.domain.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datestr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateType", propOrder = {
    "iso",
    "datestr"
})
public class DateType {

    @XmlElement(required = true)
    protected String iso;
    @XmlElement(required = true)
    protected String datestr;

    /**
     * Gets the value of the iso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso() {
        return iso;
    }

    /**
     * Sets the value of the iso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso(String value) {
        this.iso = value;
    }

    /**
     * Gets the value of the datestr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatestr() {
        return datestr;
    }

    /**
     * Sets the value of the datestr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatestr(String value) {
        this.datestr = value;
    }

}
