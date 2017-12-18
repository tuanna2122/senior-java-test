/**
 * A solution for counting how many one’s between number 0 to N
 */
package com.linecorp.exercise;

/**
 * @author Tuan Nguyen
 *
 */
public class Solution2 {

	/**
	 * <p>This method is for counting how many one’s between number 0 to N</p>
	 * <p>Please take a look at {@link Solution2Test} for all the test cases</p>
	 * 
	 * @param n an integer that's in range of 0 to 100,000,000
	 * @return total number of digit 1 appears in all the integers that do not greater than <tt>N</tt>
	 */
	public int solution(int n) {
		if (n < 0 || n > 100000000) {
			throw new IllegalArgumentException("The number must be at least 0 and at most 100,000,000");
		}

		int count = 0;
		int i = 1;
		int current = 0, after = 0, before = 0;

		while ((n / i) != 0) {
			current = (n / i) % 10;
			before = n / (i * 10);
			after = n - (n / i) * i;

			if (current > 1) {
				count = count + (before + 1) * i;
			} else if (current == 0) {
				count = count + before * i;
			} else if (current == 1) {
				count = count + before * i + after + 1;
			}

			i *= 10;
		}

		return count;
	}

}
