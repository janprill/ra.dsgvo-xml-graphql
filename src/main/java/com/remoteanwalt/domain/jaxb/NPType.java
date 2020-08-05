
package com.remoteanwalt.domain.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NO.P" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TXT" type="{}TXTType"/>
 *         &lt;element name="P" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HT" type="{}HTType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DATE" type="{}DATEType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="QUOT.START" type="{}QUOT.STARTType" minOccurs="0"/>
 *                   &lt;element name="QUOT.END" type="{}QUOT.ENDType" minOccurs="0"/>
 *                   &lt;element name="REF.DOC.OJ" type="{}REF.DOC.OJType" minOccurs="0"/>
 *                   &lt;element name="LIST" type="{}LISTType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPType", propOrder = {
    "nop",
    "txt",
    "p"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class NPType {

    @XmlElement(name = "NO.P", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nop;
    @XmlElement(name = "TXT", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TXTType txt;
    @XmlElement(name = "P")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected NPType.P p;

    /**
     * Gets the value of the nop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNOP() {
        return nop;
    }

    /**
     * Sets the value of the nop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNOP(String value) {
        this.nop = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link TXTType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TXTType getTXT() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TXTType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTXT(TXTType value) {
        this.txt = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link NPType.P }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public NPType.P getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link NPType.P }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setP(NPType.P value) {
        this.p = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HT" type="{}HTType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DATE" type="{}DATEType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="QUOT.START" type="{}QUOT.STARTType" minOccurs="0"/>
     *         &lt;element name="QUOT.END" type="{}QUOT.ENDType" minOccurs="0"/>
     *         &lt;element name="REF.DOC.OJ" type="{}REF.DOC.OJType" minOccurs="0"/>
     *         &lt;element name="LIST" type="{}LISTType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class P {

        @XmlElementRefs({
            @XmlElementRef(name = "DATE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "QUOT.START", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "HT", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "REF.DOC.OJ", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LIST", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "QUOT.END", type = JAXBElement.class, required = false)
        })
        @XmlMixed
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link DATEType }{@code >}
         * {@link JAXBElement }{@code <}{@link QUOTSTARTType }{@code >}
         * {@link JAXBElement }{@code <}{@link HTType }{@code >}
         * {@link JAXBElement }{@code <}{@link REFDOCOJType }{@code >}
         * {@link JAXBElement }{@code <}{@link LISTType }{@code >}
         * {@link String }
         * {@link JAXBElement }{@code <}{@link QUOTENDType }{@code >}
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}
