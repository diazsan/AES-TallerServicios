
package co.edu.javeriana.Cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarProdClienteReq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarProdClienteReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoUsuario" type="{http://www.ABC.com/schemaCanonical}tipoUsuario"/>
 *         &lt;element name="idUsuario" type="{http://www.ABC.com/schemaCanonical}idUsuario"/>
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
@XmlType(name = "consultarProdClienteReq", propOrder = {
    "tipoUsuario",
    "idUsuario",
    "clave"
})
public class ConsultarProdClienteReq {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoUsuario tipoUsuario;
    protected long idUsuario;
    @XmlElementRef(name = "clave", namespace = "http://www.ABC.com/schemaCustomer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clave;

    /**
     * Obtiene el valor de la propiedad tipoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link TipoUsuario }
     *     
     */
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Define el valor de la propiedad tipoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUsuario }
     *     
     */
    public void setTipoUsuario(TipoUsuario value) {
        this.tipoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public long getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(long value) {
        this.idUsuario = value;
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
