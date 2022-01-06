package junittutor;


import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class J04BeforeAllAndAfterAll {

	@BeforeAll
	public void testBeforeAll() {
		System.out.println("BeforeAll");
	}
	
	@Test
	public void testWithArrays() {
		String str = "Unit test with JUnit4";
		String[] actualArray = str.split(" ");
		String[] expectedArray = {"Unit", "test" ,"with", "JUnit4"};
		
		//assertArrayEquals(expectedArray, actualArray);
		//("The data Does Not Match!!",expectedArray, actualArray);
		
	}
	
	@AfterAll
	public void testAfterAll() {
		System.out.println("AfterAll");
	}
	

}
