package test.java.com.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.java.com.modelo.Persona;

class PersonaTest {

	@Test
	void test18IsMayorDeEdad() {
		Persona p1 = new Persona(" "," ", LocalDate.now().minusYears(18));
		
		assertTrue(p1.isMayorDeEdad());
	}
	
	@Test
	void test17IsMayorDeEdad() {
		Persona p1 = new Persona(" "," ", LocalDate.now().minusYears(17));

		assertFalse(p1.isMayorDeEdad());
	}
	
	@Test
	void test20IsMayorDeEdad() {
		Persona p1 = new Persona(" "," ", LocalDate.now().minusYears(20));
		
		assertTrue(p1.isMayorDeEdad());
	}

}
