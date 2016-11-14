
package co.edu.javeriana.Cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productoCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoCliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoProducto" type="{http://www.ABC.com/schemaCanonical}tipoProducto"/>
 *         &lt;element name="idProduto" type="{http://www.ABC.com/schemaCanonical}idProducto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoCliente", propOrder = {
    "tipoProducto",
    "idProduto"
})
public class ProductoCliente {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoProducto tipoProducto;
    @XmlElement(required = true)
    protected String idProduto;

    /**
     * Obtiene el valor de la propiedad tipoProducto.
     * 
     * @return
     *     possible object is
     *     {@link TipoProducto }
     *     
     */
    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Define el valor de la propiedad tipoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoProducto }
     *     
     */
    public void setTipoProducto(TipoProducto value) {
        this.tipoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad idProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProduto() {
        return idProduto;
    }

    /**
     * Define el valor de la propiedad idProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProduto(String value) {
        this.idProduto = value;
    }

}
