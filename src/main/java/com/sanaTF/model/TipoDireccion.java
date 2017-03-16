package com.sanaTF.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tipo_direccion")
public class TipoDireccion {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idTipoDireccion;
	@Column
	private String nombre;
	@Column
	private String esOficial;
	
	public TipoDireccion(){}
	public TipoDireccion(int idTipoDireccion, String nombre, String esOficial) {
		super();
		this.idTipoDireccion = idTipoDireccion;
		this.nombre = nombre;
		this.esOficial = esOficial;
	}
	public int getIdTipoDireccion() {
		return idTipoDireccion;
	}
	public void setIdTipoDireccion(int idTipoDireccion) {
		this.idTipoDireccion = idTipoDireccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEsOficial() {
		return esOficial;
	}
	public void setEsOficial(String esOficial) {
		this.esOficial = esOficial;
	}
	
	

}
