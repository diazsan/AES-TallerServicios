
package co.edu.javeriana.Login;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.javeriana.Login package. 
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

    private final static QName _LoginReq_QNAME = new QName("http://www.ABC.com/schemaLogin", "LoginReq");
    private final static QName _LoginRes_QNAME = new QName("http://www.ABC.com/schemaLogin", "LoginRes");
    private final static QName _HeaderReq_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerReq");
    private final static QName _HeaderRes_QNAME = new QName("http://www.ABC.com/schemaHeader", "headerRes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.javeriana.Login
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginRes }
     * 
     */
    public LoginRes createLoginRes() {
        return new LoginRes();
    }

    /**
     * Create an instance of {@link LoginReq }
     * 
     */
    public LoginReq createLoginReq() {
        return new LoginReq();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaLogin", name = "LoginReq")
    public JAXBElement<LoginReq> createLoginReq(LoginReq value) {
        return new JAXBElement<LoginReq>(_LoginReq_QNAME, LoginReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ABC.com/schemaLogin", name = "LoginRes")
    public JAXBElement<LoginRes> createLoginRes(LoginRes value) {
        return new JAXBElement<LoginRes>(_LoginRes_QNAME, LoginRes.class, null, value);
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
