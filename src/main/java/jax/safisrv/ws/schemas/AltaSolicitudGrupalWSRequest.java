
package jax.safisrv.ws.schemas;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="integrantes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://safisrv/ws/schemas}integrante" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="grupoID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productoCreditoID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodicidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plazo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDispersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cuentaCLABE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoPagoCapital" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "integrantes",
    "grupoID",
    "productoCreditoID",
    "periodicidad",
    "plazo",
    "tipoDispersion",
    "cuentaCLABE",
    "tipoPagoCapital",
    "folio",
    "claveUsuario",
    "dispositivo"
})
@XmlRootElement(name = "AltaSolicitudGrupalWSRequest")
public class AltaSolicitudGrupalWSRequest {

    @XmlElement(required = true)
    protected AltaSolicitudGrupalWSRequest.Integrantes integrantes;
    @XmlElement(required = true)
    protected String grupoID;
    @XmlElement(required = true)
    protected String productoCreditoID;
    @XmlElement(required = true)
    protected String periodicidad;
    @XmlElement(required = true)
    protected String plazo;
    @XmlElement(required = true)
    protected String tipoDispersion;
    @XmlElement(required = true)
    protected String cuentaCLABE;
    @XmlElement(required = true)
    protected String tipoPagoCapital;
    @XmlElement(required = true)
    protected String folio;
    @XmlElement(required = true)
    protected String claveUsuario;
    @XmlElement(required = true)
    protected String dispositivo;

    /**
     * Gets the value of the integrantes property.
     * 
     * @return
     *     possible object is
     *     {@link AltaSolicitudGrupalWSRequest.Integrantes }
     *     
     */
    public AltaSolicitudGrupalWSRequest.Integrantes getIntegrantes() {
        return integrantes;
    }

    /**
     * Sets the value of the integrantes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltaSolicitudGrupalWSRequest.Integrantes }
     *     
     */
    public void setIntegrantes(AltaSolicitudGrupalWSRequest.Integrantes value) {
        this.integrantes = value;
    }

    /**
     * Gets the value of the grupoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoID() {
        return grupoID;
    }

    /**
     * Sets the value of the grupoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoID(String value) {
        this.grupoID = value;
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
     *         &lt;element ref="{http://safisrv/ws/schemas}integrante" maxOccurs="unbounded" minOccurs="0"/>
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
        "integrante"
    })
    public static class Integrantes {

        protected List<Integrante> integrante;

        /**
         * Gets the value of the integrante property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the integrante property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntegrante().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integrante }
         * 
         * 
         */
        public List<Integrante> getIntegrante() {
            if (integrante == null) {
                integrante = new ArrayList<Integrante>();
            }
            return this.integrante;
        }

    }

}
