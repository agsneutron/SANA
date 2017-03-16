package com.sanaTF.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Paises")
public class Paises {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idPais;
	@Column
	private String nombre;
	@Column
	private String codigo;
	
				
	public Paises(){}
	public Paises( int idPais,String nombre, String codigo)
		   {
				super();
				this.idPais = idPais;
				this.nombre = nombre;	
				this.codigo = codigo;
		   }
	public int getIdPais() {
		return idPais;
	}
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
