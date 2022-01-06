package junittutor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class J09PerformanceTest {

	@Test
	void performanceTest() {

		assertTimeout(Duration.ofSeconds(3), ()->{
			IntStream.rangeClosed(0, 1000).forEach(System.out::println);
			
		});

		
	}

}
