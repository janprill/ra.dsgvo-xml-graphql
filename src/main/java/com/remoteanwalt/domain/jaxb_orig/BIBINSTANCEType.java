
package com.remoteanwalt.domain.jaxb_orig;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BIB.INSTANCEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIB.INSTANCEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DOCUMENT.REF" type="{}DOCUMENT.REFType"/>
 *         &lt;element name="EEA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATE" type="{}DATEType"/>
 *         &lt;element name="LG.DOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NO.SEQ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAGE.FIRST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAGE.SEQ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAGE.LAST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAGE.TOTAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NO.DOC" type="{}NO.DOCType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIB.INSTANCEType", propOrder = {
    "documentref",
    "eea",
    "date",
    "lgdoc",
    "noseq",
    "pagefirst",
    "pageseq",
    "pagelast",
    "pagetotal",
    "nodoc"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class BIBINSTANCEType {

    @XmlElement(name = "DOCUMENT.REF", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DOCUMENTREFType documentref;
    @XmlElement(name = "EEA", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String eea;
    @XmlElement(name = "DATE", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DATEType date;
    @XmlElement(name = "LG.DOC", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String lgdoc;
    @XmlElement(name = "NO.SEQ", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String noseq;
    @XmlElement(name = "PAGE.FIRST", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pagefirst;
    @XmlElement(name = "PAGE.SEQ", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pageseq;
    @XmlElement(name = "PAGE.LAST", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pagelast;
    @XmlElement(name = "PAGE.TOTAL", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pagetotal;
    @XmlElement(name = "NO.DOC", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected NODOCType nodoc;

    /**
     * Gets the value of the documentref property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTREFType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DOCUMENTREFType getDOCUMENTREF() {
        return documentref;
    }

    /**
     * Sets the value of the documentref property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTREFType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDOCUMENTREF(DOCUMENTREFType value) {
        this.documentref = value;
    }

    /**
     * Gets the value of the eea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEEA() {
        return eea;
    }

    /**
     * Sets the value of the eea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEEA(String value) {
        this.eea = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DATEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DATEType getDATE() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDATE(DATEType value) {
        this.date = value;
    }

    /**
     * Gets the value of the lgdoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLGDOC() {
        return lgdoc;
    }

    /**
     * Sets the value of the lgdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLGDOC(String value) {
        this.lgdoc = value;
    }

    /**
     * Gets the value of the noseq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNOSEQ() {
        return noseq;
    }

    /**
     * Sets the value of the noseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNOSEQ(String value) {
        this.noseq = value;
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

    /**
     * Gets the value of the pageseq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPAGESEQ() {
        return pageseq;
    }

    /**
     * Sets the value of the pageseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPAGESEQ(String value) {
        this.pageseq = value;
    }

    /**
     * Gets the value of the pagelast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPAGELAST() {
        return pagelast;
    }

    /**
     * Sets the value of the pagelast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPAGELAST(String value) {
        this.pagelast = value;
    }

    /**
     * Gets the value of the pagetotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPAGETOTAL() {
        return pagetotal;
    }

    /**
     * Sets the value of the pagetotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPAGETOTAL(String value) {
        this.pagetotal = value;
    }

    /**
     * Gets the value of the nodoc property.
     * 
     * @return
     *     possible object is
     *     {@link NODOCType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public NODOCType getNODOC() {
        return nodoc;
    }

    /**
     * Sets the value of the nodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NODOCType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-04T07:43:30+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNODOC(NODOCType value) {
        this.nodoc = value;
    }

}
