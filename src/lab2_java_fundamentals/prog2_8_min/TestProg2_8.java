package lab2_java_fundamentals.prog2_8_min;

import static org.junit.Assert.*;


import org.junit.Test;


public class TestProg2_8 {
	
	@Test
	public void testMinimum() {
		int[] myArray = { 2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0 };
		assertEquals(0,Prog2_8.minimum(myArray));
		
	}

}
