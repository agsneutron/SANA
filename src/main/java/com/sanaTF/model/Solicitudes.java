package com.sanaTF.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import org.hibernate.annotations.Type;



@Entity(name="solicitudes")
public class Solicitudes {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idSolicitud;
	@Column
	private int User_id;
	@Column
	private String folioSolicitud;
	@Column(name="idCliente")
	private int idCliente;
	@Column
	private String negocioCalle;
	@Column
	private String negocioNoExt;
	@Column
	private String negocioNoInt;
	@Column
	private int negocioIdColonia;
	@Column
	private int negocioIdMunicipio;
	@Column
	private int negocioIdEntidadFederativa;
	@Column
	private String negocioEntreCalles;
	@Column
	private String negocioTelefono;
	@Column
	private String negocioReferencia;
	@Column
	private int negocioIdGiro;
	@Column
	private String negocioAntiguedad;
	@Column
	private String referenciaNombre1;
	@Column
	private String referenciaParentesco1;
	@Column
	private String referenciaTelefono1;
	@Column
	private String referenciaDomicilio1;
	@Column
	private String referenciaNombre2;
	@Column
	private String referenciaParentesco2;
	@Column
	private String referenciaTelefono2;
	@Column
	private String referenciaDomicilio2;
	@Column
	private String creditoMonto;
	@Column
	private int creditoFrecuenciaPago;
	@Column
	private int creditoPlazo;
	@Column
	private String creditoMedidaPlazo;
	@Column
	private int creditoIdUsoRecursos;
	@Column
	private String creditoOtro;
	@Column
	private int creditoIdRenovacionAumento;
	@Column
	private int creditoIdTipoCredito;
	@Column
	private String comentarios;
	@Column
	private String autorizacionUsoDatos;
	@Column
	private String otroGiro;
	@Column
	private String otroUsoRecursos;
	
	@Column
	private String fechaRegistro;
	@Column
	private String fechaEmision;
	@Column
	private double negocioLatitud;
	@Column
	private double negocioLongitud;	
	@Column
	private String negocioNombre;
	@Column
	private String horaDesde;
	@Column
	private String horaHasta;
	@Column
	private int estatus;
	@Column
	private int negocioCP;
	
