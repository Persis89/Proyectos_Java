package pruebas_unitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPrueba2 {
	
	private Alumno al;
	
	public TestPrueba2() {
		// TODO Auto-generated constructor stub
		
	}

	@Test
	public void testProbar() {
		al= new Alumno("1","Pepe", 8,7);
	
		
		double operacion= al.CalcularPromedio();
		double resultado= 8;
		
		assertEquals(resultado, operacion,8);
		
	}

}
