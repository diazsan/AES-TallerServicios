package co.edu.javeriana.Pago;

import javax.jws.WebService;
import javax.xml.ws.Holder;

@WebService(endpointInterface = "co.edu.javeriana.Pago.PaymentService")
public class PaymentServiceImpl implements PaymentService {

    @Override
    public PaymentRes pagar(PaymentReq pagarReq,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {
				
		PaymentRes payRes=new PaymentRes();
		payRes.setNroAutoriza(434366);
		EstadoPago estado=EstadoPago.E;
		payRes.setEstadoPago(estado);
		
		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Transaccion OK");
		headerRes.value=headerResponse;	
		
		return payRes;
    }
	
}
