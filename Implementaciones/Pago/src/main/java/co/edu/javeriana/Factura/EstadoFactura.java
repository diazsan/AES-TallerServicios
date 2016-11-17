
package co.edu.javeriana.Factura;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estadoFactura.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="estadoFactura">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="2"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "estadoFactura", namespace = "http://www.ABC.com/schemaCanonical")
@XmlEnum
public enum EstadoFactura {

    PA,
    VI,
    VE;

    public String value() {
        return name();
    }

    public static EstadoFactura fromValue(String v) {
        return valueOf(v);
    }

}
