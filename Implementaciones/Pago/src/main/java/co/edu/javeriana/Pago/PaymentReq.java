
package co.edu.javeriana.Pago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentReq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prodOrigen" type="{http://www.ABC.com/schemaCanonical}prodOrigen"/>
 *         &lt;element name="ProdDestino" type="{http://www.ABC.com/schemaCanonical}ProdDestino"/>
 *         &lt;element name="valor" type="{http://www.ABC.com/schemaCanonical}valor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReq", namespace = "http://www.ABC.com/schemaPayment", propOrder = {
    "prodOrigen",
    "prodDestino",
    "valor"
})
public class PaymentReq {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProdOrigen prodOrigen;
    @XmlElement(name = "ProdDestino", required = true)
    protected String prodDestino;
    protected double valor;

    /**
     * Obtiene el valor de la propiedad prodOrigen.
     * 
     * @return
     *     possible object is
     *     {@link ProdOrigen }
     *     
     */
    public ProdOrigen getProdOrigen() {
        return prodOrigen;
    }

    /**
     * Define el valor de la propiedad prodOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdOrigen }
     *     
     */
    public void setProdOrigen(ProdOrigen value) {
        this.prodOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad prodDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdDestino() {
        return prodDestino;
    }

    /**
     * Define el valor de la propiedad prodDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdDestino(String value) {
        this.prodDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
