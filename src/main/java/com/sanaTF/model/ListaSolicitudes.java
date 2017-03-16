package com.sanaTF.model;

public class ListaSolicitudes {
	private int idSolicitud;
	private String folio;
	private String cobrador;
	private String cliente;
	private String nombreNegocio;
	private String fechaRegistro;
	private String estatus;
	private double montoCredito;
	private double adeudo;
	public ListaSolicitudes(int idSolicitud, String folio, String cobrador, String cliente, String nombreNegocio,
			String fechaRegistro, String estatus, double montoCredito, double adeudo) {
		super();
		this.idSolicitud = idSolicitud;
		this.folio = folio;
		this.cobrador = cobrador;
		this.cliente = cliente;
		this.nombreNegocio = nombreNegocio;
		this.fechaRegistro = fechaRegistro;
		this.estatus = estatus;
		this.montoCredito = montoCredito;
		this.adeudo = adeudo;
	}
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getCobrador() {
		return cobrador;
	}
	public void setCobrador(String cobrador) {
		this.cobrador = cobrador;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNombreNegocio() {
		return nombreNegocio;
	}
	public void setNombreNegocio(String nombreNegocio) {
		this.nombreNegocio = nombreNegocio;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public double getMontoCredito() {
		return montoCredito;
	}
	public void setMontoCredito(double montoCredito) {
		this.montoCredito = montoCredito;
	}
	public double getAdeudo() {
		return adeudo;
	}
	public void setAdeudo(double adeudo) {
		this.adeudo = adeudo;
	}
	
	
	

}
