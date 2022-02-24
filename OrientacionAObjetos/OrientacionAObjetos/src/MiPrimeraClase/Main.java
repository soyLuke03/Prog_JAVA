package MiPrimeraClase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		boolean toggle = true;
//		Avion nuevoAvion =crearAvionConMenu();
		
		
		
		//AUTOCREACION DE OBJETOS CON ARRAYS
		
		
		Avion[] aeropuertoSevilla = new Avion[50];
		
		for (int i=0;i<aeropuertoSevilla.length;i++) {
			Avion avion = new Avion("id"+i, 150);
			aeropuertoSevilla[i]=avion;
		}
		System.out.println("0");
		
		
		 
	}//Parte ejercicio listas.
		
//		String opcion = "";

		/*
		while (toggle == true) {
			
		
		
		System.out.println("##Men� principal##");
		System.out.println("a: Asignar vuelo\n"
						 + "b: Obtener n�mero de vuelos\n"
						 + "c: Obtener n�mero de kilometros\n"
						 + "d: Obtener media de kil�metros por vuelo\n"
						 + "e: Cambiar de compa��a\n"
						 + "f: Mostrar informaci�n del avi�n\n"
						 + "g: Salir");
		
		opcion = sc.nextLine();
		opcion = opcion.toLowerCase();

		
		
		
		
		switch (opcion) {
		case "a":{
			
			System.out.println("�Cu�ntos viajeros van en el avi�n? ");
			int viajeros = Integer.valueOf(sc.nextLine());
			System.out.println("�Cu�ntos kil�metros recorre?");
			int kmRecorridos = Integer.valueOf(sc.nextLine());
			
			
			System.out.println(nuevoAvion.asignarVuelo(viajeros, kmRecorridos));
			
		}break;
		case "b":{
			
			System.out.println(nuevoAvion.getNumVuelos());
			
		}break;
		case "c":{
			
			System.out.println(nuevoAvion.getKmVolados());
			
		}break;
		case "d":{
			
			System.out.println("La media de kil�metros es: "+ nuevoAvion.getMediaKM());
			
		}break;
		case "e":{
			
			System.out.println("�A qu� compa��a quieres cambiar el avi�n? ");
			String comp = sc.nextLine();
			nuevoAvion.setCompannia(comp);
			
			System.out.println("Cambio realizado con �xito");
			
		}break;
		case "f":{
			
			System.out.println("\nAvi�n con ID: "+ nuevoAvion.getIdAvion()+" de la compa��a: "+nuevoAvion.getCompannia()+" ha realizado "+nuevoAvion.getNumVuelos()+" vuelos, con un total de "+nuevoAvion.getKmVolados()+" km y una media de "+nuevoAvion.getMediaKM()+" km por vuelo.\n");
			
		}break;
		case "g":{
			
			toggle = false;
			
		}break;
		}
		
		
		}
		
	}
*/
	public static Avion crearAvionConMenu () {
		System.out.println("Men� de creaci�n; \n"+ "1: Crear avi�n con ID: \n" 
							 + "2: Crear aci�n con ID y compa��a: \n"
							 +"");

		int capacidad = 0;
		Avion avionCreado = null;
		
		
		Scanner sc = new Scanner(System.in);
		int opc1 = Integer.valueOf(sc.nextLine());
		
		if (opc1==1) {
			System.out.println("Introduce el ID del avi�n: ");
			String iD = sc.nextLine();
			System.out.println("Introduce la capacidad: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(iD,capacidad);
		}
		else if (opc1==2) {
			System.out.println("Introduce el ID del avi�n: ");
			String iD = sc.nextLine();
			System.out.println("Introduce la compa��a: ");
			String compania = sc.nextLine();
			System.out.println("Introduce la capacidad: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(iD,compania,capacidad);
		}
		else {
			System.out.println("La opci�n no es correcta");
		}
		
		
		return avionCreado;
	}
}
