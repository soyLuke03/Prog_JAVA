package main.model;

import java.util.HashMap;
import java.util.Map;

import main.utils.MonederoException;

public class Monedero {

	private static final Integer OCHENTA = 80;
	private static final Integer VEINTE = 20;
	private static final Integer QUINCE = 15;
	private static final Integer CUARENTA = 40;
	
	
	private Map<Moneda, Integer> cantidades;
	
	public Monedero() {
		cantidades = new HashMap<Moneda, Integer>();
		inicializarMonedero();
	}
	
	public void inicializarMonedero() {
		cantidades.put(Moneda.FIVECENT, 	OCHENTA);
		cantidades.put(Moneda.TENCENT, 		QUINCE);
		cantidades.put(Moneda.TWENTYCENT, 	CUARENTA);
		cantidades.put(Moneda.FIFTYCENT, 	VEINTE);
		cantidades.put(Moneda.EURO, 		VEINTE);
		cantidades.put(Moneda.TWOEURO, 		QUINCE);
		
	}
	
	
	public Integer calcularCambio(Map<Moneda, Integer> pago, Integer precio){
		Integer devolucion = 0;
		if(calcularPago(pago)>=precio) {
			devolucion = calcularPago(pago)-precio;
		}
		else {
			throw new MonederoException("[ERROR] No se ha introducido el importe suficiente");
		}
		
		return devolucion;
	}
	
	public String calcularDevolucionDeMonedas (int devolucion) throws MonederoException{
		
		int monedaADevolver = devolucion;
		Integer contadorMoneda2euro = 0;
		Integer contadorMoneda1euro = 0;
		Integer contadorMoneda5cent = 0;
		Integer contadorMoneda10cent = 0;
		Integer contadorMoneda20cent = 0;
		Integer contadorMoneda50cent = 0;
		
		if (monedaADevolver>0) {
			while (monedaADevolver>=200 && monedaADevolver%200 >= 0 && cantidades.get(Moneda.TWOEURO)>0) {
				contadorMoneda2euro++;
				monedaADevolver-=200;
				cantidades.put(Moneda.TWOEURO, cantidades.get(Moneda.TWOEURO)-1);
			}
			while (monedaADevolver>=100 && monedaADevolver%100 >= 0 && cantidades.get(Moneda.EURO)>0) {
				contadorMoneda1euro++;
				monedaADevolver-=100;
				cantidades.put(Moneda.EURO, cantidades.get(Moneda.EURO)-1);
			}
			while (monedaADevolver>=50 && monedaADevolver%50 >= 0 && cantidades.get(Moneda.FIFTYCENT)>0) {
				contadorMoneda50cent++;
				monedaADevolver-=50;
				cantidades.put(Moneda.FIFTYCENT, cantidades.get(Moneda.FIFTYCENT)-1);
			}
			while (monedaADevolver>=20 && monedaADevolver%20 >= 0 && cantidades.get(Moneda.TWENTYCENT)>0) {
				contadorMoneda20cent++;
				monedaADevolver-=20;
				cantidades.put(Moneda.TWENTYCENT, cantidades.get(Moneda.TWENTYCENT)-1);
			}
			while (monedaADevolver>=10 && monedaADevolver%10 >= 0 && cantidades.get(Moneda.TENCENT)>0) {
				contadorMoneda10cent++;
				monedaADevolver-=10;
				cantidades.put(Moneda.TENCENT, cantidades.get(Moneda.TENCENT)-1);
			}
			while (monedaADevolver>=5 && monedaADevolver%5 >= 0 && cantidades.get(Moneda.FIVECENT)>0) {
				contadorMoneda5cent++;
				monedaADevolver-=5;
				cantidades.put(Moneda.FIVECENT, cantidades.get(Moneda.FIVECENT)-1);
			}
			
			if (monedaADevolver>0) {
				throw new MonederoException("[ERROR]No se puede devolver el cambio");
			}
			
			
		}
		return ("Moneda 2€: "+ contadorMoneda2euro 
			   +"\nMoneda 1€: "+ contadorMoneda1euro
			   +"\nMoneda 0.5€ "+ contadorMoneda50cent
			   +"\nMoneda 0.2€ "+ contadorMoneda20cent
			   +"\nMoneda 0.1€ "+ contadorMoneda10cent
			   +"\nMoneda 0.5€ "+ contadorMoneda5cent);
		
		
		
//		cantidades.put(Moneda.EURO, cantidades.get(Moneda.EURO)-1);  Para restar monedas
	}

	public Integer calcularPago(Map<Moneda, Integer> pago) {
		
		Integer cantidad = 0;
		for(Moneda m : pago.keySet()) {
			cantidad+=pago.get(m)*m.value;
		}
		return cantidad;
	}

	@Override
	public String toString() {
		return "Monedero [cantidades=" + cantidades + "]";
	}

	public Map<Moneda, Integer> getCantidades() {
		return cantidades;
	}

	public void setCantidades(Map<Moneda, Integer> cantidades) {
		this.cantidades = cantidades;
	}
	
	
	
}
