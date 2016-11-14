
package co.edu.javeriana.Cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.javeriana.Cliente package. 
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

    private final static QName _ConsultarClienteRes_QNAME = new QName("http://www.ABC.com/schemaCustomer", "consultarClienteRes");
    private final static QName _ConsultarClienteReq_QNAME = new QName("http://www.ABC.com/schemaCustomer", "consultarClienteReq");
    private final static QName _HeaderReq_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerReq");
    private final static QName _HeaderRes_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerRes");
    private final static QName _ConsultarProdClienteRes_QNAME = new QName("http://www.ABC.com/schemaCustomer", "consultarProdClienteRes");
    private final static QName _ConsultarProdClienteReq_QNAME = new QName("http://www.ABC.com/schemaCustomer", "consultarProdClienteReq");
    private final static QName _ConsultarClienteReqClave_QNAME = new QName("http://www.ABC.com/schemaCustomer", "clave");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.javeriana.Cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarClienteRes }
     * 
     */
    public ConsultarClienteRes createConsultarClienteRes() {
        return new ConsultarClienteRes();
    }

    /**
     * Create an instance of {@link ConsultarClienteReq }
     * 
     */
    public ConsultarClienteReq createConsultarClienteReq() {
        return new ConsultarClienteReq();
    }

    /**
     * Create an instance of {@link ConsultarProdClienteRes }
     * 
     */
    public ConsultarProdClienteRes createConsultarProdClienteRes() {
        return new ConsultarProdClienteRes();
    }

    /**
     * Create an instance of {@link ConsultarProdClienteReq }
     * 
     */
    public ConsultarProdClienteReq createConsultarProdClienteReq() {
        return new ConsultarProdClienteReq();
    }

    /**
     * Create an instance of {@link ProductoCliente }
     * 
     */
    public ProductoCliente createProductoCliente() {
        return new ProductoCliente();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClienteRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaCustomer", name = "consultarClienteRes")
    public JAXBElement<ConsultarClienteRes> createConsultarClienteRes(ConsultarClienteRes value) {
        return new JAXBElement<ConsultarClienteRes>(_ConsultarClienteRes_QNAME, ConsultarClienteRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClienteReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaCustomer", name = "consultarClienteReq")
    public JAXBElement<ConsultarClienteReq> createConsultarClienteReq(ConsultarClienteReq value) {
        return new JAXBElement<ConsultarClienteReq>(_ConsultarClienteReq_QNAME, ConsultarClienteReq.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaHeader", name = "headerRes")
    public JAXBElement<HeaderRes> createHeaderRes(HeaderRes value) {
        return new JAXBElement<HeaderRes>(_HeaderRes_QNAME, HeaderRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProdClienteRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaCustomer", name = "consultarProdClienteRes")
    public JAXBElement<ConsultarProdClienteRes> createConsultarProdClienteRes(ConsultarProdClienteRes value) {
        return new JAXBElement<ConsultarProdClienteRes>(_ConsultarProdClienteRes_QNAME, ConsultarProdClienteRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProdClienteReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaCustomer", name = "consultarProdClienteReq")
    public JAXBElement<ConsultarProdClienteReq> createConsultarProdClienteReq(ConsultarProdClienteReq value) {
        return new JAXBElement<ConsultarProdClienteReq>(_ConsultarProdClienteReq_QNAME, ConsultarProdClienteReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaCustomer", name = "clave", scope = ConsultarClienteReq.class)
    public JAXBElement<String> createConsultarClienteReqClave(String value) {
        return new JAXBElement<String>(_ConsultarClienteReqClave_QNAME, String.class, ConsultarClienteReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaCustomer", name = "clave", scope = ConsultarProdClienteReq.class)
    public JAXBElement<String> createConsultarProdClienteReqClave(String value) {
        return new JAXBElement<String>(_ConsultarClienteReqClave_QNAME, String.class, ConsultarProdClienteReq.class, value);
    }

}
