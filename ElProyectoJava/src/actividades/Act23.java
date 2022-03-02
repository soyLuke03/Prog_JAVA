package actividades;

import java.util.Scanner;

public class Act23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;
		int n = 0;
		
		Scanner sc = new Scanner ( System.in );
		
		n = sc.nextInt();
		
		while (n >= 0) {
			contador = contador + 1;
			n = sc.nextInt();
		}
		System.out.println("Se han introducido: " + contador + " números.");
		
		
	}

}
