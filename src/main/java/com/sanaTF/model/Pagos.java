package com.sanaTF.model;


public class Pagos {	
	//
	private String usuario;
	private int creditoId;
    private String dispositivo;
    private String folio;
    private double pagoMontoCobrado;
    private double montoGL;
	public Pagos(String usuario, int creditoId, String dispositivo, String folio, double pagoMontoCobrado,
			double montoGL) {
		super();
		this.usuario = usuario;
		this.creditoId = creditoId;
		this.dispositivo = dispositivo;
		this.folio = folio;
		this.pagoMontoCobrado = pagoMontoCobrado;
		this.montoGL = montoGL;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getCreditoId() {
		return creditoId;
	}
	public void setCreditoId(int creditoId) {
		this.creditoId = creditoId;
	}
	public String getDispositivo() {
		return dispositivo;
	}
	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public double getPagoMontoCobrado() {
		return pagoMontoCobrado;
	}
	public void setPagoMontoCobrado(double pagoMontoCobrado) {
		this.pagoMontoCobrado = pagoMontoCobrado;
	}
	public double getMontoGL() {
		return montoGL;
	}
	public void setMontoGL(double montoGL) {
		this.montoGL = montoGL;
	}
    
    
    
	
    
	
    
		
}