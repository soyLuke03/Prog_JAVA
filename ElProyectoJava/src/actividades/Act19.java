package actividades;

import java.util.Scanner;

public class Act19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		int numero = 1;
		int total = 0;
		int eleccion = 0;
		System.out.println("Introduce 15 números: ");
		
		while (numero <= 15) {
			eleccion = sc.nextInt();
			total = total + eleccion;
			numero ++;
		}
		
		System.out.println("total:" + total);
	}

}
