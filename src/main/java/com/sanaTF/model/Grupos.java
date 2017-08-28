package com.sanaTF.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;




@Entity(name="grupos")
public class Grupos {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idGrupo;
	@Column
	private int User_id;
	@Column
	private String nombre;
	@Column
	private String fecha_Registro;
	@Column
	private int idGrupoSafi;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_id", insertable=false, updatable=false)
	private Usuarios Usuario;
	
	public Grupos(){}

	public Grupos(int idGrupo, int user_id, String nombre, String fecha_Registro, int idGrupoSafi, Usuarios usuario) {
		super();
		this.idGrupo = idGrupo;
		this.User_id = user_id;
		this.nombre = nombre;
		this.fecha_Registro = fecha_Registro;
		this.idGrupoSafi = idGrupoSafi;
		Usuario = usuario;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		this.User_id = user_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_Registro() {
		return fecha_Registro;
	}

	public void setFecha_Registro(String fecha_Registro) {
		this.fecha_Registro = fecha_Registro;
	}

	public int getIdGrupoSafi() {
		return idGrupoSafi;
	}

	public void setIdGrupoSafi(int idGrupoSafi) {
		this.idGrupoSafi = idGrupoSafi;
	}

	public Usuarios getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuarios usuario) {
		Usuario = usuario;
	}

	
	
	

}
