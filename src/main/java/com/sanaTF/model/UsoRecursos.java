

package com.sanaTF.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="uso_recursos")
public class UsoRecursos {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idUsoRecursos;
	@Column
	private String nombre;
	@Column
	private int IdDestino;
	
	
				
	public UsoRecursos(){}



	public UsoRecursos(int idUsoRecursos, String nombre, int idDestino) {
		super();
		this.idUsoRecursos = idUsoRecursos;
		this.nombre = nombre;
		IdDestino = idDestino;
	}



	public int getIdUsoRecursos() {
		return idUsoRecursos;
	}



	public void setIdUsoRecursos(int idUsoRecursos) {
		this.idUsoRecursos = idUsoRecursos;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getIdDestino() {
		return IdDestino;
	}



	public void setIdDestino(int idDestino) {
		IdDestino = idDestino;
	}
		
}
