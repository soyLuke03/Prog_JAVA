package test.java.com.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.com.modelo.Persona;
import main.java.com.utils.Collections;

class CollectionTest {

	@Test
	void testPrimerElemento() {
		List<Persona> lista = Collections.trabajarConColeccionesDePersona();
		Collections.ordenarListaPersonaS(lista);
		
		assertEquals(lista.get(0).getApellido(), "Acosta");
	}
	
	@Test
	void testUltimoElemento() {
		List<Persona> lista = Collections.trabajarConColeccionesDePersona();
		Collections.ordenarListaPersonaS(lista);
		
		assertEquals(lista.get(4).getApellido(), "Villarreal");
	}
	
	@Test
	public void testNoFallaAlOrdenarConjuntosNull() {
		assertEquals(Collections.ordenarListaPersonaS(null),null);
	}
	


}
