/**
 * Test class for {@link Solution1}
 */
package com.linecorp.exercise;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Tuan Nguyen
 *
 */
public class Solution1Test {

	private Solution1 solution1;

	/**
	 * Contexts initialize
	 */
	@Before
	public void setUp() {
		solution1 = new Solution1();
	}

	/**
	 * Contexts clean-up
	 */
	@After
	public void tearDown() {
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSolutionWillThrowException() {
		int[] A = {};
		int K = 0;
		solution1.solution(A, K);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSolutionWillThrowException2() {
		int[] A = { 1, 3, 3, 3, 4, 5, 5, 5, 5 };
		int K = 10;
		solution1.solution(A, K);
	}

	@Test
	public void testSolution() {
		int[] A = { 1, 3, 3, 3, 4, 5, 5, 5, 5 };
		int K = 2;
		int result = solution1.solution(A, K);

		assertTrue(result == 5);
	}

}
