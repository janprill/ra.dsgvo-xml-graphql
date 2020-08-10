
package com.remoteanwalt.domain.jaxb;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for dsgvoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsgvoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{}titleType"/>
 *         &lt;element name="preamble" type="{}preambleType"/>
 *         &lt;element name="terms" type="{}termsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsgvoType", propOrder = {
    "title",
    "preamble",
    "terms"
})
public class DsgvoType {

    @XmlElement(required = true)
    protected TitleType title;
    @XmlElement(required = true)
    protected PreambleType preamble;
    @XmlElement(required = true)
    protected TermsType terms;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link TitleType }
     *     
     */
    public TitleType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleType }
     *     
     */
    public void setTitle(TitleType value) {
        this.title = value;
    }

    /**
     * Gets the value of the preamble property.
     * 
     * @return
     *     possible object is
     *     {@link PreambleType }
     *     
     */
    public PreambleType getPreamble() {
        return preamble;
    }

    /**
     * Sets the value of the preamble property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreambleType }
     *     
     */
    public void setPreamble(PreambleType value) {
        this.preamble = value;
    }

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link TermsType }
     *     
     */
    public TermsType getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsType }
     *     
     */
    public void setTerms(TermsType value) {
        this.terms = value;
    }

}
