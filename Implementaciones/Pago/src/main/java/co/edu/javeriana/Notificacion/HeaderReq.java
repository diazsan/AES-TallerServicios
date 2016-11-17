
package co.edu.javeriana.Notificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para headerReq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="headerReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canalOrigen" type="{http://www.ABC.com/schemaCanonical}canal"/>
 *         &lt;element name="fechaTrx" type="{http://www.ABC.com/schemaCanonical}fechaTrx"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headerReq", propOrder = {
    "canalOrigen",
    "fechaTrx"
})
public class HeaderReq {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Canal canalOrigen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTrx;

    /**
     * Obtiene el valor de la propiedad canalOrigen.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanalOrigen() {
        return canalOrigen;
    }

    /**
     * Define el valor de la propiedad canalOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanalOrigen(Canal value) {
        this.canalOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTrx.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTrx() {
        return fechaTrx;
    }

    /**
     * Define el valor de la propiedad fechaTrx.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTrx(XMLGregorianCalendar value) {
        this.fechaTrx = value;
    }

}
