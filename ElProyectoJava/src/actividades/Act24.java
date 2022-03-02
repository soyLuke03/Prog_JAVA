package actividades;

import java.util.Scanner;

public class Act24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int i = 1;
		int maximo = n;
		
		Scanner sc = new Scanner (System.in);
		
		
		while (i <= 10) {
			n = sc.nextInt();
			if (n > maximo) {
				maximo = n;
			}
			i ++;
		}
		System.out.println("El mayor es: " + maximo);
		
		
		
		
	}

}
