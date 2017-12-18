/**
 * To find out as much as possible the pencils that have the same length
 */
package com.linecorp.exercise;

/**
 * @author Tuan Nguyen
 *
 */
public class Solution1 {

	public int solution(int[] A, int K) {
		int n = A.length;
		int best = 0;
		int count = 1;

		if ((n <= 0 || n > 10000) || K > n) {
			throw new IllegalArgumentException("Something not right!");
		}

		for (int i = 0; i < n - K - 1; i++) {
			if (A[i] == A[i + 1])
				count = count + 1;
			else
				count = 1;
			if (count > best)
				best = count;
		}

		int result = best + K;

		return result;
	}

}
