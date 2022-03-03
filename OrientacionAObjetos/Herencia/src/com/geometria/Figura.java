package com.geometria;

public abstract class Figura {
	
	public abstract Double getPerimetro();
	
	public abstract Double getArea();
	
	public void mePresento() {
		System.out.println("Hola, soy un "+ this.getClass().getSimpleName());
	}
}
