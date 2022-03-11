package pruebas_unitarias;

import static org.junit.jupiter.api.Assertions.assertTrue;

import junit.framework.TestCase;

public class TestPrueba1 extends TestCase {

	private Prueba1 probar;
	
	public void Escenario() {
		
		probar= new Prueba1();
		
	}
	

	public void testSumar() {
		Escenario();
		assertTrue(probar.Sumar(2, 3) == 5);
		
	}
	
	public void testRestar() {
		Escenario();
		assertTrue(probar.Restar(3, 2) == 1);
		
	}


}
