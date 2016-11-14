
package co.edu.javeriana.Notificacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoProducto.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoProducto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="3"/>
 *     &lt;enumeration value="AHO"/>
 *     &lt;enumeration value="COR"/>
 *     &lt;enumeration value="TCR"/>
 *     &lt;enumeration value="TDE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoProducto", namespace = "http://www.ABC.com/schemaCanonical")
@XmlEnum
public enum TipoProducto {

    AHO,
    COR,
    TCR,
    TDE;

    public String value() {
        return name();
    }

    public static TipoProducto fromValue(String v) {
        return valueOf(v);
    }

}
