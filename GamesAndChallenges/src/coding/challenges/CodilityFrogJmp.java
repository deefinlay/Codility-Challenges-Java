/**
 * 
 */

/**
 * @author DeeFinlay, Calculate minimal number of fixed-length jumps required
 *         for the frog to move between two locations
 *
 */
public class CodilityFrogJmp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int start, finish, jumpLength;
		start = 200;
		finish = 1000;
		jumpLength = 10;
		System.out.println(calculateMinJumps(start, finish, jumpLength));
	}

	/**
	 * Calculates the minimum number of hops (of size d) it takes to move between
	 * start and finish positions where start<=finish. NOTE. Assumption is made that
	 * if start == finish, then zero jumps are required as the finish is already
	 * reached
	 * 
	 * @param x start position
	 * @param y finish position
	 * @param d size of hop
	 * @return minimum number of hops required
	 */
	public static int calculateMinJumps(int x, int y, int d) {
		double minJumps;
		// casting the int calculation to double to avoid loss of precision
		minJumps = Math.ceil((double) (y - x) / d);
		return (int) minJumps;
	}
}
