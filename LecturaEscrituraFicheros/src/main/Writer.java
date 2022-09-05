package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Writer {

	private static final int NUMERO_LINEAS = 3;


	
	public void escritor(String nombre) {
		String cadena;
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter flujoEscritura = new FileWriter(nombre, true);
			PrintWriter filtroEscritura = new PrintWriter(flujoEscritura);
			for (int i = 1; i <= NUMERO_LINEAS; i++) {
				System.out.println("Introduce texto:");
				cadena=sc.nextLine();
				filtroEscritura.println(cadena);
			}
			filtroEscritura.close();
			flujoEscritura.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		}
	
}
