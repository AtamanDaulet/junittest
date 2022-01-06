package junittutor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class J11GroupingTests {

	@BeforeEach
	public void testBeforeEach(TestInfo info) {
		System.out.println("Initialize the test data for "+ info.getDisplayName());
	}

	@AfterEach
	public void testAfterEach(TestInfo info) {
		System.out.println("Clean the test data for "+ info.getDisplayName());
	}
	
	@ParameterizedTest
	@CsvSource(value = {"12,4,3","-12,3,-4","-12,-3,4","12,-4,-3"})
	void multiply(int expected, int a, int b) {
		assertEquals(expected, a*b);
	}
	
	@Nested
	class OperationsWithZeroTest {
		@ParameterizedTest
		@CsvSource(value = {"0,4,0","0,0,4","0,4,0","0,0,0"})
		void multiply(int expected, int a, int b) {
			assertEquals(expected, a*b);
		}
	}
}
