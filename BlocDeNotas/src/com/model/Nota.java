package com.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota implements Comparable<Nota>{

	private static Integer codigoSiguiente = 0;
	private Integer codigo = 0;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	//Builder
	
	public Nota(String texto) {
		this.texto=texto;
		this.codigo = codigoSiguiente++;
		this.fechaCreacion=LocalDateTime.now();
	}
	
	//Metodos
	public boolean isEmpty() {
		if (this.texto!=null || this.texto.isBlank()) {
			return true;
		}
		return false;
	}
	
	public boolean isModified() {
		
		return this.fechaUltimaModificacion!=null;
	}
	
	public boolean isModifiedAnterior(Nota otraNota) {
		
		boolean esAnterior = false;
		
		if(this.getFechaUltimaModificacion()==null || otraNota.getFechaUltimaModificacion()==null) {
			esAnterior = false;
		}
		else if(this.isModified() && otraNota.isModified()) {
			esAnterior = this.getFechaUltimaModificacion().isBefore(otraNota.getFechaUltimaModificacion());
		}
		else if(otraNota.isModified()) {
			esAnterior = true;
		}
		
		return esAnterior;
	}
	
	public boolean isCreadoAnterior(Nota otraNota) {
		
		return this.getFechaCreacion().isBefore(otraNota.getFechaCreacion());
	}


	
	
	//Getter
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	
	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	//Setter
	
	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaUltimaModificacion = LocalDateTime.now();
	}

	
	//Overrides
	@Override
	public int compareTo(Nota otraNota) {
		int result = 0;
		if(otraNota!=null) {
			if(this.fechaCreacion.isBefore(otraNota.getFechaCreacion())) {
				result = -1;
			}
			else if(this.fechaCreacion.isAfter(otraNota.getFechaCreacion())) {
				result = 1;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "Nota [texto=" + texto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, fechaUltimaModificacion, texto);
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = false;
		
		if(obj!=null) {
			
			if(this==obj) {
				sonIguales=true;
			}
			else {
				Nota laOtra = (Nota)obj;
				sonIguales = this.texto.equals(laOtra.getTexto()) && this.getFechaCreacion().equals(laOtra.getFechaCreacion());
			}
			
		}
		return sonIguales;
	}
}
