package Ejercicio7.Remake.copy;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AlmacenTest {

	@Test
	void test() {
		Almacen almacen = new Almacen();
		
		assertEquals(almacen.obtenerCajaPrioritaria().getIdCaja(), 1);
	}

	@Test
	void testObtenerCajaTrasAsignarCliente() {
		Almacen almacen = new Almacen();
		almacen.asignarCliente(new Cliente());
		almacen.asignarCliente(new Cliente());
		
		assertEquals(almacen.obtenerCajaPrioritaria().getIdCaja(), 2);
	}
	
	@Test
	void testAtenderClienteSiNoExisten() {
		try {
			Almacen almacen = new Almacen();
			almacen.atenderCaja(2);
			assert(false);
		} catch (CajaException e) {
			assert(true);
		} catch (Exception e) {
			assert(false);		
		}
	}
	
	@Test
	void testAtenderClienteSiExisten() {
			Almacen almacen = new Almacen();
			almacen.asignarCliente(new Cliente());
			almacen.asignarCliente(new Cliente());
			assertTrue(!almacen.atenderCaja(1).isBlank());
	}
	
	@Test
	void testAtenderClienteOtraCaja() {
		Almacen almacen = new Almacen();
		almacen.asignarCliente(new Cliente());
		almacen.asignarCliente(new Cliente());
		try {
			almacen.atenderCaja(5);			
		} catch (CajaException e) {
			assert(true);
		} catch (Exception e) {
			assert(false);
		}
	}
	
}
