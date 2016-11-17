package co.edu.javeriana.Factura;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import co.edu.javeriana.Log.LogReq;
import co.edu.javeriana.Log.LogService;
import co.edu.javeriana.Log.LogService_Service;
import co.edu.javeriana.aes.modval.pagos.artifacts.Pago;
import co.edu.javeriana.aes.modval.pagos.artifacts.PagosInerface;
import co.edu.javeriana.aes.modval.pagos.artifacts.ReferenciaFactura;
import co.edu.javeriana.aes.modval.pagos.artifacts.Resultado;
import co.edu.javeriana.aes.modval.pagos.artifacts.ServiciosPagos;

@WebService(endpointInterface = "co.edu.javeriana.Factura.BillService")
public class BillServiceImpl implements BillService {

	@Override
	public ConsultarFacturaRes consultar(ConsultarFacturaReq consulta,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {

		return null;
	}

	@Override
	public PagarFacturaRes pagar(PagarFacturaReq pagar, HeaderReq headerReq,
			Holder<HeaderRes> headerRes) {
		
		invocarLog("Entra a enviar el pago");
		ServiciosPagos servPag = new ServiciosPagos();
		PagosInerface pagoStub = servPag.getPagos();
		Pago pago = new Pago();
		ReferenciaFactura ref = new ReferenciaFactura();
		ref.setReferenciaFactura(pagar.getRefPago());
		pago.setTotalPagar(33333);
		pago.setReferenciaFactura(ref);

		BindingProvider bindingProvider = (BindingProvider) pagoStub;
		bindingProvider
				.getRequestContext()
				.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
						"http://localhost:8080/Workshop1-SOAP-Service-1.0-SNAPSHOT/PagosServiceService");
		bindingProvider
		.getRequestContext()
		.put(BindingProvider.SOAPACTION_URI_PROPERTY,
				"http://localhost:8080/Workshop1-SOAP-Service-1.0-SNAPSHOT/PagosServiceService/pagar");		
 

		Resultado res = null;
		invocarLog("Antes de enviar el pago");
		res = pagoStub.pagar(pago);

		PagarFacturaRes payRes = new PagarFacturaRes();
		payRes.setValor(3333);

		HeaderRes headerResponse = new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta(res.getMensaje());
		headerRes.value = headerResponse;

		return null;
	}

	@Override
	public CompensarFacturaRes compensar(CompensarFacturaReq compensar,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {

		return null;
	}

	public void invocarLog(String mensaje) {
		// cliente del servicio de log(recomendamos se asincrono)
		Date hoy = new Date();
		hoy.getDate();
		GregorianCalendar calen = new GregorianCalendar();
		calen.setTime(hoy);
		XMLGregorianCalendar date2 = null;
		try {
			date2 = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(calen);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		co.edu.javeriana.Log.HeaderReq headReqLog = new co.edu.javeriana.Log.HeaderReq();
		co.edu.javeriana.Log.Canal canalLog = co.edu.javeriana.Log.Canal.CAJ;
		headReqLog.setCanalOrigen(canalLog);
		headReqLog.setFechaTrx(date2);
		LogService_Service logServ = new LogService_Service();
		LogService logStub = logServ.getLogServicePort();
		co.edu.javeriana.Log.LogReq log = new LogReq();
		BindingProvider bindingLog = (BindingProvider) logStub;
		bindingLog
				.getRequestContext()
				.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
						"http://localhost:8080/LogService-1.0-SNAPSHOT/LogServiceImplService");

		// Graba log pago
		log.setDescripcion(mensaje);
		logStub.grabar(log, headReqLog);
	}
}
