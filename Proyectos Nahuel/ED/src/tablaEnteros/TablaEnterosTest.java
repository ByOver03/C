package tablaEnteros;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TablaEnterosTest {

	static TablaEnteros tabl;
	static Integer[] tabla= {};
	static Integer[] arrayNull;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}
	
	
	@ParameterizedTest
	@CsvSource
	
	@Test
	void testArrayvacio() {
		assertThrows(IllegalArgumentException.class, 
				()-> tabl= new TablaEnteros(arrayNull));
		
	}
	@Test
	void testTablaEnteros() {
		fail("Not yet implemented");
	}

	@Test
	void testSumaTabla() {
		fail("Not yet implemented");
	}

	@Test
	void testMayorTabla() {
		fail("Not yet implemented");
	}

	@Test
	void testPosicionTabla() {
		fail("Not yet implemented");
	}
	
	
}
