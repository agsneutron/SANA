package com.sanaTF.model;

public class CobroRealiza {
	private String creditoID;
	private String numTransaccion;
	private String saldoExigible;
	private String saldoTotalActual;
	private String codigoRespuesta;
	private String mensajeRespuesta;
	
	public CobroRealiza(String creditoID, String numTransaccion, String saldoExigible, String saldoTotalActual,
			String codigoRespuesta, String mensajeRespuesta) {
		super();
		this.creditoID = creditoID;
		this.numTransaccion = numTransaccion;
		this.saldoExigible = saldoExigible;
		this.saldoTotalActual = saldoTotalActual;
		this.codigoRespuesta = codigoRespuesta;
		this.mensajeRespuesta = mensajeRespuesta;
	}

	public String getCreditoID() {
		return creditoID;
	}

	public void setCreditoID(String creditoID) {
		this.creditoID = creditoID;
	}

	public String getNumTransaccion() {
		return numTransaccion;
	}

	public void setNumTransaccion(String numTransaccion) {
		this.numTransaccion = numTransaccion;
	}

	public String getSaldoExigible() {
		return saldoExigible;
	}

	public void setSaldoExigible(String saldoExigible) {
		this.saldoExigible = saldoExigible;
	}

	public String getSaldoTotalActual() {
		return saldoTotalActual;
	}

	public void setSaldoTotalActual(String saldoTotalActual) {
		this.saldoTotalActual = saldoTotalActual;
	}

	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}

	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
	
	


}
