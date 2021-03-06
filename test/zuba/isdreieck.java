package zuba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class isdreieck {
	
	private int seitea;
	private int seiteb;
	private int seitec;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp(){
		dreieck = new Dreieck(seitea,seiteb,seitec);
	}
	
	@Test
	public void testDreieckSeiteANULL(){
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void testDreieckSeiteBNULL(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void testDreieckSeiteCNULL(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(0);
		
		assertFalse(dreieck.istDreieck());
	}
	//
	@Test
	public void testDreieckSeiteAkleiner0(){
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void testDreieckSeiteBkleiner0(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(-1);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void testDreieckSeiteCkleiner0(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(-1);
		
		assertFalse(dreieck.istDreieck());
	}
	//

	@Test
	public void testDreieckAundBgleichC(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(4);
		
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void testDreieckAundcgleichB(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void testDreieckCundBgleichA(){
		dreieck.setSeite_a(4);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void testDreieckCundBungleichA(){
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void testDreieckSeiteAundBunter0(){
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(Integer.MAX_VALUE);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	//
	@Test
	public void testDreieckisDreieck(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.istDreieck());
	}
	//
}
