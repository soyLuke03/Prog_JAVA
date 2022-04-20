package main.pacaje;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


	public static Map<Integer,Integer> cuentaNumeros(List<Integer> numeros){ // 1 1 3 5 3 4 5 1.  1 -> 3 / 3 -> 2...
		
		Map<Integer,Integer> numbers = new HashMap<>();
		int x;
		for (Integer i : numeros) {
			if(numbers.containsKey(i)) {
				x = numbers.get(i);
				numbers.put(i, ++x);
			}
			else {
				x=1;
				numbers.put(i, x);
			}
		}
		
		return numbers;
	}
	
	public static  <T> Map<T,Integer> cuentaCosas(List<T> numeros){ // 1 1 3 5 3 4 5 1.  1 -> 3 / 3 -> 2...
		
		Map<T,Integer> cosas = new HashMap<>();
		Integer x;
		for (T i : numeros) {
			if(cosas.containsKey(i)) {
				x = cosas.get(i);
				cosas.put(i, ++x);
			}
			else {
				x=1;
				cosas.put(i, x);
			}
		}
		
		return cosas;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Maps. 
		
		//Clave   -> Valor
		//Key -> Value
		
		//Comunidad -> Conjunto de gente
		//Algoritmo -> Conjunto de pasos
		
		
		
//		Map<String, String> diccionario;
		
//		Map<String,String> diccionario = new HashMap<>();
//		diccionario.put("Comunidad", "Conjunto de gente");
//		diccionario.put("Algoritmo", "Conjunto de pasos para resolver un problema");
		
//		System.out.println(diccionario);
		
		
		//Rescatar un valor
		
		//ContainsKey  boolean --> devuelve si una clave existe en el map

//		System.out.println(diccionario.containsKey("Comunidad"));
//		System.out.println(diccionario.containsKey("Vecindario"));
//		System.out.println(diccionario.containsKey("Algoritmo"));
//		System.out.println(diccionario.containsKey("algoritmo")); //Es case Sensitive
	
		//getKey: contenido --> devuelve el valor asociado a la clave
		
//		System.out.println(diccionario.get("Comunidad"));
//		System.out.println(diccionario.get("Vecindario"));
//		System.out.println(diccionario.get("Algoritmo"));
//		System.out.println(diccionario.get("algoritmo"));
	
/*	
		Map<String,List<String>> instituto = new HashMap<>();
		
		List<String> ltemp = new ArrayList<String>();
		ltemp.add("Sergio");
		ltemp.add("Daniel");
		ltemp.add("Pilar");
		
		instituto.put("1A", ltemp);
		
		instituto.put("1A", new ArrayList<String>()); //Esto machaca la lista anterior
		instituto.get("A1").add("Antonio");
		instituto.get("A1").add("Sergio");
		instituto.get("A1").add("Daniel");
		instituto.get("A1").add("Pilar");
		instituto.get("A1").add("Antonio");
*/	
		
		/*
		Map<String, Integer> numeros = new HashMap<>();
		
		numeros.put("Uno", 1);
		numeros.put("Ciento doce", 112);
		numeros.put("Dos", 2);
		numeros.put("Cuatro", 4);
		numeros.put("Cinco", 5);
		*/
		
		System.out.println("...");
		
		
		List<String> palabras = new ArrayList<>();
		palabras.add("Cod");
		palabras.add("Desstiny");
		palabras.add("Elden ring");
		palabras.add("Elden ring");
		palabras.add("Desstiny");
		palabras.add("Elden ring");
		palabras.add("Valorant");
		palabras.add("Valorant");
		
		System.out.println(cuentaCosas(palabras));
	}

}
