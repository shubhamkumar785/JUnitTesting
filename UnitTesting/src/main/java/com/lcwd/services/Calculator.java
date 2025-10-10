package com.lcwd.services;

public class Calculator {
	
	public static int addTwoNumbers(int a, int b) {
		return a + b;
	}
	public static int productTwoNumbers(int a, int b) {
		return a * b;
	}
	public static double divideTwoNumbers(int a, int b) {
		return a /  b;
	}
	public static int sumAnyNumbers(int... numbers) {
		int sum =0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}

}
