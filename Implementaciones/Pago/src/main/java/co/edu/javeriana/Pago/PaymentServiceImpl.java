package co.edu.javeriana.Pago;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import co.edu.javeriana.Factura.BillService_Service;
import co.edu.javeriana.Factura.PagarFacturaReq;
import co.edu.javeriana.Factura.PagarFacturaRes;
import co.edu.javeriana.Log.*;
import co.edu.javeriana.Notificacion.NotificacionReq;
import co.edu.javeriana.Notificacion.NotificationService;
import co.edu.javeriana.Notificacion.NotificationService_Service;
import co.edu.javeriana.Producto.ActualizarProductoReq;
import co.edu.javeriana.Producto.ActualizarProductoRes;
import co.edu.javeriana.Producto.ProductService;
import co.edu.javeriana.Producto.ProductService_Service;

@WebService(endpointInterface = "co.edu.javeriana.Pago.PaymentService")
public class PaymentServiceImpl implements PaymentService {

    @SuppressWarnings("deprecation")
	@Override
    public PaymentRes pagar(PaymentReq pagarReq,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {
  //cliente del servicio de log(recomendamos se asincrono)  	
		Date hoy=new Date();
		hoy.getDate();		
		GregorianCalendar calen = new GregorianCalendar();
		calen.setTime(hoy);
		XMLGregorianCalendar date2 = null;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(calen);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}  
		co.edu.javeriana.Log.HeaderReq headReqLog=new co.edu.javeriana.Log.HeaderReq();
		co.edu.javeriana.Log.Canal canalLog=co.edu.javeriana.Log.Canal.CAJ;
		headReqLog.setCanalOrigen(canalLog);
		headReqLog.setFechaTrx(date2);			
    	LogService_Service logServ=new LogService_Service();
    	LogService logStub=logServ.getLogServicePort();
    	co.edu.javeriana.Log.LogReq log=new LogReq();
    	BindingProvider bindingLog = (BindingProvider) logStub;
    	bindingLog.getRequestContext().put(
			      BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
			      "http://localhost:8080/LogService-1.0-SNAPSHOT/LogServiceImplService");
    	
    	
 // Invocacion del debito al producto   	
		ProductService_Service produServ=new ProductService_Service();
		ProductService serviceStub=produServ.getProductServicePort();			
		BindingProvider bindingProvider = (BindingProvider) serviceStub;		
		bindingProvider.getRequestContext().put(
			      BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
			      "http://localhost:8080/ProductService-1.0-SNAPSHOT/ProductServiceImplService");		
		ActualizarProductoReq rq=new ActualizarProductoReq();
		co.edu.javeriana.Producto.TipoProducto tipo=co.edu.javeriana.Producto.TipoProducto.AHO;
		rq.setIdProduto("008977");
		rq.setTipoProducto(tipo);		
		co.edu.javeriana.Producto.HeaderReq headReq=new co.edu.javeriana.Producto.HeaderReq();
		co.edu.javeriana.Producto.Canal canal=co.edu.javeriana.Producto.Canal.CAJ;
		headReq.setCanalOrigen(canal);
		headReq.setFechaTrx(headerReq.fechaTrx);
		@SuppressWarnings("unused")
		ActualizarProductoRes responseProd=null;
		Holder<co.edu.javeriana.Producto.HeaderRes> holderHead=new Holder<co.edu.javeriana.Producto.HeaderRes>();		
		responseProd=serviceStub.actualizar(rq, headReq, holderHead);    	
		
// Graba log pago		
		log.setDescripcion("Product: " + holderHead.value.getDescRespuesta()+" - "+holderHead.value.getCodRespuesta());
		logStub.grabar(log, headReqLog);
		
//invocacion pago factura		
		PagarFacturaReq facturaReq=new PagarFacturaReq();
		facturaReq.setConvenio(Integer.parseInt(pagarReq.getProdDestino().substring(0, 3)));
		facturaReq.setRefPago(pagarReq.getProdDestino());
		co.edu.javeriana.Factura.HeaderReq headReqFactura=new co.edu.javeriana.Factura.HeaderReq();
		co.edu.javeriana.Factura.Canal canalFactura=co.edu.javeriana.Factura.Canal.CAJ;
		headReqFactura.setCanalOrigen(canalFactura);
		headReqFactura.setFechaTrx(headerReq.fechaTrx);
		Holder<co.edu.javeriana.Factura.HeaderRes> holderHeadFactura=new Holder<co.edu.javeriana.Factura.HeaderRes>();
		co.edu.javeriana.Factura.BillService_Service billServ=new BillService_Service();
		co.edu.javeriana.Factura.BillService billStub=billServ.getBillServicePort();
		BindingProvider bindingFactura = (BindingProvider) billStub;		
		bindingFactura.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
			      "http://localhost:8080/BillService-1.0-SNAPSHOT/BillServiceImplService");	
		@SuppressWarnings("unused")
		PagarFacturaRes facturaRes=null;
		facturaRes=billStub.pagar(facturaReq, headReqFactura, holderHeadFactura);
		
// Graba log Factura		
		log.setDescripcion("Bill: " + holderHeadFactura.value.getDescRespuesta()+" - "+holderHeadFactura.value.getCodRespuesta());
		logStub.grabar(log, headReqLog);
		
// Invocacion de notificacion(recomendamos sea asincrono)	
		NotificacionReq renotifi=new NotificacionReq();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JAXBElement<String> jaxbElement = 
			    new JAXBElement(new QName("http://www.ABC.com/schemaPayment", ""), String.class, "Se ha hecho el pago de un servicio publico");
		//JAXBElement<String> descri=new JAXBElement<String>(null, null, "Notificacion a usuario");
		renotifi.setDescripcionNotifica(jaxbElement);
		renotifi.setDestinoNotifica("algo@.algo.com");
		renotifi.setOrigenNotifica("algo@.algo.com");
		renotifi.setMensajeNotifica(jaxbElement);
		co.edu.javeriana.Notificacion.HeaderReq headReqNoti=new co.edu.javeriana.Notificacion.HeaderReq();
		co.edu.javeriana.Notificacion.Canal canalNoti=co.edu.javeriana.Notificacion.Canal.CAJ;	
		headReqNoti.setCanalOrigen(canalNoti);
		headReqNoti.setFechaTrx(headerReq.fechaTrx);
		@SuppressWarnings("unused")
		Holder<co.edu.javeriana.Notificacion.HeaderRes> holderHeadNoti=new Holder<co.edu.javeriana.Notificacion.HeaderRes>();
		NotificationService_Service serviNoti=new NotificationService_Service();
		NotificationService notiStub=serviNoti.getNotificationServicePort();
		BindingProvider bindingNoti = (BindingProvider) notiStub;		
		bindingNoti.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
			      "http://localhost:8080/NotificationService-1.0-SNAPSHOT/NotificacionServiceImplService");	
		
// Graba log Notificacion		
		log.setDescripcion("Bill: No devuelve respuesta");
		logStub.grabar(log, headReqLog);

// Enviar respuesta pago
		PaymentRes payRes=new PaymentRes();
		payRes.setNroAutoriza(434366);
		EstadoPago estado=EstadoPago.E;
		payRes.setEstadoPago(estado);
		
		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Pago existoso");
		headerRes.value=headerResponse;	
		
		return payRes;
    }
	
}
