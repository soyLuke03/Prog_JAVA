package Ejercicio7.utils;

import java.util.Comparator;

import Ejercicio7.model.Caja;

public class CajaComparatorPorIdYnumeroClientes implements Comparator<Caja>{

	@Override
	public int compare(Caja o1, Caja o2) {
		return o1.getIdCaja()-o2.getIdCaja();
	}

}
