/**
 * 
 */
package coding.challenges;

import java.util.Arrays;

/**
 * @author DeeFinlay, Finds the missing element in any given permutation
 *
 */
public class CodilityPermMissingElem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Array size N with values 1...N+1
		int[] A = { 1, 2, 4, 5, 6 };
		System.out.println(findMissing(A));
	}

	/**
	 * Finds missing element in array
	 * 
	 * @param A, integer array of size N containing adjacent elements ranging from 1
	 *           to N+1 with a single missing element
	 * @return the missing element
	 */
	public static int findMissing(int[] A) {
		double sum = 0;
		// sort the input array
		Arrays.sort(A);
		for (int current = 0; current < A.length; current++) {
			// sum all in this array
			sum += A[current];
		}
		// N*(N+1)/2 is the sum of all elements in a sequential array containing values
		// 1..N+1
		int N = A.length + 1;
		double missing = 0.5 * N * (N + 1) - sum;
		// the difference in the two sums is the value of the missing sequential element
		return (int) missing;
	}
}
