/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.Factura;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author ASUS
 */
public class PagosServiceService {

    public static String str_endpoint = "http://localhost:8080/Workshop1-SOAP-Service-1.0-SNAPSHOT/PagosServiceService";

    public String compensar(String referenciaFactura, String totalPagar) {
        String mensajeRespuesta = "";
        String str_Xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sch=\"http://www.servicios.co/pagos/schemas\">\n"
                + "   <soapenv:Header/>\n"
                + "   <soapenv:Body>\n"
                + "      <sch:Pago>\n"
                + "         <sch:referenciaFactura>\n"
                + "            <sch:referenciaFactura>" + referenciaFactura + "</sch:referenciaFactura>\n"
                + "         </sch:referenciaFactura>\n"
                + "         <sch:totalPagar>" + totalPagar + "</sch:totalPagar>\n"
                + "      </sch:Pago>\n"
                + "   </soapenv:Body>\n"
                + "</soapenv:Envelope>";
        String xmlRespuesta = probarServicios(str_Xml, "compensar");
        String[] output1 = xmlRespuesta.split("<mensaje>");
        String[] output2 = output1[1].split("</mensaje>");
        mensajeRespuesta = output2[0];
        return mensajeRespuesta;
    }

    public String consultar(String referenciaFactura) {
        String mensajeRespuesta = "";
        String str_Xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sch=\"http://www.servicios.co/pagos/schemas\">\n"
                + "   <soapenv:Header/>\n"
                + "   <soapenv:Body>\n"
                + "      <sch:ReferenciaFactura>\n"
                + "         <sch:referenciaFactura>" + referenciaFactura + "</sch:referenciaFactura>\n"
                + "      </sch:ReferenciaFactura>\n"
                + "   </soapenv:Body>\n"
                + "</soapenv:Envelope>";
        String xmlRespuesta = probarServicios(str_Xml, "consultar");
        String[] output1 = xmlRespuesta.split("<totalPagar>");
        String[] output2 = output1[1].split("</totalPagar>");
        mensajeRespuesta = output2[0];
        return mensajeRespuesta;
    }

    public String pagar(String referenciaFactura, String totalPagar) {
        String mensajeRespuesta = "";
        String str_Xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sch=\"http://www.servicios.co/pagos/schemas\">\n"
                + "   <soapenv:Header/>\n"
                + "   <soapenv:Body>\n"
                + "      <sch:Pago>\n"
                + "         <sch:referenciaFactura>\n"
                + "            <sch:referenciaFactura>"+referenciaFactura+"</sch:referenciaFactura>\n"
                + "         </sch:referenciaFactura>\n"
                + "         <sch:totalPagar>"+totalPagar+"</sch:totalPagar>\n"
                + "      </sch:Pago>\n"
                + "   </soapenv:Body>\n"
                + "</soapenv:Envelope>";
        String xmlRespuesta = probarServicios(str_Xml, "pagar");
        String[] output1 = xmlRespuesta.split("<mensaje>");
        String[] output2 = output1[1].split("</mensaje>");
        mensajeRespuesta = output2[0];
        return mensajeRespuesta;
    }

    public static String probarServicios(String xmlInput, String SOAPAction) {
        URL url = null;
        URLConnection connection = null;
        HttpURLConnection httpConn = null;
        String responseString = null;
        String outputString = null;
        ByteArrayOutputStream bout = null;
        OutputStream out = null;
        InputStreamReader isr = null;
        BufferedReader in = null;
        outputString = "";
        try {
            url = new URL(str_endpoint);
            connection = url.openConnection();
            httpConn = (HttpURLConnection) connection;
            bout = new ByteArrayOutputStream();
            byte[] buffer = new byte[xmlInput.length()];
            buffer = xmlInput.getBytes();
            bout.write(buffer);
            byte[] b = bout.toByteArray();
            httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
            httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            httpConn.setRequestProperty("SOAPAction", SOAPAction);
            httpConn.setRequestMethod("POST");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            out = httpConn.getOutputStream();
            out.write(b);
            out.close();
            // Read the response and write it to standard out.
            isr = new InputStreamReader(httpConn.getInputStream());
            in = new BufferedReader(isr);
            while ((responseString = in.readLine()) != null) {
                outputString = outputString + responseString;
            }
            return outputString;
        } catch (Exception e) {
            e.printStackTrace();
            return "error al invocar el ws " + e.getMessage();
        }
    }

}
