package com.sanaTF.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="clientes")
public class Clientes {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idCliente;
	@Column
	private String nombre;
	@Column
	private String apellidoPaterno;
	@Column
	private String apellidoMaterno;
	@Column
	private String sexo;
	@Column
	private String fechaNacimiento;
	@Column
	private String nacionalidad;
	@Column
	private int edad;
	@Column
	private int paisNacimiento;
	@Column
	private int entidadFederativaNacimiento;
	@Column
	private String curp;
	@Column
	private String rfc;
	@Column
	private String telefonolParticular;
	@Column
	private String telefonoCelular;
	@Column
	private String mail;
	@Column
	private String calle;
	@Column
	private String numeroExterior;
	@Column
	private String numeroInterior;
	@Column
	private int idColonia;
	@Column
	private String cp;
	@Column
	private int idMunicipio;
	@Column
	private int entidadFederativaDomicilio;
	
	@Column
	private int idClienteSANA;
	@Column
	private String titulo;
	@Column
	private String direccionOficial;
	@Column
	private String numeroIdentificacion;
	@Column
	private int idTipoIdentificacion;
	@Column
	private String identificacionOficial;
	@Column
	private int idTipoDireccion;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idTipoIdentificacion", insertable=false, updatable=false)		
	private TipoIdentificacion tipoIdentificacion;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idTipoDireccion", insertable=false, updatable=false)		
	private TipoDireccion tipoDireccion;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="paisNacimiento", insertable=false, updatable=false)		
	private Paises paisNacio;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="entidadFederativaNacimiento", insertable=false, updatable=false)		
	private EntidadFederativa estadoNacio;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="entidadFederativaDomicilio", insertable=false, updatable=false)		
	private EntidadFederativa estadoDomicilio;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idMunicipio", insertable=false, updatable=false)		
	private Municipios municipioDomicilio;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idColonia", insertable=false, updatable=false)		
	private Colonias coloniaDomicilio;
	
				
	public Clientes(){}


	public Clientes(int idCliente, String nombre, String apellidoPaterno, String apellidoMaterno, String sexo,
			String fechaNacimiento, String nacionalidad, int edad, int paisNacimiento, int entidadFederativaNacimiento,
			String curp, String rfc, String telefonolParticular, String telefonoCelular, String mail, String calle,
			String numeroExterior, String numeroInterior, int idColonia, String cp, int idMunicipio,
			int entidadFederativaDomicilio, int idClienteSANA, String titulo, String direccionOficial,
			String numeroIdentificacion, int idTipoIdentificacion, String identificacionOficial, int idTipoDireccion,
			TipoIdentificacion tipoIdentificacion, TipoDireccion tipoDireccion, Paises paisNacio,
			EntidadFederativa estadoNacio, EntidadFederativa estadoDomicilio, Municipios municipioDomicilio,
			Colonias coloniaDomicilio) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.paisNacimiento = paisNacimiento;
		this.entidadFederativaNacimiento = entidadFederativaNacimiento;
		this.curp = curp;
		this.rfc = rfc;
		this.telefonolParticular = telefonolParticular;
		this.telefonoCelular = telefonoCelular;
		this.mail = mail;
		this.calle = calle;
		this.numeroExterior = numeroExterior;
		this.numeroInterior = numeroInterior;
		this.idColonia = idColonia;
		this.cp = cp;
		this.idMunicipio = idMunicipio;
		this.entidadFederativaDomicilio = entidadFederativaDomicilio;
		this.idClienteSANA = idClienteSANA;
		this.titulo = titulo;
		this.direccionOficial = direccionOficial;
		this.numeroIdentificacion = numeroIdentificacion;
		this.idTipoIdentificacion = idTipoIdentificacion;
		this.identificacionOficial = identificacionOficial;
		this.idTipoDireccion = idTipoDireccion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.tipoDireccion = tipoDireccion;
		this.paisNacio = paisNacio;
		this.estadoNacio = estadoNacio;
		this.estadoDomicilio = estadoDomicilio;
		this.municipioDomicilio = municipioDomicilio;
		this.coloniaDomicilio = coloniaDomicilio;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidoPaterno() {
		return apellidoPaterno;
	}


	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}


	public String getApellidoMaterno() {
		return apellidoMaterno;
	}


	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getPaisNacimiento() {
		return paisNacimiento;
	}


	public void setPaisNacimiento(int paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}


	public int getEntidadFederativaNacimiento() {
		return entidadFederativaNacimiento;
	}


	public void setEntidadFederativaNacimiento(int entidadFederativaNacimiento) {
		this.entidadFederativaNacimiento = entidadFederativaNacimiento;
	}


	public String getCurp() {
		return curp;
	}


	public void setCurp(String curp) {
		this.curp = curp;
	}


	public String getRfc() {
		return rfc;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	public String getTelefonolParticular() {
		return telefonolParticular;
	}


	public void setTelefonolParticular(String telefonolParticular) {
		this.telefonolParticular = telefonolParticular;
	}


	public String getTelefonoCelular() {
		return telefonoCelular;
	}


	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getNumeroExterior() {
		return numeroExterior;
	}


	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}


	public String getNumeroInterior() {
		return numeroInterior;
	}


	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}


	public int getIdColonia() {
		return idColonia;
	}


	public void setIdColonia(int idColonia) {
		this.idColonia = idColonia;
	}


	public String getCp() {
		return cp;
	}


	public void setCp(String cp) {
		this.cp = cp;
	}


	public int getIdMunicipio() {
		return idMunicipio;
	}


	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}


	public int getEntidadFederativaDomicilio() {
		return entidadFederativaDomicilio;
	}


	public void setEntidadFederativaDomicilio(int entidadFederativaDomicilio) {
		this.entidadFederativaDomicilio = entidadFederativaDomicilio;
	}


	public int getIdClienteSANA() {
		return idClienteSANA;
	}


	public void setIdClienteSANA(int idClienteSANA) {
		this.idClienteSANA = idClienteSANA;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDireccionOficial() {
		return direccionOficial;
	}


	public void setDireccionOficial(String direccionOficial) {
		this.direccionOficial = direccionOficial;
	}


	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}


	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}


	public int getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}


	public void setIdTipoIdentificacion(int idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}


	public String getIdentificacionOficial() {
		return identificacionOficial;
	}


	public void setIdentificacionOficial(String identificacionOficial) {
		this.identificacionOficial = identificacionOficial;
	}


	public int getIdTipoDireccion() {
		return idTipoDireccion;
	}


	public void setIdTipoDireccion(int idTipoDireccion) {
		this.idTipoDireccion = idTipoDireccion;
	}


	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}


	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}


	public TipoDireccion getTipoDireccion() {
		return tipoDireccion;
	}


	public void setTipoDireccion(TipoDireccion tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}


	public Paises getPaisNacio() {
		return paisNacio;
	}


	public void setPaisNacio(Paises paisNacio) {
		this.paisNacio = paisNacio;
	}


	public EntidadFederativa getEstadoNacio() {
		return estadoNacio;
	}


	public void setEstadoNacio(EntidadFederativa estadoNacio) {
		this.estadoNacio = estadoNacio;
	}


	public EntidadFederativa getEstadoDomicilio() {
		return estadoDomicilio;
	}


	public void setEstadoDomicilio(EntidadFederativa estadoDomicilio) {
		this.estadoDomicilio = estadoDomicilio;
	}


	public Municipios getMunicipioDomicilio() {
		return municipioDomicilio;
	}


	public void setMunicipioDomicilio(Municipios municipioDomicilio) {
		this.municipioDomicilio = municipioDomicilio;
	}


	public Colonias getColoniaDomicilio() {
		return coloniaDomicilio;
	}


	public void setColoniaDomicilio(Colonias coloniaDomicilio) {
		this.coloniaDomicilio = coloniaDomicilio;
	}


							   
}
