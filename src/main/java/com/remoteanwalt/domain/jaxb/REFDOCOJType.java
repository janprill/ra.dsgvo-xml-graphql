
package com.remoteanwalt.domain.jaxb;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for REF.DOC.OJType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REF.DOC.OJType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="COLL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DATE.PUB" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NO.OJ" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PAGE.FIRST" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REF.DOC.OJType", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class REFDOCOJType {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "COLL")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String coll;
    @XmlAttribute(name = "DATE.PUB")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String datepub;
    @XmlAttribute(name = "NO.OJ")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nooj;
    @XmlAttribute(name = "PAGE.FIRST")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pagefirst;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCOLL() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCOLL(String value) {
        this.coll = value;
    }

    /**
     * Gets the value of the datepub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDATEPUB() {
        return datepub;
    }

    /**
     * Sets the value of the datepub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDATEPUB(String value) {
        this.datepub = value;
    }

    /**
     * Gets the value of the nooj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNOOJ() {
        return nooj;
    }

    /**
     * Sets the value of the nooj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNOOJ(String value) {
        this.nooj = value;
    }

    /**
     * Gets the value of the pagefirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPAGEFIRST() {
        return pagefirst;
    }

    /**
     * Sets the value of the pagefirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPAGEFIRST(String value) {
        this.pagefirst = value;
    }

}
