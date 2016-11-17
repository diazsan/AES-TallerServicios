
package co.edu.javeriana.Factura;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.javeriana.Factura package. 
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

    private final static QName _PagarFacturaReq_QNAME = new QName("http://www.ABC.com/schemaBill", "pagarFacturaReq");
    private final static QName _PagarFacturaRes_QNAME = new QName("http://www.ABC.com/schemaBill", "pagarFacturaRes");
    private final static QName _HeaderReq_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerReq");
    private final static QName _ConsultarFacturaReq_QNAME = new QName("http://www.ABC.com/schemaBill", "consultarFacturaReq");
    private final static QName _HeaderRes_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerRes");
    private final static QName _CompensarFacturaReq_QNAME = new QName("http://www.ABC.com/schemaBill", "compensarFacturaReq");
    private final static QName _CompensarFacturaRes_QNAME = new QName("http://www.ABC.com/schemaBill", "compensarFacturaRes");
    private final static QName _ConsultarFacturaRes_QNAME = new QName("http://www.ABC.com/schemaBill", "consultarFacturaRes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.javeriana.Factura
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PagarFacturaRes }
     * 
     */
    public PagarFacturaRes createPagarFacturaRes() {
        return new PagarFacturaRes();
    }

    /**
     * Create an instance of {@link PagarFacturaReq }
     * 
     */
    public PagarFacturaReq createPagarFacturaReq() {
        return new PagarFacturaReq();
    }

    /**
     * Create an instance of {@link ConsultarFacturaRes }
     * 
     */
    public ConsultarFacturaRes createConsultarFacturaRes() {
        return new ConsultarFacturaRes();
    }

    /**
     * Create an instance of {@link CompensarFacturaRes }
     * 
     */
    public CompensarFacturaRes createCompensarFacturaRes() {
        return new CompensarFacturaRes();
    }

    /**
     * Create an instance of {@link CompensarFacturaReq }
     * 
     */
    public CompensarFacturaReq createCompensarFacturaReq() {
        return new CompensarFacturaReq();
    }

    /**
     * Create an instance of {@link ConsultarFacturaReq }
     * 
     */
    public ConsultarFacturaReq createConsultarFacturaReq() {
        return new ConsultarFacturaReq();
    }

    /**
     * Create an instance of {@link HeaderReq }
     * 
     */
    public HeaderReq createHeaderReq() {
        return new HeaderReq();
    }

    /**
     * Create an instance of {@link HeaderRes }
     * 
     */
    public HeaderRes createHeaderRes() {
        return new HeaderRes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagarFacturaReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaBill", name = "pagarFacturaReq")
    public JAXBElement<PagarFacturaReq> createPagarFacturaReq(PagarFacturaReq value) {
        return new JAXBElement<PagarFacturaReq>(_PagarFacturaReq_QNAME, PagarFacturaReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagarFacturaRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaBill", name = "pagarFacturaRes")
    public JAXBElement<PagarFacturaRes> createPagarFacturaRes(PagarFacturaRes value) {
        return new JAXBElement<PagarFacturaRes>(_PagarFacturaRes_QNAME, PagarFacturaRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaHeader", name = "headerReq")
    public JAXBElement<HeaderReq> createHeaderReq(HeaderReq value) {
        return new JAXBElement<HeaderReq>(_HeaderReq_QNAME, HeaderReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFacturaReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaBill", name = "consultarFacturaReq")
    public JAXBElement<ConsultarFacturaReq> createConsultarFacturaReq(ConsultarFacturaReq value) {
        return new JAXBElement<ConsultarFacturaReq>(_ConsultarFacturaReq_QNAME, ConsultarFacturaReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaHeader", name = "headerRes")
    public JAXBElement<HeaderRes> createHeaderRes(HeaderRes value) {
        return new JAXBElement<HeaderRes>(_HeaderRes_QNAME, HeaderRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompensarFacturaReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaBill", name = "compensarFacturaReq")
    public JAXBElement<CompensarFacturaReq> createCompensarFacturaReq(CompensarFacturaReq value) {
        return new JAXBElement<CompensarFacturaReq>(_CompensarFacturaReq_QNAME, CompensarFacturaReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompensarFacturaRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaBill", name = "compensarFacturaRes")
    public JAXBElement<CompensarFacturaRes> createCompensarFacturaRes(CompensarFacturaRes value) {
        return new JAXBElement<CompensarFacturaRes>(_CompensarFacturaRes_QNAME, CompensarFacturaRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFacturaRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaBill", name = "consultarFacturaRes")
    public JAXBElement<ConsultarFacturaRes> createConsultarFacturaRes(ConsultarFacturaRes value) {
        return new JAXBElement<ConsultarFacturaRes>(_ConsultarFacturaRes_QNAME, ConsultarFacturaRes.class, null, value);
    }

}
