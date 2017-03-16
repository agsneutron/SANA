package com.sanaTF.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="promotores")
public class Promotores {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPromotores;
	private int User_Id;
	private String fecha;
	
	public Promotores() {}

	public Promotores(int idPromotores, int user_Id, String fecha) {
		super();
		this.idPromotores = idPromotores;
		this.User_Id = user_Id;
		this.fecha = fecha;
	}

	public int getIdPromotores() {
		return idPromotores;
	}

	public void setIdPromotores(int idPromotores) {
		this.idPromotores = idPromotores;
	}

	public int getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(int user_Id) {
		this.User_Id = user_Id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	

}
