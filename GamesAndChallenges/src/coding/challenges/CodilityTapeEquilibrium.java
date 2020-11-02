/**
 * 
 */
package coding.challenges;

import java.util.Arrays;

/**
 * @author DeeFinlay Demonstrates finding the lowest difference between movable
 *         sides of an array
 */
public class CodilityTapeEquilibrium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] someArray = { -1000, 1000 };
		System.out.println(solution(someArray));
	}

	/**
	 * Finds the smallest difference between the totals on the left and right sides
	 * of a movable pivot point in an array
	 * 
	 * @param A array of integers
	 * @return the smallest difference between totals on either side of a "fulcrum"
	 */
	public static int solution(int[] A) {
		int smallestDifference, currentDifference;
		long arrayTotal, leftTotal;
		// sum all in the given array
		arrayTotal = 0;
		for (int element : A) {
			arrayTotal += element;
		}
		leftTotal = 0;
		// initialise smallest as largest possible integer value
		smallestDifference = Integer.MAX_VALUE;
		currentDifference = Integer.MAX_VALUE;
		for (int currentElement = 0; currentElement < A.length - 1; currentElement++) {
			leftTotal += A[currentElement];
			// difference is right total - left total
			// right total is array total - left total
			// so difference is array total - twice the left total
			currentDifference = (int) Math.abs(arrayTotal - (2 * (leftTotal)));
			smallestDifference = Math.min(smallestDifference, currentDifference);
		}
		return (int) smallestDifference;
	};
}
