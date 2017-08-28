package com.sanaTF.model;

public class ListaGrupos {
	private int idgrupo;
	private int user_id;
	private String nombre;
	private String fecha_registro;
	private String idgruposafi;
	
	public ListaGrupos() {
	}

	public ListaGrupos(int idgrupo, int user_id, String nombre, String fecha_registro, String idgruposafi) {
		super();
		this.idgrupo = idgrupo;
		this.user_id = user_id;
		this.nombre = nombre;
		this.fecha_registro = fecha_registro;
		this.idgruposafi = idgruposafi;
	}

	public int getIdgrupo() {
		return idgrupo;
	}

	public void setIdgrupo(int idgrupo) {
		this.idgrupo = idgrupo;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getIdgruposafi() {
		return idgruposafi;
	}

	public void setIdgruposafi(String idgruposafi) {
		this.idgruposafi = idgruposafi;
	}
	
	
	
	

}
