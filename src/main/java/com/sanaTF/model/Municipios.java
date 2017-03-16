package com.sanaTF.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="municipios")
public class Municipios {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int id;
	@Column
	private int estado_id;
	@Column
	private String nombre;
	@Column
	private int localidad;	
					
	public Municipios(){}

	public Municipios(int id, int estado_id, String nombre, int localidad) {
		super();
		this.id = id;
		this.estado_id = estado_id;
		this.nombre = nombre;
		this.localidad = localidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstado_id() {
		return estado_id;
	}

	public void setEstado_id(int estado_id) {
		this.estado_id = estado_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLocalidad() {
		return localidad;
	}

	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}

	
				   
}