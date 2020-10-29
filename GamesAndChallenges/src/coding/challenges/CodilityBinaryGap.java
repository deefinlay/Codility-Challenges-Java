/**
 * 
 */
package coding.challenges;

/**
 * @author DeeFinlay Class to find largest consecutive number of zeroes, or
 *         binary gap
 */
public class CodilityBinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 2147483647;
		System.out.printf("Largest gap is %d", solution(num));
	}

	/**
	 * Find the largest consecutive number of zeroes in a binary number, or the
	 * binary gap
	 * 
	 * @param number is the denary number to convert
	 * @return the binary gap
	 */
	public static int solution(int number) {
		int largestGap, startIndex, endIndex, pointer;
		largestGap = 0;
		startIndex = 0;
		endIndex = 0;
		pointer = 0;
		// convert to binary
		String binaryVersion = Integer.toBinaryString(number);
		System.out.println(binaryVersion);
		// outer loop until end of binaryVersion
		while (pointer <= binaryVersion.length()) {
			// mark index of first nonzero char
			startIndex = binaryVersion.indexOf('1', pointer);
			// mark index of next nonzero char, where a return of -1 signifies no further
			// non zeroes
			endIndex = binaryVersion.indexOf('1', pointer + 1);
			if (endIndex > 0 && endIndex - startIndex - 1 > largestGap) {
				largestGap = endIndex - startIndex - 1;
			}
			if (endIndex > 0) {
				// reset the pointer position
				pointer = endIndex;
			} else {
				// a -1 signifies no more nonzeroes, so finish iterating
				break;
			}
		}
		return largestGap;
	}
}
