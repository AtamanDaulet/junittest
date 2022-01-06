package junittutor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class J10DisableUnitTest {

	@Test
	@Disabled
	public void testWithArrays01() {
		String str = "Unit test with JUnit01";
		String[] actualArray = str.split(" ");
		String[] expectedArray = {"Unit", "test" ,"with", "JUnit01"};
		
		assertArrayEquals(expectedArray, actualArray);
		assertArrayEquals(expectedArray, actualArray,"The data Does Not Match!!");
		
	}
	
	@Test	
	public void testWithArrays02() {
		String str = "Unit test with JUnit02";
		String[] actualArray = str.split(" ");
		String[] expectedArray = {"Unit", "test" ,"with", "JUnit02"};
		
		assertArrayEquals(expectedArray, actualArray);
		assertArrayEquals(expectedArray, actualArray, "The data Does Not Match!!");
		
	}

}
