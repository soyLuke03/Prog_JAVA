package actividades;

import java.util.Scanner;

public class Act42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);	
		String cadena = sc.next();
		
		if (ocho(cadena) == "S" && mayuscula(cadena) == "S" && minuscula(cadena) == "S" && signo(cadena) == "S" && digito(cadena) == "S") {
			System.out.println("Contraseña FUERTE");
		}
		else {
			System.out.println("Contraseña DÉBIL.");
		}		
	}
	//Comprueba logintud
	public static String ocho(String cadena) {
		String res ="";
		
		if (cadena.length() >= 8) {
			res = "S";
		}
		return res;
	}
	//Comprueba mayusculas
	public static String mayuscula(String cadena) {
		String res ="";
		
		for (int i = cadena.length()-1; i >= 0 ; i-- )
			
			if (Character.isUpperCase(cadena.charAt(i))) {
				res = "S";
			}
		
		return res;
		
	}
	//Comprueba minusculas
	public static String minuscula(String cadena) {
		String res ="";

		for (int i = cadena.length()-1; i >= 0 ; i-- )
			
			if (Character.isLowerCase(cadena.charAt(i))) {
				res = "S";
			}
		
		return res;
		
	}
	//Comprueba signos especiales
	public static String signo(String cadena) {
		String res ="";
		String signos = "!¡¿?ºª|@#€%$&¬=+-_ç";

		for (int i = cadena.length()-1; i >= 0 ; i-- ) { // CADENA: AgL12_1
			
			for (int j = signos.length()-1; j >= 0 ; j--) {
			
				if (cadena.charAt(i) == signos.charAt(j)) {
					res = "S";
			}
			}
			}
		
		return res;
		
	}
	//Comprueba digitos
	public static String digito(String cadena) {
		String res ="";

		for (int i = cadena.length()-1; i >= 0 ; i-- )
			
			if (Character.isDigit(cadena.charAt(i))) {
				res = "S";
			}
		
		return res;
		
	}
}

