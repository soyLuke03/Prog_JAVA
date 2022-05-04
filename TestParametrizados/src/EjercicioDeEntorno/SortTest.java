package EjercicioDeEntorno;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SortTest {

	@Test
	public void testOrdenacion() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(1);
		lista.add(15);
		lista.add(9);
		
		SortEjercicio.ordenarNumeros(lista);
		
		assertEquals(lista.get(0), 1);
		assertEquals(lista.get(1), 3);
		assertEquals(lista.get(2), 9);
		assertEquals(lista.get(3), 15);
		
	}
	
	@Test
	public void testOrdenacionRepetidos() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(3);
		lista.add(3);
		
		
		SortEjercicio.ordenarNumeros(lista);
		
		assertEquals(lista.get(0), 3);
		assertEquals(lista.get(1), 3);
		assertEquals(lista.get(2), 3);
		
		
	}
	
	@Test
	public void testOrdenacionListaVacia() {
		List<Integer> lista = new ArrayList<>();
		
		SortEjercicio.ordenarNumeros(lista);
		
		assertTrue(lista.isEmpty());
		
	}
	
	
	@MethodSource("crearListas")
	@ParameterizedTest
	public void testOrdenacionPorInsercion(List<Integer> lista) {
		
		SortEjercicio.ordenarNumeros(lista);
		
		if (lista!=null) {
			for(int i =0;i<lista.size()-1;i++) {
				if(lista.get(i)>lista.get(i+1)) {
					assert(false);
				}
				
			}
		}
	}
	
	
	public static Stream<List<Integer>> crearListas(){
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(3);
		lista1.add(1);
		lista1.add(15);
		lista1.add(9);
		
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(3);
		lista2.add(3);

		List<Integer> lista3 = new ArrayList<>();
		lista3.add(0);
		
		List<Integer> lista4 = null;
		
		List<Integer> lista5 = new ArrayList<>();
		
		return Stream.of(lista1, lista2, lista3, lista4, lista5);
	}
	
	
}
