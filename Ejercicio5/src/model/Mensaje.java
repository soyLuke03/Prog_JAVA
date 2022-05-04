package model;

import java.time.LocalDateTime;

public class Mensaje {

	
	private Persona remitente;
	private String textoMsg;
	private LocalDateTime fechaYhora;
	private int numeroMensaje;
	public static int contadorMensaje = 0;
	
	
	public Mensaje(Persona persona, String textoMsg) {
		this.remitente = persona;
		this.textoMsg = textoMsg;
		
		this.fechaYhora = LocalDateTime.now();
		
		this.numeroMensaje = contadorMensaje++;
	}

	
	@Override
	public String toString() {
		return "Mensaje: "+numeroMensaje+ " De: "+ remitente +" Texto: "+textoMsg+" Fecha y Hora: " + fechaYhora+"";
	}


	public Persona getRemitente() {
		return remitente;
	}


	public void setRemitente(Persona remitente) {
		this.remitente = remitente;
	}


	public String getTextoMsg() {
		return textoMsg;
	}


	public LocalDateTime getFechaYhora() {
		return fechaYhora;
	}


	public int getNumeroMensaje() {
		return numeroMensaje;
	}


	public static int getContadorMensaje() {
		return contadorMensaje;
	}


	public void setTextoMsg(String textoMsg) {
		this.textoMsg = textoMsg;
	}


	public void setFechaYhora(LocalDateTime fechaYhora) {
		this.fechaYhora = fechaYhora;
	}


	public void setNumeroMensaje(int numeroMensaje) {
		this.numeroMensaje = numeroMensaje;
	}


	public static void setContadorMensaje(int contadorMensaje) {
		Mensaje.contadorMensaje = contadorMensaje;
	}
	
	
	
}
