package Ejercicio7.model;

public class Caja {

	private int idCaja;
 	private boolean cerrado;

 	public Caja() {
 		this.cerrado = true;
 	}
 	
 	public Caja(int id) {
 		this();
 		this.idCaja = id;
 	}

 	public boolean abrirCaja() {
		if(this.cerrado) {
			this.cerrado = false;
		}
		else {
			throw new CajaException("La caja ya estaba abierta");
		}
 		return !this.cerrado;
	}
 	
 	public boolean cerrarCaja() {
 		if(!this.cerrado) {
 			this.cerrado = true;
 		}
 		else {
			throw new CajaException("La caja ya estaba cerrada");
 		}
 		return this.cerrado;
 	}
	
	
	public boolean isCerrado() {
		return cerrado;
	}
	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}

	public int getIdCaja() {
		return idCaja;
	}
	public void setIdCaja(int idCaja) {
		this.idCaja = idCaja;
	}
	
 	
 	
}
