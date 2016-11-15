package co.edu.javeriana.Producto;

import javax.jws.WebService;
import javax.xml.ws.Holder;

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
		headerResponse.setDescRespuesta("Transaccion OK");
		headerRes.value=headerResponse;	
		
		return cansProdRes;
    }
	
	public ActualizarProductoRes actualizar(ActualizarProductoReq actualiza,
			HeaderReq headerReq, Holder<HeaderRes> headerRes){
		
		ActualizarProductoRes actualizaProdRes=new ActualizarProductoRes();
		actualizaProdRes.setDescProducto("cuenta Ahorros");
		actualizaProdRes.setSaldoProducto(22222.56);
		
		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Transaccion OK");
		headerRes.value=headerResponse;		

		return	actualizaProdRes;	
	}
}
