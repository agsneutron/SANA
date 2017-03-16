package com.sanaTF.model;

public class ListaCobradores {
	
	private String Nombre;
	private double Meta;
	private double porVisitar;
	private double cobrado;
	private double Visitados;
	private double User_id;
	public ListaCobradores(String nombre, double meta, double porVisitar, double cobrado, double visitados,
			double user_id) {
		super();
		Nombre = nombre;
		Meta = meta;
		this.porVisitar = porVisitar;
		this.cobrado = cobrado;
		Visitados = visitados;
		User_id = user_id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getMeta() {
		return Meta;
	}
	public void setMeta(double meta) {
		Meta = meta;
	}
	public double getPorVisitar() {
		return porVisitar;
	}
	public void setPorVisitar(double porVisitar) {
		this.porVisitar = porVisitar;
	}
	public double getCobrado() {
		return cobrado;
	}
	public void setCobrado(double cobrado) {
		this.cobrado = cobrado;
	}
	public double getVisitados() {
		return Visitados;
	}
	public void setVisitados(double visitados) {
		Visitados = visitados;
	}
	public double getUser_id() {
		return User_id;
	}
	public void setUser_id(double user_id) {
		User_id = user_id;
	}
	
	
	
	 

}
