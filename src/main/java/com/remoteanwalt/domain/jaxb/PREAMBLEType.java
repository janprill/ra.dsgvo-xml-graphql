
package com.remoteanwalt.domain.jaxb;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PREAMBLEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PREAMBLEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PREAMBLE.INIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GR.VISA" type="{}GR.VISAType"/>
 *         &lt;element name="GR.CONSID" type="{}GR.CONSIDType"/>
 *         &lt;element name="PREAMBLE.FINAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PREAMBLEType", propOrder = {
    "preambleinit",
    "grvisa",
    "grconsid",
    "preamblefinal"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PREAMBLEType {

    @XmlElement(name = "PREAMBLE.INIT", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String preambleinit;
    @XmlElement(name = "GR.VISA", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected GRVISAType grvisa;
    @XmlElement(name = "GR.CONSID", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected GRCONSIDType grconsid;
    @XmlElement(name = "PREAMBLE.FINAL", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String preamblefinal;

    /**
     * Gets the value of the preambleinit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPREAMBLEINIT() {
        return preambleinit;
    }

    /**
     * Sets the value of the preambleinit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPREAMBLEINIT(String value) {
        this.preambleinit = value;
    }

    /**
     * Gets the value of the grvisa property.
     * 
     * @return
     *     possible object is
     *     {@link GRVISAType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public GRVISAType getGRVISA() {
        return grvisa;
    }

    /**
     * Sets the value of the grvisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRVISAType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGRVISA(GRVISAType value) {
        this.grvisa = value;
    }

    /**
     * Gets the value of the grconsid property.
     * 
     * @return
     *     possible object is
     *     {@link GRCONSIDType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public GRCONSIDType getGRCONSID() {
        return grconsid;
    }

    /**
     * Sets the value of the grconsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRCONSIDType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGRCONSID(GRCONSIDType value) {
        this.grconsid = value;
    }

    /**
     * Gets the value of the preamblefinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPREAMBLEFINAL() {
        return preamblefinal;
    }

    /**
     * Sets the value of the preamblefinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPREAMBLEFINAL(String value) {
        this.preamblefinal = value;
    }

}
