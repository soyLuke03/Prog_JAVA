package ClaseEjercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Complejo comp = new Complejo();
		
		System.out.println("NÚMEROS COMPLEJOS\n==================");
		System.out.println("Elija su opción: \n"
						 + "1- Sumar complejos \n"
						 + "2- Restar complejos \n"
						 + "3- Igualar complejos");
		String opc = sc1.nextLine();
		
		if (opc.equals("1")) {
			
			comp.sumaDosNumeros();
			
		}else if (opc.equals("2")) {
			
			comp.restaDosNumeros();
			
		}else if (opc.equals("3")) {
			
			comp.equals();
			
		}else {
			System.out.println("opción inválida");
		}
		
	}

}
