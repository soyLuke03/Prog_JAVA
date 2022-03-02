package actividades;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner (System.in);
		System.out.println("¿Qué día es?");
		String diaDeLaSemana = sc1.next();
		
		switch (diaDeLaSemana) {
		case "Lunes":
		{
			System.out.println("A primera toca Sistemas");
			break;
		}
		case "Martes":
		{
			System.out.println("A primera toca Programación");
			break;
		}
		case "Miércoles":
		{
			System.out.println("A primera toca Base de datos");
			break;
		}
		case "Jueves":
		{
			System.out.println("A primera toca Base de datos");
			break;
		}
		case "Viernes":
		{
			System.out.println("A primera toca Base de datos");
			break;
		}
			
		default:
		{
			System.out.println("Fecha inválida");
		}
			
		}
		
		
		
		
		
		
	}
}