	@Column
	private String fotoIdentificacion;
	@Column
	private String fotoComprobanteDomicilio;
	@Column
	private String fotoComprobantePropiedad;
	@Column
	private String fotoSolicitudBuro;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idCliente", insertable=false, updatable=false)
	private Clientes cliente;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="negocioIdColonia", insertable=false, updatable=false)
	private Colonias negocioColonia;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="negocioIdMunicipio", insertable=false, updatable=false)
	private Municipios negocioMunicipio;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="negocioIdEntidadFederativa", insertable=false, updatable=false)
	private EntidadFederativa  negocioEntidadFederativa;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="negocioIdGiro", insertable=false, updatable=false)
	private Giro negocioGiro;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="creditoIdUsoRecursos", insertable=false, updatable=false)
	private UsoRecursos creditoUsoRecursos;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="creditoIdRenovacionAumento", insertable=false, updatable=false)
	private Renovacion creditoRenovacionAumento;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="creditoIdTipoCredito", insertable=false, updatable=false)
	private TipoCredito creditoTipoCredito;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_id", insertable=false, updatable=false)
	private Usuarios Usuario;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="creditoPlazo", insertable=false, updatable=false)
	private Plazos Plazo;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="creditoFrecuenciaPago", insertable=false, updatable=false)
	private FrecuenciaPagos Frecuencia;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="clientes",
	joinColumns=@JoinColumn(name="idCliente"),
	inverseJoinColumns=@JoinColumn(name="idCliente"))
	private Clientes cliente;*/
	
	
	public Solicitudes(){}

	public Solicitudes(int idSolicitud, int user_id, String folioSolicitud, int idCliente, String negocioCalle,
			String negocioNoExt, String negocioNoInt, int negocioIdColonia, int negocioIdMunicipio,
			int negocioIdEntidadFederativa, String negocioEntreCalles, String negocioTelefono, String negocioReferencia,
			int negocioIdGiro, String negocioAntiguedad, String referenciaNombre1, String referenciaParentesco1,
			String referenciaTelefono1, String referenciaDomicilio1, String referenciaNombre2,
			String referenciaParentesco2, String referenciaTelefono2, String referenciaDomicilio2, String creditoMonto,
			int creditoFrecuenciaPago, int creditoPlazo, String creditoMedidaPlazo, int creditoIdUsoRecursos,
			String creditoOtro, int creditoIdRenovacionAumento, int creditoIdTipoCredito, String comentarios,
			String autorizacionUsoDatos, String otroGiro, String otroUsoRecursos, String fechaRegistro,
			String fechaEmision, double negocioLatitud, double negocioLongitud, String negocioNombre, String horaDesde,
			String horaHasta, int estatus, int negocioCP, String fotoIdentificacion, String fotoComprobanteDomicilio,
			String fotoComprobantePropiedad, String fotoSolicitudBuro, Clientes cliente, Colonias negocioColonia,
			Municipios negocioMunicipio, EntidadFederativa negocioEntidadFederativa, Giro negocioGiro,
			UsoRecursos creditoUsoRecursos, Renovacion creditoRenovacionAumento, TipoCredito creditoTipoCredito,
			Usuarios usuario, Plazos plazo, FrecuenciaPagos frecuencia) {
		super();
		this.idSolicitud = idSolicitud;
		this.User_id = user_id;
		this.folioSolicitud = folioSolicitud;
		this.idCliente = idCliente;
		this.negocioCalle = negocioCalle;
		this.negocioNoExt = negocioNoExt;
		this.negocioNoInt = negocioNoInt;
		this.negocioIdColonia = negocioIdColonia;
		this.negocioIdMunicipio = negocioIdMunicipio;
		this.negocioIdEntidadFederativa = negocioIdEntidadFederativa;
		this.negocioEntreCalles = negocioEntreCalles;
		this.negocioTelefono = negocioTelefono;
		this.negocioReferencia = negocioReferencia;
		this.negocioIdGiro = negocioIdGiro;
		this.negocioAntiguedad = negocioAntiguedad;
		this.referenciaNombre1 = referenciaNombre1;
		this.referenciaParentesco1 = referenciaParentesco1;
		this.referenciaTelefono1 = referenciaTelefono1;
		this.referenciaDomicilio1 = referenciaDomicilio1;
		this.referenciaNombre2 = referenciaNombre2;
		this.referenciaParentesco2 = referenciaParentesco2;
		this.referenciaTelefono2 = referenciaTelefono2;
		this.referenciaDomicilio2 = referenciaDomicilio2;
		this.creditoMonto = creditoMonto;
		this.creditoFrecuenciaPago = creditoFrecuenciaPago;
		this.creditoPlazo = creditoPlazo;
		this.creditoMedidaPlazo = creditoMedidaPlazo;
		this.creditoIdUsoRecursos = creditoIdUsoRecursos;
		this.creditoOtro = creditoOtro;
		this.creditoIdRenovacionAumento = creditoIdRenovacionAumento;
		this.creditoIdTipoCredito = creditoIdTipoCredito;
		this.comentarios = comentarios;
		this.autorizacionUsoDatos = autorizacionUsoDatos;
		this.otroGiro = otroGiro;
		this.otroUsoRecursos = otroUsoRecursos;
		this.fechaRegistro = fechaRegistro;
		this.fechaEmision = fechaEmision;
		this.negocioLatitud = negocioLatitud;
		this.negocioLongitud = negocioLongitud;
		this.negocioNombre = negocioNombre;
		this.horaDesde = horaDesde;
		this.horaHasta = horaHasta;
		this.estatus = estatus;
		this.negocioCP = negocioCP;
		this.fotoIdentificacion = fotoIdentificacion;
		this.fotoComprobanteDomicilio = fotoComprobanteDomicilio;
		this.fotoComprobantePropiedad = fotoComprobantePropiedad;
		this.fotoSolicitudBuro = fotoSolicitudBuro;
		this.cliente = cliente;
		this.negocioColonia = negocioColonia;
		this.negocioMunicipio = negocioMunicipio;
		this.negocioEntidadFederativa = negocioEntidadFederativa;
		this.negocioGiro = negocioGiro;
		this.creditoUsoRecursos = creditoUsoRecursos;
		this.creditoRenovacionAumento = creditoRenovacionAumento;
		this.creditoTipoCredito = creditoTipoCredito;
		this.Usuario = usuario;
		this.Plazo = plazo;
		this.Frecuencia = frecuencia;
	}

	public int getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		this.User_id = user_id;
	}

	public String getFolioSolicitud() {
		return folioSolicitud;
	}

	public void setFolioSolicitud(String folioSolicitud) {
		this.folioSolicitud = folioSolicitud;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNegocioCalle() {
		return negocioCalle;
	}

	public void setNegocioCalle(String negocioCalle) {
		this.negocioCalle = negocioCalle;
	}

	public String getNegocioNoExt() {
		return negocioNoExt;
	}

	public void setNegocioNoExt(String negocioNoExt) {
		this.negocioNoExt = negocioNoExt;
	}

	public String getNegocioNoInt() {
		return negocioNoInt;
	}

	public void setNegocioNoInt(String negocioNoInt) {
		this.negocioNoInt = negocioNoInt;
	}

	public int getNegocioIdColonia() {
		return negocioIdColonia;
	}

	public void setNegocioIdColonia(int negocioIdColonia) {
		this.negocioIdColonia = negocioIdColonia;
	}

	public int getNegocioIdMunicipio() {
		return negocioIdMunicipio;
	}

	public void setNegocioIdMunicipio(int negocioIdMunicipio) {
		this.negocioIdMunicipio = negocioIdMunicipio;
	}

	public int getNegocioIdEntidadFederativa() {
		return negocioIdEntidadFederativa;
	}

	public void setNegocioIdEntidadFederativa(int negocioIdEntidadFederativa) {
		this.negocioIdEntidadFederativa = negocioIdEntidadFederativa;
	}

	public String getNegocioEntreCalles() {
		return negocioEntreCalles;
	}

	public void setNegocioEntreCalles(String negocioEntreCalles) {
		this.negocioEntreCalles = negocioEntreCalles;
	}

	public String getNegocioTelefono() {
		return negocioTelefono;
	}

	public void setNegocioTelefono(String negocioTelefono) {
		this.negocioTelefono = negocioTelefono;
	}

	public String getNegocioReferencia() {
		return negocioReferencia;
	}

	public void setNegocioReferencia(String negocioReferencia) {
		this.negocioReferencia = negocioReferencia;
	}

	public int getNegocioIdGiro() {
		return negocioIdGiro;
	}

	public void setNegocioIdGiro(int negocioIdGiro) {
		this.negocioIdGiro = negocioIdGiro;
	}

	public String getNegocioAntiguedad() {
		return negocioAntiguedad;
	}

	public void setNegocioAntiguedad(String negocioAntiguedad) {
		this.negocioAntiguedad = negocioAntiguedad;
	}

	public String getReferenciaNombre1() {
		return referenciaNombre1;
	}

	public void setReferenciaNombre1(String referenciaNombre1) {
		this.referenciaNombre1 = referenciaNombre1;
	}

	public String getReferenciaParentesco1() {
		return referenciaParentesco1;
	}

	public void setReferenciaParentesco1(String referenciaParentesco1) {
		this.referenciaParentesco1 = referenciaParentesco1;
	}

	public String getReferenciaTelefono1() {
		return referenciaTelefono1;
	}

	public void setReferenciaTelefono1(String referenciaTelefono1) {
		this.referenciaTelefono1 = referenciaTelefono1;
	}

	public String getReferenciaDomicilio1() {
		return referenciaDomicilio1;
	}

	public void setReferenciaDomicilio1(String referenciaDomicilio1) {
		this.referenciaDomicilio1 = referenciaDomicilio1;
	}

	public String getReferenciaNombre2() {
		return referenciaNombre2;
	}

	public void setReferenciaNombre2(String referenciaNombre2) {
		this.referenciaNombre2 = referenciaNombre2;
	}

	public String getReferenciaParentesco2() {
		return referenciaParentesco2;
	}

	public void setReferenciaParentesco2(String referenciaParentesco2) {
		this.referenciaParentesco2 = referenciaParentesco2;
	}

	public String getReferenciaTelefono2() {
		return referenciaTelefono2;
	}

	public void setReferenciaTelefono2(String referenciaTelefono2) {
		this.referenciaTelefono2 = referenciaTelefono2;
	}

	public String getReferenciaDomicilio2() {
		return referenciaDomicilio2;
	}

	public void setReferenciaDomicilio2(String referenciaDomicilio2) {
		this.referenciaDomicilio2 = referenciaDomicilio2;
	}

	public String getCreditoMonto() {
		return creditoMonto;
	}

	public void setCreditoMonto(String creditoMonto) {
		this.creditoMonto = creditoMonto;
	}

	public int getCreditoFrecuenciaPago() {
		return creditoFrecuenciaPago;
	}

	public void setCreditoFrecuenciaPago(int creditoFrecuenciaPago) {
		this.creditoFrecuenciaPago = creditoFrecuenciaPago;
	}

	public int getCreditoPlazo() {
		return creditoPlazo;
	}

	public void setCreditoPlazo(int creditoPlazo) {
		this.creditoPlazo = creditoPlazo;
	}

	public String getCreditoMedidaPlazo() {
		return creditoMedidaPlazo;
	}

	public void setCreditoMedidaPlazo(String creditoMedidaPlazo) {
		this.creditoMedidaPlazo = creditoMedidaPlazo;
	}

	public int getCreditoIdUsoRecursos() {
		return creditoIdUsoRecursos;
	}

	public void setCreditoIdUsoRecursos(int creditoIdUsoRecursos) {
		this.creditoIdUsoRecursos = creditoIdUsoRecursos;
	}

	public String getCreditoOtro() {
		return creditoOtro;
	}

	public void setCreditoOtro(String creditoOtro) {
		this.creditoOtro = creditoOtro;
	}

	public int getCreditoIdRenovacionAumento() {
		return creditoIdRenovacionAumento;
	}

	public void setCreditoIdRenovacionAumento(int creditoIdRenovacionAumento) {
		this.creditoIdRenovacionAumento = creditoIdRenovacionAumento;
	}

	public int getCreditoIdTipoCredito() {
		return creditoIdTipoCredito;
	}

	public void setCreditoIdTipoCredito(int creditoIdTipoCredito) {
		this.creditoIdTipoCredito = creditoIdTipoCredito;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getAutorizacionUsoDatos() {
		return autorizacionUsoDatos;
	}

	public void setAutorizacionUsoDatos(String autorizacionUsoDatos) {
		this.autorizacionUsoDatos = autorizacionUsoDatos;
	}

	public String getOtroGiro() {
		return otroGiro;
	}

	public void setOtroGiro(String otroGiro) {
		this.otroGiro = otroGiro;
	}

	public String getOtroUsoRecursos() {
		return otroUsoRecursos;
	}

	public void setOtroUsoRecursos(String otroUsoRecursos) {
		this.otroUsoRecursos = otroUsoRecursos;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public double getNegocioLatitud() {
		return negocioLatitud;
	}

	public void setNegocioLatitud(double negocioLatitud) {
		this.negocioLatitud = negocioLatitud;
	}

	public double getNegocioLongitud() {
		return negocioLongitud;
	}

	public void setNegocioLongitud(double negocioLongitud) {
		this.negocioLongitud = negocioLongitud;
	}

	public String getNegocioNombre() {
		return negocioNombre;
	}

	public void setNegocioNombre(String negocioNombre) {
		this.negocioNombre = negocioNombre;
	}

	public String getHoraDesde() {
		return horaDesde;
	}

	public void setHoraDesde(String horaDesde) {
		this.horaDesde = horaDesde;
	}

	public String getHoraHasta() {
		return horaHasta;
	}

	public void setHoraHasta(String horaHasta) {
		this.horaHasta = horaHasta;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public int getNegocioCP() {
		return negocioCP;
	}

	public void setNegocioCP(int negocioCP) {
		this.negocioCP = negocioCP;
	}

	public String getFotoIdentificacion() {
		return fotoIdentificacion;
	}

	public void setFotoIdentificacion(String fotoIdentificacion) {
		this.fotoIdentificacion = fotoIdentificacion;
	}

	public String getFotoComprobanteDomicilio() {
		return fotoComprobanteDomicilio;
	}

	public void setFotoComprobanteDomicilio(String fotoComprobanteDomicilio) {
		this.fotoComprobanteDomicilio = fotoComprobanteDomicilio;
	}

	public String getFotoComprobantePropiedad() {
		return fotoComprobantePropiedad;
	}

	public void setFotoComprobantePropiedad(String fotoComprobantePropiedad) {
		this.fotoComprobantePropiedad = fotoComprobantePropiedad;
	}

	public String getFotoSolicitudBuro() {
		return fotoSolicitudBuro;
	}

	public void setFotoSolicitudBuro(String fotoSolicitudBuro) {
		this.fotoSolicitudBuro = fotoSolicitudBuro;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Colonias getNegocioColonia() {
		return negocioColonia;
	}

	public void setNegocioColonia(Colonias negocioColonia) {
		this.negocioColonia = negocioColonia;
	}

	public Municipios getNegocioMunicipio() {
		return negocioMunicipio;
	}

	public void setNegocioMunicipio(Municipios negocioMunicipio) {
		this.negocioMunicipio = negocioMunicipio;
	}

	public EntidadFederativa getNegocioEntidadFederativa() {
		return negocioEntidadFederativa;
	}

	public void setNegocioEntidadFederativa(EntidadFederativa negocioEntidadFederativa) {
		this.negocioEntidadFederativa = negocioEntidadFederativa;
	}

	public Giro getNegocioGiro() {
		return negocioGiro;
	}

	public void setNegocioGiro(Giro negocioGiro) {
		this.negocioGiro = negocioGiro;
	}

	public UsoRecursos getCreditoUsoRecursos() {
		return creditoUsoRecursos;
	}

	public void setCreditoUsoRecursos(UsoRecursos creditoUsoRecursos) {
		this.creditoUsoRecursos = creditoUsoRecursos;
	}

	public Renovacion getCreditoRenovacionAumento() {
		return creditoRenovacionAumento;
	}

	public void setCreditoRenovacionAumento(Renovacion creditoRenovacionAumento) {
		this.creditoRenovacionAumento = creditoRenovacionAumento;
	}

	public TipoCredito getCreditoTipoCredito() {
		return creditoTipoCredito;
	}

	public void setCreditoTipoCredito(TipoCredito creditoTipoCredito) {
		this.creditoTipoCredito = creditoTipoCredito;
	}

	public Usuarios getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.Usuario = usuario;
	}

	public Plazos getPlazo() {
		return Plazo;
	}

	public void setPlazo(Plazos plazo) {
		this.Plazo = plazo;
	}

	public FrecuenciaPagos getFrecuencia() {
		return Frecuencia;
	}

	public void setFrecuencia(FrecuenciaPagos frecuencia) {
		this.Frecuencia = frecuencia;
	}


								    					
} 
