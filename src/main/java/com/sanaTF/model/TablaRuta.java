package com.sanaTF.model;

public class TablaRuta {
	private int idCliente;
	private String cliente;
    private String horaDesde;
    private String horaHasta;
    private double cuota;
    private String cobro;
    private double cobrado;
    private String razon;
    private String circulo;
    private double latitud;
    private double longitud;
    private String direccion;
    private String nombreNegocio;
    private String idCredito;
    private String folioSolicitud;
    private String claveUsuario;
    private int idPago;
    
	public TablaRuta(int idCliente, String cliente, String horaDesde, String horaHasta, double cuota, String cobro,
			double cobrado, String razon, String circulo, double latitud, double longitud, String direccion,
			String nombreNegocio, String idCredito, String folioSolicitud, String claveUsuario, int idPago) {
		super();
		this.idCliente = idCliente;
		this.cliente = cliente;
		this.horaDesde = horaDesde;
		this.horaHasta = horaHasta;
		this.cuota = cuota;
		this.cobro = cobro;
		this.cobrado = cobrado;
		this.razon = razon;
		this.circulo = circulo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.direccion = direccion;
		this.nombreNegocio = nombreNegocio;
		this.idCredito = idCredito;
		this.folioSolicitud = folioSolicitud;
		this.claveUsuario = claveUsuario;
		this.idPago = idPago;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
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

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public String getCobro() {
		return cobro;
	}

	public void setCobro(String cobro) {
		this.cobro = cobro;
	}

	public double getCobrado() {
		return cobrado;
	}

	public void setCobrado(double cobrado) {
		this.cobrado = cobrado;
	}

	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}

	public String getCirculo() {
		return circulo;
	}

	public void setCirculo(String circulo) {
		this.circulo = circulo;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombreNegocio() {
		return nombreNegocio;
	}

	public void setNombreNegocio(String nombreNegocio) {
		this.nombreNegocio = nombreNegocio;
	}

	public String getIdCredito() {
		return idCredito;
	}

	public void setIdCredito(String idCredito) {
		this.idCredito = idCredito;
	}

	public String getFolioSolicitud() {
		return folioSolicitud;
	}

	public void setFolioSolicitud(String folioSolicitud) {
		this.folioSolicitud = folioSolicitud;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}
    
	
	
	
	
}
