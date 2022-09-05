package main;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Files.Combinacion;
import Files.Historial;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(combinacionGanadora(12,35,32,14,50,12,3));

	
	
	}

	
	
	
	
	
	private static void numeroRepite(List<Combinacion> combinaciones) {
	
		Map<Collection<Integer>, Integer> numerosRepetidos= new HashMap<>();
		for(Combinacion c: combinaciones) {
			for(Integer i : c.getNumeros()) {
				
				if(!numerosRepetidos.containsKey(i)) {
					numerosRepetidos.put(i, 0);
				}
				numerosRepetidos.put(i, numerosRepetidos.get(i)+1);
			}
			
		}
	}
	
	
	
	private static int combinacionGanadora(int n1, int n2, int n3, int n4, int n5, int s1, int s2) {
		try {
		Combinacion combinacion = new Combinacion(n1,n2,n3,n4,n5,s1,s2);
		int contadorDeWins=0;	
		
			
		
		List<Combinacion> historial = new ArrayList<>();
		Historial h = new Historial();
		
		File file = new File(".\\files\\Euromillones_2004_a_2022.csv");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
	
		
		br.readLine();
		String linea = br.readLine();
		while (linea!=null) {
			
			String[] info = linea.split(",");
			Set<Integer> numeros = new HashSet<>();
			
			numeros.add(Integer.valueOf(info[1]));
			numeros.add(Integer.valueOf(info[2]));
			numeros.add(Integer.valueOf(info[3]));
			numeros.add(Integer.valueOf(info[4]));
			numeros.add(Integer.valueOf(info[5]));
			
			Set<Integer> estrellas = new HashSet<>();
			estrellas.add(Integer.valueOf(info[7]));
			estrellas.add(Integer.valueOf(info[8]));
			
			Combinacion comb = new Combinacion(numeros, estrellas);
			historial.add(comb);
			
			
			
			
			if(comb.equals(combinacion)) {
				contadorDeWins++;
			}
			
		
			linea= br.readLine();
			
		}
		br.close();
		fr.close();
		
		
	
		return contadorDeWins;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}
