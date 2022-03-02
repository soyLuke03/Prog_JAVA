package com.edu.ElProyectoJava;

public class CadenasDEJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Strings
		
		String cadenaDeTexto = "Nueva cadena de texto";
		
		cadenaDeTexto = new String("Ahora");
		
		//cadenaDeTexto.isEmpty();		//Comprueba cadenas vacías
		//cadenaDeTexto.isBlank();		//Comprueba si la cadena está vacía o tienes solo espacios
		//cadenaDeTexto.length(); 		//Determina la longitud de la cadena.
		//cadenaDeTexto.indexOf('o'); 	//Determina si el caracter "o" existe en la cadena
		
		//cadenaDeTexto.toUpperCase();		Transforma a Mayúsculas
		//cadenaDeTexto.toLowerCase();		Transforma a Minúsculas

		//Character.isDigit('7');			isDigit sirve para detectar si es o no un digito.
		
		
		boolean contiene = cadenaDeTexto.indexOf("esta")!=-1;
		
		contiene = cadenaDeTexto.contains("esta");
		contiene = cadenaDeTexto.endsWith("esta");

		//cadenaDeTexto.trim("    Ahora a probarlo    ");			.trim sirve para detectar espacios al inicio o al final de las cadenas.	
		//cadenaDeTexto.split("Esto es solo una prueba");			.split sirve para dividir palabras en una cadena.
		
		System.out.println(cadenaDeTexto.indexOf('a'));
		System.out.println(cadenaDeTexto.length());
		
		
		
			//Se pueden saber:
					//Posición de un caracter
					//Contener palabra
					//Logintud de la cadena
					//Espacios en blanco
					//Está vacía
		
		String cadenaVacia ="";
		String cadena2="   ";
		
		
		
		//Character
		
		
		
		//StringBuilder
		
		
		
		//StringBuffer
		
		
		
	}

}
