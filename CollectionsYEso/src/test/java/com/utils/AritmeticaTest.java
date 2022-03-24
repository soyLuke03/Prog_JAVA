package test.java.com.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.com.modelo.Persona;
import main.java.com.utils.Aritmetica;

class AritmeticaTest {

	@Test
	void testSuma1() {
		Aritmetica ari = new Aritmetica();
		
		assertEquals(ari.sumar(2, 2), 4);
		assertEquals(ari.sumar(2, 0), 2);
		assertEquals(ari.sumar(0, 2), 2);
		assertEquals(ari.sumar(0, 0), 0);

	}
	
	@Test
	void testResta1() {
		Aritmetica ari = new Aritmetica();
		
		assertEquals(ari.restar(5, 2),3);
		assertEquals(ari.restar(2, 5),-3);
		assertEquals(ari.restar(5, 5),0);
		assertEquals(ari.restar(-5, 2),-7);
		assertEquals(ari.restar(5, -2),7);
		
	}
	



}
