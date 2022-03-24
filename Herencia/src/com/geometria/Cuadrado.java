package com.geometria;

public class Cuadrado extends Figura  {

	private double longitudLado;

	public Cuadrado(double longitudLado) {
		super();
		this.longitudLado=longitudLado;
	}
	
	@Override
	public Double getPerimetro() {
		return 4*longitudLado;
	}

	@Override
	public Double getArea() {
		return longitudLado*longitudLado;
	}
	
	public int getNumeroLados() {
		return 4;
	}
}
