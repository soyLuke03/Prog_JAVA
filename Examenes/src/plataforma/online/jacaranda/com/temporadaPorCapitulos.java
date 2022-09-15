package plataforma.online.jacaranda.com;

import java.util.Comparator;

public class temporadaPorCapitulos implements Comparator<Temporada> {

	@Override
	public int compare(Temporada o1, Temporada o2) {
		int res = 0;
		
		if(o1.getCapitulos().size()>o2.getCapitulos().size()) {
			res = 1;
		}
		else if(o1.getCapitulos().size()<o2.getCapitulos().size()) {
			res = -1;
		}
		
		return res;
	}

}
