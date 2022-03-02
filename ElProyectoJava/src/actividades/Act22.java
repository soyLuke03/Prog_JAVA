package actividades;

import java.util.Scanner;

public class Act22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = 0;
		int cuadrado = 0; 
		
		n = sc.nextInt();
		
		while (n >= 0) {
			
			cuadrado = n * n;
			System.out.println("El cuadrado es: " + cuadrado);
			n = sc.nextInt();
		
		}
	}

}
