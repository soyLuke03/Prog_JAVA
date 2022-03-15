package com.model;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Bloc {

	private static final Integer NUMERO_NOTAS_MAXIMA = 10;
	private Integer numNotas = 0;
	private String nombre;
	private Nota[] blocNotas = new Nota[NUMERO_NOTAS_MAXIMA];
	
	//BUILDER
	
	public Bloc(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Methods
	
	public void updateNota(int posicion, String texto) {
		if (blocNotas[posicion-1] != null && posicion < NUMERO_NOTAS_MAXIMA) {
			blocNotas[posicion-1].setTexto(texto);
		}

		
	}
	
	public void addNota(Nota nota) {
		if (this.numNotas<NUMERO_NOTAS_MAXIMA) {
			this.blocNotas[numNotas] = nota;
			numNotas++;
		}
	}

	public void addNota(int posicion ,Nota nota) {
		if (this.numNotas<NUMERO_NOTAS_MAXIMA) {
			this.blocNotas[posicion] = nota;
		}
		else {
			throw new BlocException("La posición indicada es incorrecta");
		}
	}
	
	public String getNota(int numero) {
	
		StringBuilder sb = new StringBuilder();
		
		if (blocNotas[numero-1] != null) {
			sb.append(blocNotas[numero-1].getTexto());
		}
		else {
			throw new BlocException("No existe una nota en la posición elegida");
		}
		
		return sb.toString();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void activa(int posicion) {
		if (this.blocNotas[posicion-1] instanceof Activable && posicion < NUMERO_NOTAS_MAXIMA && this.blocNotas[posicion-1] != null) {
			
			NotaAlarma notaAactivar = (NotaAlarma)this.blocNotas[posicion-1];
			notaAactivar.activar();
			
		}
		
		else {
			throw new BlocException("No se puede activar la alarma");
		}
	}
	
	public void desactiva(int posicion) {
		if (this.blocNotas[posicion-1] instanceof Activable && posicion < NUMERO_NOTAS_MAXIMA && this.blocNotas[posicion-1] != null) {
			
			NotaAlarma notaAactivar = (NotaAlarma)this.blocNotas[posicion-1];
			notaAactivar.desactivar();
			
		}
		
		else {
			throw new BlocException("No se puede desactivar la alarma");
		}
		
	}
	
	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}
	
	public String ordenarBloc() { // A saber que se hace aquí
		
		StringBuilder sb = new StringBuilder();
		return sb.toString(); 
	}
	 
	public Nota[] ordenarNotas() {
		
		int contadorNotas = contarNotasNoNulas();
		
		Nota[] notasOrdenadas = new Nota[contadorNotas];
		
		int cNotasOrdenadas = 0;
		for(int j=0;j<this.blocNotas.length;j++) {
			if(this.blocNotas[j]!=null) {
				notasOrdenadas[cNotasOrdenadas++]=this.blocNotas[j];
			}
		}
		Arrays.sort(notasOrdenadas);
		return notasOrdenadas;
	}

	private int contarNotasNoNulas() {
		int contadorNotas = 0;
		for(int i=0;i<this.blocNotas.length;i++) {
			if(this.blocNotas[i]!=null) {
				contadorNotas++;
			}
		}
		return contadorNotas;
	}
	
	public void introducirNotas(Nota notaAIntroducir) {
		
		
	}
	
	public String listarNotas() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i<blocNotas.length;i++) {
			sb.append(blocNotas[i]);
		}
		
		return sb.toString();
	}

	
	
	//Overrides
	
	@Override
	public String toString() {
		return "Bloc [numNotas=" + numNotas + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, numNotas);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;

		Bloc otroBloc = (Bloc) obj;
		
		if(obj != null && this.nombre.equals(otroBloc.nombre)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
	
	
	
}
