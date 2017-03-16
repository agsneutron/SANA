package com.sanaTF.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="frecuencia_pago")
public class FrecuenciaPagos {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int idFrecuenciaPago;	
	@Column
	private String descripcion;
	@Column
	private String clave_frecuencia_pago;
	
	public FrecuenciaPagos() {}

	public FrecuenciaPagos(int idFrecuenciaPago, String descripcion, String clave_frecuencia_pago) {
		super();
		this.idFrecuenciaPago = idFrecuenciaPago;
		this.descripcion = descripcion;
		this.clave_frecuencia_pago = clave_frecuencia_pago;
	}

	public int getIdFrecuenciaPago() {
		return idFrecuenciaPago;
	}

	public void setIdFrecuenciaPago(int idFrecuenciaPago) {
		this.idFrecuenciaPago = idFrecuenciaPago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getClave_frecuencia_pago() {
		return clave_frecuencia_pago;
	}

	public void setClave_frecuencia_pago(String clave_frecuencia_pago) {
		this.clave_frecuencia_pago = clave_frecuencia_pago;
	}

		
	
	
}