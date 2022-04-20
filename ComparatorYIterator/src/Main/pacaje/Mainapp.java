package Main.pacaje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Mainapp {

	
	private static void sortApellidosNombre(List<Persona> listaPersonas) {
		
		listaPersonas.sort(new ComparatorPersonaApellidos().thenComparing(new ComparatorPersonaNombre()));			
		
		for(Persona p:listaPersonas) {
			System.out.println(p);
		}

		
	}
	private static void sortNombreApellidos(List<Persona> listaPersonas) {
			
		listaPersonas.sort(new ComparatorPersonaNombre().thenComparing(new ComparatorPersonaApellidos()));			
		
		for(Persona p:listaPersonas) {
			System.out.println(p);
		}

 	}
	private static void sortDNIFechaNacimiento(List<Persona> listaPersonas) {
		
		listaPersonas.sort(new ComparatorPersonaDNI().thenComparing(new ComparatorPersonaFechaNacimiento()));			
		
		for(Persona p:listaPersonas) {
			System.out.println(p);
		}

 	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String SEPARADOR="########";
		List<Persona> listaPersonas = new ArrayList<>();
//		Set<Persona> conjuntoPersonas = new HashSet<>();
		
		
		listaPersonas.add(new Persona("David","Gómez","55555555K",LocalDate.of(2000,2,2)));
		listaPersonas.add(new Persona("David","González","55555555K",LocalDate.of(1999,2,2)));
		listaPersonas.add(new Persona("Juan","Céspedes","55555555K",LocalDate.of(1999,2,2)));
		listaPersonas.add(new Persona("María","Sánchez","00555555K",LocalDate.of(1999,2,2)));
		listaPersonas.add(new Persona("David","López","01555555K",LocalDate.of(1999,2,2)));
	
		
		sortApellidosNombre(listaPersonas);
		System.out.println(SEPARADOR);
		sortNombreApellidos(listaPersonas);
		System.out.println(SEPARADOR);
		sortDNIFechaNacimiento(listaPersonas);
//		listaPersonas.sort(new ComparatorPersonaNombre().thenComparing(new ComparatorPersonaFechaNacimiento().thenComparing(new ComparatorPersonaApellidos().thenComparing(new ComparatorPersonaDNI()))));
		

		
//		Iterator iterator = conjuntoPersonas.iterator();

		
		/*
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/
		
		
//		for(Persona p:listaPersonas) {
//			System.out.println(p);
//		}
		
		/*
		System.out.println(SEPARADOR);
		
		for(int i = 0;i<listaPersonas.size();i++){
			System.out.println(listaPersonas.get(i));
		}
		System.out.println(SEPARADOR);
		
		Iterator iterator = listaPersonas.iterator();
		iterator.hasNext();
		iterator.hasNext();
		
		int contador = 0;
		while(iterator.hasNext()) {
			contador++;
			iterator.next();
		}
		System.out.println(contador);
		*/
		
		
		
	}
	
}
	

