package com.sanaTF.model;

public class PromotoresRuta {
	private int User_Id;
	private String nombre;
	private int meta;
	private int visitados;
	private int solicitudes;
	public PromotoresRuta(int user_Id, String nombre, int meta, int visitados, int solicitudes) {
		super();
		this.User_Id = user_Id;
		this.nombre = nombre;
		this.meta = meta;
		this.visitados = visitados;
		this.solicitudes = solicitudes;
	}
	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		this.User_Id = user_Id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMeta() {
		return meta;
	}
	public void setMeta(int meta) {
		this.meta = meta;
	}
	public int getVisitados() {
		return visitados;
	}
	public void setVisitados(int visitados) {
		this.visitados = visitados;
	}
	public int getSolicitudes() {
		return solicitudes;
	}
	public void setSolicitudes(int solicitudes) {
		this.solicitudes = solicitudes;
	}
	
	

}
