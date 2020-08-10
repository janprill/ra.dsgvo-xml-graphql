
package com.remoteanwalt.domain.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alineaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alineaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="p" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="highlight" type="{}highlightType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="date" type="{}dateType" minOccurs="0"/>
 *                   &lt;element name="quote" type="{}quoteType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="reference" type="{}referenceType" minOccurs="0"/>
 *                   &lt;element name="ft" type="{}ftType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="list" type="{}listType" minOccurs="0"/>
 *         &lt;element name="quote" type="{}quoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="highlight" type="{}highlightType" minOccurs="0"/>
 *         &lt;element name="date" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="note" type="{}noteType" minOccurs="0"/>
 *         &lt;element name="ft" type="{}ftType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alineaType", propOrder = {
    "content"
})
public class AlineaType {

    @XmlElementRefs({
        @XmlElementRef(name = "list", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "date", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quote", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "note", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ft", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "p", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "highlight", type = JAXBElement.class, required = false)
    })
    @XmlMixed
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
     * {@link JAXBElement }{@code <}{@link ListType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link QuoteType }{@code >}
     * {@link JAXBElement }{@code <}{@link NoteType }{@code >}
     * {@link JAXBElement }{@code <}{@link FtType }{@code >}
     * {@link JAXBElement }{@code <}{@link AlineaType.P }{@code >}
     * {@link JAXBElement }{@code <}{@link HighlightType }{@code >}
     * 
     * 
     */
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
     *         &lt;element name="highlight" type="{}highlightType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="date" type="{}dateType" minOccurs="0"/>
     *         &lt;element name="quote" type="{}quoteType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="reference" type="{}referenceType" minOccurs="0"/>
     *         &lt;element name="ft" type="{}ftType" minOccurs="0"/>
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
    public static class P {

        @XmlElementRefs({
            @XmlElementRef(name = "date", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ft", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "highlight", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "reference", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "quote", type = JAXBElement.class, required = false)
        })
        @XmlMixed
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
         * {@link JAXBElement }{@code <}{@link DateType }{@code >}
         * {@link JAXBElement }{@code <}{@link FtType }{@code >}
         * {@link String }
         * {@link JAXBElement }{@code <}{@link HighlightType }{@code >}
         * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
         * {@link JAXBElement }{@code <}{@link QuoteType }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}
