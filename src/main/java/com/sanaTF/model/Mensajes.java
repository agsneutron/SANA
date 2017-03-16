package com.sanaTF.model;

public class Mensajes {
	private int codigo;
	private int idSolicitud;
	private String mensaje;
	public Mensajes(){};
	public Mensajes(int codigo, int idSolicitud, String mensaje) {
		super();
		this.codigo = codigo;
		this.idSolicitud = idSolicitud;
		this.mensaje = mensaje;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	

}
