
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
 *         &lt;element name="destinoCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="proyecto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montoSolici" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoIntegrante" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "destinoCredito",
    "proyecto",
    "montoSolici",
    "tipoIntegrante"
})
@XmlRootElement(name = "integrante")
public class Integrante {

    @XmlElement(required = true)
    protected String prospectoID;
    @XmlElement(required = true)
    protected String clienteID;
    @XmlElement(required = true)
    protected String destinoCredito;
    @XmlElement(required = true)
    protected String proyecto;
    @XmlElement(required = true)
    protected String montoSolici;
    @XmlElement(required = true)
    protected String tipoIntegrante;

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
     * Gets the value of the tipoIntegrante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIntegrante() {
        return tipoIntegrante;
    }

    /**
     * Sets the value of the tipoIntegrante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIntegrante(String value) {
        this.tipoIntegrante = value;
    }

}
