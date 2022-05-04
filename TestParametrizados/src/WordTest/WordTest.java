package WordTest;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import EjercicioDeEntorno.SortEjercicio;

class WordTest {

	private Word word;
	
	@BeforeEach
	void setUp() {
		word = new Word();
	}
	
	
	@ParameterizedTest
	@ValueSource(strings= {"ala", "radar"})
	void esPalindromo(String palabra) {
		assertTrue(word.esPalindromo(palabra));
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"alasde", "radares"})
	void noEsPalindromo(String palabra) {
		assertFalse(word.esPalindromo(palabra));
	}
	
}
