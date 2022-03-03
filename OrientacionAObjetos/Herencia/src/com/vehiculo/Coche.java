package com.vehiculo;

public class Coche extends Vehiculo {

	private Integer capacidad = 4;
	private Integer distanciaRecorrida;
	
	
	public Coche(int distancia) {
		super();
		this.distanciaRecorrida=distancia;
	}
	
	@Override
	public int numeroPasajeros() {
		return capacidad;
	}

	@Override
	public int kilometraje() {
		return distanciaRecorrida;
	}

}
