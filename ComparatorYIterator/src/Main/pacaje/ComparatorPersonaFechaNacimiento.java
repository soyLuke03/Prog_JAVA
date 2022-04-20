package Main.pacaje;

import java.util.Comparator;

public class ComparatorPersonaFechaNacimiento implements Comparator<Persona> {

	public ComparatorPersonaFechaNacimiento() {
		
	}
	
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
	}

}
