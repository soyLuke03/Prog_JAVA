package Actividades2;

public class EjercCadenasBol2 {

	private static String cadenaNueva;



	public static void main(String[] args) {
			System.out.println(parImpar("Elpepelelo",true));
			System.out.println(cesar('a',26));
			System.out.println(cesarTxt("abcd", 3));
			System.out.print(divTreh("1298"));
		
	}

	
	public static String parImpar(String cadena, boolean flag) {
		String cadenaCambiada = "";
		
		StringBuilder sb = new StringBuilder();
		
		if (flag == true) {
			for(int i = 0; i < cadena.length();i += 2) {
				sb.append(cadena.charAt(i));
			}
		}
		else 
		{
			for(int i = 1; i < cadena.length();i += 2) {
				sb.append(cadena.charAt(i));
		}
		
		
		}
		return sb.toString();
		}
		
	public static String cesar(char c, int cifrado) {
		StringBuilder sb = new StringBuilder();
		String abcdario = "abcdefghijklmnñopqrstuvwxyz";
		
		sb.append(abcdario.charAt(((abcdario.indexOf(c)) + cifrado) % 27));
		
		return sb.toString();
	}
	
	
	
	
	    public static String cesarTxt(String cadena, int cifrado) {
		

		return cadenaNueva;
	}
	
	
	public static String divTreh(String numero) {
		String n ="";
		int number = 0;


		
		for (int i=0;i < numero.length();i++) {
			switch (numero.charAt(i)) {
			case '1':{
				number += 1; 
			}break;
			case '2':{
				number += 2; 
			}break;
			case '3':{
				number += 3; 
			}break;	
			case '4':{
				number += 4; 
			}break;
			case '5':{
				number += 5; 
			}break;	
			case '6':{
				number += 6; 
			}break;
			case '7':{
				number += 7; 
			}break;
			case '8':{
				number += 8; 
			}break;
			case '9':{
				number += 9; 
			}break;
			}
			}
		
		if (number % 3 == 0) {
			n = "Divisible";
		}
		
		
		else {
			System.out.println("No divisible");
		}
		
		return n;
	}
	
	
	
	
}

