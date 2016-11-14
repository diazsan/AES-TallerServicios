
package co.edu.javeriana.Producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarProductoRes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarProductoRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descProducto" type="{http://www.ABC.com/schemaCanonical}nombre"/>
 *         &lt;element name="saldoProducto" type="{http://www.ABC.com/schemaCanonical}saldoProducto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarProductoRes", propOrder = {
    "descProducto",
    "saldoProducto"
})
public class ActualizarProductoRes {

    @XmlElement(required = true)
    protected String descProducto;
    protected double saldoProducto;

    /**
     * Obtiene el valor de la propiedad descProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescProducto() {
        return descProducto;
    }

    /**
     * Define el valor de la propiedad descProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescProducto(String value) {
        this.descProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoProducto.
     * 
     */
    public double getSaldoProducto() {
        return saldoProducto;
    }

    /**
     * Define el valor de la propiedad saldoProducto.
     * 
     */
    public void setSaldoProducto(double value) {
        this.saldoProducto = value;
    }

}
