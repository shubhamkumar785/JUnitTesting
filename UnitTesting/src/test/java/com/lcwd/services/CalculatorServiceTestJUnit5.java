package com.lcwd.services;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTestJUnit5 {
	
	
	@BeforeAll
	public static void init() {
		System.out.println("This is single time logic");
	}
	
	@AfterAll
	public static void cleanup() {
		System.out.println("After All The Test Case Logic");
	}
	@BeforeEach
	public void eachtestCase() {
		System.out.println("Before Each");
		
	}
	@AfterEach
	public void afterTestCase() {
		System.out.println("After Each");

		
	}
	
	
	@Test
	@DisplayName("This is custom name")
	public void addTwoNumbersTest() {
		System.out.println("First Test Case");
		int actual = Calculator.addTwoNumbers(12, 12);
		int expected = 24;
		Assertions.assertEquals(expected, actual, () -> "Not Matched");
		
	}
	@Test
	@Disabled
	public void addAnyNumbersTest() {
		System.out.println("Second Test Case");
		int actual = Calculator.sumAnyNumbers(2, 4, 6, 8, 9);
		int expected = 29;
		Assertions.assertEquals(expected, actual, () -> "Not Matched");
		
	}
	

}
