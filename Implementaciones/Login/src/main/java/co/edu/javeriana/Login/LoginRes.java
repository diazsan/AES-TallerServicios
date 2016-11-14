
package co.edu.javeriana.Login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoginRes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoginRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nroAutoriza" type="{http://www.ABC.com/schemaCanonical}nroAutoriza"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginRes", namespace = "http://www.ABC.com/schemaLogin", propOrder = {
    "nroAutoriza"
})
public class LoginRes {

    @XmlSchemaType(name = "long")
    protected int nroAutoriza;

    /**
     * Obtiene el valor de la propiedad nroAutoriza.
     * 
     */
    public int getNroAutoriza() {
        return nroAutoriza;
    }

    /**
     * Define el valor de la propiedad nroAutoriza.
     * 
     */
    public void setNroAutoriza(int value) {
        this.nroAutoriza = value;
    }

}
