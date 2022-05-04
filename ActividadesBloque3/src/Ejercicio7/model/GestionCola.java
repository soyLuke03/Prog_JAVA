package Ejercicio7.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Ejercicio7.Remake.copy.CajaComparatorPorId;

public class GestionCola {

	public static final int NUMERO_CAJAS = 20;
	private Map<Caja,List<Cliente>> distribucionesCajas;
	
	
	public GestionCola() {
		
		distribucionesCajas = new HashMap<>();
		
		for (int i = 0;i<NUMERO_CAJAS;i++) {
			Caja caja = new Caja(i);
			distribucionesCajas.put(caja, new ArrayList<Cliente>());
		}
	}
	
	public void abrirCaja(int idCaja) throws CajaException{
		for (Caja c : distribucionesCajas.keySet()) {
			if(c.getIdCaja()==idCaja) {
				c.abrirCaja();
			}
		}
	}
	
	public void cerrarCaja(int idCaja) throws CajaException{
		for (Caja c : distribucionesCajas.keySet()) {
			if(c.getIdCaja()==idCaja) {
				if (distribucionesCajas.get(c).isEmpty()) {
					c.cerrarCaja();
				}
			}
		}
	}
	
	public Caja obtenerCajaPrioritaria() {
		
		List<Caja> cajas = new ArrayList<>(distribucionesCajas.keySet());
		cajas.sort(new CajaComparatorPorId());
		
		Caja cajaPrioritaria = cajas.get(0);
		
		for (int i = 1;i<cajas.size();i++) {
			if(distribucionesCajas.get(cajaPrioritaria).size() >
				distribucionesCajas.get(cajas.get(i)).size()) {
				cajaPrioritaria = cajas.get(i);
			}
		}
		
		return cajaPrioritaria;
	}
	
	public String asignarCliente(Cliente cl) {
		Caja caja = obtenerCajaPrioritaria();
		distribucionesCajas.get(caja).add(cl);
		
		return "Usted es el cliente " +cl.getNumeroCliente()+" .Acuda a la caja número: "+ caja.getIdCaja();
	}
	
	public String atenderCaja(int idCaja) {
		String mensaje = "";
		
		for(Caja c : distribucionesCajas.keySet()) {
			if(c.getIdCaja()==idCaja && !distribucionesCajas.get(c).isEmpty()) {
				Cliente cliente = distribucionesCajas.get(c).get(0);
				mensaje = "Se ha atendido al cliente: " + cliente.getNumeroCliente()+ "";
				distribucionesCajas.get(c).remove(0);
			}
		}
		
		return mensaje;
	}
	
	
	
}
