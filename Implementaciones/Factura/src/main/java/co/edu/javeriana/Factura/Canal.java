
package co.edu.javeriana.Factura;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para canal.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="canal">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="3"/>
 *     &lt;enumeration value="CAJ"/>
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="BMO"/>
 *     &lt;enumeration value="OFI"/>
 *     &lt;enumeration value="CNB"/>
 *     &lt;enumeration value="IVR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "canal", namespace = "http://www.ABC.com/schemaCanonical")
@XmlEnum
public enum Canal {

    CAJ,
    WEB,
    BMO,
    OFI,
    CNB,
    IVR;

    public String value() {
        return name();
    }

    public static Canal fromValue(String v) {
        return valueOf(v);
    }

}
