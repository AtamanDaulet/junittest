package junittutor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J05TestExceptions {

	@Test
	void testException01() {

		String str = null;
		
		assertThrows(NullPointerException.class,
				()-> {
					System.out.println("The Null poinetr exception method executed"); 
					str.length();
				});
	}

	@Test
	void testException02() {

		String str = "123A";
		
		assertThrows(NumberFormatException.class,
				()-> {
					System.out.println("The NumberFormatException method executed"); 
					Integer.parseInt(str);
				});
	}
	
	@Test
	void testException03() {
		
		assertThrows(ArithmeticException.class,
				()-> {
					System.out.println("The ArithmeticException method executed"); 
					int num  = 7/0;
				});
	}
	
	@Test
	void testException04() {
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					printAge(-3);
				});
	}
	
	void printAge(int age) {
		if(age <=0) {
			throw new IllegalArgumentException();
		}else {
			System.out.println("age is "+age);
		}
	}
	
}
