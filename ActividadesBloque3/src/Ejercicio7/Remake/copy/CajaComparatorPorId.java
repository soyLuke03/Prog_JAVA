package Ejercicio7.Remake.copy;

import java.util.Comparator;

public class CajaComparatorPorId implements Comparator<Caja>{

	@Override
	public int compare(Caja o1, Caja o2) {
		int resultado=0;
		
		if(o1.getNumeroClientes()<o2.getNumeroClientes()) {
			resultado = -1;
		}
		else if(o1.getNumeroClientes()>o2.getNumeroClientes()) {
			resultado = 1;
		}
		else {
			resultado = o1.getIdCaja() - o2.getIdCaja();
		}
		
		return resultado;
		

	}

}
