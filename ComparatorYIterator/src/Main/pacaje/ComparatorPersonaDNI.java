package Main.pacaje;

import java.util.Comparator;

public class ComparatorPersonaDNI implements Comparator<Persona> {

	public ComparatorPersonaDNI() {
		// TODO Auto-generated constructor stub
	}

	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getDni().compareTo(o2.getDni());
	}
	
	
}
