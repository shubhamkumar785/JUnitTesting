//package com.lcwd.services;
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import java.util.Date;
//
//public class CalculatorServiceTest {
//	
//	int counter = 0;
//	
//	@BeforeClass
//	public static void init() {
//		System.out.println("Before all test cases: ");
//		System.out.println("standard test : " + new Date());
//	}
//	@Before
//	public void beforeEach() {
//		System.out.println("Before each test cases");
//		counter = 0;
//	}
//
//	@Test(timeout = 2000)
//	public void addTwoNumbersTest() throws InterruptedException {
//		for(int i=1; i<=20; i++) {
//			counter += i;
//		}
//		Thread.sleep(3000);
//		System.out.println("Test for addTwoNumbersTest");
//		int result = Calculator.addTwoNumbers(12, 45);
//		int expected = 57;
//		System.out.println("Counter int first test case: " + counter);
//		Assert.assertEquals(expected, result);
//		
//	}
//	@Test
//	public void sumAnyNumbersTest() {
//		for(int i=1; i<=100; i++) {
//			counter += i;
//		}
//		System.out.println("Counter int second test case: " + counter);
//
//		System.out.println("Test for sumAnyNumbersTest");
//		int result = Calculator.sumAnyNumbers(2, 4, 6, 8, 9);
//		int expected = 29;
//		Assert.assertEquals(expected, result);
//	}
//	@AfterClass
//	public static void cleanup() {
//		System.out.println("After all the test cases");
//		System.out.println("End test cases : " + new Date());
//	}
//
//}
