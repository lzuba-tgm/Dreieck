package zuba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class gleichSchenkelig {
	private int seitea;
	private int seiteb;
	private int seitec;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp(){
		dreieck = new Dreieck(seitea,seiteb,seitec);
	}
	
	@Test
	public void testDreieckAundBgleich(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	@Test
	public void testDreieckungleich(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	@Test
	public void testDreieckAundBundCgleich(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	@Test
	public void testDreieckAundCgleich(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
}

