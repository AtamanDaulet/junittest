package junittutor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class J07RepeatSameTestMultipleTimes {

	@BeforeEach
	void beforeEachTest() {
		System.out.println("Before each test");
	}
	@AfterEach
	void afterEachTest() {
		System.out.println("After each test");
		System.out.println("==============");
	}
	
	@RepeatedTest(4)
	void containTest() {

		assertFalse("abcdef".contains("ijk"));
		System.out.println("Test");		
	}
	
	@RepeatedTest(5)
	void addTest() {

		assertEquals(3, Math.addExact(1, 2));
		System.out.println("Add Test is executed");		
	}
	
}
