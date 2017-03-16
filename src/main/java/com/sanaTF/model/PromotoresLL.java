package com.sanaTF.model;

public class PromotoresLL {
	private double latitud;
	private double longitud;
	private String solicitud;
	public PromotoresLL(double latitud, double longitud, String solicitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.solicitud = solicitud;
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
	public String getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}
	
	

}
