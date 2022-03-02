package actividades;

import java.util.Scanner;

public class Act5 {
	
	public static void main(String[] args) {
		
		
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Introduce la hora en formato 24Horas: Ejemplo->(16) ");
		
		int hora = sc1.nextInt();
		
		if (hora <= 12 && hora >= 6) {
			System.out.println("Buenos días");
		}
		
		else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		}
		else if (hora >= 21 && hora <= 24 || hora <= 5) {
			System.out.println("Buenas noches");
		}
		
	}

}
