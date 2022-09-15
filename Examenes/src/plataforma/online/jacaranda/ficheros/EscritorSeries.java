package plataforma.online.jacaranda.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import plataforma.online.jacaranda.com.Catalogo;
import plataforma.online.jacaranda.com.Serie;

public class EscritorSeries {

	private static final String espacio = ",";

	public void escribirFichero(String ruta, Catalogo catalog) {
		
		try {
			File file = new File(ruta);
			FileWriter fw = new FileWriter(file);
			PrintWriter printer = new PrintWriter(fw);
			
			StringBuilder sb = new StringBuilder();
			
			Collection<Serie> series = new ArrayList<>();
			
			
			series.addAll(catalog.getMapSeries().values());
			for(Serie serie : series) {
				sb.append(serie.getNombreSerie());
				sb.append(espacio);
				sb.append(serie.getAnno());
				sb.append(espacio);
				sb.append(serie.getTema());
				sb.append("\n");
			}
			printer.println(sb);
			
			
			
		
		
			
			fw.close();
			printer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
