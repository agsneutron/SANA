
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
 *         &lt;element name="creditoID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saldoExigible" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saldoTotalActual" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "creditoID",
    "numTransaccion",
    "saldoExigible",
    "saldoTotalActual",
    "codigoRespuesta",
    "mensajeRespuesta"
})
@XmlRootElement(name = "PagoCreditoResponse")
public class PagoCreditoResponse {

    @XmlElement(required = true)
    protected String creditoID;
    @XmlElement(required = true)
    protected String numTransaccion;
    @XmlElement(required = true)
    protected String saldoExigible;
    @XmlElement(required = true)
    protected String saldoTotalActual;
    @XmlElement(required = true)
    protected String codigoRespuesta;
    @XmlElement(required = true)
    protected String mensajeRespuesta;

    /**
     * Gets the value of the creditoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditoID() {
        return creditoID;
    }

    /**
     * Sets the value of the creditoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditoID(String value) {
        this.creditoID = value;
    }

    /**
     * Gets the value of the numTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTransaccion() {
        return numTransaccion;
    }

    /**
     * Sets the value of the numTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTransaccion(String value) {
        this.numTransaccion = value;
    }

    /**
     * Gets the value of the saldoExigible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoExigible() {
        return saldoExigible;
    }

    /**
     * Sets the value of the saldoExigible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoExigible(String value) {
        this.saldoExigible = value;
    }

    /**
     * Gets the value of the saldoTotalActual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoTotalActual() {
        return saldoTotalActual;
    }

    /**
     * Sets the value of the saldoTotalActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoTotalActual(String value) {
        this.saldoTotalActual = value;
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
