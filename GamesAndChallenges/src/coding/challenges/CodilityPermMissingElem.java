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
		int[] A = { 12, 1, 9, 8, 7, 6, 3, 2, 10, 4, 5 };
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
		int missingElement = 0;
		// sort the input array
		Arrays.sort(A);
		for (int current = 0; current <= A.length && missingElement == 0; ) {
			int next = current + 1;
			// if first element not 1, found missing as first element
			if (current == 0 && A[current] != 1) {
				missingElement = 1;
				// if reached the end, missing is the last element
			} else if (current == A.length - 1) {
				missingElement = A[current];
				// if elements are adjacent, increment counter
			} else if (A[current] + 1 == A[next]) {
				current++;
				// if not last item and elements are not adjacent, then found missing
			} else {
				missingElement = A[current] + 1;
			}
		}
		return missingElement;
	}
}
