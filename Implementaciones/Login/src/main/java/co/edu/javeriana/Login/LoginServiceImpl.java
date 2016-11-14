package co.edu.javeriana.Login;

import javax.jws.WebService;
import javax.xml.ws.Holder;

@WebService(endpointInterface = "co.edu.javeriana.Login.LoginService")
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginRes autenticar(LoginReq autenticarReq,
			HeaderReq headerReq, Holder<HeaderRes> headerRes) {
				
		LoginRes loginRes=new LoginRes();
		loginRes.setNroAutoriza(234565);
		
		HeaderRes headerResponse=new HeaderRes();
		headerResponse.setCodRespuesta(0);
		headerResponse.setDescRespuesta("Transaccion OK");
		headerRes.value=headerResponse;	
		
		return loginRes;
    }
}
