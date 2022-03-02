package actividades;

import java.util.Scanner;

public class Act26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner ( System.in);
		System.out.println("SUMAR NUMEROS SIN FIN");
		
		int sumador = 0;
		int numero = 0;
		String cadena = "";
		
		while (cadena != "fin") {
			
			System.out.println("Número: ");
			numero = sc.nextInt();
			sumador = numero + sumador;
			
			System.out.println("¿Acabar?");
			cadena = sc.next();
		
			}
		
#########################################################	
		
		
		
	}

}
