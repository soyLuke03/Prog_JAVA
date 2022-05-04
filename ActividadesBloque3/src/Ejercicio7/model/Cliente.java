package Ejercicio7.model;

public class Cliente {

	private int numeroCliente;
	private static int idClienteActual = 0;
	
	public Cliente() {
		this.numeroCliente = idClienteActual++;
	}

	
	
	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
}
