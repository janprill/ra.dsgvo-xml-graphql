
package com.remoteanwalt.domain.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.remoteanwalt.domain.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Dsgvo_QNAME = new QName("", "dsgvo");
    private final static QName _PTypeDate_QNAME = new QName("", "date");
    private final static QName _PTypeReference_QNAME = new QName("", "reference");
    private final static QName _PTypeHighlight_QNAME = new QName("", "highlight");
    private final static QName _PTypeQuote_QNAME = new QName("", "quote");
    private final static QName _PTypeFt_QNAME = new QName("", "ft");
    private final static QName _LiTypeTxtNote_QNAME = new QName("", "note");
    private final static QName _AlineaTypeP_QNAME = new QName("", "p");
    private final static QName _AlineaTypeList_QNAME = new QName("", "list");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.remoteanwalt.domain.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlineaType }
     * 
     */
    public AlineaType createAlineaType() {
        return new AlineaType();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link ParagraphType.Alinea }
     * 
     */
    public ParagraphType.Alinea createParagraphTypeAlinea() {
        return new ParagraphType.Alinea();
    }

    /**
     * Create an instance of {@link LiType }
     * 
     */
    public LiType createLiType() {
        return new LiType();
    }

    /**
     * Create an instance of {@link DsgvoType }
     * 
     */
    public DsgvoType createDsgvoType() {
        return new DsgvoType();
    }

    /**
     * Create an instance of {@link TitleType }
     * 
     */
    public TitleType createTitleType() {
        return new TitleType();
    }

    /**
     * Create an instance of {@link TxtType }
     * 
     */
    public TxtType createTxtType() {
        return new TxtType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link QuoteType }
     * 
     */
    public QuoteType createQuoteType() {
        return new QuoteType();
    }

    /**
     * Create an instance of {@link ListType }
     * 
     */
    public ListType createListType() {
        return new ListType();
    }

    /**
     * Create an instance of {@link FtType }
     * 
     */
    public FtType createFtType() {
        return new FtType();
    }

    /**
     * Create an instance of {@link SubtitleType }
     * 
     */
    public SubtitleType createSubtitleType() {
        return new SubtitleType();
    }

    /**
     * Create an instance of {@link NoteType }
     * 
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link DivisionType }
     * 
     */
    public DivisionType createDivisionType() {
        return new DivisionType();
    }

    /**
     * Create an instance of {@link ArticleType }
     * 
     */
    public ArticleType createArticleType() {
        return new ArticleType();
    }

    /**
     * Create an instance of {@link PType }
     * 
     */
    public PType createPType() {
        return new PType();
    }

    /**
     * Create an instance of {@link NpType }
     * 
     */
    public NpType createNpType() {
        return new NpType();
    }

    /**
     * Create an instance of {@link PreambleType }
     * 
     */
    public PreambleType createPreambleType() {
        return new PreambleType();
    }

    /**
     * Create an instance of {@link TermsType }
     * 
     */
    public TermsType createTermsType() {
        return new TermsType();
    }

    /**
     * Create an instance of {@link HighlightType }
     * 
     */
    public HighlightType createHighlightType() {
        return new HighlightType();
    }

    /**
     * Create an instance of {@link AlineaType.P }
     * 
     */
    public AlineaType.P createAlineaTypeP() {
        return new AlineaType.P();
    }

    /**
     * Create an instance of {@link ParagraphType.Alinea.P }
     * 
     */
    public ParagraphType.Alinea.P createParagraphTypeAlineaP() {
        return new ParagraphType.Alinea.P();
    }

    /**
     * Create an instance of {@link LiType.Txt }
     * 
     */
    public LiType.Txt createLiTypeTxt() {
        return new LiType.Txt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DsgvoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dsgvo")
    public JAXBElement<DsgvoType> createDsgvo(DsgvoType value) {
        return new JAXBElement<DsgvoType>(_Dsgvo_QNAME, DsgvoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date", scope = PType.class)
    public JAXBElement<DateType> createPTypeDate(DateType value) {
        return new JAXBElement<DateType>(_PTypeDate_QNAME, DateType.class, PType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reference", scope = PType.class)
    public JAXBElement<ReferenceType> createPTypeReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_PTypeReference_QNAME, ReferenceType.class, PType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighlightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "highlight", scope = PType.class)
    public JAXBElement<HighlightType> createPTypeHighlight(HighlightType value) {
        return new JAXBElement<HighlightType>(_PTypeHighlight_QNAME, HighlightType.class, PType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "quote", scope = PType.class)
    public JAXBElement<QuoteType> createPTypeQuote(QuoteType value) {
        return new JAXBElement<QuoteType>(_PTypeQuote_QNAME, QuoteType.class, PType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ft", scope = PType.class)
    public JAXBElement<FtType> createPTypeFt(FtType value) {
        return new JAXBElement<FtType>(_PTypeFt_QNAME, FtType.class, PType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date", scope = LiType.Txt.class)
    public JAXBElement<DateType> createLiTypeTxtDate(DateType value) {
        return new JAXBElement<DateType>(_PTypeDate_QNAME, DateType.class, LiType.Txt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "note", scope = LiType.Txt.class)
    public JAXBElement<NoteType> createLiTypeTxtNote(NoteType value) {
        return new JAXBElement<NoteType>(_LiTypeTxtNote_QNAME, NoteType.class, LiType.Txt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "quote", scope = LiType.Txt.class)
    public JAXBElement<QuoteType> createLiTypeTxtQuote(QuoteType value) {
        return new JAXBElement<QuoteType>(_PTypeQuote_QNAME, QuoteType.class, LiType.Txt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date", scope = AlineaType.P.class)
    public JAXBElement<DateType> createAlineaTypePDate(DateType value) {
        return new JAXBElement<DateType>(_PTypeDate_QNAME, DateType.class, AlineaType.P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reference", scope = AlineaType.P.class)
    public JAXBElement<ReferenceType> createAlineaTypePReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_PTypeReference_QNAME, ReferenceType.class, AlineaType.P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighlightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "highlight", scope = AlineaType.P.class)
    public JAXBElement<HighlightType> createAlineaTypePHighlight(HighlightType value) {
        return new JAXBElement<HighlightType>(_PTypeHighlight_QNAME, HighlightType.class, AlineaType.P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "quote", scope = AlineaType.P.class)
    public JAXBElement<QuoteType> createAlineaTypePQuote(QuoteType value) {
        return new JAXBElement<QuoteType>(_PTypeQuote_QNAME, QuoteType.class, AlineaType.P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ft", scope = AlineaType.P.class)
    public JAXBElement<FtType> createAlineaTypePFt(FtType value) {
        return new JAXBElement<FtType>(_PTypeFt_QNAME, FtType.class, AlineaType.P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlineaType.P }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "p", scope = AlineaType.class)
    public JAXBElement<AlineaType.P> createAlineaTypeP(AlineaType.P value) {
        return new JAXBElement<AlineaType.P>(_AlineaTypeP_QNAME, AlineaType.P.class, AlineaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date", scope = AlineaType.class)
    public JAXBElement<DateType> createAlineaTypeDate(DateType value) {
        return new JAXBElement<DateType>(_PTypeDate_QNAME, DateType.class, AlineaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighlightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "highlight", scope = AlineaType.class)
    public JAXBElement<HighlightType> createAlineaTypeHighlight(HighlightType value) {
        return new JAXBElement<HighlightType>(_PTypeHighlight_QNAME, HighlightType.class, AlineaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "note", scope = AlineaType.class)
    public JAXBElement<NoteType> createAlineaTypeNote(NoteType value) {
        return new JAXBElement<NoteType>(_LiTypeTxtNote_QNAME, NoteType.class, AlineaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "quote", scope = AlineaType.class)
    public JAXBElement<QuoteType> createAlineaTypeQuote(QuoteType value) {
        return new JAXBElement<QuoteType>(_PTypeQuote_QNAME, QuoteType.class, AlineaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "list", scope = AlineaType.class)
    public JAXBElement<ListType> createAlineaTypeList(ListType value) {
        return new JAXBElement<ListType>(_AlineaTypeList_QNAME, ListType.class, AlineaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ft", scope = AlineaType.class)
    public JAXBElement<FtType> createAlineaTypeFt(FtType value) {
        return new JAXBElement<FtType>(_PTypeFt_QNAME, FtType.class, AlineaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParagraphType.Alinea.P }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "p", scope = ParagraphType.Alinea.class)
    public JAXBElement<ParagraphType.Alinea.P> createParagraphTypeAlineaP(ParagraphType.Alinea.P value) {
        return new JAXBElement<ParagraphType.Alinea.P>(_AlineaTypeP_QNAME, ParagraphType.Alinea.P.class, ParagraphType.Alinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date", scope = ParagraphType.Alinea.class)
    public JAXBElement<DateType> createParagraphTypeAlineaDate(DateType value) {
        return new JAXBElement<DateType>(_PTypeDate_QNAME, DateType.class, ParagraphType.Alinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighlightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "highlight", scope = ParagraphType.Alinea.class)
    public JAXBElement<HighlightType> createParagraphTypeAlineaHighlight(HighlightType value) {
        return new JAXBElement<HighlightType>(_PTypeHighlight_QNAME, HighlightType.class, ParagraphType.Alinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "note", scope = ParagraphType.Alinea.class)
    public JAXBElement<NoteType> createParagraphTypeAlineaNote(NoteType value) {
        return new JAXBElement<NoteType>(_LiTypeTxtNote_QNAME, NoteType.class, ParagraphType.Alinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "quote", scope = ParagraphType.Alinea.class)
    public JAXBElement<QuoteType> createParagraphTypeAlineaQuote(QuoteType value) {
        return new JAXBElement<QuoteType>(_PTypeQuote_QNAME, QuoteType.class, ParagraphType.Alinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "list", scope = ParagraphType.Alinea.class)
    public JAXBElement<ListType> createParagraphTypeAlineaList(ListType value) {
        return new JAXBElement<ListType>(_AlineaTypeList_QNAME, ListType.class, ParagraphType.Alinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ft", scope = ParagraphType.Alinea.class)
    public JAXBElement<FtType> createParagraphTypeAlineaFt(FtType value) {
        return new JAXBElement<FtType>(_PTypeFt_QNAME, FtType.class, ParagraphType.Alinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date", scope = TxtType.class)
    public JAXBElement<DateType> createTxtTypeDate(DateType value) {
        return new JAXBElement<DateType>(_PTypeDate_QNAME, DateType.class, TxtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "note", scope = TxtType.class)
    public JAXBElement<NoteType> createTxtTypeNote(NoteType value) {
        return new JAXBElement<NoteType>(_LiTypeTxtNote_QNAME, NoteType.class, TxtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "quote", scope = TxtType.class)
    public JAXBElement<QuoteType> createTxtTypeQuote(QuoteType value) {
        return new JAXBElement<QuoteType>(_PTypeQuote_QNAME, QuoteType.class, TxtType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date", scope = ParagraphType.Alinea.P.class)
    public JAXBElement<DateType> createParagraphTypeAlineaPDate(DateType value) {
        return new JAXBElement<DateType>(_PTypeDate_QNAME, DateType.class, ParagraphType.Alinea.P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reference", scope = ParagraphType.Alinea.P.class)
    public JAXBElement<ReferenceType> createParagraphTypeAlineaPReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_PTypeReference_QNAME, ReferenceType.class, ParagraphType.Alinea.P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighlightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "highlight", scope = ParagraphType.Alinea.P.class)
    public JAXBElement<HighlightType> createParagraphTypeAlineaPHighlight(HighlightType value) {
        return new JAXBElement<HighlightType>(_PTypeHighlight_QNAME, HighlightType.class, ParagraphType.Alinea.P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "quote", scope = ParagraphType.Alinea.P.class)
    public JAXBElement<QuoteType> createParagraphTypeAlineaPQuote(QuoteType value) {
        return new JAXBElement<QuoteType>(_PTypeQuote_QNAME, QuoteType.class, ParagraphType.Alinea.P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ft", scope = ParagraphType.Alinea.P.class)
    public JAXBElement<FtType> createParagraphTypeAlineaPFt(FtType value) {
        return new JAXBElement<FtType>(_PTypeFt_QNAME, FtType.class, ParagraphType.Alinea.P.class, value);
    }

}
