package com.sanaTF.model;


public class Lugares {
	private int idCliente;
	private String cliente;
    private String horaDesde;
    private String horaHasta;
    private double latitud;
    private double longitud;
    private String nombreNegocio;
    private int lugarVisitado;
    
	public Lugares(int idCliente, String cliente, String horaDesde, String horaHasta, double latitud, double longitud,
			String nombreNegocio, int lugarVisitado) {
		super();
		this.idCliente = idCliente;
		this.cliente = cliente;
		this.horaDesde = horaDesde;
		this.horaHasta = horaHasta;
		this.latitud = latitud;
		this.longitud = longitud;
		this.nombreNegocio = nombreNegocio;
		this.lugarVisitado = lugarVisitado;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public String getNombreNegocio() {
		return nombreNegocio;
	}

	public void setNombreNegocio(String nombreNegocio) {
		this.nombreNegocio = nombreNegocio;
	}

	public int getLugarVisitado() {
		return lugarVisitado;
	}

	public void setLugarVisitado(int lugarVisitado) {
		this.lugarVisitado = lugarVisitado;
	}
    
	
    
		
}

