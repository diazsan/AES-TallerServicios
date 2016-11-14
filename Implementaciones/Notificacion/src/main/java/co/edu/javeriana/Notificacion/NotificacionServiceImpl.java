package co.edu.javeriana.Notificacion;

import javax.jws.WebService;
import javax.xml.ws.Holder;

@WebService(endpointInterface = "co.edu.javeriana.Notificacion.NotificationService")
public class NotificacionServiceImpl implements NotificationService {

    @Override
    public void notificar(NotificacionReq notificacionReq,
			HeaderReq headerReq) {
			System.out.println("entro");
    }
}
