package junittutor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class J06DisplayName {
	//When we run multiple test cases, we might more logical expression for the TC so we can understand them
	@Test
	@DisplayName("NullPointerException method executed")
	void testException01() {

		String str = null;
		
		assertThrows(NullPointerException.class,
				()-> {
					System.out.println("The Null poinetr exception method executed"); 
					str.length();
				});
	}

}
