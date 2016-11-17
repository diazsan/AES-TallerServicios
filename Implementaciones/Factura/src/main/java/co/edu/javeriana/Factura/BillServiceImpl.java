package co.edu.javeriana.Factura;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import co.edu.javeriana.Log.LogReq;
import co.edu.javeriana.Log.LogService;
import co.edu.javeriana.Log.LogService_Service;

@WebService(endpointInterface = "co.edu.javeriana.Factura.BillService")
public class BillServiceImpl implements BillService {

	@Override
	public ConsultarFacturaRes consultar(ConsultarFacturaReq consulta,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {

		ConsultarFacturaRes resp = new ConsultarFacturaRes();

		if (tipoConsumo(consulta.getConvenio()) == 1) {

			try {
				HttpClient consult = new DefaultHttpClient();
				// Aca se debe identificar el endpoint del respectivo convenio
				HttpGet req = new HttpGet(
						"http://localhost:8080/Workshop1-REST-Service-1.0-SNAPSHOT/servicios/pagos/v1/payments/123");
				HttpResponse res = consult.execute(req);
				if (res.getStatusLine().getStatusCode() == 200) {
					HttpEntity resEntity = res.getEntity();
					JSONObject jObject = new JSONObject(
							EntityUtils.toString(resEntity));
					resp.setValor(jObject.getDouble("valorFactura"));
					HeaderRes headerResponse = new HeaderRes();
					headerResponse.setCodRespuesta(0);
					headerResponse
							.setDescRespuesta("Consulta en Convenio REST exitosa");
					headerRes.value = headerResponse;
				} else {
					resp.setValor(00000.00);
					HeaderRes headerResponse = new HeaderRes();
					headerResponse.setCodRespuesta(1);
					headerResponse
							.setDescRespuesta("No existe rererencia de pago");
					headerRes.value = headerResponse;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			// Consulta SOAP
			PagosServiceService pss = new PagosServiceService();
			resp.setValor(Double.parseDouble(pss.consultar(consulta
					.getRefPago())));
			HeaderRes headerResponse = new HeaderRes();
			headerResponse.setCodRespuesta(0);
			headerResponse
					.setDescRespuesta("Consulta en Convenio SOAP exitosa");
			headerRes.value = headerResponse;
		}
		invocarLog("BillService: Se invoca servicio para consultar factura "
				+ consulta.getRefPago());
		return resp;
	}

	@Override
	public PagarFacturaRes pagar(PagarFacturaReq pagar, HeaderReq headerReq,
			Holder<HeaderRes> headerRes) {

		PagarFacturaRes resp = new PagarFacturaRes();

		if (tipoConsumo(pagar.getConvenio()) == 1) {
			try {
				HttpClient pago = new DefaultHttpClient();
				// Aca se debe identificar el endpoint del respectivo convenio
				HttpPost req = new HttpPost(
						"http://localhost:8080/Workshop1-REST-Service-1.0-SNAPSHOT/servicios/pagos/v1/payments/123");
				HttpResponse res = pago.execute(req);
				if (res.getStatusLine().getStatusCode() == 200) {
					HttpEntity resEntity = res.getEntity();
					JSONObject jObject = new JSONObject(
							EntityUtils.toString(resEntity));
					resp.setValor(0.0);
					HeaderRes headerResponse = new HeaderRes();
					headerResponse.setCodRespuesta(0);
					headerResponse.setDescRespuesta(jObject.getString("mensaje"));
					headerRes.value = headerResponse;
				} else {
					resp.setValor(00000.00);
					HeaderRes headerResponse = new HeaderRes();
					headerResponse.setCodRespuesta(1);
					headerResponse
							.setDescRespuesta("No existe rererencia de pago");
					headerRes.value = headerResponse;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			// Pago SOAP
			PagosServiceService pss = new PagosServiceService();
			resp.setValor(000.00);
			HeaderRes headerResponse = new HeaderRes();
			headerResponse.setCodRespuesta(0);
			headerResponse.setDescRespuesta(pss.pagar(pagar.getRefPago(),
					pagar.getRefPago()));
			headerRes.value = headerResponse;
		}

		invocarLog("BillService: Se invoco servicio rest para pagar factura "
				+ pagar.getRefPago());
		return resp;
	}

	@Override
	public CompensarFacturaRes compensar(CompensarFacturaReq compensar,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {
		CompensarFacturaRes resp = new CompensarFacturaRes();
		if (tipoConsumo(compensar.getConvenio()) == 1) {
			if (compensar.getConvenio() == 111) {// si es etb
				try {
					HttpClient compens = new DefaultHttpClient();
					HttpDelete req = new HttpDelete(
							"http://localhost:8080/Workshop1-REST-Service-1.0-SNAPSHOT/servicios/pagos/v1/payments/123");
					HttpResponse resCompensa = compens.execute(req);
					if (resCompensa.getStatusLine().getStatusCode() == 200) {
						HttpEntity resEntity = resCompensa.getEntity();
						JSONObject jObject = new JSONObject(
								EntityUtils.toString(resEntity));
						resp.setValor(0.0);
						HeaderRes headerResponse = new HeaderRes();
						headerResponse.setCodRespuesta(0);
						headerResponse.setDescRespuesta(jObject
								.getString("mensaje"));
						headerRes.value = headerResponse;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				// Es gas natural, y aun no esta implementado
				
				HeaderRes headerResponse = new HeaderRes();
				headerResponse.setCodRespuesta(2);
				headerResponse
						.setDescRespuesta("Operacion no soportada para este convenio");
				headerRes.value = headerResponse;
			}
		}else{
// Compensa SOAP
			PagosServiceService pss = new PagosServiceService();
			resp.setValor(000.00);
			HeaderRes headerResponse = new HeaderRes();
			headerResponse.setCodRespuesta(0);
			headerResponse.setDescRespuesta(pss.compensar(compensar.getRefPago(),
					compensar.getRefPago()));
			headerRes.value = headerResponse;
		}
		invocarLog("BillService: Se invoco servicio rest para compensar factura "
				+ compensar.getRefPago());
		return resp;
	}

	@SuppressWarnings("deprecation")
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

	public int tipoConsumo(int convenio) {
		if (convenio == 111 || convenio == 222)
			return 1;// Consumo Rest
		else
			return 2;// consumo SOAP
	}
}
