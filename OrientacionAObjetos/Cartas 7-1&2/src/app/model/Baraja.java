package app.model;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {

	
	
	private final Integer NUMERO_CARTAS = 52;
	private final Integer CARTAS_POR_PALO = 13;
	private Integer siguiente;
	
	private Carta[] listaCartas; //En las listas, el plural es imporante
	private Carta[] listaFinal = new Carta[NUMERO_CARTAS];
	
	//Builder
	public Baraja() {
		super();
		this.listaCartas = new Carta[NUMERO_CARTAS];
		
		int numeroPalos = Palo.values().length;
		int cont=0;
		
		for(int i = 0; i <numeroPalos; i++) {
			for (int j = 0;j<CARTAS_POR_PALO;j++) {
				
				listaCartas[cont] = new Carta(j+1, Palo.values()[i]);
				cont++;
			}
		}
		
	}

	
	
	public int posicionAleatoria() {
		return ThreadLocalRandom.current().nextInt(0,NUMERO_CARTAS);
	}
	
	public void barajar() {
		for (int i = 0;i<NUMERO_CARTAS;i++) {
				
				if (listaCartas[i]!=null) {
					
					listaFinal[i]=listaCartas[posicionAleatoria()];
					listaCartas[posicionAleatoria()] = null;
					
				}
				System.out.println(listaFinal[i]);
			}
		
		
	}

	@Override
	public String toString() {
		return "Baraja [listaCartas=" + Arrays.toString(listaCartas) + ", NUMERO_CARTAS=" + NUMERO_CARTAS
				+ ", CARTAS_POR_PALO=" + CARTAS_POR_PALO + ", siguiente=" + siguiente + "]";
	}





}
