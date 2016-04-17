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
	public void testDreieckAundBundCgleich(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	@Test
	public void testDreiecknichtgleich(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(10);
		dreieck.setSeite_c(9);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	@Test
	public void testDreieckAundCgleich(){
		dreieck.setSeite_a(4);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(4);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	@Test
	public void testDreieckCishypo(){
		dreieck.setSeite_a(12);
		dreieck.setSeite_b(16);
		dreieck.setSeite_c(22);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	@Test
	public void testDreieckBishypo(){
		dreieck.setSeite_a(12);
		dreieck.setSeite_b(22);
		dreieck.setSeite_c(16);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	@Test
	public void testDreieckAishypo(){
		dreieck.setSeite_a(22);
		dreieck.setSeite_b(12);
		dreieck.setSeite_c(16);
		
		assertFalse(dreieck.rechtWinkelig());
	}
}
