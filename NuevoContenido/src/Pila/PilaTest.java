package Pila;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class PilaTest {

	@Test
	void testPush() {
		OrdenEnPila pila = new OrdenEnPila();
		pila.push(1);
		pila.push(2);
		pila.push(0);
		assertEquals(pila.size(), 3);
	}
	
	@Test
	void testPop() throws Exception {
		
		OrdenEnPila pila = new OrdenEnPila();
		assertNull(pila.pop());
		
		pila.push(2);
		pila.push(3);
		pila.push(0);
		assertEquals(pila.pop(), 0);
		assertEquals(pila.size(), 2);
		assertEquals(pila.pop(), 3);
		assertEquals(pila.size(), 1);
		assertEquals(pila.pop(), 2);
		assertEquals(pila.size(), 0);

		
	}

}
