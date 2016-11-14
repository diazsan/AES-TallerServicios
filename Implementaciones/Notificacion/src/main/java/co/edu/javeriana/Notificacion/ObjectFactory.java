
package co.edu.javeriana.Notificacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.javeriana.Notificacion package. 
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

    private final static QName _NotificacionReq_QNAME = new QName("http://www.ABC.com/schemaNotification", "notificacionReq");
    private final static QName _HeaderReq_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerReq");
    private final static QName _HeaderRes_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerRes");
    private final static QName _NotificacionReqDescripcionNotifica_QNAME = new QName("http://www.ABC.com/schemaNotification", "descripcionNotifica");
    private final static QName _NotificacionReqMensajeNotifica_QNAME = new QName("http://www.ABC.com/schemaNotification", "mensajeNotifica");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.javeriana.Notificacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificacionReq }
     * 
     */
    public NotificacionReq createNotificacionReq() {
        return new NotificacionReq();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificacionReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaNotification", name = "notificacionReq")
    public JAXBElement<NotificacionReq> createNotificacionReq(NotificacionReq value) {
        return new JAXBElement<NotificacionReq>(_NotificacionReq_QNAME, NotificacionReq.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaNotification", name = "descripcionNotifica", scope = NotificacionReq.class)
    public JAXBElement<String> createNotificacionReqDescripcionNotifica(String value) {
        return new JAXBElement<String>(_NotificacionReqDescripcionNotifica_QNAME, String.class, NotificacionReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaNotification", name = "mensajeNotifica", scope = NotificacionReq.class)
    public JAXBElement<String> createNotificacionReqMensajeNotifica(String value) {
        return new JAXBElement<String>(_NotificacionReqMensajeNotifica_QNAME, String.class, NotificacionReq.class, value);
    }

}
