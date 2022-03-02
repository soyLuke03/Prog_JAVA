package app.model;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {

	
	
	protected final Integer NUMERO_CARTAS = 52;
	private final Integer CARTAS_POR_PALO = 13;
	protected Integer siguiente = 0;
	private final Integer NUMERO_INTERCAMBIOS = 70;
	
	private Carta[] listaCartas; //En las listas, el plural es imporante
	
	//Builder
	public Baraja() {
		super();
		this.listaCartas = new Carta[NUMERO_CARTAS];
		
		int numeroPalos = Palo.values().length;
		int cont=0;
		
		for(int i = 0; i <numeroPalos; i++) {
			for (int j = 0;j<CARTAS_POR_PALO;j++) {
				
				listaCartas[cont] = new Carta(j+1.0, Palo.values()[i]);
				cont++;
			}
		}
		
	}

	public int getSiguiente() {
		return this.siguiente ++;
	}
	
	public int posicionAleatoria() {
		return ThreadLocalRandom.current().nextInt(0,NUMERO_CARTAS);
	}
	
	public void barajar() {
		
		for (int i = 0;i<NUMERO_INTERCAMBIOS;i++) {
			int numeroRandom1 = posicionAleatoria();
			int numeroRandom2 = posicionAleatoria();
			
			Carta c1 = this.listaCartas[numeroRandom1];
			Carta c2 = this.listaCartas[numeroRandom2];
			
			this.listaCartas[numeroRandom1] = c2;
			this.listaCartas[numeroRandom2] = c1;
		}

		
	}

	
	
	public Carta[] getListaCartas() {
		return listaCartas;
	}
	
	@Override
	public String toString() {
		return "Baraja [listaCartas=" + Arrays.toString(listaCartas) + ", NUMERO_CARTAS=" + NUMERO_CARTAS
				+ ", CARTAS_POR_PALO=" + CARTAS_POR_PALO + ", siguiente=" + siguiente + "]";
	}






}
