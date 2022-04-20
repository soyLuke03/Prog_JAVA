package Set.java.com.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import main.java.com.modelo.Persona;

public class EjemploConjunto {

	public EjemploConjunto() {
		
	}


	public static void pruebaComparacionColecciones() {
		List<Integer> lista = new ArrayList<>();
//		System.out.println("Debo tener la secuencia: 8, 8, 8, 14, 7, 2, 3, null");
//		cargarColeccion(lista);
		
		Set<Integer> conjunto = new HashSet<Integer>();
//		System.out.println("Debo tener la secuencia: null, 2, 3, 7, 8, 14");
//		cargarColeccion(conjunto);
		
		List<Persona> listaPersona = new ArrayList<Persona>();
		cargarColeccionPersonas(listaPersona);

		Set<Persona> conjuntoPersona = new HashSet<Persona>();
		cargarColeccionPersonas(conjuntoPersona);
		
	}																					
	
	
	public static void cargarColeccionPersonas(Collection<Persona> conjuntoPersonas) {
	conjuntoPersonas.add(new Persona("Antonio", "Luque", LocalDate.now()));
	conjuntoPersonas.add(new Persona("Antonio", "Luque", LocalDate.now()));
	conjuntoPersonas.add(new Persona("Antonio", "González", LocalDate.now()));
	conjuntoPersonas.add(new Persona("Herme", "Ramos", LocalDate.now()));
	conjuntoPersonas.add(new Persona("Herme", "Ramos", LocalDate.now()));
	conjuntoPersonas.add(new Persona("Antonio", "Ramos", LocalDate.now()));
	conjuntoPersonas.add(new Persona("Joseba", "Díaz", LocalDate.now()));
	
	System.out.println(conjuntoPersonas.size());
	System.out.println(conjuntoPersonas);
	}
	
	public static void cargarColeccion(Collection<Integer> conjuntoNumeros) {
		
		// Los conjuntos no salen con un orden, solo se añaden
		conjuntoNumeros.add(8);
		conjuntoNumeros.add(8);
		conjuntoNumeros.add(8);
		conjuntoNumeros.add(14);
		conjuntoNumeros.add(7);
		conjuntoNumeros.add(2);
		conjuntoNumeros.add(3);
		
		System.out.println(conjuntoNumeros);
		System.out.println(conjuntoNumeros.size());
	}
}
