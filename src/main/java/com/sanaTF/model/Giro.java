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
	private String nombre;
	
	
				
	public Giro(){}
	public Giro( int idGiro,String nombre)
		   {
				super();
				this.idGiro = idGiro;
				this.nombre = nombre;				
		   }
	
	public int getIdGiro() {
		return idGiro;
	}
	public void setIdGiro(int idGiro) {
		this.idGiro = idGiro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
