package com.lcwd.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class assertExample {
	
	
	@Test
	public void test1() {
		System.out.println("Testing some assertion methods");
		
		byte actual = 12;
		byte expected = 12;
		
		Assertions.assertEquals(expected, actual);
		
	}

}
