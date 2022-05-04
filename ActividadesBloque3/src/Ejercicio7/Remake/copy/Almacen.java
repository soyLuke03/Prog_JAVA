package Ejercicio7.Remake.copy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {

	private List<Caja> cajas;
	public static final int NUMERO_CAJAS = 20;
	
	public Almacen() {
		
		cajas = new ArrayList<Caja>();
		for(int i =0;i<NUMERO_CAJAS;i++) {
			cajas.add(new Caja(i));
		}
	}
	
	public Caja obtenerCajaPrioritaria() {
		
	cajas.sort(new CajaComparatorPorId());
	return cajas.get(0);	
		
	}
	public String asignarCliente(Cliente cl) {
		Caja caja = obtenerCajaPrioritaria();
		caja.addCliente(cl);
		
		return "Usted es el cliente " +cl.getNumeroClientes()+" .Acuda a la caja número: "+ caja.getIdCaja();
	}
	public void atenderCaja(int idCaja) {
		
		Iterator<Caja> iterator = cajas.iterator();
		
		Boolean cajaLocated = false;
		
		while(iterator.hasNext() && cajaLocated==false) {
			if(iterator.next()==cajas.get(idCaja)) {
				cajas.get(idCaja).atenderCliente();
				cajaLocated = true;
			}
		}
		
		for(Caja c : cajas) {
			if(c.getIdCaja()==idCaja && !cajas.isEmpty()) {
				c.removeCliente();
				System.out.println("Se ha atendido al cliente: " + c.getNCliente());
			}
		}
		
	}
	
	public void abrirCaja(int idCaja) {
		for (Caja c : cajas) {
			if(c.getIdCaja()==idCaja) {
				c.abrirCaja();
			}
		}
	}

	public void cerrarCaja(int idCaja) {
		for (Caja c : cajas) {
			if(c.getIdCaja()==idCaja) {
				c.cerrarCaja();
			}
		}
	}
	
	
	
	
	
}
