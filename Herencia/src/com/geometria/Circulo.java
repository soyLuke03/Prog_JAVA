package com.geometria;

public class Circulo extends Figura {

	private double radio;
	private final Double PI = Math.PI;
	
	public Circulo(double radio) {
		super();
		this.radio=radio;
	}
	
	@Override
	public Double getPerimetro() {
		return 2*PI*radio;
	}

	@Override
	public Double getArea() {
		return PI*Math.pow(radio, 2);
	}
	
	


}
