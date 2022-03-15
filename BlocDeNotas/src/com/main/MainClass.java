package com.main;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

import com.model.Bloc;
import com.model.Nota;
import com.model.NotaAlarma;
import com.model.NotaAlarmaException;

public class MainClass {

	private static final String MENU_PRINCIPAL = "Menú para crear notas \n"
			+ "1. Crear nota\n"
			+ "2. Crear nota alarma\n"
			+ "3. Modificar nota\n"
			+ "4. Salir";
										
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		imprimirMenuPrincipal();
		
		boolean toggle = false;
		int opcion = Integer.valueOf(sc.nextLine());
		
		Bloc bloc = new Bloc("Bloc creado");
		
		while (toggle == false) {
			if(opcion==1) {
				System.out.println("Introduce el texto a incluir en la nota");
				String texto = sc.nextLine();
				Nota n = new Nota(texto);
				bloc.addNota(n);
				
				
				imprimirMenuPrincipal();
				opcion = Integer.valueOf(sc.nextLine());
			}
			
			else if(opcion==2) {

//				for(Nota n : bloc.ordenarNotas()) {
//					System.out.println(n);
//				}
				
//				Nota[] notasOrdenadas = bloc.ordenarNotas();
//				
//				for(int i=0;i<notasOrdenadas.length;i++) {
//					System.out.println(notasOrdenadas[i]);
//				}
				
				System.out.println("Introduce el texto a incluir en la nota");
				String texto = sc.nextLine();
				NotaAlarma n = new NotaAlarma(texto,LocalDateTime.now(),true);
				bloc.addNota(n);
				
				imprimirMenuPrincipal();
				opcion = Integer.valueOf(sc.nextLine());
				
			}
			
			else if(opcion==3) {
				System.out.println("Indica la posición de la nota a modificar");
				int pos = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce el texto nuevo");
				String textoNuevo = sc.nextLine();
				bloc.updateNota(pos, textoNuevo);
				
				imprimirMenuPrincipal();
				opcion = Integer.valueOf(sc.nextLine());
			}
			
			else if(opcion==4) {
				String respuesta="";
				do {
				System.out.println("¿Estás seguro de querer salir? S/N");
				respuesta = sc.nextLine();
				
				}while("SN".contains(respuesta) || "sn".contains(respuesta) && respuesta.length()==1);
				
				if ("S".equalsIgnoreCase(respuesta)) {
					toggle = true;
				}
				
			}
			
			else {
				
			}
		}
		
			
		
		System.out.println("");
	}
	
	private static void imprimirMenuPrincipal() {
		System.out.println(MENU_PRINCIPAL);
	}
	
	private static
	
	
	
	
	
	
	
	
	
	
	
	
	private static void test() {
		Integer[] lista = new Integer[7];
		
		lista[0] = 10;
		lista[1] = 3;
		lista[2] = 1;
		
		Arrays.sort(lista);
	}

}
