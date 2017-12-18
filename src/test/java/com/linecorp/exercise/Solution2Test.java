/**
 * Test class for {@link Solution2}
 */
package com.linecorp.exercise;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Tuan Nguyen
 *
 */
public class Solution2Test {

	private Solution2 solution2;

	/**
	 * Contexts initialize
	 */
	@Before
	public void setUp() {
		solution2 = new Solution2();
	}

	/**
	 * Contexts clean-up
	 */
	@After
	public void tearDown() {
	}

	@Test
	public void testSolutionWillReturnZero() {
		int result = solution2.solution(0);
		assertTrue(result == 0);
	}

	@Test
	public void testSolutionWillReturnOne() {
		Set<Integer> results = new HashSet<Integer>();

		for (int n = 1; n <= 9; n++) {
			results.add(solution2.solution(n));
		}

		// For number less than 10 but greater than 0, it's always 1
		assertTrue(results.size() == 1);
		assertTrue(results.iterator().next() == 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSolutionWillThrowException() {
		solution2.solution(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSolutionWillThrowException2() {
		solution2.solution(100000001);
	}

	@Test
	public void testSolutionWithAnIntegerHave2Digits() {
		int result = solution2.solution(13);
		assertTrue(result == 6);
	}

	@Test
	public void testSolutionWithAnIntegerHave3Digits() {
		int result = solution2.solution(133);
		assertTrue(result == 68);
	}

	@Test
	public void testSolutionWithAnIntegerHave4Digits() {
		int result = solution2.solution(1666);
		assertTrue(result == 1204);
	}

	@Test
	public void testSolutionWithAnIntegerHave5Digits() {
		int result = solution2.solution(16666);
		assertTrue(result == 13704);
	}

	@Test
	public void testSolutionWithAnIntegerHave6Digits() {
		int result = solution2.solution(166666);
		assertTrue(result == 153704);
	}

}
