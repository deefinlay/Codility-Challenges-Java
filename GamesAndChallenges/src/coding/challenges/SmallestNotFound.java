/**
 * 
 */
package coding.challenges;

import java.util.Arrays;

/**
 * @author Owner
 *
 */
public class SmallestNotFound {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1 };
		System.out.println(solution(arr));
	}

	/**
	 * Returns the smallest positive integer (greater than 0) that does not occur in
	 * A which is an array of N integers
	 * @param A is an array of integers
	 * @return the smallest missing positive integer in A
	 */
	static int solution(int[] A) {
		int smallestMissing = 1;
		Arrays.sort(A);
		// if all negative (highest sorted element is negative or zero)
		if (A[A.length - 1] <= 0) {
			smallestMissing = 1;
		} else {
			// place the counter at the first positive element
			int counter = 0;
			while (A[counter] <= 0) {
				counter++;
			}
			boolean found = false;
			while (counter <= A.length && !found) {
				// if last element and still not found must be the one after
				if (counter == (A.length) - 1 && !found) {
					smallestMissing = A[A.length - 1] + 1;
					found = true;
				} else if (A[counter + 1] != A[counter] + 1) {
					smallestMissing = A[counter] + 1;
					found = true;
				} else {
					counter++;
				}
			}
		}
		return smallestMissing;
	}
}
