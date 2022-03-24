package com.animales;

public class Leon extends Animal implements Sonido, SerVivo, Carnivoro{

	
	
	
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Estoy comiendo");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("Estoy durmiendo");
	}

	
	//INTERFAZ
	@Override
	public String emitirSonido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void procrear() {
		// TODO Auto-generated method stub
		
	}

	
	//INTERFAZ Carnivoro
	@Override
	public void cazar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acechar() {
		// TODO Auto-generated method stub
		
	}

}
