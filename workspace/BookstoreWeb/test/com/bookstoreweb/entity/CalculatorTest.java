package com.bookstoreweb.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		int a = 2;
		int b = 5;
		
		int result = cal.add(2, 5);
		int expected = 7;
		
		assertEquals(expected, result);
	}

}
