
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
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tercerNombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apPaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apMaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CURP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoCivil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paisNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paisResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sectorGeneral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actividadBMX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actividadFR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promotorInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promotorActual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDireccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDireccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oficial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="esOficial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primerNombreConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoNombreConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tercerNombreConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apPaternoConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apMaternoConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nacionalidadConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paisNacimientoConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoNacConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaNacConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RFCConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoIdentiConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folioIdentiConyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "primerNombre",
    "segundoNombre",
    "tercerNombre",
    "apPaterno",
    "apMaterno",
    "fecNacimiento",
    "titulo",
    "rfc",
    "curp",
    "estadoCivil",
    "sucursal",
    "mail",
    "paisNacimiento",
    "estadoNacimiento",
    "nacionalidad",
    "paisResidencia",
    "sexo",
    "telefono",
    "sectorGeneral",
    "actividadBMX",
    "actividadFR",
    "promotorInicial",
    "promotorActual",
    "numero",
    "tipoDireccion",
    "estado",
    "municipio",
    "codigoPostal",
    "localidad",
    "colonia",
    "calle",
    "numeroDireccion",
    "oficial",
    "numIdentificacion",
    "tipoIdentificacion",
    "esOficial",
    "fechaExpedicion",
    "fechaVencimiento",
    "primerNombreConyuge",
    "segundoNombreConyuge",
    "tercerNombreConyuge",
    "apPaternoConyuge",
    "apMaternoConyuge",
    "nacionalidadConyuge",
    "paisNacimientoConyuge",
    "estadoNacConyuge",
    "fechaNacConyuge",
    "rfcConyuge",
    "tipoIdentiConyuge",
    "folioIdentiConyuge",
    "folio",
    "claveUsuario",
    "dispositivo"
})
@XmlRootElement(name = "SolAltaClienteRequest")
public class SolAltaClienteRequest {

    @XmlElement(required = true)
    protected String primerNombre;
    @XmlElement(required = true)
    protected String segundoNombre;
    @XmlElement(required = true)
    protected String tercerNombre;
    @XmlElement(required = true)
    protected String apPaterno;
    @XmlElement(required = true)
    protected String apMaterno;
    @XmlElement(required = true)
    protected String fecNacimiento;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(name = "RFC", required = true)
    protected String rfc;
    @XmlElement(name = "CURP", required = true)
    protected String curp;
    @XmlElement(required = true)
    protected String estadoCivil;
    @XmlElement(required = true)
    protected String sucursal;
    @XmlElement(required = true)
    protected String mail;
    @XmlElement(required = true)
    protected String paisNacimiento;
    @XmlElement(required = true)
    protected String estadoNacimiento;
    @XmlElement(required = true)
    protected String nacionalidad;
    @XmlElement(required = true)
    protected String paisResidencia;
    @XmlElement(required = true)
    protected String sexo;
    @XmlElement(required = true)
    protected String telefono;
    @XmlElement(required = true)
    protected String sectorGeneral;
    @XmlElement(required = true)
    protected String actividadBMX;
    @XmlElement(required = true)
    protected String actividadFR;
    @XmlElement(required = true)
    protected String promotorInicial;
    @XmlElement(required = true)
    protected String promotorActual;
    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    protected String tipoDireccion;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String municipio;
    @XmlElement(required = true)
    protected String codigoPostal;
    @XmlElement(required = true)
    protected String localidad;
    @XmlElement(required = true)
    protected String colonia;
    @XmlElement(required = true)
    protected String calle;
    @XmlElement(required = true)
    protected String numeroDireccion;
    @XmlElement(required = true)
    protected String oficial;
    @XmlElement(required = true)
    protected String numIdentificacion;
    @XmlElement(required = true)
    protected String tipoIdentificacion;
    @XmlElement(required = true)
    protected String esOficial;
    @XmlElement(required = true)
    protected String fechaExpedicion;
    @XmlElement(required = true)
    protected String fechaVencimiento;
    @XmlElement(required = true)
    protected String primerNombreConyuge;
    @XmlElement(required = true)
    protected String segundoNombreConyuge;
    @XmlElement(required = true)
    protected String tercerNombreConyuge;
    @XmlElement(required = true)
    protected String apPaternoConyuge;
    @XmlElement(required = true)
    protected String apMaternoConyuge;
    @XmlElement(required = true)
    protected String nacionalidadConyuge;
    @XmlElement(required = true)
    protected String paisNacimientoConyuge;
    @XmlElement(required = true)
    protected String estadoNacConyuge;
    @XmlElement(required = true)
    protected String fechaNacConyuge;
    @XmlElement(name = "RFCConyuge", required = true)
    protected String rfcConyuge;
    @XmlElement(required = true)
    protected String tipoIdentiConyuge;
    @XmlElement(required = true)
    protected String folioIdentiConyuge;
    @XmlElement(required = true)
    protected String folio;
    @XmlElement(required = true)
    protected String claveUsuario;
    @XmlElement(required = true)
    protected String dispositivo;

