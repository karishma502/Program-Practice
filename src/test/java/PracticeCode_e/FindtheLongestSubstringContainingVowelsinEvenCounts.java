package PracticeCode_e;

import java.util.Arrays;

public class FindtheLongestSubstringContainingVowelsinEvenCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "leetminicoworoep";
		System.out.println(findTheLongestSubstring(s1));
		

		String s2 = "leetcodeisgreat";
		System.out.println(findTheLongestSubstring(s2));
		
		String s3 = "bcbcbc";
		System.out.println(findTheLongestSubstring(s3));
	}
	public static int findTheLongestSubstring(String s) {
		int[] mapy = new int[32];
		Arrays.fill(mapy, -2);
		mapy[0] = -1;

		int maxLen = 0;
		int mask = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			switch (ch) {
			case 'a':
				mask ^= 1;
				break;
			case 'e':
				mask ^= 2;
				break;
			case 'i':
				mask ^= 4;
				break;
			case 'o':
				mask ^= 8;
				break;
			case 'u':
				mask ^= 16;
				break;
			}

			int prev = mapy[mask];
			if (prev == -2) {
				mapy[mask] = i;
			} else {
				maxLen = Math.max(maxLen, i - prev);
			}
		}

		return maxLen;
	}

}
