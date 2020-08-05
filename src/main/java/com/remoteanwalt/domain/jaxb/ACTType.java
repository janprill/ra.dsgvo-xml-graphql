
package com.remoteanwalt.domain.jaxb;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ACTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIB.INSTANCE" type="{}BIB.INSTANCEType"/>
 *         &lt;element name="TITLE" type="{}TITLEType"/>
 *         &lt;element name="PREAMBLE" type="{}PREAMBLEType"/>
 *         &lt;element name="ENACTING.TERMS" type="{}ENACTING.TERMSType"/>
 *         &lt;element name="FINAL" type="{}FINALType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ACT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTType", propOrder = {
    "bibinstance",
    "title",
    "preamble",
    "enactingterms",
    "_final"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ACTType {

    @XmlElement(name = "BIB.INSTANCE", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BIBINSTANCEType bibinstance;
    @XmlElement(name = "TITLE", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TITLEType title;
    @XmlElement(name = "PREAMBLE", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PREAMBLEType preamble;
    @XmlElement(name = "ENACTING.TERMS", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ENACTINGTERMSType enactingterms;
    @XmlElement(name = "FINAL", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected FINALType _final;

    /**
     * Gets the value of the bibinstance property.
     * 
     * @return
     *     possible object is
     *     {@link BIBINSTANCEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BIBINSTANCEType getBIBINSTANCE() {
        return bibinstance;
    }

    /**
     * Sets the value of the bibinstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BIBINSTANCEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBIBINSTANCE(BIBINSTANCEType value) {
        this.bibinstance = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link TITLEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TITLEType getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTITLE(TITLEType value) {
        this.title = value;
    }

    /**
     * Gets the value of the preamble property.
     * 
     * @return
     *     possible object is
     *     {@link PREAMBLEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PREAMBLEType getPREAMBLE() {
        return preamble;
    }

    /**
     * Sets the value of the preamble property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREAMBLEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPREAMBLE(PREAMBLEType value) {
        this.preamble = value;
    }

    /**
     * Gets the value of the enactingterms property.
     * 
     * @return
     *     possible object is
     *     {@link ENACTINGTERMSType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ENACTINGTERMSType getENACTINGTERMS() {
        return enactingterms;
    }

    /**
     * Sets the value of the enactingterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENACTINGTERMSType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setENACTINGTERMS(ENACTINGTERMSType value) {
        this.enactingterms = value;
    }

    /**
     * Gets the value of the final property.
     * 
     * @return
     *     possible object is
     *     {@link FINALType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public FINALType getFINAL() {
        return _final;
    }

    /**
     * Sets the value of the final property.
     * 
     * @param value
     *     allowed object is
     *     {@link FINALType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFINAL(FINALType value) {
        this._final = value;
    }

}
