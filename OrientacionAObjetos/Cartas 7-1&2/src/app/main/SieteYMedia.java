package app.main;

import java.util.Scanner;

import app.model.Baraja;
import app.model.Carta;
import app.model.IA;

public class SieteYMedia {

		public static void main(String[] args) {
			
			Baraja baraja = new Baraja();
			baraja.barajar();
			

			boolean pierdeIA = false;
			boolean pierdeJugador = false;
			boolean pierdeJugador2 = false;
			
			boolean toggle = true;
			boolean toggleJuego = true;

			Scanner sc = new Scanner (System.in);
			
			System.out.println("Bienvenido al juego 7&1/2\n");
			while (toggle == true) {
				int contador = 0;
				double puntos = 0;
				String opc = "";
				
				
				System.out.println("¿Qué modo quieres jugar?"
						+ "\n1- vs IA"
						+ "\n2- vs Jugador"
						+ "\n3- __prueba__"
						+ "\n4- Salir");

				opc = sc.nextLine();
			
				if (opc.equals("1")) {			//VS IA
					
					pierdeIA = false;
					pierdeJugador = false;
					
					System.out.println("\n Opción JUGADOR vs IA elegida...");
					baraja.barajar();
					int dificultad;
					do {
						System.out.println("Elija la dificultad del 1-5.");
						dificultad = Integer.valueOf(sc.nextLine());
					}while(dificultad>=6);
					
					IA ia = new IA(dificultad);
					ia.puntosIA=0; 
					
					toggleJuego = true;
					
					while (toggleJuego == true) {
						System.out.println("¿Quieres carta? [S/N]");
						opc = sc.nextLine();
						
						if (opc.equalsIgnoreCase("S")) {
							
							System.out.println(baraja.getListaCartas()[contador]);
							puntos += baraja.getListaCartas()[contador].getValor(baraja.getListaCartas()[contador]);
						
							System.out.println(puntos+"\n");
							
							if(puntos>7.5) {
								System.out.println("Pierdes.\n");
								pierdeJugador = true;
								toggleJuego = false;
							}
							
							contador ++;
						}
						else if (opc.equalsIgnoreCase("N")) {
							
							System.out.println("Ahora le toca a la IA.\n");
							toggleJuego = false;
						}
						else {
							System.out.println("[ERROR] Opción inválida\n");
						}
					}	
								toggleJuego = true;
					
						while (toggleJuego == true) {
							
							
							
							if (ia.eleccionIA().equalsIgnoreCase("S")) {
								System.out.println(baraja.getListaCartas()[contador]);
								ia.puntosIA += baraja.getListaCartas()[contador].getValor(baraja.getListaCartas()[contador]);
							
								
								if(ia.puntosIA>7.5) {
									
									toggleJuego = false;
								}
								
								contador ++;
							}
							else if (ia.eleccionIA().equalsIgnoreCase("N")) {
								
								pierdeIA = true;
								toggleJuego = false;
							}
						}
						System.out.println("Fin del juego\n");
						if (ia.puntosIA<puntos && pierdeJugador == false) {
							System.out.println("gana el jugador 1. \n");
						}
						else if(ia.puntosIA>puntos && pierdeIA == false) {
							System.out.println("gana la IA. \n");
						}
						else {
							System.out.println("Empate \n");
						}
						
						puntos = 0;
						ia.puntosIA = 0;
						opc = "";
						contador = 0;
						
						
					}
					
				
				
				else if (opc.equals("2")) {			//VS JUGADOR
					pierdeIA = false;
					pierdeJugador = false;
					
					System.out.println("\n Opción JUGADOR vs JUGADOR elegida...");
					baraja.barajar();
					
					double puntosJugador2 = 0; 
					toggleJuego = true;
					
					while (toggleJuego == true) {
						System.out.println("¿Quieres carta? [S/N]");
						opc = sc.nextLine();
						
						if (opc.equalsIgnoreCase("S")) {
							
							System.out.println(baraja.getListaCartas()[contador]);
							puntos += baraja.getListaCartas()[contador].getValor(baraja.getListaCartas()[contador]);
						
							System.out.println(puntos+"\n");
							
							if(puntos>7.5) {
								System.out.println("Pierdes.\n");
								pierdeJugador = true;
								toggleJuego = false;
							}
							
							contador ++;
						}
						else if (opc.equalsIgnoreCase("N")) {
							
							System.out.println("Ahora le toca al jugador 2.\n");
							
							toggleJuego = false;
						}
						else {
							System.out.println("[ERROR] Opción inválida\n");
						}
					}
					
					toggleJuego = true;
					
					while (toggleJuego == true) {
						System.out.println("¿Quieres carta? [S/N]");
						opc = sc.nextLine();
						if (opc.equalsIgnoreCase("S")) {
							System.out.println(baraja.getListaCartas()[contador]);
							puntosJugador2 += baraja.getListaCartas()[contador].getValor(baraja.getListaCartas()[contador]);
						
							System.out.println(puntosJugador2+"\n");
							
							if(puntosJugador2>7.5) {
								System.out.println("Pierdes.\n");
								pierdeJugador2 = true;
								toggleJuego = false;
							}
							
							contador ++;
						}
						else if (opc.equalsIgnoreCase("N")) {
							
							System.out.println("Fin del juego\n");
							
							toggleJuego = false;
						}
						else {
							System.out.println("[ERROR] Opción inválida\n");
						}
					}
					if (puntosJugador2<puntos && pierdeJugador == false) {
						System.out.println("gana el jugador 1. \n");
					}
					else if(puntosJugador2>puntos && pierdeJugador2 == false) {
						System.out.println("gana el jugador 2. \n");
					}
					else {
						System.out.println("Empate \n");
					}
					
					puntos = 0;
					puntosJugador2 = 0;
					opc = "";
					contador = 0;
				}
				
				else if (opc.equals("3")) {//PRUEBA
					baraja.barajar();
					
					System.out.println("\n Opción prueba elegida..."
							+ "\n Cargando juego...	");
					
					while (toggleJuego == true) {
						System.out.println("¿Quieres carta? [S/N]");
						opc = sc.nextLine();
						if (opc.equalsIgnoreCase("S")) {
							System.out.println(baraja.getListaCartas()[contador]);
							puntos += baraja.getListaCartas()[contador].getValor(baraja.getListaCartas()[contador]);
						
							System.out.println(puntos);
							
							if(puntos>7.5) {
								System.out.println("Juego terminado. Pierdes.\n");
								toggleJuego = false;
							}
							
							contador ++;
						}
						else if (opc.equalsIgnoreCase("N")) {
							
							if (puntos<=7.5) {
								System.out.println("Ahora le toca a la IA.\n");
							}
							toggleJuego = false;
						}
						else {
							System.out.println("[ERROR] Opción inválida\n");
						}
					}
					
					puntos = 0;
					contador = 0;
				}
				
				else if (opc.equals("4")) {//Salir
					toggle = false;
				}
				
				else {
					System.out.println("[ERROR] Opción inválida \n");
				}
			}
		
		}
}
