package JUnit_5;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class OrdenadorTest {

	@Test
	void testOrdenadorEsCaro() {
	 
	    Ordenador ordenador= new Ordenador("MAC",16,35000);
	    assertTrue(ordenador.esCaro());
	 
	}
	    @Test
	void testPrecioIvaDelOrdenador() {
	 
	    Ordenador ordenador= new Ordenador("macmini",8,15000);
	    assertEquals(17400,ordenador.getPrecioIVA());
	 
	}
	    
//	    @Test
//	    void testOrdenadorEsCaroHamCrest() {
//	     
//	        Ordenador ordenador= new Ordenador("imac",16,35000);
//	        assertThat(ordenador.esCaro(),ordenador.is(false));
//	     
//	    }
////	     
//	     
//	    @Test
//	    void testPrecioIvaDelOrdenadorHamCrest() {
//	     
//	        Ordenador ordenador= new Ordenador("macmini",8,1300);
//	        assertThat(ordenador.getPrecioIVA(),closeTo(1573,0.01));
//	     
//	    }
//	    
//	    @Test
//	    void testOrdenadorEsCaroAssertJ() {
//	     
//	        Ordenador ordenador= new Ordenador("imac",16,2500);
//	        assertThat(ordenador.esCaro()).isTrue();
//	     
//	    }
//	     
//	    @Test
//	    void testPrecioIvaDelOrdenadorAssertJ() {
//	     
//	        Ordenador ordenador= new Ordenador("macmini",8,1300);
//	        assertThat(ordenador.getPrecioIVA()).isEqualTo(1573);
//	     
//	    }

}
