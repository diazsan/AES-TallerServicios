package co.edu.javeriana.Log;

import javax.jws.WebService;

@WebService(endpointInterface = "co.edu.javeriana.Log.LogService")
public class LogServiceImpl implements LogService {

    @Override
    public void grabar(LogReq grabar,
			HeaderReq headerReq) {
		System.out.println("entra");
    }
}
