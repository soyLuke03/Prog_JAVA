package com.vehiculo;

public class Avion extends Vehiculo {

	private Integer capacidad;
	private Integer distanciaRecorrida;
	
	
	public Avion(int capacidad, int distancia) {
		super();
		this.capacidad=capacidad;
		this.distanciaRecorrida = distancia;
	}
	
	@Override
	public int numeroPasajeros() {
		return capacidad;
	}

	@Override
	public int kilometraje() {
		return distanciaRecorrida;
	}
	
	public boolean despegar() {
		return true;
	}

}
