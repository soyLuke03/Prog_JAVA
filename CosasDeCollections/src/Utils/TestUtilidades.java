package Utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestUtilidades {

	@Test
	void test() {
		Integer[] listaEnteros = new Integer[4];
		
		listaEnteros[0]=1;
		listaEnteros[1]=3;
		listaEnteros[2]=5;
		listaEnteros[3]=8;
		
		Integer[] invertida = Utilidades.reverse(listaEnteros);
		
		assertEquals(invertida[0],8);
		assertEquals(invertida[1],5);
		assertEquals(invertida[2],3);
		assertEquals(invertida[3],1);
	}
	
	@Test
	void listaVacía() {
		Integer[] listaEnteros = new Integer[0];
		
		Integer[] invertida = Utilidades.reverse(listaEnteros);
	
		assertEquals(invertida.length, 0);
	}
	
	@Test
	void listaNula() {
		Integer[] listaEnteros = null;
		
		Integer[] invertida = Utilidades.reverse(listaEnteros);
	
		assertEquals(invertida,null);
	}
	
	
	@Test
	void testCadena() {
		String[] saludo = "Hola que tal".split(" ");
		
		assertEquals(Utilidades.reverse(saludo[0]),"tal");
	}
	
	

}
