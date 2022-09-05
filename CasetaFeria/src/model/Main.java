package model;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import model.reader.Reader;
import model.writer.JSONwriter;

public class Main {

	
	public static void imprimirMenu() {
		System.out.println("1- Mostrar todas las casetas existentes en una calle."
						+ "\n2- Mostrar todas las casetas de tipo familiar"
						+ "\n3- Mostrar todas las casetas de tipo Distrito"
						+ "\n4- Mostrar todas las casetas que no sean ni familiares ni distritos"
						+ "\n5- Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo familiar"
						+ "\n6- Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo Distrito"
						+ "\n7- Eliminar una caseta"
						+ "\n8- Salir");
	}
	
	
	public static void main(String[] args) {

		/**
		 * Creacion del XML a JSON
		 */
		Reader rd = new Reader();
		List<Caseta> casetas = rd.cargarArchivosDatos("C:\\Users\\antog\\Desktop\\Cosas de clase\\Programación\\OrientacionAObjetos\\CasetaFeria\\src\\files\\casetasferia.xml");
		JSONwriter jsonT = new JSONwriter();
		jsonT.escribirColeccionAJson(casetas,"C:\\Users\\antog\\Desktop\\Cosas de clase\\Programación\\OrientacionAObjetos\\CasetaFeria\\src\\files\\casetasJSON.json");
		//-------------------------//
		
		
		//Menu
		
		String opc = "";
		String cadena = "";
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		Scanner alt = new Scanner(System.in);
		while (!opc.equals("8")) {
			
			if(opc.equals("1")) {//Mostrar todas las casetas existentes en una calle.
				cadena = alt.nextLine();
				System.out.println(listarPorCalle(casetas, cadena));
			}
			if(opc.equals("2")) {//Mostrar todas las casetas de tipo familiar
				System.out.println(listarPorClase(casetas, "FAMILIAR"));
			}
			if(opc.equals("3")) {//Mostrar todas las casetas de tipo Distrito
				System.out.println(listarPorClase(casetas, "DISTRITO"));
			}
			if(opc.equals("4")) {//Mostrar todas las casetas que no sean ni familiares ni distritos.
				System.out.println(listarEspecial(casetas));
			}
			if(opc.equals("5")) {//Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo familiar que existen
				System.out.println(listarCalleFamiliar(casetas));
			}
			if(opc.equals("6")) {//Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo Distrito que existen
				System.out.println(listarCalleDistrito(casetas));
			}
			if(opc.equals("7")) {//Eliminar una caseta. Si se elimina una caseta se considerará que el resto de las casetas posteriores se desplazan, es decir si borro la caseta 5 de una calle, todas las casetas a partir del número 5 deberán descender un número si la caseta borrada tiene un módulo, dos si dos módulos, y así sucesivamente. Se pedirá el nombre de la calle y el número. Si no existe se deberá mostrar un mensaje de error.
				numero = Integer.valueOf(alt.nextLine());
				borrarCaseta(casetas,numero);			
			}
			
			imprimirMenu();
			opc = sc.nextLine();
		}
	
	
	}


	private static String listarPorCalle(List<Caseta> casetas, String calle) {
		StringBuilder sb = new StringBuilder();
		for (Caseta c : casetas) {
			if(c.getCalle().equals(calle)) {
				sb.append(c+"\n");
			}
		}
		return sb.toString();
	}
	
	private static String listarPorClase(List<Caseta> casetas, String distrito) {
		StringBuilder sb = new StringBuilder();
		for (Caseta c : casetas) {
			if(c.getClase().equals(distrito)) {
				sb.append(c+"\n");
			}
		}
		return sb.toString();
	}
	
	private static String listarEspecial(List<Caseta> casetas) {
		StringBuilder sb = new StringBuilder();
		for (Caseta c : casetas) {
			if(!c.getClase().equals("DISTRITO") && !c.getClase().equals("FAMILIAR")) {
				sb.append(c+"\n");
			}
		}
		return sb.toString();
	}
	
	private static String listarCalleFamiliar(List<Caseta> casetas) { // No funcuiona
		StringBuilder sb = new StringBuilder();
		Set<Calle> calles = new HashSet<>();
		
		for (Caseta c : casetas) {
			calles.add(new Calle(c.getCalle(),c.getIdCalle()));
		}
		
		
		return sb.toString();
	}
	
	private static String listarCalleDistrito(List<Caseta> casetas) { // No funcuiona
		StringBuilder sb = new StringBuilder();
		Set<Calle> calles = new HashSet<>();
		
		for (Caseta c : casetas) {
			calles.add(new Calle(c.getCalle(),c.getIdCalle()));
		}
		
		
		return sb.toString();
	}

	
	private static void borrarCaseta(List<Caseta> casetas, int numeroCaseta) {
		
		casetas.remove(numeroCaseta);
		for (int i = numeroCaseta+1;i<casetas.size();i++) {
			casetas.get(i).setNumero(casetas.get(i).getNumero()-1);
		}
		
	}

	
	
	
}
