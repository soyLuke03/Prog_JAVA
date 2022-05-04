package utils;

import java.util.Comparator;

import model.Mensaje;

public class PersonaComparator implements Comparator<Mensaje>{

	@Override
	public int compare(Mensaje o1, Mensaje o2) {
		// TODO Auto-generated method stub
		return o1.getRemitente().getNombre().compareTo(o2.getRemitente().getNombre());
	}

}
