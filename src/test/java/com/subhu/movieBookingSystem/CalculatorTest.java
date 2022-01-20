package com.subhu.movieBookingSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		int expected = 5;
		int actual = new Calculator().add(2, 3);
		Assertions.assertEquals(expected, actual);
	}
}
