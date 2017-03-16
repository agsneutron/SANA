package com.sanaTF.model;

public class ClientesAsignados {
	
	private String cliente;
	private String latitud;
	private String longitud;
	
	public ClientesAsignados(String cliente, String latitud, String longitud) {
		super();
		this.cliente = cliente;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	
	

}
