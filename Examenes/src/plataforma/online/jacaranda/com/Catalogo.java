package plataforma.online.jacaranda.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Catalogo {
	
	private Map<String, Serie> mapSeries;
	
	public Catalogo() {
		mapSeries=new HashMap<String, Serie>();
	}
	
	public void annadirSerie(String nombreSerie, int anno, Tema tema) throws SerieException {
		if (mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("Ya existe esa serie");
		}
		Serie serie = new Serie(nombreSerie, anno, tema);
		mapSeries.put(serie.getNombreSerie(), serie);
	}
	
	public void annadirTemporada(String nombreSerie, String temporada) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.addTemporada(temporada);
	}
	
	public void annadirCapituloTemporada(String nombreSerie, String temporada, String capitulo) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.addCapituloTemporada(temporada, capitulo);

	}
	
	public void valorarTemporada(String nombreSerie, String temporada, int valoracion) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.valorarTemporada(temporada, valoracion);
	}
	
	public int numeroDeTemporadasDeUnaSerie(String nombreSerie) throws SerieException{
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		return mapSeries.get(nombreSerie).getTemporadas().size();
	}
	
	public void modificarTema(String nombreSerie, Tema nuevoTema) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		mapSeries.get(nombreSerie).setTema(nuevoTema);
		
	}
	
	public  String listadoOrdenadoSeriesDeUnTema( Tema tema)  throws SerieException {
		Collection<Serie> series = new ArrayList<>();
		List<Serie> seriePorTema = new ArrayList<>();
		
		series = mapSeries.values();
		
		for(Serie serie : series) {
			if(serie.getTema()==tema) {
				seriePorTema.add(serie);
			}
		}
		
		
		return seriePorTema.toString();
	}

	public Map<String, Serie> getMapSeries() {
		return mapSeries;
	}

	public void setMapSeries(Map<String, Serie> mapSeries) {
		this.mapSeries = mapSeries;
	}
	
	
}
