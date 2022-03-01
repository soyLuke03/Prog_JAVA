package JuegoDeCartas;

import java.util.Stack;

public class Baraja {

	protected final Integer numCartas = 52; 
	protected Integer siguiente;
	private Cartas[] Cartas = new Cartas[numCartas];
	
	//Contructor 
	
	public Baraja() {}
	
	
	//Metodos
	
	public void barajar() {
		
	}
	
	private String GenerarPalo() {
		
		String cadena = null;
		String palo = null;
		
		for (int p=0;p<4;p++) {
			if (p==0) {
				 palo = "diamantes";
			}
			else if (p==1) {
				 palo = "picas";
			}
			else if (p==2) {
				 palo = "corazones";
			}
			else if (p==3) {
				 palo = "tréboles";
			}
			for (int i=0;i<13;i++) {
				cadena = (palo + " de " + GenerarNumero());
			}
		}
		
		
		return cadena;
	}
	
	private int GenerarNumero() {
		int numero = 0;
		
		for(int i=0;i<13;i++) {
			numero = i+1;
		}
		
		return numero;
	}
	
	public void AsignarCarta() {
		for (int i =0 ; i<numCartas ; i++) {

			Cartas[i] = GenerarPalo();
			
		}
	}
	

	//Getter
	
	public Integer getSiguiente() {
		return siguiente;
	}


	
	//ToString
	
	@Override
	public String toString() {
		return "";
	}
	
	
	
	
}
