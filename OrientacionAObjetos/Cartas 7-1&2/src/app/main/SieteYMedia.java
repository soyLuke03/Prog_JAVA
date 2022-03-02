package app.main;

import java.util.Scanner;

import app.model.Baraja;
import app.model.Carta;

public class SieteYMedia {

		public static void main(String[] args) {
			
			Baraja baraja = new Baraja();
			baraja.barajar();
			

			boolean toggle = true;
			boolean toggleJuego = true;

			Scanner sc = new Scanner (System.in);
			
			System.out.println("Bienvenido al juego 7&1/2\n");
			while (toggle == true) {
				int contador = 0;
				double puntos = 0;
				String opc = "";
				
				
				System.out.println("¿Qué modo quieres jugar?"
						+ "\n1- vs IA[EN DESARROLLO]"
						+ "\n2- vs Jugador[EN DESARROLLO]"
						+ "\n3- PRUEBA"
						+ "\n4- Salir");

				opc = sc.nextLine();
			
				if (opc.equals("1")) {			//VS IA
					
				
				}
				
				else if (opc.equals("2")) {			//VS JUGADOR
					System.out.println("\n Opción JUGADORvsJUGADOR elegida...");
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
								toggleJuego = false;
							}
							
							contador ++;
						}
						else if (opc.equalsIgnoreCase("N")) {
							
							System.out.println("Fin del juego\n");
							if (puntosJugador2<puntos) {
								System.out.println("gana el jugador 1. \n");
							}
							else if(puntosJugador2>puntos) {
								System.out.println("gana el jugador 2. \n");
							}
							else {
								System.out.println("Empate \n");
							}
							
							toggleJuego = false;
						}
						else {
							System.out.println("[ERROR] Opción inválida\n");
						}
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
