/**
 * 
 */
package coding.challenges;

/**
 * @author DeeFinlay
 *
 */
public class FrogRiverOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] leafPositions = { 3, 3, 3, 2, 3, 1, 2 };
		System.out.println(solution(4, leafPositions));
	}

	/**
	 * Finds the first position in an array for which all previous "steps" have occurred 
	 * @param X is the number of steps
	 * @param A is the array of integers
	 * @return the first position at which all "steps" have occurred
	 */
	public static int solution(int X, int[] A) {
		int currentSum = 0;
		// create a boolean "flag" array whose expected sum will be X times 1 (or X)
		boolean[] checked = new boolean[X];
		int expectedSum = X;
		int counter = 0;
		// flag if one of the "step" numbers has occurred
		do {
			if (!checked[A[counter] - 1]) {
				checked[A[counter] - 1] = true;
				currentSum += 1;
			}
			counter++;
		} while (currentSum < expectedSum && counter < A.length);
		// if all steps are not found return -1 else take 1 off the counter which will
		// have incremented
		return currentSum < expectedSum ? -1 : counter - 1;
	};
}
