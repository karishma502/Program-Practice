package PracticeCode_h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test case 1
		String[] words1 = {"abaacbcbb"};
		String[] words2={"abc"};
		System.out.println(wordSubsets(words1, words2));

	}
	public static  int wordSubsets(String[] words1, String[] words2) {

		String s="";
		int[] charFrequency = new int[26];
		int totalLength = 0;
		for (char c : s.toCharArray()) {
			charFrequency[c - 'a']++;
		}
		for (int frequency : charFrequency) {
			if (frequency == 0) continue;
			if (frequency % 2 == 0) {
				totalLength += 2;
			} else {
				totalLength += 1;
			}
		}
		return totalLength;



	}
}