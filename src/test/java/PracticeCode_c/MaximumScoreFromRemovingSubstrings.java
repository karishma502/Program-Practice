package PracticeCode_c;

public class MaximumScoreFromRemovingSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="cdbcbbaaabab";
		int x1 =4;
		int y1 =5;
		System.out.println(maximumGain(str1, x1, y1));

		String str2="aabbaaxybbaabb";
		int x2 =4;
		int y2 =5;
		System.out.println(maximumGain(str2, x2, y2));
	}

	public static int maximumGain(String s, int x, int y) {

		if (x < y) {
			// Swap points
			int temp = x;
			x = y;
			y = temp;

			s = new StringBuilder(s).reverse().toString();
		}

		int aCount = 0, bCount = 0, totalPoints = 0;

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			if (currentChar == 'a') {
				aCount++;
			} else if (currentChar == 'b') {
				if (aCount > 0) {
					// Can form "ab", remove it and add points
					aCount--;
					totalPoints += x;
				} else {
					// Can't form "ab", keep 'b' for potential future 'ba'
					bCount++;
				}
			} else {
				// Non 'a' or 'b' character encountered
				// Calculate points for any remaining 'ba' pairs
				totalPoints += Math.min(bCount, aCount) * y;
				// Reset counters for next segment
				aCount = bCount = 0;
			}
		}

		// Calculate points for any remaining "ba" pairs at the end
		totalPoints += Math.min(bCount, aCount) * y;

		return totalPoints;
	}

}
