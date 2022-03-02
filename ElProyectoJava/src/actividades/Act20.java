package actividades;

import java.util.Scanner;

public class Act20 {

	public static void main(String[] args) {

		String cadena = null;
		int n1=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce 5 números: ");
		int i = 1;
		while (i <= 5) {
			n1 = sc.nextInt();
			
			if (n1 % 3 == 0) {
			System.out.println("Es múltiplo");
			}
			i++;
			}
	
		System.out.println("Programa finalizado");
	}
	

}
