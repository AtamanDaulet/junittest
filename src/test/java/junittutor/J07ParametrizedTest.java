package junittutor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class J07ParametrizedTest {

	@Test
	void length_greater_than_zero() {

		// Not recommended 
		assertTrue("ABCD".length() > 0);
		assertTrue("ABC".length() > 0);
		assertTrue("A".length() > 0);
		assertTrue("".length() >= 0);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"ABCD", "ABC", "A", ""})
	void length_greater_than_zero_with_parameterized_test(String str) {

		assertTrue(str.length() >= 0);
		
	}
	
	@ParameterizedTest
	@CsvSource (value = {"ABCD,abcd", "ABC,abc", "A,a"})
	void upperCaseTest(String str1, String actualStr2) {

		assertEquals(str1, actualStr2.toUpperCase());
		
	}
	
	@ParameterizedTest
	@CsvSource (value = {"ABCD,4", "ABC,3", "A,1"})
	void lengthTest(String str1, int actual) {

		assertEquals(str1.length(), actual);
		
	}


	@ParameterizedTest
	@CsvSource (value = {"true,ali,a", "false,joe,a", "false,tom,a"})
	void testContain(boolean isTrue, String str1, String str2) {

		assertEquals(isTrue, str1.contains(str2) );
		
	}
}
