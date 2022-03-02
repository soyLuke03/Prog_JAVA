package actividades;

import java.util.Scanner;

public class Act25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int numeroDeNumeros = 0;
		int maximo = n;
		int media = 0;
		int contadorImpares = 0;
		int acumuladorImpares = 0;
		
		Scanner sc = new Scanner (System.in);
		
		n = sc.nextInt();
		
		while (n >= 0) {
			if (n % 2 == 0) {
				
				if (n > maximo) {
					maximo = n;
				}
				
				
			}
			else {
				acumuladorImpares = acumuladorImpares + n;
				contadorImpares ++;
				
			}
		numeroDeNumeros ++;
		n = sc.nextInt();

		}
		media = acumuladorImpares / contadorImpares;

		
		System.out.println("Existen: " + numeroDeNumeros + " números");
		System.out.println("El mayor de los pares es: " + maximo);
		System.out.println("La media de los impares es: " + media);

		
		
	}

}
