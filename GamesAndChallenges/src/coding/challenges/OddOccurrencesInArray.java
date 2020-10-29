/**
 * 
 */
package coding.challenges;

import java.util.Arrays;

/**
 * @author DeeFinlay, Finds the unpaired element in an array with an odd number
 *         of elements
 *
 */
public class OddOccurrencesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] oddArray = { 1, 2, 2, 5, 6, 5, 25, 35, 25, 35, 1, 10, 6 };
		System.out.println(findUnpairedElement(oddArray));
	}

	/**
	 * Takes an array of positive integers, all of which bar one are paired values,
	 * and finds that unpaired value
	 * 
	 * @param input array of positive integers
	 * @return the unpaired element in the above array
	 */
	public static int findUnpairedElement(int[] input) {
		// array can only contain positive integers so initialise unpaired element value
		// as -1
		int unpairedElement = -1;
		// input array in order
		Arrays.sort(input);
		for (int current = 0; current <= input.length && unpairedElement < 0;) {
			int next = current + 1;
			// found unpaired as last element
			if (current == input.length - 1) {
				unpairedElement = input[current];
				// if pair found, jump two elements
			} else if (input[current] == input[next]) {
				current += 2;
				// if not last item and not pair, then found unpaired
			} else {
				unpairedElement = input[current];
			}
		}
		return unpairedElement;
	}
}
