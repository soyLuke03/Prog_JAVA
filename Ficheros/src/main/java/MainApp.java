package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		
		
		
		try {

			File file = new File(".\\Files\\Fichero.txt");
		
			FileReader fr = new FileReader(file);
			//System.out.println(fr.read());
			
			BufferedReader br = new BufferedReader(fr);
//			System.out.println(br.readLine());
			
			
			/*
			 * Los READERS consumen la linea que se 
			 * muestra por lo que 
			 * no podemos volver a ella.
			 * */
			List lista = new ArrayList<>();
			String n = br.readLine();
			while(n!=null) {
				lista.add(n.split(" ")); 
				n = br.readLine();
			}
			
			System.out.println(lista.get(0));
			
			
			br.close();
			fr.close();
			
			
			
			
			
		} 
		catch (IOException e) {
			System.out.println("[ERROR]");
		}
		
	}
}

