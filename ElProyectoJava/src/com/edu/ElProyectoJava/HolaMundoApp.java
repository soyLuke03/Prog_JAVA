package com.edu.ElProyectoJava;

import java.util.Scanner;

public class HolaMundoApp {

	public static void main(String[] args) {
		
		//Tipos de variables Tete
		/*
		long tipoLong = 1_000_000_000;
		System.out.println(tipoLong);
		
		char c = 'D';
		System.out.println(c);
		
		int numero = c; 
		System.out.println(numero);
		
		boolean buleano = false;
		System.out.println(buleano);
		
		float tipoFloat = 0.9f;
		System.out.println(tipoFloat);
		*/
		
		//Para printear cosas
		
		/*
		System.out.println("El Pepe");
		
		int Integer = 39;
		Integer = 38;
		System.out.println(Integer);
		*/
		
		
		//Para constantes (Ponerlas en mayúsculas)
		
		/*
		final float PI = 3.141518f;
		
		System.out.println(PI);
		*/
		/* *
		 * el pepe
		 * */

		//Operadores TeTe
		/*
		int valor1 = 10;
				
		System.out.println(valor1);
		
		*/
		//Para sumar 1 o si se usa -- restar 1
		
		/*
		valor1++;
		
		System.out.println(valor1);
		
		*/
		//Buleanos
		/*
		boolean logica = false;
		System.out.println(logica);
		
		logica = !logica;
		System.out.println(logica);
		
		logica = !logica;
		System.out.println(logica);
		
		
		System.out.println(3+5+9*(9+3-6));
		
		
		*/
		//Condicionales de IF y ELSE
		/*
		boolean condicion = true;
		
		if ( condicion == true)
		{
			System.out.println("Es tru");
		}
		else if ( condicion == false)
		{
			System.out.println("Es fols");
		}
		*/
		
		
		//Condicionales de IF, ELIF (ELSE IF) y ELSE
		/*
		int nusmero = 41;
		
		if ( nusmero > 42 ) {
			System.out.println("Mas que 42");
		}
		
		else if ( nusmero == 42 ) {
			System.out.println("Es 42");
		}
		
		else {
			System.out.println("Menos que 42");
		}
  		
		*/
		
		//El switch o como sea. PARA VALORES CERRADOS, FINITOS Y REDUCIDOS.
		/*
		int mes = 3;
		
		switch (mes) {
		case 1:
		{ 
			System.out.println("Enero chaval");
			break;
		}
		case 2:
		{ 
			System.out.println("Febrero chaval");
			break;
		}
		case 3:
		{ 
			System.out.println("Marzo chaval");
			break;
		}
		case 4:
		{ 
			System.out.println("Abril chaval");
			break;
		}
		default:
			System.out.println("El predeterminao chaval");;
		}
		
		*/
		//Switch con cosas multiplés ESTE SOLO FUNCIONA EN JAVA 14 PARA ADELANTE
		
		/*
		int diaMes = 31;
		
		switch (diaMes) {
		case 1, 3, 5, 7, 8, 10, 12 :
		{
			System.out.println("31 dias");
			break;
		}
		case 2 :
		{
			System.out.println("El februari");
			break;
		}
		case 4, 6, 9, 11 :
		{
			System.out.println("30 días");
			break;
		}
		
		default:
		{
			System.out.println("El predeterminao");
		}
		}
		
		
		//Para hacer los inputs de python
		String name;
		
		System.out.println("¿Nombre?");
		Scanner algo = new Scanner (System.in);
		name = algo.next();
		
		System.out.println("Hello ,"+ name);
				
		
		//Lo mismo pero con INT
		System.out.println("Di un numero");
		
		Scanner numeroSC = new Scanner (System.in);
		int numero1 = numeroSC.nextInt();
				
		System.out.println(numero1 + 12);
		
		
		*/
		
		
		
		
		//EJERCICIO 1: Diseña un programa que pregunte por la edad y diga si es mayor de edad:
		
		/*
		 
		System.out.println("Introduce la edad");
		
		Scanner edad = new Scanner ( System.in );
		
		int edadChico = edad.nextInt();
		
		if (edadChico >= 18 ) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("Es menor de edad");
		}
		
		*/
		
		//EJERCICIO 2: Indica el grupo de edad:
		
		/*
		System.out.println("Introduce la edad");
		
		Scanner edad1 = new Scanner ( System.in );
		
		int edadChico1 = edad1.nextInt();
		
		
		if (edadChico1 < 18) {
			System.out.println("Es un niño");
		}
		else if (edadChico1 > 65 ){
			System.out.println("Es anciano");
		}
		else {
			System.out.println("Es adulto");
		}
		*/
		
		//EJERCICIO 3: Realiza un programa (días del mes) que pregunte por un mes y un año y devuelva el número de días que tiene el mes en ese año
		/*
		System.out.println("Di un mes, primo: ");
		
		Scanner diaDelMes = new Scanner (System.in);
		int diaDelMesV = diaDelMes.nextInt();
		
		switch (diaDelMesV) 
		{
		case 1:
		{
			System.out.println("enero y tiene 31 días");
			break;
		}
		case 2:
		{
			System.out.println("febrero y tiene 27 días, 28 si es bisiesto");
			break;
		}
		case 3:
		{
			System.out.println("Marzo y tiene 31 días");
			break;
		}
		case 4:
		{
			System.out.println("Abril y tiene 30 días");
			break;
		}
		case 5:
		{
			System.out.println("Mayo y tiene 31 días");
			break;
		}
		case 6:
		{
			System.out.println("Junio y tiene 30 días");
			break;
		}
		case 7:
		{
			System.out.println("Julio y tiene 31 días");
			break;
		}
		case 8:
		{
			System.out.println("Agosto y tiene 31 días");
			break;
		}
		case 9:
		{
			System.out.println("Septiembre y tiene 30 días");
			break;
		}
		case 10:
		{
			System.out.println("Octubre y tiene 31 días");
			break;
		}
		case 11:
		{
			System.out.println("Noviembre y tiene 30 días");
			break;
		}
		case 12:
		{
			System.out.println("Diciembre y tiene 31 días. Uvitas.");
			break;
		}

		default:
			System.out.println("No existe, campeón.");
		}
		
		*/
		
		
		
		//BUCLES. POR CONTADOR Y POR CONDICION
		/*
		
		int i = 1;
				
		while (i <= 10) {
			System.out.println(i*2);
			i++;
		}
		*/
		//for ( declaración de variable; definición/condición ; contador/acción)
		/*
		for (int x = 1; x <=10 ; x++) {				
			System.out.println(x*2);
		}
		
		*/
		//BUCLE ""DO WHILE"" Hace la orden al menos una vez.
		/*
		Scanner sc1 = new Scanner ( System.in);
		int numero =0;
		
		do {
			System.out.println("Escribe un numero");
			numero = sc1.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("El número es par");
			}
			
			else {
				System.out.println("El número es impar");
			}
			
		}while (numero > 0);
		
		
		
		
		Scanner sc1 = new Scanner ( System.in);
		int numero =0;
		
		for ( ; numero > 0 ; ); {
			System.out.println("Escribe un numero");
			numero = sc1.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("El número es par");
			}
			
			else {
				System.out.println("El número es impar");
			}
			
		}
		*/
		
		/*
		boolean esPrimo = true;
		int numero = 23;
		
		for (int i=2 ; i < numero && esPrimo ; i++) {
			if (numero % i == 0) {
				esPrimo = false;
				System.out.println("No es primo");
			
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
