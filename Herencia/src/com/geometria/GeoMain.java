package com.geometria;

public class GeoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Circulo(3).getArea());
		System.out.println(new Cuadrado(5).getArea());
		Figura circulo = new Circulo(2);
		Figura cuadrado = new Cuadrado(6);


		
		Figura[] listaFiguras = new Figura[2];
		listaFiguras[0] = new Circulo(2);
		listaFiguras[1] = new Cuadrado(1);
		
		cuadrado.mePresento();
	}

}
