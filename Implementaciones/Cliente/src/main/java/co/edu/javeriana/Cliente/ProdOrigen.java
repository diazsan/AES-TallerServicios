
package co.edu.javeriana.Cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para prodOrigen.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="prodOrigen">
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
@XmlType(name = "prodOrigen", namespace = "http://www.ABC.com/schemaCanonical")
@XmlEnum
public enum ProdOrigen {

    AHO,
    COR,
    TCR,
    TDE;

    public String value() {
        return name();
    }

    public static ProdOrigen fromValue(String v) {
        return valueOf(v);
    }

}
