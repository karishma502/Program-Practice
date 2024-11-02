package PracticeCode_g;

public class CircularSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  sentence = "leetcode exercises sound delightful";
		System.out.println(isCircularSentence(sentence));

	}

	public static boolean isCircularSentence(String sentence) {
		// First check: verify if the first and last characters of the entire string match
		// This handles the requirement that the sentence should be circular
		if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1))
			return false;

		// Find the first space in the string
		int k = sentence.indexOf(" ");

		// If there are no spaces, it means there's only one word
		// In this case, we already checked if first and last letters match
		if (k == -1)
			return true;

		// Iterate through all spaces in the string
		while (k != -1) {
			// For each space found:
			// Check if the character before the space (last letter of current word)
			// matches the character after the space (first letter of next word)
			if (sentence.charAt(k - 1) != sentence.charAt(k + 1)) {
				return false;
			}

			// Find the next space in the string, starting from position after current space
			k = sentence.indexOf(" ", k+1);
		}

		// If we've made it through all checks, the sentence is circular
		return true;
	}


}
