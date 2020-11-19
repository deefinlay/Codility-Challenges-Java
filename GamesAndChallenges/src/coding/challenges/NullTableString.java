/**
 * 
 */
package coding.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Removes a line in a "table" containing the text NULL
 * 
 * @author DeeFinlay
 *
 */
public class NullTableString {

	/**
	 * Main method code
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println(solution("header,header\nANNUL,ANNULLED\nnull,NILL\nNULL,NULL"));
	}

	/**
	 * Removes a line or "row" in a "table", the table being represented as a String
	 * s. If a line in the table contains the term NULL then remove that line from
	 * the "table"
	 * 
	 * @param S is the string representation of the table
	 * @return the string without the line containing NULL
	 */
	public static String solution(String S) {
		String newString = "";
		String nullRegex = "NULL,|,NULL,|,NULL";
		String lineRegex = ".*[a-zA-Z0-9]|,\\n";
		Pattern p = Pattern.compile(lineRegex);
		Matcher m = p.matcher(S);
		while (m.find()) {
			// split into "lines"
			String line = m.group();
			// find the NULL expression in each of the lines or rows
			Pattern row = Pattern.compile(nullRegex);
			Matcher nullWord = row.matcher(line);
			// if the NULL expression is not found add this group to the new string
			if (!nullWord.find()) {
				System.out.println(line.length());
				newString += line;
				// if it's not the last line add back the line break
				if (!m.hitEnd()) {
					newString += "\n";
				}
			}
		}
		return newString;
	}

}
