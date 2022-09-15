package plataforma.online.jacaranda.com;

import java.util.Comparator;

public class temporadaPorNotaMedia implements Comparator<Temporada> {

	@Override
	public int compare(Temporada o1, Temporada o2) {
		int res = 0;
		
		if(o1.getNotaMedia()>o2.getNotaMedia()) {
			res = 1;
		}
		else if(o1.getNotaMedia()<o2.getNotaMedia()) {
			res = -1;
		}
		
		return res;
	}

}
