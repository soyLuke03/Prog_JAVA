package Actividades2;

public class Ejerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(numerosRoman("C"));
		
	}

	
	public static int numerosRoman(String nRomano) {
		int resultado = 0;
		
		for (int i=0;i< nRomano.length()-1; i++){
			
			
		
		switch (nRomano.charAt(i)) {
		case 'I':
			resultado += 1;
			break;
		
		case 'V':
			resultado += 5;
			break;
		
		case 'X':
			resultado += 10;
			break;
		
		case 'L':
			resultado += 50;
			break;
		
		case 'C':
			resultado += 100;
			break;
		
		case 'D':
			resultado += 500;
			break;
		
		case 'M':
			resultado += 1000;
			break;
		

		default:
			break;
		}
		
	}
		return resultado;
	}
	
	
}
