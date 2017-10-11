
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
 *         &lt;element name="prospectoID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clienteID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productoCreditoID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montoSolici" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodicidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plazo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinoCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="proyecto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDispersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cuentaCLABE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoPagoCapital" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="claveUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dispositivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "prospectoID",
    "clienteID",
    "productoCreditoID",
    "montoSolici",
    "periodicidad",
    "plazo",
    "destinoCredito",
    "proyecto",
    "tipoDispersion",
    "cuentaCLABE",
    "tipoPagoCapital",
    "tipoCredito",
    "numeroCredito",
    "folio",
    "claveUsuario",
    "dispositivo"
})
@XmlRootElement(name = "altaSolicitudCreditoRequest")
public class AltaSolicitudCreditoRequest {

    @XmlElement(required = true)
    protected String prospectoID;
    @XmlElement(required = true)
    protected String clienteID;
    @XmlElement(required = true)
    protected String productoCreditoID;
    @XmlElement(required = true)
    protected String montoSolici;
    @XmlElement(required = true)
    protected String periodicidad;
    @XmlElement(required = true)
    protected String plazo;
    @XmlElement(required = true)
    protected String destinoCredito;
    @XmlElement(required = true)
    protected String proyecto;
    @XmlElement(required = true)
    protected String tipoDispersion;
    @XmlElement(required = true)
    protected String cuentaCLABE;
    @XmlElement(required = true)
    protected String tipoPagoCapital;
    @XmlElement(required = true)
    protected String tipoCredito;
    @XmlElement(required = true)
    protected String numeroCredito;
    @XmlElement(required = true)
    protected String folio;
    @XmlElement(required = true)
    protected String claveUsuario;
    @XmlElement(required = true)
    protected String dispositivo;

    /**
     * Gets the value of the prospectoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProspectoID() {
        return prospectoID;
    }

    /**
     * Sets the value of the prospectoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProspectoID(String value) {
        this.prospectoID = value;
    }

    /**
     * Gets the value of the clienteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteID() {
        return clienteID;
    }

    /**
     * Sets the value of the clienteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteID(String value) {
        this.clienteID = value;
    }

    /**
     * Gets the value of the productoCreditoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductoCreditoID() {
        return productoCreditoID;
    }

    /**
     * Sets the value of the productoCreditoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductoCreditoID(String value) {
        this.productoCreditoID = value;
    }

    /**
     * Gets the value of the montoSolici property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoSolici() {
        return montoSolici;
    }

    /**
     * Sets the value of the montoSolici property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoSolici(String value) {
        this.montoSolici = value;
    }

    /**
     * Gets the value of the periodicidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicidad() {
        return periodicidad;
    }

    /**
     * Sets the value of the periodicidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicidad(String value) {
        this.periodicidad = value;
    }

    /**
     * Gets the value of the plazo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazo() {
        return plazo;
    }

    /**
     * Sets the value of the plazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazo(String value) {
        this.plazo = value;
    }

    /**
     * Gets the value of the destinoCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoCredito() {
        return destinoCredito;
    }

    /**
     * Sets the value of the destinoCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoCredito(String value) {
        this.destinoCredito = value;
    }

    /**
     * Gets the value of the proyecto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProyecto() {
        return proyecto;
    }

    /**
     * Sets the value of the proyecto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProyecto(String value) {
        this.proyecto = value;
    }

    /**
     * Gets the value of the tipoDispersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDispersion() {
        return tipoDispersion;
    }

    /**
     * Sets the value of the tipoDispersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDispersion(String value) {
        this.tipoDispersion = value;
    }

    /**
     * Gets the value of the cuentaCLABE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaCLABE() {
        return cuentaCLABE;
    }

    /**
     * Sets the value of the cuentaCLABE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaCLABE(String value) {
        this.cuentaCLABE = value;
    }

    /**
     * Gets the value of the tipoPagoCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPagoCapital() {
        return tipoPagoCapital;
    }

    /**
     * Sets the value of the tipoPagoCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPagoCapital(String value) {
        this.tipoPagoCapital = value;
    }

    /**
     * Gets the value of the tipoCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCredito() {
        return tipoCredito;
    }

    /**
     * Sets the value of the tipoCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCredito(String value) {
        this.tipoCredito = value;
    }

    /**
     * Gets the value of the numeroCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCredito() {
        return numeroCredito;
    }

    /**
     * Sets the value of the numeroCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCredito(String value) {
        this.numeroCredito = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Gets the value of the claveUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveUsuario() {
        return claveUsuario;
    }

    /**
     * Sets the value of the claveUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveUsuario(String value) {
        this.claveUsuario = value;
    }

    /**
     * Gets the value of the dispositivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositivo() {
        return dispositivo;
    }

    /**
     * Sets the value of the dispositivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositivo(String value) {
        this.dispositivo = value;
    }

}
