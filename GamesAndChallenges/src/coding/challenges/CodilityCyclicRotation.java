/**
 * 
 */
package coding.challenges;

import java.util.Arrays;

/**
 * @author DeeFinlay Codility Cyclic Rotation challenge demonstrating rotation
 *         of an array by a desired number of shifts
 */
public class CodilityCyclicRotation {

	/**
	 * @param args Main method begins here
	 */
	public static void main(String[] args) {
		int[] unshifted = { 4, 5, 6, 7, 8, 9 };
		int numShifts = 5;
		System.out.println("Unshifted: " + Arrays.toString(unshifted));
		int[] shifted = shiftArray(unshifted, numShifts);
		System.out.println("Shifted: " + Arrays.toString(shifted));

	}

	/**
	 * Shifts each element of A to the right K times placing the former last element
	 * at the beginning
	 * 
	 * @param A array to be shifted
	 * @param K number of shifts to be made
	 * @return
	 */
	public static int[] shiftArray(int[] A, int K) {

		int dimension = A.length;
		for (int shifts = 1; shifts <= K; shifts++) {
			// set aside the last element temporarily while shifting the array
			int setAside = A[dimension - 1];
			for (int counter = 1; counter < dimension; counter++) {
				// shift the element
				A[dimension - counter] = A[dimension - counter - 1];
			}
			A[0] = setAside;
			System.out.println("After shift " + shifts + ": " + Arrays.toString(A));
		}
		return A;
	}

}
