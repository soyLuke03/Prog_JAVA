package Ejercicio6.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diccionario {

	
	private Map<String,Set<String>> diccionario;
	
	public Diccionario() {
		this.diccionario = new HashMap<>();
	}
	
	public void addPalabra(String palabra,String significado) {
		
		if(!diccionario.containsKey(palabra)) {
			Set<String> significados = new HashSet<>();
			significados.add(significado);
			diccionario.put(palabra, significados);	
		}
		else {
			if(diccionario.get(palabra).contains(significado)) {
				
			}
			diccionario.get(palabra).add(significado);
		}
		
	}
	
	public Set<String> buscarPalabra(String palabra){
		
		
		return diccionario.get(palabra);
	}
	
	public void borrarPalabra(String palabra) {
		diccionario.remove(palabra);
	}
	
	public void borrarSignificado(String palabra,String significado) {
		diccionario.remove(palabra, significado);
	}
	
	public List<String> listarPalabras(String comienzoPalabra){
		List<String> palabras = new ArrayList<String>();
	
		for(String clave : diccionario.keySet()) {
			if(clave.startsWith(comienzoPalabra)) {
				palabras.add(clave);
			}
		}
//		Arrays.sort(palabras.toArray());
		palabras.sort(new DiccionarioComparator());
		return palabras;
	}
	
}
