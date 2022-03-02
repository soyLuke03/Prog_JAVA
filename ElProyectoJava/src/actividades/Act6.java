package actividades;

import java.util.Scanner;

public class Act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc1 = new Scanner (System.in);
		
		System.out.println("Bienvenido a estuf.app");
		System.out.println("¿Qué día es? ");
		int dia = Integer.valueOf(sc1.next());
		System.out.println("Ahora el mes: ");
		int mes = Integer.valueOf(sc1.next());
		
		while (mes < 0 || mes > 12) {
			System.out.println("Mes inválido");
			mes = Integer.valueOf(sc1.next());
		}
		
		switch (mes) {
		case 1,3,5,7,8,10,12: {
			while (dia < 0 || dia > 31) {
				System.out.println("Día inválido");
				 dia = Integer.valueOf(sc1.next());
				 
			}break;
		}
		case 2:{
			while (dia < 0 || dia > 29) {
				System.out.println("Día inválido");
				 dia = Integer.valueOf(sc1.next());

			}break;
		}
		case 4,6,9,11:{
			while (dia < 0 || dia < 30) {
				System.out.println("Día inválido");
				 dia = Integer.valueOf(sc1.next());

			}break;
		}
		default:{
			System.out.println("Mes inválido");
		}
			
			
		}
		
		if (dia >= 20 && mes == 3 || dia <=21 && mes == 6) {
			System.out.println("20º");
		}
		else if (dia > 21 && mes == 6 || dia <= 23 && mes == 9) {
			System.out.println("24º");
		}
		else if (dia > 23 && mes == 6 || dia <= 21 && mes == 12) {
			System.out.println("19º");
		}
		else if (dia > 21 && mes == 12 || dia <= 20 && mes == 3) {
			System.out.println("19º");
		}
		else if (mes == 1 ||  mes == 2) {
			System.out.println("19º");
		}
		else if (mes == 4 ||  mes == 5) {
			System.out.println("20º");
		}
		else if (mes == 7 ||  mes == 8) {
			System.out.println("24º");
		}
		else if (mes == 10 ||  mes == 11) {
			System.out.println("19º");
		}
	}
}