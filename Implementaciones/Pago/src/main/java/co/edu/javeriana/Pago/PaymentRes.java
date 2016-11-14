
package co.edu.javeriana.Pago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentRes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nroAutoriza" type="{http://www.ABC.com/schemaCanonical}nroAutoriza"/>
 *         &lt;element name="estadoPago" type="{http://www.ABC.com/schemaCanonical}estadoPago"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRes", namespace = "http://www.ABC.com/schemaPayment", propOrder = {
    "nroAutoriza",
    "estadoPago"
})
public class PaymentRes {

    @XmlSchemaType(name = "long")
    protected int nroAutoriza;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EstadoPago estadoPago;

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

    /**
     * Obtiene el valor de la propiedad estadoPago.
     * 
     * @return
     *     possible object is
     *     {@link EstadoPago }
     *     
     */
    public EstadoPago getEstadoPago() {
        return estadoPago;
    }

    /**
     * Define el valor de la propiedad estadoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoPago }
     *     
     */
    public void setEstadoPago(EstadoPago value) {
        this.estadoPago = value;
    }

}
