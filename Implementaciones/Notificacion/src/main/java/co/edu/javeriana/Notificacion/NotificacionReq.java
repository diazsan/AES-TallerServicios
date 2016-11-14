
package co.edu.javeriana.Notificacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para notificacionReq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="notificacionReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origenNotifica" type="{http://www.ABC.com/schemaCanonical}origenNotifica"/>
 *         &lt;element name="destinoNotifica" type="{http://www.ABC.com/schemaCanonical}destinoNotifica"/>
 *         &lt;element name="mensajeNotifica" type="{http://www.ABC.com/schemaCanonical}mensajeNotifica" minOccurs="0"/>
 *         &lt;element name="descripcionNotifica" type="{http://www.ABC.com/schemaCanonical}descripcionNotifica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificacionReq", namespace = "http://www.ABC.com/schemaNotification", propOrder = {
    "origenNotifica",
    "destinoNotifica",
    "mensajeNotifica",
    "descripcionNotifica"
})
public class NotificacionReq {

    @XmlElement(required = true)
    protected String origenNotifica;
    @XmlElement(required = true)
    protected String destinoNotifica;
    @XmlElementRef(name = "mensajeNotifica", namespace = "http://www.ABC.com/schemaNotification", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensajeNotifica;
    @XmlElementRef(name = "descripcionNotifica", namespace = "http://www.ABC.com/schemaNotification", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionNotifica;

    /**
     * Obtiene el valor de la propiedad origenNotifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenNotifica() {
        return origenNotifica;
    }

    /**
     * Define el valor de la propiedad origenNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenNotifica(String value) {
        this.origenNotifica = value;
    }

    /**
     * Obtiene el valor de la propiedad destinoNotifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoNotifica() {
        return destinoNotifica;
    }

    /**
     * Define el valor de la propiedad destinoNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoNotifica(String value) {
        this.destinoNotifica = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeNotifica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensajeNotifica() {
        return mensajeNotifica;
    }

    /**
     * Define el valor de la propiedad mensajeNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensajeNotifica(JAXBElement<String> value) {
        this.mensajeNotifica = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionNotifica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionNotifica() {
        return descripcionNotifica;
    }

    /**
     * Define el valor de la propiedad descripcionNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionNotifica(JAXBElement<String> value) {
        this.descripcionNotifica = value;
    }

}
