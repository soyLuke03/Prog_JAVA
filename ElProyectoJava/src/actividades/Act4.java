package actividades;

import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner (System.in);
		
		System.out.println("Nota parte práctica: ");
		double notaPractica = sc1.nextDouble();	
		
		
		System.out.println("Nota parte problemas: ");
		double notaProblemas = sc1.nextDouble();
		
		
		System.out.println("Nota parte teórica: ");
		double notaTeorica = sc1.nextDouble();
		
		
		double notaPracticaFinal = 0.1 * notaPractica;
		double notaProblemasFinal = 0.5 * notaProblemas;
		double notaTeoricaFinal = 0.4 * notaTeorica;
		
		
		
		if (notaPractica < 0 && notaPractica > 10) {
			if (notaProblemas < 0 && notaProblemas > 10) {
				if (notaTeorica < 0 && notaTeorica > 10 ) {
					
				}
				else {
					System.out.println("La media es: " + dividir(notaPracticaFinal,notaProblemasFinal,notaTeoricaFinal));

				}
			}
			else {
				System.out.println("La media es: " + dividir(notaPracticaFinal,notaProblemasFinal,notaTeoricaFinal));

			}
		}
		else {
			System.out.println("La media es: " + dividir(notaPracticaFinal,notaProblemasFinal,notaTeoricaFinal));

		}
		
	
	}
			
			
	
	public static String dividir(double nota1, double nota2, double nota3) {
	
	

	double media = (nota1 + nota2 + nota3);
	String nota = null;
	
	if (media < 5 && media >= 0) {
	 nota = "Insuficiente";
	 System.out.println("Tu media es: "+ media);
	}
	else if (media >= 5 && media < 6) {
	 nota = "Suficiente";
	 System.out.println("Tu media es: "+ media);

	}
	else if (media >= 6 && media < 7) {
	 nota = "Bien";
	 System.out.println("Tu media es: "+ media);

	}
	else if (media >= 7 && media < 9) {
	 nota = "Notable";
	 System.out.println("Tu media es: "+ media);

	}
	else if (media >= 9 && media <= 10) {
	 nota = "Sobresaliente";
	 System.out.println("Tu media es: "+ media);

	}
	
	return nota ;
		
	}

}
