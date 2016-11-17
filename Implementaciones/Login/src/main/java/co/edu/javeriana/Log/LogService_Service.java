
package co.edu.javeriana.Log;

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
@WebServiceClient(name = "LogService", targetNamespace = "http://www.ABC.com/LogService/", wsdlLocation = "file:/D:/Especializacion/Model_Val_Arquitectura/AES-TallerServicios/Implementaciones/Log/src/main/resources/co/edu/javeriana/Log/wsdl/LogService.wsdl")
public class LogService_Service
    extends Service
{

    private final static URL LOGSERVICE_WSDL_LOCATION;
    private final static WebServiceException LOGSERVICE_EXCEPTION;
    private final static QName LOGSERVICE_QNAME = new QName("http://www.ABC.com/LogService/", "LogService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Especializacion/Model_Val_Arquitectura/AES-TallerServicios/Implementaciones/Log/src/main/resources/co/edu/javeriana/Log/wsdl/LogService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOGSERVICE_WSDL_LOCATION = url;
        LOGSERVICE_EXCEPTION = e;
    }

    public LogService_Service() {
        super(__getWsdlLocation(), LOGSERVICE_QNAME);
    }

    public LogService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOGSERVICE_QNAME, features);
    }

    public LogService_Service(URL wsdlLocation) {
        super(wsdlLocation, LOGSERVICE_QNAME);
    }

    public LogService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOGSERVICE_QNAME, features);
    }

    public LogService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LogService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LogService
     */
    @WebEndpoint(name = "LogServicePort")
    public LogService getLogServicePort() {
        return super.getPort(new QName("http://www.ABC.com/LogService/", "LogServicePort"), LogService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LogService
     */
    @WebEndpoint(name = "LogServicePort")
    public LogService getLogServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ABC.com/LogService/", "LogServicePort"), LogService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOGSERVICE_EXCEPTION!= null) {
            throw LOGSERVICE_EXCEPTION;
        }
        return LOGSERVICE_WSDL_LOCATION;
    }

}