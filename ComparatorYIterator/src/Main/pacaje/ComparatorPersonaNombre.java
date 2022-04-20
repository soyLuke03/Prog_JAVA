package Main.pacaje;

import java.util.Comparator;

public class ComparatorPersonaNombre implements Comparator<Persona> {

	public ComparatorPersonaNombre() {
		
	}
	
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
