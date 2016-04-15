package zuba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class gleichSeitig {
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
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.gleichSeitig());
	}
	@Test
	public void testDreieckBundCgleich(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
}
