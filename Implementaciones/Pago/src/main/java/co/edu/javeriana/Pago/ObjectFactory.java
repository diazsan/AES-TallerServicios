
package co.edu.javeriana.Pago;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.javeriana.Pago package. 
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

    private final static QName _PaymentReq_QNAME = new QName("http://www.ABC.com/schemaPayment", "PaymentReq");
    private final static QName _PaymentRes_QNAME = new QName("http://www.ABC.com/schemaPayment", "PaymentRes");
    private final static QName _HeaderReq_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerReq");
    private final static QName _HeaderRes_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerRes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.javeriana.Pago
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentReq }
     * 
     */
    public PaymentReq createPaymentReq() {
        return new PaymentReq();
    }

    /**
     * Create an instance of {@link PaymentRes }
     * 
     */
    public PaymentRes createPaymentRes() {
        return new PaymentRes();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaPayment", name = "PaymentReq")
    public JAXBElement<PaymentReq> createPaymentReq(PaymentReq value) {
        return new JAXBElement<PaymentReq>(_PaymentReq_QNAME, PaymentReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaPayment", name = "PaymentRes")
    public JAXBElement<PaymentRes> createPaymentRes(PaymentRes value) {
        return new JAXBElement<PaymentRes>(_PaymentRes_QNAME, PaymentRes.class, null, value);
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

}
