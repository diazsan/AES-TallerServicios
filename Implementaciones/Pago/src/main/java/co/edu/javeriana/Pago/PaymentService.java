
package co.edu.javeriana.Pago;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PaymentService", targetNamespace = "http://www.ABC.com/PaymentService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PaymentService {


    /**
     * 
     * @param pagarReq
     * @param headerReq
     * @param headerRes
     * @return
     *     returns co.edu.javeriana.Pago.PaymentRes
     */
    @WebMethod(operationName = "Pagar")
    @WebResult(name = "PaymentRes", targetNamespace = "http://www.ABC.com/schemaPayment", partName = "pagarRes")
    public PaymentRes pagar(
        @WebParam(name = "PaymentReq", targetNamespace = "http://www.ABC.com/schemaPayment", partName = "pagarReq")
        PaymentReq pagarReq,
        @WebParam(name = "headerReq", targetNamespace = "http://www.ABC.com/schemaHeader", header = true, partName = "headerReq")
        HeaderReq headerReq,
        @WebParam(name = "headerRes", targetNamespace = "http://www.ABC.com/schemaHeader", header = true, mode = WebParam.Mode.OUT, partName = "headerRes")
        Holder<HeaderRes> headerRes);

}
