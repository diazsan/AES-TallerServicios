
package co.edu.javeriana.Notificacion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NotificationService", targetNamespace = "http://www.ABC.com/NotificationService/", wsdlLocation = "file:/D:/Especializacion/Model_Val_Arquitectura/AES-TallerServicios/Implementaciones/Notificacion/src/main/resources/co/edu/javeriana/Notificacion/wsdl/NotificationService.wsdl")
public class NotificationService_Service
    extends Service
{

    private final static URL NOTIFICATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException NOTIFICATIONSERVICE_EXCEPTION;
    private final static QName NOTIFICATIONSERVICE_QNAME = new QName("http://www.ABC.com/NotificationService/", "NotificationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Especializacion/Model_Val_Arquitectura/AES-TallerServicios/Implementaciones/Notificacion/src/main/resources/co/edu/javeriana/Notificacion/wsdl/NotificationService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NOTIFICATIONSERVICE_WSDL_LOCATION = url;
        NOTIFICATIONSERVICE_EXCEPTION = e;
    }

    public NotificationService_Service() {
        super(__getWsdlLocation(), NOTIFICATIONSERVICE_QNAME);
    }

    public NotificationService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NOTIFICATIONSERVICE_QNAME, features);
    }

    public NotificationService_Service(URL wsdlLocation) {
        super(wsdlLocation, NOTIFICATIONSERVICE_QNAME);
    }

    public NotificationService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NOTIFICATIONSERVICE_QNAME, features);
    }

    public NotificationService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NotificationService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NotificationService
     */
    @WebEndpoint(name = "NotificationServicePort")
    public NotificationService getNotificationServicePort() {
        return super.getPort(new QName("http://www.ABC.com/NotificationService/", "NotificationServicePort"), NotificationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NotificationService
     */
    @WebEndpoint(name = "NotificationServicePort")
    public NotificationService getNotificationServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ABC.com/NotificationService/", "NotificationServicePort"), NotificationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NOTIFICATIONSERVICE_EXCEPTION!= null) {
            throw NOTIFICATIONSERVICE_EXCEPTION;
        }
        return NOTIFICATIONSERVICE_WSDL_LOCATION;
    }

}
