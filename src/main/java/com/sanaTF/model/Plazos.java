package com.sanaTF.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="plazos")
public class Plazos {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idPlazo;	
	@Column
	private String descripcion;
	@Column
	private int numero;
	@Column
	private String unidad;
	
	public Plazos() {}

	public Plazos(int idPlazo, String descripcion, int numero, String unidad) {
		super();
		this.idPlazo = idPlazo;
		this.descripcion = descripcion;
		this.numero = numero;
		this.unidad = unidad;
	}

	public int getIdPlazo() {
		return idPlazo;
	}

	public void setIdPlazo(int idPlazo) {
		this.idPlazo = idPlazo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
	
		
	
}	