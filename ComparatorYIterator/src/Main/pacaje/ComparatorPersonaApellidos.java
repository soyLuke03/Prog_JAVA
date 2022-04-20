package Main.pacaje;

import java.util.Comparator;

public class ComparatorPersonaApellidos implements Comparator<Persona> {

	public ComparatorPersonaApellidos() {
		// TODO Auto-generated constructor stub
	}

	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getApellidos().compareTo(o2.getApellidos());
	}
	
	
}