    /**
     * Gets the value of the primerNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Sets the value of the primerNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Gets the value of the segundoNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Sets the value of the segundoNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Gets the value of the tercerNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTercerNombre() {
        return tercerNombre;
    }

    /**
     * Sets the value of the tercerNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTercerNombre(String value) {
        this.tercerNombre = value;
    }

    /**
     * Gets the value of the apPaterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /**
     * Sets the value of the apPaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApPaterno(String value) {
        this.apPaterno = value;
    }

    /**
     * Gets the value of the apMaterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /**
     * Sets the value of the apMaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApMaterno(String value) {
        this.apMaterno = value;
    }

    /**
     * Gets the value of the fecNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecNacimiento() {
        return fecNacimiento;
    }

    /**
     * Sets the value of the fecNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecNacimiento(String value) {
        this.fecNacimiento = value;
    }

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the curp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Sets the value of the curp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Gets the value of the estadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the value of the estadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Gets the value of the sucursal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Sets the value of the sucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursal(String value) {
        this.sucursal = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the paisNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     * Sets the value of the paisNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNacimiento(String value) {
        this.paisNacimiento = value;
    }

    /**
     * Gets the value of the estadoNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNacimiento() {
        return estadoNacimiento;
    }

    /**
     * Sets the value of the estadoNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNacimiento(String value) {
        this.estadoNacimiento = value;
    }

    /**
     * Gets the value of the nacionalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Sets the value of the nacionalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

    /**
     * Gets the value of the paisResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisResidencia() {
        return paisResidencia;
    }

    /**
     * Sets the value of the paisResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisResidencia(String value) {
        this.paisResidencia = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the sectorGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorGeneral() {
        return sectorGeneral;
    }

    /**
     * Sets the value of the sectorGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorGeneral(String value) {
        this.sectorGeneral = value;
    }

    /**
     * Gets the value of the actividadBMX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadBMX() {
        return actividadBMX;
    }

    /**
     * Sets the value of the actividadBMX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadBMX(String value) {
        this.actividadBMX = value;
    }

    /**
     * Gets the value of the actividadFR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadFR() {
        return actividadFR;
    }

    /**
     * Sets the value of the actividadFR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadFR(String value) {
        this.actividadFR = value;
    }

    /**
     * Gets the value of the promotorInicial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotorInicial() {
        return promotorInicial;
    }

    /**
     * Sets the value of the promotorInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotorInicial(String value) {
        this.promotorInicial = value;
    }

    /**
     * Gets the value of the promotorActual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotorActual() {
        return promotorActual;
    }

    /**
     * Sets the value of the promotorActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotorActual(String value) {
        this.promotorActual = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the tipoDireccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDireccion() {
        return tipoDireccion;
    }

    /**
     * Sets the value of the tipoDireccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDireccion(String value) {
        this.tipoDireccion = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the municipio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Sets the value of the municipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Gets the value of the codigoPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Sets the value of the codigoPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Gets the value of the colonia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Sets the value of the colonia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColonia(String value) {
        this.colonia = value;
    }

    /**
     * Gets the value of the calle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Sets the value of the calle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Gets the value of the numeroDireccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDireccion() {
        return numeroDireccion;
    }

    /**
     * Sets the value of the numeroDireccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDireccion(String value) {
        this.numeroDireccion = value;
    }

    /**
     * Gets the value of the oficial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficial() {
        return oficial;
    }

    /**
     * Sets the value of the oficial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficial(String value) {
        this.oficial = value;
    }

    /**
     * Gets the value of the numIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    /**
     * Sets the value of the numIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdentificacion(String value) {
        this.numIdentificacion = value;
    }

    /**
     * Gets the value of the tipoIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Sets the value of the tipoIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacion(String value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Gets the value of the esOficial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsOficial() {
        return esOficial;
    }

    /**
     * Sets the value of the esOficial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsOficial(String value) {
        this.esOficial = value;
    }

    /**
     * Gets the value of the fechaExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Sets the value of the fechaExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Gets the value of the fechaVencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Sets the value of the fechaVencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimiento(String value) {
        this.fechaVencimiento = value;
    }

    /**
     * Gets the value of the primerNombreConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombreConyuge() {
        return primerNombreConyuge;
    }

    /**
     * Sets the value of the primerNombreConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombreConyuge(String value) {
        this.primerNombreConyuge = value;
    }

    /**
     * Gets the value of the segundoNombreConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombreConyuge() {
        return segundoNombreConyuge;
    }

    /**
     * Sets the value of the segundoNombreConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombreConyuge(String value) {
        this.segundoNombreConyuge = value;
    }

    /**
     * Gets the value of the tercerNombreConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTercerNombreConyuge() {
        return tercerNombreConyuge;
    }

    /**
     * Sets the value of the tercerNombreConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTercerNombreConyuge(String value) {
        this.tercerNombreConyuge = value;
    }

    /**
     * Gets the value of the apPaternoConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApPaternoConyuge() {
        return apPaternoConyuge;
    }

    /**
     * Sets the value of the apPaternoConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApPaternoConyuge(String value) {
        this.apPaternoConyuge = value;
    }

    /**
     * Gets the value of the apMaternoConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApMaternoConyuge() {
        return apMaternoConyuge;
    }

    /**
     * Sets the value of the apMaternoConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApMaternoConyuge(String value) {
        this.apMaternoConyuge = value;
    }

    /**
     * Gets the value of the nacionalidadConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadConyuge() {
        return nacionalidadConyuge;
    }

    /**
     * Sets the value of the nacionalidadConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadConyuge(String value) {
        this.nacionalidadConyuge = value;
    }

    /**
     * Gets the value of the paisNacimientoConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNacimientoConyuge() {
        return paisNacimientoConyuge;
    }

    /**
     * Sets the value of the paisNacimientoConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNacimientoConyuge(String value) {
        this.paisNacimientoConyuge = value;
    }

    /**
     * Gets the value of the estadoNacConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNacConyuge() {
        return estadoNacConyuge;
    }

    /**
     * Sets the value of the estadoNacConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNacConyuge(String value) {
        this.estadoNacConyuge = value;
    }

    /**
     * Gets the value of the fechaNacConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacConyuge() {
        return fechaNacConyuge;
    }

    /**
     * Sets the value of the fechaNacConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacConyuge(String value) {
        this.fechaNacConyuge = value;
    }

    /**
     * Gets the value of the rfcConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCConyuge() {
        return rfcConyuge;
    }

    /**
     * Sets the value of the rfcConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCConyuge(String value) {
        this.rfcConyuge = value;
    }

    /**
     * Gets the value of the tipoIdentiConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentiConyuge() {
        return tipoIdentiConyuge;
    }

    /**
     * Sets the value of the tipoIdentiConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentiConyuge(String value) {
        this.tipoIdentiConyuge = value;
    }

    /**
     * Gets the value of the folioIdentiConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioIdentiConyuge() {
        return folioIdentiConyuge;
    }

    /**
     * Sets the value of the folioIdentiConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioIdentiConyuge(String value) {
        this.folioIdentiConyuge = value;
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
