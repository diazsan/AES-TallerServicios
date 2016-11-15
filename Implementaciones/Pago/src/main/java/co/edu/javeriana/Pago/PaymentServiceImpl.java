package co.edu.javeriana.Pago;

import javax.jws.WebService;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import co.edu.javeriana.Producto.ActualizarProductoReq;
import co.edu.javeriana.Producto.ActualizarProductoRes;
import co.edu.javeriana.Producto.ProductService;
import co.edu.javeriana.Producto.ProductService_Service;

@WebService(endpointInterface = "co.edu.javeriana.Pago.PaymentService")
public class PaymentServiceImpl implements PaymentService {

    @Override
    public PaymentRes pagar(PaymentReq pagarReq,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {
    	
    	
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
