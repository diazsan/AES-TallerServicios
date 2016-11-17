
package co.edu.javeriana.Log;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoUsuario.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoUsuario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="3"/>
 *     &lt;enumeration value="CED"/>
 *     &lt;enumeration value="NIT"/>
 *     &lt;enumeration value="CEE"/>
 *     &lt;enumeration value="REG"/>
 *     &lt;whiteSpace value="collapse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoUsuario", namespace = "http://www.ABC.com/schemaCanonical")
@XmlEnum
public enum TipoUsuario {

    CED,
    NIT,
    CEE,
    REG;

    public String value() {
        return name();
    }

    public static TipoUsuario fromValue(String v) {
        return valueOf(v);
    }

}
