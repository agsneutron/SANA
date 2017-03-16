
package com.sanaTF.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="colonias")
public class Colonias {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int id;
	@Column
	private int estado_id;
	@Column
	private int municipio_id;
	@Column
	private String tipoAsentamiento;
	@Column
	private String nombre;
	@Column
	private int codigoPostal;	
		
					
	public Colonias(){}


	public Colonias(int id, int estado_id, int municipio_id, String tipoAsentamiento, String nombre, int codigoPostal) {
		super();
		this.id = id;
		this.estado_id = estado_id;
		this.municipio_id = municipio_id;
		this.tipoAsentamiento = tipoAsentamiento;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
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


	public int getMunicipio_id() {
		return municipio_id;
	}


	public void setMunicipio_id(int municipio_id) {
		this.municipio_id = municipio_id;
	}


	public String getTipoAsentamiento() {
		return tipoAsentamiento;
	}


	public void setTipoAsentamiento(String tipoAsentamiento) {
		this.tipoAsentamiento = tipoAsentamiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

				   
}