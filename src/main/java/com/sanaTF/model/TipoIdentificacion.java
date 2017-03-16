package com.sanaTF.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tipo_identificacion")
public class TipoIdentificacion {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idTipoIdentificacion;
	@Column
	private int idEmpresa;
	@Column
	private String nombre;
	@Column
	private int numeroCaracteres;
	@Column
	private String esOficial;
	
	public TipoIdentificacion(){}
	
	public TipoIdentificacion(int idTipoIdentificacion, int idEmpresa, String nombre, int numeroCaracteres,
			String esOficial) {
		super();
		this.idTipoIdentificacion = idTipoIdentificacion;
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.numeroCaracteres = numeroCaracteres;
		this.esOficial = esOficial;
	}

	public int getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	public void setIdTipoIdentificacion(int idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCaracteres() {
		return numeroCaracteres;
	}

	public void setNumeroCaracteres(int numeroCaracteres) {
		this.numeroCaracteres = numeroCaracteres;
	}

	public String getEsOficial() {
		return esOficial;
	}

	public void setEsOficial(String esOficial) {
		this.esOficial = esOficial;
	}
	
	
	

}
