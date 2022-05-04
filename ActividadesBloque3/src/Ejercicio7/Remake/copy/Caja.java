package Ejercicio7.Remake.copy;

import java.util.ArrayList;
import java.util.List;

import Ejercicio7.model.CajaException;

public class Caja {
	
	private boolean cerrado;
	private int idCaja;
	private List<Cliente> clientes;
	
	public Caja(int id) {
		this.idCaja = id;
		clientes = new ArrayList<Cliente>();
	}
	
	public String atenderCliente() {
		String resultado="";
		if(!cerrado && !clientes.isEmpty()) {
			Cliente cl = clientes.remove(0);
			resultado ="Se ha atendido al cliente";
		}
		else {
			throw new CajaException();
		}
		return resultado;
	}
	
	public boolean asignarCliente(Cliente cl) {
		if(!cerrado) {
			clientes.add(cl);
		}
		return cerrado;
	}
	
	public int getNumeroClientes() {
		return clientes.size();
	}
	
	public void addCliente (Cliente cl) {
		clientes.add(cl);
	}
	
	public int getNCliente() {
		return clientes.get(0).getNumeroClientes();
	}
	
	public void removeCliente () {
		clientes.remove(0);
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
