package junittutor;

import static org.junit.Assert.*;

import org.junit.Test;

public class J02Accertions {

	@Test
	public void testToFindMin() {
		
		int actualMin = Math.min(13, 15);
		int expectedMin = 13;
		
		//assertEquals
        assertEquals(actualMin, expectedMin);
        
        assertEquals("The min is not 13", actualMin, expectedMin);
        
        //assertTrue
        assertTrue( actualMin == expectedMin);
        
        assertTrue("The min is not 13", actualMin == expectedMin);
        
        //assertFalse
        assertFalse(actualMin != expectedMin);
        
        assertFalse("The min is not 13", actualMin != expectedMin);
		
	}
	
	@Test
	public void testWithArrays() {
		String str = "Unit test with JUnit4";
		String[] actualArray = str.split(" ");
		String[] expectedArray = {"Unit", "test" ,"with", "JUnit4"};
		
		assertArrayEquals(expectedArray, actualArray);
		assertArrayEquals("The data Does Not Match!!",expectedArray, actualArray);
		
	}

}
