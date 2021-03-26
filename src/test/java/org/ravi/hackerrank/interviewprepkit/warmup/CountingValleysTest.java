package org.ravi.hackerrank.interviewprepkit.warmup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountingValleysTest {

	// Infinite test plugin - continuously running tests
	@Test
	void testCountingValleysTestCase1() {
		int noOfSteps = 8;
		String path = "UDDDUDUU";
		int expectedValue = 1;

		assertEquals(expectedValue, Result.countingValleys(noOfSteps, path));
	}

	@Test
	void testCountingValleysTestCase2() {
		int noOfSteps = 12;
		String path = "DDUUDDUDUUUD";
		int expectedValue = 2;

		assertEquals(expectedValue, Result.countingValleys(noOfSteps, path));
	}

}
