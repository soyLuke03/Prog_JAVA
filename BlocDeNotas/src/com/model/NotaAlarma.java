package com.model;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable{

	private LocalDateTime fechaAlarma;
	private final static Integer MINUTOS_REPETIR_POR_DEFECTO = 5;
	private Integer minutosRepetir;
	private Boolean activado=true;
	
	//Builder
	
	public NotaAlarma(String texto) {
		super(texto);
	}
	
	public NotaAlarma(String texto,LocalDateTime fechaAlarma, Boolean activado) {
		super(texto);
		this.fechaAlarma = fechaAlarma;
		this.activado = activado;
	}
	public NotaAlarma(String texto,LocalDateTime fechaAlarma, Integer minutosRepetir) {
		super(texto);
		this.fechaAlarma = fechaAlarma;
		this.minutosRepetir = minutosRepetir;
	}
	
	
	//Metodos
	
	@Override
	public void activar() {
		// TODO Auto-generated method stub
		this.activado = true;
	}
	
	@Override
	public void desactivar() {
		// TODO Auto-generated method stub
		this.activado = false;
	}
	
	public boolean isActivado() {
		return this.activado;
	}
	
	
	//GETTERS
	
	public static Integer getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	//SETTERS
	

	private void setFechaAlarma(LocalDateTime fechaAlarma) {
		this.fechaAlarma = fechaAlarma;
	}

	//Overrides
	@Override
	public String toString() {
		return "NotaAlarma [fechaAlarma=" + fechaAlarma + ", minutosRepetir=" + minutosRepetir + ", activado="
				+ activado + "]";
	}
	
}
