
package co.edu.javeriana.Login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoginReq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoginReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoLogin" type="{http://www.ABC.com/schemaCanonical}tipoLogin"/>
 *         &lt;element name="nroLogin" type="{http://www.ABC.com/schemaCanonical}nroLogin"/>
 *         &lt;element name="clave" type="{http://www.ABC.com/schemaCanonical}clave"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginReq", namespace = "http://www.ABC.com/schemaLogin", propOrder = {
    "tipoLogin",
    "nroLogin",
    "clave"
})
public class LoginReq {

    @XmlElement(required = true)
    protected String tipoLogin;
    @XmlElement(required = true)
    protected String nroLogin;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad tipoLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLogin() {
        return tipoLogin;
    }

    /**
     * Define el valor de la propiedad tipoLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLogin(String value) {
        this.tipoLogin = value;
    }

    /**
     * Obtiene el valor de la propiedad nroLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroLogin() {
        return nroLogin;
    }

    /**
     * Define el valor de la propiedad nroLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroLogin(String value) {
        this.nroLogin = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

}
