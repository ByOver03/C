package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {


	@Test
	void testSuma() {
		double valorEsperat = 5;
		Calculadora calcu = new Calculadora(2, 3);
		double resultat = calcu.suma();
		assertEquals(valorEsperat, resultat, 0, "Error de la suma");
	}

	@Test
	void testResta() {
		double valorEsperat = 1;
		Calculadora calcu = new Calculadora(3, 2);
		double resultat = calcu.resta();
		assertEquals(valorEsperat, resultat, 0, "Error de la suma");
	}

	@Test
	void testMultiplica() {
		double valorEsperat = 9;
		Calculadora calcu = new Calculadora(3, 3);
		double resultat = calcu.multiplica();
		assertEquals(valorEsperat, resultat, 0, "Error de la suma");
	}

	@Test
	void testDivideix() {
		double valorEsperat = 1;
		Calculadora calcu = new Calculadora(3, 3);
		double resultat = calcu.divideix();
		assertEquals(valorEsperat, resultat, 0, "Error de la suma");
	}

}
