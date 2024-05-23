package ejercici4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	Cuenta  cuenta;
	Cuenta cuenta2; 
	
	@BeforeEach
	void setUp() throws Exception{
		cuenta = new Cuenta();
		cuenta2 = new Cuenta();
	}
	
	@AfterEach
	void tearDown()throws Exception{
		
	}
	
	@BeforeAll
	static void  setUpBeforeClass() throws Exception{
		
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		
	}
	@Test
	void testDeposito() {
		float balanceEsperado= 40;
		cuenta.Deposito(40);
		
		assertEquals(balanceEsperado, cuenta.Balance(), 0, "pedro pedro pedro");
	}

	@Test
	void testRetiro() {
		float balanceEsperado= 0;
		cuenta.Deposito(40);
		cuenta.Retiro(40);
		
		assertEquals(balanceEsperado, cuenta.Balance(),0,"pedrito me electrucutaste pedrito");
	}

	@Test
	void testTransferencia() {
		
	}

	@Test
	void testBalance() {
		
	}

}
