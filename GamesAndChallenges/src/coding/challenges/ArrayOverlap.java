package coding.challenges;

import java.util.Arrays;

/**
 * Determines if an array representing two subarrays and a matching elements
 * element is valid or not
 * 
 * @author DeeFinlay
 *
 */
public class ArrayOverlap {

	/**
	 * Main Method code
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] test = { 4, 10, 4, 6, 2 };
		System.out.println(ArrayChallenge(test));
	}

	/**
	 * ArrayChallenge determines if array arr is in a valid form. That form is the
	 * first and last elements in two subarrays together with the number of elements
	 * overlapping. For example, { 4, 10, 4, 6, 2 } is the subarray 4-10, the
	 * subarray 4-6 and 2 elements overlapping. This should return false because
	 * there are 3 elements overlapping in this pattern.
	 * 
	 * @param arr is the array in the form above
	 * @return true if the array is in the correct form, false otherwise
	 */
	public static boolean ArrayChallenge(int[] arr) {
		int overlap = 0;
		// Split arr into two subarrays
		System.out.println("hello");
		int[] firstArray = new int[arr[1] - arr[0] + 1];
		int[] secondArray = new int[arr[3] - arr[2] + 1];
		// Populate subarrays
		System.out.println("arr0 " + arr[0]);
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = arr[0] + i;
		}
		System.out.println(Arrays.toString(firstArray));
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = arr[2] + i;
		}
		System.out.println(Arrays.toString(secondArray));
		// Count number of elements overlapping
		for (int i = 0; i < firstArray.length; i++) {
			// use binarySearch as the arrays are naturally sequential
			System.out.println(Arrays.binarySearch(secondArray, firstArray[i]));
			if (Arrays.binarySearch(secondArray, firstArray[i]) >= 0) {
				System.out.println(overlap);
				overlap++;
			}
		}
		return (overlap == arr[4]) ? true : false;
	}
}
