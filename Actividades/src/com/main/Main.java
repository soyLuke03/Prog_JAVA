package com.main;
import java.util.Arrays;

import com.utils.ArrayUtilidad;

public class Main {

	public static void main(String[] args) {
		
		Entero[] enteros = new Entero[5];
		
		Entero e1 = new Entero(2);
		Entero e2 = new Entero(12);
		Entero e3 = new Entero(4);
		Entero e4 = new Entero(21);
		Entero e5 = new Entero(3);
		
		enteros[0] = e1;
		enteros[1] = e2;
		enteros[2] = e3;
		enteros[3] = e4;
		enteros[4] = e5;
		
		Comparable[] lista = new Comparable[5];
		
		lista[0] = (Comparable) e1;
		lista[1] = (Comparable) e2;
		lista[2] = (Comparable) e3;
		lista[3] = (Comparable) e4;
		lista[4] = (Comparable) e5;
		
		Arrays.sort(lista);
		
		ArrayUtilidad.imprimirArray(lista);
	}
}
