package Ejercicio7.Remake.copy;

public class Cliente {

	private int numeroCliente;
	private static int idClienteActual = 0;
	
	public Cliente() {
		this.numeroCliente = idClienteActual++;
	}

	
	
	public int getNumeroClientes() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
}
