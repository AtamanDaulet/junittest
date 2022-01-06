package junittutor;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class J01Accertions {

	@Test
	public void test() {
	//	fail("Not yet implemented");
	}
	
	@Test
	public void testToAssert() {
	//1.  Assertion => assertEquals
		
		//a)
		int actualLenth = "ABCD".length();
		int expectedLenth = 4;
		Assert.assertEquals(expectedLenth, actualLenth);
		
		//b)
		Assert.assertEquals("The expected data does Not match!",expectedLenth, actualLenth);
	
	//2. Assertion
		
		//a)
		
		assertTrue(expectedLenth == actualLenth);
		
		//b)
		
		assertTrue("The expected data does Not match!", expectedLenth == actualLenth);
		
	//3. Assertion
		
		//a)
		assertFalse(expectedLenth != actualLenth);
		
		//b)
		assertFalse("The expected and actual data are same", expectedLenth != actualLenth);		
	}

	@Test
	public void testToConvertUpper() {
		String actual = "abcd".toUpperCase();
		String expected = "ABCD";

		assertEquals(expected, actual);
		assertEquals("The expected data does Not match!",expected, actual);
		assertTrue( expected.equals(actual));
		assertTrue("The expected data does Not match!", expected.equals(actual));
		assertFalse( !expected.equals(actual));	
		assertFalse("The expected and actual data are same", !expected.equals(actual));	
		
		// assertNotNull
		assertNotNull(actual);
		
		// assertNull
		//assertNull(actual);
	}
	
	@Test
	public void testToContainNormal() {
		
		boolean actual = "abcd".contains("hi");
		boolean expected = false;
		
		assertEquals(expected, actual);
		assertEquals("The expected data does Not match!",expected, actual);	
	}
	
	@Test
	public void testToContainInLine() {
				
		assertEquals(false, "abcd".contains("hi"));
		assertEquals("The expected data does Not match!",false, "abcd".contains("hi"));	
	}
	
	
}
