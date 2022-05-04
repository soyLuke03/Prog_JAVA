package main.model;

import java.util.HashMap;
import java.util.Map;

public class InventarioDePaquetes {

	private final int VEINTE = 20;
	private final int DIEZ = 10;
	private final int CUARENTA = 40;
	
	private TipoPaquete tipo;
	private int coste = 450;
	
	public Map<TipoPaquete, Integer> cantidades;
	
	public InventarioDePaquetes() {
		cantidades = new HashMap<TipoPaquete, Integer>();
		rellenarExistencias();
	}
	
	
	public void darPaquete(TipoPaquete tipo) {
		
		if (TipoPaquete.Camel.equals(tipo))
			cantidades.put(TipoPaquete.Camel, cantidades.get(TipoPaquete.Camel)-1);
		
		else if (TipoPaquete.Chesterfield.equals(tipo))
			cantidades.put(TipoPaquete.Chesterfield, cantidades.get(TipoPaquete.Chesterfield)-1);
		
		else if (TipoPaquete.LuckyStrike.equals(tipo))
			cantidades.put(TipoPaquete.LuckyStrike, cantidades.get(TipoPaquete.LuckyStrike)-1);
		
		else if (TipoPaquete.Marlboro.equals(tipo))
			cantidades.put(TipoPaquete.Marlboro, cantidades.get(TipoPaquete.Marlboro)-1);
		
		else if (TipoPaquete.Winston.equals(tipo))
			cantidades.put(TipoPaquete.Winston, cantidades.get(TipoPaquete.Winston)-1);
		
	}
	
	private void rellenarExistencias() {
		cantidades.put(TipoPaquete.Winston,VEINTE);
		cantidades.put(TipoPaquete.Camel,DIEZ);
		cantidades.put(TipoPaquete.Chesterfield,DIEZ);
		cantidades.put(TipoPaquete.LuckyStrike,CUARENTA);
		cantidades.put(TipoPaquete.Marlboro,VEINTE);
	}


	@Override
	public String toString() {
		return "InventarioDePaquetes [VEINTE=" + VEINTE + ", DIEZ=" + DIEZ + ", CUARENTA=" + CUARENTA + ", tipo=" + tipo
				+ ", coste=" + coste + ", cantidades=" + cantidades + "]";
	}


	public TipoPaquete getTipo() {
		return tipo;
	}


	public int getCoste() {
		return coste;
	}


	public Map<TipoPaquete, Integer> getCantidades() {
		return cantidades;
	}


	public void setTipo(TipoPaquete tipo) {
		this.tipo = tipo;
	}


	public void setCoste(int coste) {
		this.coste = coste;
	}


	public void setCantidades(Map<TipoPaquete, Integer> cantidades) {
		this.cantidades = cantidades;
	}
	
}
