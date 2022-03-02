package actividades;

import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {
		

		System.out.println(obtenerTipoCaracter('['));

	}
	
	
	public static String obtenerTipoCaracter(char c) {
		
		String llaves = "{}[]()";
		String signoPunt = "ºª|@#€%$&¬=+-_ç";
		
		
		String mensaje = "";
		
		if (Character.isUpperCase(c)) {
			mensaje = "El caracter está en mayúscula";
		}
		
		else if (Character.isLowerCase(c)) {
			mensaje = "El caracter está en minúscula";
		}
		
		else if (Character.isDigit(c)) {
			mensaje = "El caracter es un número";
		}
		
		else if (c == ' ') {
			mensaje = "El caracter es un espacio";
		}
		
		else if (llaves.indexOf(c) != -1) {
			mensaje = "Es una llave o paréntesis";
		}
		
		else if (signoPunt.indexOf(c) == -1) {
			mensaje = "El caracter es un signo de puntuación";
		}
		
		else if (signoPunt.indexOf(c) != -1) {
			mensaje = "Es un caracter especial";
		}
		
		
		
		
		
		return mensaje;
		
		
	}
		
		
		
		
	
}
