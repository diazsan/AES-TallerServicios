package co.edu.javeriana.Producto;

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

@WebService(endpointInterface = "co.edu.javeriana.Producto.ProductService")
public class ProductServiceImpl implements ProductService {

    @Override
    public ConsultarProductoRes consultar(ConsultarProductoReq consulta,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {
				
		ConsultarProductoRes cansProdRes=new ConsultarProductoRes();
		cansProdRes.setDescProducto("cuenta Ahorros");
		cansProdRes.setSaldoProducto(5355354.34);
		
		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Consulta productos exitosa");
		headerRes.value=headerResponse;	
		
		invocarLog("ProductService: Sale de consulta de cuenta " + consulta.getIdProduto());
		
		return cansProdRes;
    }
	
	public ActualizarProductoRes actualizar(ActualizarProductoReq actualiza,
			HeaderReq headerReq, Holder<HeaderRes> headerRes){
		
		ActualizarProductoRes actualizaProdRes=new ActualizarProductoRes();
		actualizaProdRes.setDescProducto("cuenta Ahorros");
		actualizaProdRes.setSaldoProducto(22222.56);
		
		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Debito a producto exitoso");
		headerRes.value=headerResponse;		
		
		invocarLog("ProductService: Sale de actualizacion de cuenta " + actualiza.getIdProduto()+" - por valor de "+actualiza.getValorDebito());

		return	actualizaProdRes;	
	}
	
	@SuppressWarnings("deprecation")
	public void invocarLog(String mensaje) {
		// cliente del servicio de log(recomendamos sea asincrono)
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
