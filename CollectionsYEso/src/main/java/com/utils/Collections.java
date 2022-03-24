package main.java.com.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import main.java.com.modelo.Persona;

public class Collections {

	public Collections() {
		
	}
	
	
	public static void trabajarConColecciones() {
		
		List<Integer> listaNumero = new ArrayList<Integer>();
		
		listaNumero.add(1);
		for (int i = 0;i<15;i++) {
			listaNumero.add(1);
		}
		
		listaNumero.remove(1);
		listaNumero.remove(Integer.valueOf(1));
		
	}
	
	public static void trabajarConColeccionesDeNombre() {
		
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("Alejandra");
		listaNombres.add("Felipe");
		listaNombres.add("Antonio");
		listaNombres.add("Javier");
		listaNombres.add("Vicente");
		
		System.out.println(listaNombres.size());
		
		listaNombres.remove("Antonio");
		listaNombres.remove(0);
		System.out.println(listaNombres);
		listaNombres.clear();
		
	}
	
	public static List<Persona> trabajarConColeccionesDePersona() {
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("Alejandra","Mensaque",LocalDate.of(2002, 1, 21)));
		listaPersonas.add(new Persona("Felipe","Acosta",LocalDate.of(1998, 12, 17)));
		listaPersonas.add(new Persona("Antonio","Calzado",LocalDate.of(1998, 6, 11)));
		listaPersonas.add(new Persona("Javier","Villarreal",LocalDate.of(2006, 2, 2)));
		listaPersonas.add(new Persona("Vicente","Villarreal",LocalDate.of(2003, 12, 31)));
		

		return listaPersonas;
	}
	
	public static List<Persona> ordenarListaPersonaS(List<Persona> personas){
		
		if (personas != null) {
			java.util.Collections.sort(personas);
		}
		return personas;
	}
}
