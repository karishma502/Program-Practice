package PracticeCode_h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wordSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test case 1
		String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
		String[] words2 = {"e", "o"};
		System.out.println("Universal words: " + wordSubsets(words1, words2));

		// Test case 2
		String[] words1_2 = {"amazon", "apple", "facebook", "google", "leetcode"};
		String[] words2_2 = {"lo", "eo"};
		System.out.println("Universal words: " + wordSubsets(words1_2, words2_2));

		// Test case 3
		String[] words1_3 = {"amazon", "apple", "facebook", "google", "leetcode"};
		String[] words2_3 = {"e", "oo"};
		System.out.println("Universal words: " + wordSubsets(words1_3, words2_3));


	}
	public static  List<String> wordSubsets(String[] words1, String[] words2) {
		int[] maxCharFreq = new int[26];
		int[] tempCharFreq = new int[26];

		for (String word : words2) {
			Arrays.fill(tempCharFreq, 0);
			for (char ch : word.toCharArray()) {
				tempCharFreq[ch - 'a']++;
			}
			for (int i = 0; i < 26; ++i) {
				maxCharFreq[i] = Math.max(maxCharFreq[i], tempCharFreq[i]);
			}
		}

		List<String> universalWords = new ArrayList<>();

		for (String word : words1) {
			Arrays.fill(tempCharFreq, 0);
			for (char ch : word.toCharArray()) {
				tempCharFreq[ch - 'a']++;
			}

			boolean isUniversal = true;
			for (int i = 0; i < 26; ++i) {
				if (maxCharFreq[i] > tempCharFreq[i]) {
					isUniversal = false;
					break;
				}
			}
			if (isUniversal) {
				universalWords.add(word);
			}
		}

		return universalWords;
	}


}
