package com.edu.ElProyectoJava;

import java.util.Scanner;

public class EjercicioDeClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numeroDiasMes();
		
	}
		
	public static void numeroDiasMes() {
		
		Scanner sc1 = new Scanner (System.in);
		
		
		System.out.println("Dime un año: ");
		int year = Integer.valueOf(sc1.next());
		
				System.out.println("Dime un mes: ");
		int month = Integer.valueOf(sc1.next());
		while (year > 0)
		{
		

		

		
		switch (month) {
		case 1,3,5,7,8,10,12:
		{
			System.out.println("El mes tiene 31 días ");
			break;
		}
		case 2:
		{if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			System.out.println("El mes tiene 29 días ");
			}
		else
		{
			System.out.println("El mes tiene 28 días ");
		}
			break;
		}

		case 4,6,9,11:
		{
			System.out.println("El mes tiene 30 días");
			break;
		}
			
		default:
		{
			System.out.println("El mes no es válido");
			break;
		}
		}
		}
	}

	

}
