package junittutor;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


public class J03BeforeEachAndAfterEach {
	
	@BeforeEach
	public void testBeforeEach(TestInfo info) {
		System.out.println("Before method execution!"+ info.getDisplayName());
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
