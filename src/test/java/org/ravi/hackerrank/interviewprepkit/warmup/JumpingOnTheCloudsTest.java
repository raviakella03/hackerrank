package org.ravi.hackerrank.interviewprepkit.warmup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JumpingOnTheCloudsTest {

	@Test
	void testJumpingOnCloudsTestCase1() {
		int[] clouds = { 0, 0, 1, 0, 0, 1, 0 };
		int expectedValue = 4;

		assertEquals(expectedValue, JumpingOnTheClouds.jumpingOnClouds(clouds));
	}

	@Test
	void testJumpingOnCloudsTestCase2() {
		int[] clouds = { 0, 0, 0, 1, 0, 0 };
		int expectedValue = 3;

		assertEquals(expectedValue, JumpingOnTheClouds.jumpingOnClouds(clouds));
	}

}
