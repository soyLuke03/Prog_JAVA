package Files;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {

	private Map<LocalDate,Combinacion> sorteos;
	
	
	public Historial() {
		sorteos = new HashMap<>();
	}
	
	public Historial(LocalDate fecha, Combinacion comb) {
		
		if(comprobarFecha(fecha) || comb!=null) {
			sorteos = new HashMap<>();
		}
		else {
			throw new HistorialException("[ERROR] Error inesperado.");
		}
		
	}
	
	
	/**
	 * Comprueba que una fecha sea MARTES o VIERNES
	 * @param fecha
	 * @return
	 */
	public boolean comprobarFecha(LocalDate fecha) {
		boolean puede = false;
		
		if(fecha.getDayOfWeek()==DayOfWeek.TUESDAY || fecha.getDayOfWeek()==DayOfWeek.FRIDAY) {
			puede = true;
		}
		
		return puede;
	}
	
	
	
	public boolean addSorteo(LocalDate fecha, Combinacion comb) {
		boolean esPosible = false;
		
		if(comb!=null) {
			if (sorteos.containsKey(fecha)) {
				throw new HistorialException("[ERROR] Fecha existente");
				
			}
			else {
				esPosible = true;
				sorteos.put(fecha, comb);
			}
		}
		else {
			throw new HistorialException("[ERROR] Combinacion nula");
		}
		
		return esPosible;
	}
	
	
	public boolean addSorteo(int anno, int mes, int dia, Combinacion comb) {
		boolean esPosible = false;
		if(addSorteo(LocalDate.of(anno, mes, dia), comb)){
			esPosible = true;
			addSorteo(LocalDate.of(anno, mes, dia), comb);
		}
		
		return esPosible;
		
	} 
	
	public boolean actualizarSorteo(int anno, int mes, int dia, Combinacion comb) {
		boolean esPosible = false;
		
		if(actualizarSorteo(LocalDate.of(anno, mes, dia), comb)) {
			esPosible = true;
			actualizarSorteo(LocalDate.of(anno, mes, dia), comb);
		}
		
		return esPosible;
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion comb) {
		boolean esPosible = false;
		
		if(comb!=null) {
			if (!sorteos.containsKey(fecha)) {
				throw new HistorialException("[ERROR] Fecha inexistente");
				
			}
			else {
				esPosible = true;
				sorteos.replace(fecha, comb);
			}
		}
		else {
			throw new HistorialException("[ERROR] Combinacion nula");
		}
		
		return esPosible;
	}
	
	public boolean borrarSorteo(LocalDate fecha) {
		boolean borrado = false;
		
		if(fecha!=null) {
			if (!sorteos.containsKey(fecha)) {
				throw new HistorialException("[ERROR] Fecha inexistente");
				
			}
			else {
				borrado = true;
				sorteos.remove(fecha);
			}
		}
		else {
			throw new HistorialException("[ERROR] Fecha nula");
		}
		
		return borrado;
	}
	
	public String mostrarHistorico(LocalDate fecha){
		StringBuilder sb = new StringBuilder();
		
		sorteos.keySet();
		
		for(LocalDate i : sorteos.keySet()) {
			if(i.getMonth()==fecha.getMonth()) {
				sb.append("["+i+": "+sorteos.get(i)+"]");
				sb.append("\n");
			}
		}
		
		return sb.toString();
	}
	
	
	public Map<String, Integer> comprobarAciertos(LocalDate fecha,Combinacion comb){
		String fechaToString = fecha.toString();
		Integer aciertos = 0;
		Map<String, Integer> mapa= new HashMap<>();
		
		if (fecha!=null&&comb!=null) {
			
			if (sorteos.containsKey(fecha)) {
				aciertos = sorteos.get(fecha).comprobarAciertos(comb);
			}
			
		}
		else {
			aciertos = -1;
		}
		
		mapa.put(fechaToString, aciertos);
		
		return mapa;
	}
	
	
	
}
