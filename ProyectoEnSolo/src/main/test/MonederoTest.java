package main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import main.model.Moneda;
import main.model.Monedero;

class MonederoTest {

	@Test
	void test() {
		Monedero mon = new Monedero();
		
		Map<Moneda, Integer> pago = new HashMap<>();
		
		pago.put(Moneda.EURO, 3);
		
		assertEquals(mon.calcularCambio(pago, 50),250);
		
	}

	@Test
	void calcularPago() {
		Monedero mon = new Monedero();
		Map<Moneda,Integer> pago = new HashMap<>();
		pago.put(Moneda.EURO, 2);
		pago.put(Moneda.FIFTYCENT, 1);
		
		
		
		assertEquals(mon.calcularPago(pago), 250);
	}
	
}
