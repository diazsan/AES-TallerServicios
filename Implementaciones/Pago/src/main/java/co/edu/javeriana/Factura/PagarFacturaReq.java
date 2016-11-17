
package co.edu.javeriana.Factura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pagarFacturaReq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pagarFacturaReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refPago" type="{http://www.ABC.com/schemaCanonical}refPago"/>
 *         &lt;element name="convenio" type="{http://www.ABC.com/schemaCanonical}idConvenio"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagarFacturaReq", propOrder = {
    "refPago",
    "convenio"
})
public class PagarFacturaReq {

    @XmlElement(required = true)
    protected String refPago;
    @XmlSchemaType(name = "integer")
    protected int convenio;

    /**
     * Obtiene el valor de la propiedad refPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPago() {
        return refPago;
    }

    /**
     * Define el valor de la propiedad refPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPago(String value) {
        this.refPago = value;
    }

    /**
     * Obtiene el valor de la propiedad convenio.
     * 
     */
    public int getConvenio() {
        return convenio;
    }

    /**
     * Define el valor de la propiedad convenio.
     * 
     */
    public void setConvenio(int value) {
        this.convenio = value;
    }

}
