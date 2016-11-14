package co.edu.javeriana.Cliente;

import javax.jws.WebService;
import javax.xml.ws.Holder;

@WebService(endpointInterface = "co.edu.javeriana.Cliente.CustomerService")
public class CustomerServiceImpl implements CustomerService {

    @Override
    public ConsultarClienteRes consultar(ConsultarClienteReq consulta,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {
				
		ConsultarClienteRes consultaRes=new ConsultarClienteRes();
		consultaRes.setNombreCliente("pedro");
		long numCel=3124567890L;
		consultaRes.setCelular(numCel);
		consultaRes.setCorreo("algo@algo.com");

		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Transaccion OK");
		headerRes.value=headerResponse;		

        return consultaRes;
    }

    @Override
    public ConsultarProdClienteRes consultarProd(ConsultarProdClienteReq consultaProd,
			HeaderReq headerReq, Holder<HeaderRes> headerRes)  {
		
		ConsultarProdClienteRes productosRes=new ConsultarProdClienteRes();
		
		ProductoCliente producto=new ProductoCliente();
		TipoProducto tipoProd=TipoProducto.AHO;
		producto.setTipoProducto(tipoProd);
		producto.setIdProduto("00987654");
		productosRes.getProducto().add(producto);
		
		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Transaccion OK");
		headerRes.value=headerResponse;	

        return productosRes;
    }
}
