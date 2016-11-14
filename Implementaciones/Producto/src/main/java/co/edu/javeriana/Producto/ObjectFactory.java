
package co.edu.javeriana.Producto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.javeriana.Producto package. 
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

    private final static QName _ActualizarProductoRes_QNAME = new QName("http://www.ABC.com/schemaProduct", "actualizarProductoRes");
    private final static QName _ConsultarProductoRes_QNAME = new QName("http://www.ABC.com/schemaProduct", "consultarProductoRes");
    private final static QName _ActualizarProductoReq_QNAME = new QName("http://www.ABC.com/schemaProduct", "actualizarProductoReq");
    private final static QName _HeaderReq_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerReq");
    private final static QName _ConsultarProductoReq_QNAME = new QName("http://www.ABC.com/schemaProduct", "consultarProductoReq");
    private final static QName _HeaderRes_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerRes");
    private final static QName _ConsultarProductoReqClave_QNAME = new QName("http://www.ABC.com/schemaProduct", "clave");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.javeriana.Producto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarProductoRes }
     * 
     */
    public ActualizarProductoRes createActualizarProductoRes() {
        return new ActualizarProductoRes();
    }

    /**
     * Create an instance of {@link ConsultarProductoReq }
     * 
     */
    public ConsultarProductoReq createConsultarProductoReq() {
        return new ConsultarProductoReq();
    }

    /**
     * Create an instance of {@link ConsultarProductoRes }
     * 
     */
    public ConsultarProductoRes createConsultarProductoRes() {
        return new ConsultarProductoRes();
    }

    /**
     * Create an instance of {@link ActualizarProductoReq }
     * 
     */
    public ActualizarProductoReq createActualizarProductoReq() {
        return new ActualizarProductoReq();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarProductoRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaProduct", name = "actualizarProductoRes")
    public JAXBElement<ActualizarProductoRes> createActualizarProductoRes(ActualizarProductoRes value) {
        return new JAXBElement<ActualizarProductoRes>(_ActualizarProductoRes_QNAME, ActualizarProductoRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductoRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaProduct", name = "consultarProductoRes")
    public JAXBElement<ConsultarProductoRes> createConsultarProductoRes(ConsultarProductoRes value) {
        return new JAXBElement<ConsultarProductoRes>(_ConsultarProductoRes_QNAME, ConsultarProductoRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarProductoReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaProduct", name = "actualizarProductoReq")
    public JAXBElement<ActualizarProductoReq> createActualizarProductoReq(ActualizarProductoReq value) {
        return new JAXBElement<ActualizarProductoReq>(_ActualizarProductoReq_QNAME, ActualizarProductoReq.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductoReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaProduct", name = "consultarProductoReq")
    public JAXBElement<ConsultarProductoReq> createConsultarProductoReq(ConsultarProductoReq value) {
        return new JAXBElement<ConsultarProductoReq>(_ConsultarProductoReq_QNAME, ConsultarProductoReq.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaProduct", name = "clave", scope = ConsultarProductoReq.class)
    public JAXBElement<String> createConsultarProductoReqClave(String value) {
        return new JAXBElement<String>(_ConsultarProductoReqClave_QNAME, String.class, ConsultarProductoReq.class, value);
    }

}
