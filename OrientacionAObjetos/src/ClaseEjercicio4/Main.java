package ClaseEjercicio4;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		
		
		Complejo[] arrayComplejos = new Complejo[5];
		
		
		
		Complejo c1 = new Complejo(3, 3);
		Complejo c2 = new Complejo(2, 1);

		Complejo c3 = new Complejo(3, 3);
		
		arrayComplejos[0] = c1;
		arrayComplejos[1] = c2;
		arrayComplejos[2] = c3;

		arrayComplejos[arrayComplejos.length-1] = new Complejo(3, 2);
		
		arrayComplejos[0].suma(arrayComplejos[2]);
		
		System.out.println(c1==c3); //FALSE
		System.out.println(c1.equals(c3)); //TRUE
		System.out.println(c2.equals(c3)); //FALSE
		
		Complejo resultadoSuma = c1.suma(c2);
		resultadoSuma = c2.suma(c1);

		
		/*
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
		
		
		*/
	}
	
	

}
