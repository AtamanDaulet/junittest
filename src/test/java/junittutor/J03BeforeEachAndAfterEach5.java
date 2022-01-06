package junittutor;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J03BeforeEachAndAfterEach5 {

	@BeforeEach
	public void testBeforeEach(TestInfo info) {
		System.out.println("Before method execution! "+ info.getDisplayName());
	}
	
	@Test
	public void testWithArrays() {
		String str = "Unit test with JUnit";
		String[] actualArray = str.split(" ");
		String[] expectedArray = {"Unit", "test" ,"with", "JUnit"};
		
		assertArrayEquals(expectedArray, actualArray);
		assertArrayEquals("The data Does Not Match!!",expectedArray, actualArray);
		
	}


}
