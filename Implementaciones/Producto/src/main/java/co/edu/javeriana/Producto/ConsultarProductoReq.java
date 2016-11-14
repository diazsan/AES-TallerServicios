
package co.edu.javeriana.Producto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarProductoReq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarProductoReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoProducto" type="{http://www.ABC.com/schemaCanonical}tipoProducto"/>
 *         &lt;element name="idProduto" type="{http://www.ABC.com/schemaCanonical}idProducto"/>
 *         &lt;element name="clave" type="{http://www.ABC.com/schemaCanonical}clave" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarProductoReq", propOrder = {
    "tipoProducto",
    "idProduto",
    "clave"
})
public class ConsultarProductoReq {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoProducto tipoProducto;
    @XmlElement(required = true)
    protected String idProduto;
    @XmlElementRef(name = "clave", namespace = "http://www.ABC.com/schemaProduct", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clave;

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

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClave(JAXBElement<String> value) {
        this.clave = value;
    }

}
