
package co.edu.javeriana.Producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para headerRes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="headerRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRespuesta" type="{http://www.ABC.com/schemaCanonical}codRespuesta"/>
 *         &lt;element name="descRespuesta" type="{http://www.ABC.com/schemaCanonical}descRespuesta"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headerRes", namespace = "http://www.ABC.com/schemaHeader", propOrder = {
    "codRespuesta",
    "descRespuesta"
})
public class HeaderRes {

    protected int codRespuesta;
    @XmlElement(required = true)
    protected String descRespuesta;

    /**
     * Obtiene el valor de la propiedad codRespuesta.
     * 
     */
    public int getCodRespuesta() {
        return codRespuesta;
    }

    /**
     * Define el valor de la propiedad codRespuesta.
     * 
     */
    public void setCodRespuesta(int value) {
        this.codRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad descRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRespuesta() {
        return descRespuesta;
    }

    /**
     * Define el valor de la propiedad descRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRespuesta(String value) {
        this.descRespuesta = value;
    }

}
