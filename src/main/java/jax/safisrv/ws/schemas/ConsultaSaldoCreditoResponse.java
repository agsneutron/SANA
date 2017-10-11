
package jax.safisrv.ws.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saldoTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saldoExigibleDia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="proyeccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saldoFinalPlazo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensajeRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "saldoTotal",
    "saldoExigibleDia",
    "proyeccion",
    "saldoFinalPlazo",
    "codigoRespuesta",
    "mensajeRespuesta"
})
@XmlRootElement(name = "ConsultaSaldoCreditoResponse")
public class ConsultaSaldoCreditoResponse {

    @XmlElement(required = true)
    protected String saldoTotal;
    @XmlElement(required = true)
    protected String saldoExigibleDia;
    @XmlElement(required = true)
    protected String proyeccion;
    @XmlElement(required = true)
    protected String saldoFinalPlazo;
    @XmlElement(required = true)
    protected String codigoRespuesta;
    @XmlElement(required = true)
    protected String mensajeRespuesta;

    /**
     * Gets the value of the saldoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * Sets the value of the saldoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoTotal(String value) {
        this.saldoTotal = value;
    }

    /**
     * Gets the value of the saldoExigibleDia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoExigibleDia() {
        return saldoExigibleDia;
    }

    /**
     * Sets the value of the saldoExigibleDia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoExigibleDia(String value) {
        this.saldoExigibleDia = value;
    }

    /**
     * Gets the value of the proyeccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProyeccion() {
        return proyeccion;
    }

    /**
     * Sets the value of the proyeccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProyeccion(String value) {
        this.proyeccion = value;
    }

    /**
     * Gets the value of the saldoFinalPlazo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoFinalPlazo() {
        return saldoFinalPlazo;
    }

    /**
     * Sets the value of the saldoFinalPlazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoFinalPlazo(String value) {
        this.saldoFinalPlazo = value;
    }

    /**
     * Gets the value of the codigoRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Sets the value of the codigoRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuesta(String value) {
        this.codigoRespuesta = value;
    }

    /**
     * Gets the value of the mensajeRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    /**
     * Sets the value of the mensajeRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeRespuesta(String value) {
        this.mensajeRespuesta = value;
    }

}
