package Ejercicio6.main.rework;

import java.util.HashSet;
import java.util.Set;

public class EntradaDiccionario {

	private String palabra;
	private Set<String> significados;
	
	public EntradaDiccionario() {
		// TODO Auto-generated constructor stub
	}
	
	public EntradaDiccionario(String palabra, String significado) {
		this.palabra=palabra;
		this.significados= new HashSet<String>();
		
	}

	public String getPalabra() {
		return palabra;
	}

	public Set<String> getSignificados() {
		return significados;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public void setSignificados(Set<String> significados) {
		this.significados = significados;
	}
	
}
