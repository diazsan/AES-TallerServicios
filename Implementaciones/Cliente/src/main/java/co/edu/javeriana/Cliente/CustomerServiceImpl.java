package co.edu.javeriana.Cliente;

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

@WebService(endpointInterface = "co.edu.javeriana.Cliente.CustomerService")
public class CustomerServiceImpl implements CustomerService {

    @Override
    public ConsultarClienteRes consultar(ConsultarClienteReq consulta,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {
				
		ConsultarClienteRes consultaRes=new ConsultarClienteRes();
		consultaRes.setNombreCliente("Pedro AES");
		long numCel=3124567890L;
		consultaRes.setCelular(numCel);
		consultaRes.setCorreo("algo@algo.com");

		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Consulta datos cliente exitoso");
		headerRes.value=headerResponse;		
		invocarLog("CustomerService: Sale de la consulta de cliente " + consulta.getIdUsuario());
        return consultaRes;
    }

    @Override
    public ConsultarProdClienteRes consultarProd(ConsultarProdClienteReq consultaProd,
			HeaderReq headerReq, Holder<HeaderRes> headerRes)  {
		
		ConsultarProdClienteRes productosRes=new ConsultarProdClienteRes();
		
		ProductoCliente producto1=new ProductoCliente();
		TipoProducto tipoProd1=TipoProducto.AHO;
		producto1.setTipoProducto(tipoProd1);
		producto1.setIdProduto("00987654");
		productosRes.getProducto().add(producto1);
		
		ProductoCliente producto2=new ProductoCliente();
		TipoProducto tipoProd2=TipoProducto.TCR;
		producto2.setTipoProducto(tipoProd2);
		producto2.setIdProduto("4123541234567819");		
		productosRes.getProducto().add(producto2);
		
		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Consulta productos cliente exitoso");
		headerRes.value=headerResponse;	
		
		invocarLog("CustomerService: Sale de la consulta de productos para la cedula " + consultaProd.getIdUsuario());

        return productosRes;
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
