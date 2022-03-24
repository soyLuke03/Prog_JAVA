package com.vehiculo;

public class VehiculoMain {

	public static void main(String[] args) {
		
		Vehiculo coche = new Coche(100);
		Coche coche2 = new Coche(1200);
		
		Vehiculo avion = new Avion(100, 20000);
		Avion avion2 = new Avion(340, 2300);
		
		coche.kilometraje();
		coche2.numeroPasajeros();
		
		
		((Avion)avion).despegar();
		avion2.despegar();
		
	}
	
	
}
