package Ejercicio6.main.rework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class NuevoDiccionario {

	private Collection<EntradaDiccionario> entradas;
	
	public NuevoDiccionario() {
		this.entradas = new HashSet<EntradaDiccionario>();
	}
	
	
	public List<String> buscarPalabra (String palabra){
		List<String> significados = null;
		
		for(EntradaDiccionario en : entradas) {
			if(en.getPalabra().equalsIgnoreCase(palabra)) {
				significados = new ArrayList<>(en.getSignificados());
			}
		}
		
		return null;
	}
	
}
