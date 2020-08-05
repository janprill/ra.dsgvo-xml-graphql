
package com.remoteanwalt.domain.jaxb;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FINALType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FINALType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="P" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SIGNATURE" type="{}SIGNATUREType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FINALType", propOrder = {
    "p",
    "signature"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class FINALType {

    @XmlElement(name = "P", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String p;
    @XmlElement(name = "SIGNATURE", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected SIGNATUREType signature;

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setP(String value) {
        this.p = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SIGNATUREType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public SIGNATUREType getSIGNATURE() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIGNATUREType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSIGNATURE(SIGNATUREType value) {
        this.signature = value;
    }

}
