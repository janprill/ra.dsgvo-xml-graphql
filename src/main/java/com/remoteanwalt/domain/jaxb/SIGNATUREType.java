
package com.remoteanwalt.domain.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIGNATUREType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIGNATUREType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PL.DATE" type="{}PL.DATEType"/>
 *         &lt;element name="SIGNATORY" type="{}SIGNATORYType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIGNATUREType", propOrder = {
    "pldate",
    "signatory"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SIGNATUREType {

    @XmlElement(name = "PL.DATE", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PLDATEType pldate;
    @XmlElement(name = "SIGNATORY")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<SIGNATORYType> signatory;

    /**
     * Gets the value of the pldate property.
     * 
     * @return
     *     possible object is
     *     {@link PLDATEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PLDATEType getPLDATE() {
        return pldate;
    }

    /**
     * Sets the value of the pldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLDATEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPLDATE(PLDATEType value) {
        this.pldate = value;
    }

    /**
     * Gets the value of the signatory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSIGNATORY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SIGNATORYType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<SIGNATORYType> getSIGNATORY() {
        if (signatory == null) {
            signatory = new ArrayList<SIGNATORYType>();
        }
        return this.signatory;
    }

}
