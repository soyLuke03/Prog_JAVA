package actividades;

import java.util.Scanner;

public class Act27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		
		int sueldo = 0;
		int nsueldo = 0;
		int masmil = 0;
		int acumulador = 0;
		
		System.out.println("Dame 10 sueldos: ");
		
		
		while (nsueldo <= 9) {
			sueldo = sc.nextInt();
			
			while (sueldo < 0) {
				System.out.println("Dame el sueldo mayor que 0.");
				sueldo = sc.nextInt();
		
			}
			
			if (sueldo >= 1000) {
				masmil ++;
			}
			acumulador = acumulador + sueldo;
			nsueldo ++;
				
		}
			System.out.println("Sueldo +1000: " + masmil);
			System.out.println("Suma total: " + acumulador);
	
	}

}
