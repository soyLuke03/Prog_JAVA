package app.model;

import java.util.concurrent.ThreadLocalRandom;

public class IA {

	private int dificultad;
	public static double puntosIA=0;
	
	public IA (int dificultad) {
		
		if (dificultad <= 5) {
			this.dificultad = dificultad;			
		}
		else {
			this.dificultad = 1;
		}
	}
	
	
	public String eleccionIA () {
		String eleccion="";
		
		if(dificultad==1) {
			int numero = ThreadLocalRandom.current().nextInt(0,10);
			
			if(numero>=6) {
				eleccion="s";
			}
			else {
				eleccion="n";
			}
		}
		else if(dificultad==2) {
			int numero = ThreadLocalRandom.current().nextInt(0,100);
			
			if(numero>=65) {
				eleccion="s";
			}
			else {
				eleccion="n";
			}
		}
		else if(dificultad==3) {
			if(puntosIA>=7) {
				eleccion="n";
			}
			else {
				eleccion="s";
			}
			
		}
		else if(dificultad==4) {
			if(puntosIA>=6.5) {
				eleccion="n";
			}
			else {
				eleccion="s";
			}
		}
		else if(dificultad==5) {
			if(puntosIA>=5.5) {
				eleccion="n";
			}
			else {
				eleccion="s";
			}
		}
		
		
		return eleccion;
	}
	
	
}
