package lib;

import static org.junit.Assert.*;

import org.junit.Test;

import test.Cordonne;

public class TestUnitaire {

	@Test
	public void test() {
		Cordonne point= new Cordonne(1,2);
	
		
		assertEquals(3, point.somme());
		
		
		
	}

}
