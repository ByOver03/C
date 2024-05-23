package arrayListOp;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ArrayListOpCorregitTest {
	
	static int [] arraySimple, arrayNulo, arrayVacio, arrayNegativo, arrayUnElemento;
	static ArrayListOpCorregit lista;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//arraySimple = new int []{1,2,3,4,5};
		arrayNulo = null;
		arrayVacio = new int[] {};
		arrayUnElemento = new int [0];
		//arrayNegativo = new int []{-127,-3423,-2};
		lista = new ArrayListOpCorregit();
	}
		
	@ParameterizedTest
	@DisplayName("Test con CsvFileSource")
	@CsvFileSource(resources="./datos.csv", numLinesToSkip = 1, delimiterString = ";")
	void testFindClosestToAverage(String arrayTexto, int resul) {
		
		String [] arrayDatos = arrayTexto.split(",");
		
		int [] arrayNumeros = new int [arrayDatos.length];
		
		for(int i = 0; i < arrayDatos.length; i++) {
			arrayNumeros[i] = Integer.parseInt(arrayDatos[i]);
		}
		
		assertEquals(resul, lista.findClosestToAverage(arrayNumeros));
	}
	
	@Test
	@DisplayName("Test array valor null")
	public void testArrayNull() {
		assertThrows(InvalidParameterException.class, () -> lista.findClosestToAverage(arrayNulo),
				"Error, la taula t� valor null");

	}

	@Test
	@DisplayName("Test array vac�o")
	public void testArrayVacio() {
		assertThrows(InvalidParameterException.class, () -> lista.findClosestToAverage(arrayVacio), "Error, la taula est� buida");

	}
	
	@ParameterizedTest
	@DisplayName("Parametritzat ValueSource")
	@ValueSource(ints = { 1, 2, 3, 4 })
	void testValue(int n) {
		arrayUnElemento = new int [] {n};
		int valorEsperat = n;
		int solucio = lista.findClosestToAverage(arrayUnElemento);
		assertEquals(valorEsperat, solucio, "Error ValueSource, array d'un element" );

	}

	@ParameterizedTest
	@DisplayName("Parametritzat CSVSource")
	@CsvSource({ 
		"-1, -2, -3, -4, -5, -3", 
		"1, 2, -2, -4, -6, -2", 
		"10,20,30,40,50,30" })
	void testCSV(int n1, int n2, int n3, int n4, int n5, int solucio) {
		int[] arrayParam = { n1, n2, n3, n4, n5 };		
		int resultat = lista.findClosestToAverage(arrayParam);
		assertEquals(solucio, resultat, 0, "Error test CSVSource");
	}

}
