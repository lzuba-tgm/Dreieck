package zuba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class rechtWinkelig {
	private int seitea;
	private int seiteb;
	private int seitec;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp(){
		dreieck = new Dreieck(seitea,seiteb,seitec);
	}
	@Test
	public void testDreieck(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	@Test
	public void testDreieckAundBgleich(){
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(4);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	@Test
	public void testDreieck0(){
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(0);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
}
