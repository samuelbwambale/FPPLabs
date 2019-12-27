package lab2_java_fundamentals.prog2_6_remove_str_dups;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;



public class TestProg6 {
	
	@Test
	public void testRemoveDups() {
		String[] testData1 = {"Isaac", "Samuel", "Allan", "Samuel"};
		assertFalse(Prog6.noDuplicates(testData1));
		String[] testData2 = {"Isaac", "Samuel", "Allan"};
		assertTrue(Prog6.noDuplicates(testData2));
		String[] result = Prog6.removeDups(testData1);
		String[] arr = {"Isaac", "Samuel", "Allan"};
		Arrays.equals(result, arr);
		
	}
}

