package plataforma.online.jacaranda.com;

import plataforma.online.jacaranda.ficheros.EscritorCapitulos;
import plataforma.online.jacaranda.ficheros.EscritorSeries;
import plataforma.online.jacaranda.ficheros.EscritorTemporada;

public class MainApp {

	public static void main(String[] args) {
		
																								/**
																								 * <3
																								 */
		
		Catalogo catalog = new Catalogo();

		
		
		catalog.annadirSerie("Serie A", 2001,Tema.CIENCIAFICCION);
		catalog.annadirSerie("Serie B", 2002, Tema.COMEDIA);
		
		catalog.annadirTemporada("Serie A", "Temporada 1");
		catalog.annadirCapituloTemporada("Serie A", "Temporada 1", "Capitulo 1");
		catalog.annadirCapituloTemporada("Serie A", "Temporada 1", "Capitulo 2");

		catalog.annadirTemporada("Serie A", "Temporada 2");
		catalog.annadirCapituloTemporada("Serie A", "Temporada 2", "Capitulo 1");
		catalog.annadirCapituloTemporada("Serie A", "Temporada 2", "Capitulo 2");

		catalog.annadirTemporada("Serie A", "Temporada 3");
		catalog.annadirCapituloTemporada("Serie A", "Temporada 3", "Capitulo 1");
		catalog.annadirCapituloTemporada("Serie A", "Temporada 3", "Capitulo 2");

		
		catalog.annadirTemporada("Serie B", "Temporada 1");
		catalog.annadirTemporada("Serie B", "Temporada 2");
		catalog.annadirTemporada("Serie B", "Temporada 3");
		
		
		
		escribirCatalogo(catalog);
	}


	private static void escribirCatalogo(Catalogo catalog) {
		EscritorTemporada temporadas = new EscritorTemporada();
		EscritorSeries series = new EscritorSeries();
		EscritorCapitulos capitulos = new EscritorCapitulos();

		
		temporadas.escribirFichero("C:\\Users\\antog\\Desktop\\Cosas de clase\\Programación\\Examenes\\Examenes\\src\\files\\Temporada.csv", catalog);
		series.escribirFichero("C:\\Users\\antog\\Desktop\\Cosas de clase\\Programación\\Examenes\\Examenes\\src\\files\\Series.csv", catalog);
		capitulos.escribirFichero("C:\\Users\\antog\\Desktop\\Cosas de clase\\Programación\\Examenes\\Examenes\\src\\files\\Capítulos.csv", catalog);
	}
}