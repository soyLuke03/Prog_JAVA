package actividades;

import java.util.Scanner;

public class Act21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner (System.in);
		int n = -1;
		
		while (n < 0) {
			System.out.println("Introduce un número positivo");
			n = sc1.nextInt();
		}
		
		for (int i = 0; i <= 100 ;i++) {
			System.out.println(n);
			n = n + 1;
		}
		
		
		
	}

}
