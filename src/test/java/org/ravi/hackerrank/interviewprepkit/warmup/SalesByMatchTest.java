package org.ravi.hackerrank.interviewprepkit.warmup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;

class SalesByMatchTest {

//	@ParameterizedTest(name = "Input_Value={0}, Expected_Output={1}")
//	@CsvFileSource(resources = "/salesByMatchInput.csv", numLinesToSkip = 1)
	@Test
	void testSalesByMatchTestCase1() {
		int inputListLength = 9;
		int[] inputSocksList = {10,20,20,10,10,30,50,10,20};
		int expectedValue = 3;
		
		assertEquals(expectedValue, SalesByMatch.sockMerchant(inputListLength, inputSocksList));
	}
	
	@Test
	void testSalesByMatchTestCase2() {
		int inputListLength = 10;
		int[] inputSocksList = {1,1,3,1,2,1,3,3,3,3};
		int expectedValue = 4;
		
		assertEquals(expectedValue, SalesByMatch.sockMerchant(inputListLength, inputSocksList));
	}
}
