package plataforma.online.jacaranda.com;

import java.util.ArrayList;
import java.util.List;

public class Serie {

	private static final int ANNO_MINIMO = 1900;
	private String nombreSerie;
	private int anno;
	private Tema tema;
	private List<Temporada> temporadas;
	
	public Serie(String nombreSerie, int anno, Tema tema) {
		this.nombreSerie = nombreSerie;
		if(anno<ANNO_MINIMO) {
			throw new SerieException("Año no válido");
		}
		this.anno = anno;
		this.tema = tema;
		temporadas = new ArrayList<>();
	}
	
	public void addTemporada(String nuevaTemporada) {
		Temporada temp = new Temporada(nuevaTemporada);
		
		if(temporadas.contains(temp)) {
			throw new SerieException("Temporada existente");
		}
		else {
			Temporada temporadaN = new Temporada(nuevaTemporada);
			temporadas.add(temporadaN);
		}
	}
	
	public void addCapituloTemporada(String temporada, String capitulo) {
		Temporada temp = new Temporada(temporada);
		
		if(temporadas.contains(temp)) {
			temp.annadirCapitulo(capitulo);
		}
		else {
			throw new SerieException("Temporada inexistente");
		}
	}
	
	public void valorarTemporada(String temporada, int valoracion) {
		Temporada temp = new Temporada(temporada);
		
		if(temporadas.contains(temp)) {
			temp.valorar(valoracion);
		}
		else {
			throw new SerieException("Temporada inexistente");
		}
	}
	
	public String listarTemporadasPorNotaMedia(){
		temporadas.sort(new temporadaPorNotaMedia());
		StringBuilder sb = new StringBuilder();
		for(Temporada tm : temporadas) {
			sb.append(tm.toString()+"\n");
		}
		return sb.toString();
	}
	
	public String listarTemporadasPorNumeroDeCapitulos(){
		temporadas.sort(new temporadaPorCapitulos());
		StringBuilder sb = new StringBuilder();
		for(Temporada tm : temporadas) {
			sb.append(tm.toString()+"\n");
		}
		return sb.toString();
	}
	
	public String getNombreSerie() {
		return nombreSerie;
	}
	
	public void setNombreSerie(String nombreSerie) {
		this.nombreSerie = nombreSerie;
	}
	
	
	public int getAnno() {
		return anno;
	}
	
	public void setAnno(int anno) throws SerieException {
		if ( anno < ANNO_MINIMO) {
			throw new SerieException("Año incorrecto");
		}
		this.anno = anno;
	}
	
	public Tema getTema() {
		return tema;
	}
	
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	
	public int numeroTemporadas() {
		return temporadas.size();
	}
	
	
	
	public String toString() {
		return  "Serie " + nombreSerie + " Anno " + anno + " Tema " + tema + "Numero temporadadas " + numeroTemporadas();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreSerie == null) ? 0 : nombreSerie.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (nombreSerie == null) {
			if (other.nombreSerie != null)
				return false;
		} else if (!nombreSerie.equals(other.nombreSerie))
			return false;
		return true;
	}

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	
	
	
}
