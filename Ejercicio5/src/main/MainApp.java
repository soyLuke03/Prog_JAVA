package main;

import model.Alumno;
import model.Persona;
import model.Profesor;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona marina = new Alumno("marina",21);	
		Persona yomismo = new Alumno("yomismo",17);
		Persona unoMas = new Profesor("unoMas",29);
		Persona luke = new Alumno("luke", 18);
		
		marina.enviarMensaje(luke, "Adios, buen dias");
		marina.enviarMensaje(luke, "Sota, caballo y rey");
		marina.enviarMensaje(luke, "Poker stars");
		
		System.out.println(luke.encontrarMensaje("Poker "));
		System.out.println(luke.encontrarMensaje(" "));
		System.out.println(luke.encontrarMensaje("Hola"));
		
		System.out.println("");
		System.out.println(marina.getRemitente());
	}

}
