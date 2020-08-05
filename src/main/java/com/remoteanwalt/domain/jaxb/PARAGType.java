
package com.remoteanwalt.domain.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PARAGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARAGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NO.PARAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ALINEA" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="P" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HT" type="{}HTType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="DATE" type="{}DATEType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="QUOT.START" type="{}QUOT.STARTType" minOccurs="0"/>
 *                             &lt;element name="QUOT.END" type="{}QUOT.ENDType" minOccurs="0"/>
 *                             &lt;element name="REF.DOC.OJ" type="{}REF.DOC.OJType" minOccurs="0"/>
 *                             &lt;element name="LIST" type="{}LISTType" minOccurs="0"/>
 *                             &lt;element name="FT" type="{}FTType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LIST" type="{}LISTType" minOccurs="0"/>
 *                   &lt;element name="QUOT.START" type="{}QUOT.STARTType" minOccurs="0"/>
 *                   &lt;element name="QUOT.END" type="{}QUOT.ENDType" minOccurs="0"/>
 *                   &lt;element name="HT" type="{}HTType" minOccurs="0"/>
 *                   &lt;element name="DATE" type="{}DATEType" minOccurs="0"/>
 *                   &lt;element name="NOTE" type="{}NOTEType" minOccurs="0"/>
 *                   &lt;element name="FT" type="{}FTType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARAGType", propOrder = {
    "noparag",
    "alinea"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PARAGType {

    @XmlElement(name = "NO.PARAG", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String noparag;
    @XmlElement(name = "ALINEA")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<PARAGType.ALINEA> alinea;
    @XmlAttribute(name = "IDENTIFIER")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String identifier;

    /**
     * Gets the value of the noparag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNOPARAG() {
        return noparag;
    }

    /**
     * Sets the value of the noparag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNOPARAG(String value) {
        this.noparag = value;
    }

    /**
     * Gets the value of the alinea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alinea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getALINEA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAGType.ALINEA }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<PARAGType.ALINEA> getALINEA() {
        if (alinea == null) {
            alinea = new ArrayList<PARAGType.ALINEA>();
        }
        return this.alinea;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getIDENTIFIER() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIDENTIFIER(String value) {
        this.identifier = value;
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
     *                   &lt;element name="FT" type="{}FTType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LIST" type="{}LISTType" minOccurs="0"/>
     *         &lt;element name="QUOT.START" type="{}QUOT.STARTType" minOccurs="0"/>
     *         &lt;element name="QUOT.END" type="{}QUOT.ENDType" minOccurs="0"/>
     *         &lt;element name="HT" type="{}HTType" minOccurs="0"/>
     *         &lt;element name="DATE" type="{}DATEType" minOccurs="0"/>
     *         &lt;element name="NOTE" type="{}NOTEType" minOccurs="0"/>
     *         &lt;element name="FT" type="{}FTType" minOccurs="0"/>
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
    public static class ALINEA {

        @XmlElementRefs({
            @XmlElementRef(name = "LIST", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "QUOT.END", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "HT", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "P", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DATE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NOTE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "QUOT.START", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FT", type = JAXBElement.class, required = false)
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
         * {@link JAXBElement }{@code <}{@link LISTType }{@code >}
         * {@link JAXBElement }{@code <}{@link QUOTENDType }{@code >}
         * {@link JAXBElement }{@code <}{@link HTType }{@code >}
         * {@link String }
         * {@link JAXBElement }{@code <}{@link PARAGType.ALINEA.P }{@code >}
         * {@link JAXBElement }{@code <}{@link DATEType }{@code >}
         * {@link JAXBElement }{@code <}{@link NOTEType }{@code >}
         * {@link JAXBElement }{@code <}{@link QUOTSTARTType }{@code >}
         * {@link JAXBElement }{@code <}{@link FTType }{@code >}
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
         *         &lt;element name="FT" type="{}FTType" minOccurs="0"/>
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
                @XmlElementRef(name = "LIST", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "QUOT.END", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "REF.DOC.OJ", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "DATE", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "QUOT.START", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "FT", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "HT", type = JAXBElement.class, required = false)
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
             * {@link JAXBElement }{@code <}{@link LISTType }{@code >}
             * {@link JAXBElement }{@code <}{@link QUOTENDType }{@code >}
             * {@link JAXBElement }{@code <}{@link REFDOCOJType }{@code >}
             * {@link String }
             * {@link JAXBElement }{@code <}{@link DATEType }{@code >}
             * {@link JAXBElement }{@code <}{@link QUOTSTARTType }{@code >}
             * {@link JAXBElement }{@code <}{@link FTType }{@code >}
             * {@link JAXBElement }{@code <}{@link HTType }{@code >}
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

}
