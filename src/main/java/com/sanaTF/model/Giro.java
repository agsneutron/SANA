package com.sanaTF.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="giro")
public class Giro {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idGiro;
	@Column
	private double idActividadBMX;
	@Column
	private int idActividadINEGI;
	@Column
	private double idActividadFR;
	@Column
	private int idActividadFOMUR;
	@Column
	private String nombre;
	
	
				
	public Giro(){}



	public Giro(int idGiro, double idActividadBMX, int idActividadINEGI, double idActividadFR, int idActividadFOMUR,
			String nombre) {
		super();
		this.idGiro = idGiro;
		this.idActividadBMX = idActividadBMX;
		this.idActividadINEGI = idActividadINEGI;
		this.idActividadFR = idActividadFR;
		this.idActividadFOMUR = idActividadFOMUR;
		this.nombre = nombre;
	}



	public int getIdGiro() {
		return idGiro;
	}



	public void setIdGiro(int idGiro) {
		this.idGiro = idGiro;
	}



	public double getIdActividadBMX() {
		return idActividadBMX;
	}



	public void setIdActividadBMX(double idActividadBMX) {
		this.idActividadBMX = idActividadBMX;
	}



	public int getIdActividadINEGI() {
		return idActividadINEGI;
	}



	public void setIdActividadINEGI(int idActividadINEGI) {
		this.idActividadINEGI = idActividadINEGI;
	}



	public double getIdActividadFR() {
		return idActividadFR;
	}



	public void setIdActividadFR(double idActividadFR) {
		this.idActividadFR = idActividadFR;
	}



	public int getIdActividadFOMUR() {
		return idActividadFOMUR;
	}



	public void setIdActividadFOMUR(int idActividadFOMUR) {
		this.idActividadFOMUR = idActividadFOMUR;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	
}

