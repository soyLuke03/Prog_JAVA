package plataforma.online.jacaranda.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Temporada {


	private String nombreTemporada;
	private List<String> capitulos;
	private int sumaOpiniones;
	private int numeroOpiniones;
	
	
	public Temporada(String nombreTemporada) {
		capitulos = new ArrayList<>();
		this.sumaOpiniones=0;
		this.numeroOpiniones=0;
		this.nombreTemporada = nombreTemporada;
	}
	
	
	public String mostrarCapitulos(){
		StringBuilder sb = new StringBuilder();
		
		for(String s : capitulos) {
			sb.append(s);
		}
		return sb.toString();
	}
	
	public void annadirCapitulo(String capitulo) {
		if(capitulos.contains(capitulo)) {
			throw new TemporadaException("Capitulo existente");
		}
		capitulos.add(capitulo);
		
	}
	
	public boolean eliminarCapitulo(String capitulo) {
		boolean borrado = false;
		for(int i = 0;i<capitulos.size();i++) {
			if(capitulos.get(i).equals(capitulo)) {
				capitulos.remove(i);
			}
		}
		
		return borrado;
	}
	
	/**
	 * Metodo para añadir valoraciones (integer)
	 * @param opinion
	 */
	public void valorar(int opinion) {
		
		if(opinion>0 && opinion <10) {
			this.sumaOpiniones += opinion;
			this.numeroOpiniones++;
		}
		else {
			throw new TemporadaException("Puntuación inválida");
		}
		
		
	}
	
	/**
	 * Metodo para añadir un capitulo despues de otro
	 * @param capNuevo
	 * @param otroCap
	 */
	public void annadirCapituloDespues(String capNuevo, String otroCap) {
		int posicion = capitulos.size();
		for(int i = 0;i<capitulos.size();i++) {
			if(capitulos.get(i).equals(otroCap)) {
				posicion = i;
			}
		}
		
		
		capitulos.add(posicion,capNuevo);
		
		
	}
	
	/**
	 * Metodo para buscar capitulos por palabras
	 * @param palabra
	 * @return
	 */
	public String primerCapituloQueContieneEstaPalabra(String palabra) {
		String guess = "";
		
		for(int i = 0;i<capitulos.size();i++) {
			if(capitulos.get(i).contains(palabra)) {
				guess = capitulos.get(i);
			}
		}
		
		
		return guess;
	}
	
	public double getNotaMedia() {
		double resultado = 0;
		
		if(numeroOpiniones!=0) {
			resultado = sumaOpiniones/numeroOpiniones;
		}
		
		
		return resultado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitulos, nombreTemporada, numeroOpiniones, sumaOpiniones);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		Temporada otra = (Temporada) obj;
		if(this.nombreTemporada.equals(otra.nombreTemporada)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}

	@Override
	public String toString() {
		return this.nombreTemporada + "," + this.capitulos + "," + this.sumaOpiniones + "," + this.numeroOpiniones;
	}

	public String getNombreTemporada() {
		return nombreTemporada;
	}

	public void setNombreTemporada(String nombreTemporada) {
		this.nombreTemporada = nombreTemporada;
	}

	public List<String> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<String> capitulos) {
		this.capitulos = capitulos;
	}

	public int getSumaOpiniones() {
		return sumaOpiniones;
	}

	public void setSumaOpiniones(int sumaOpiniones) {
		this.sumaOpiniones = sumaOpiniones;
	}

	public int getNumeroOpiniones() {
		return numeroOpiniones;
	}

	public void setNumeroOpiniones(int numeroOpiniones) {
		this.numeroOpiniones = numeroOpiniones;
	}
	
	
	
}
