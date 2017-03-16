package com.sanaTF.model;

public class RutaOptima {
	private double latitud;
	private double longitud;
	private String nombreCliente;
	private String ruta;
	private int lugarVisitado;
	
	public RutaOptima(double latitud, double longitud, String nombreCliente, String ruta, int lugarVisitado) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.nombreCliente = nombreCliente;
		this.ruta = ruta;
		this.lugarVisitado = lugarVisitado;
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

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public int getLugarVisitado() {
		return lugarVisitado;
	}

	public void setLugarVisitado(int lugarVisitado) {
		this.lugarVisitado = lugarVisitado;
	}
	
	
	
}
