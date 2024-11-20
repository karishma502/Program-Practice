package PracticeCode_g;

public class TakeKofEachCharacterFromLeftandRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="aabaaaacaabc";
		int k=2;
		System.out.println(takeCharacters(s, k));
		
		String s2 ="a";
		int k2=1;
		System.out.println(takeCharacters(s2, k2));
	}
	public static int takeCharacters(String s, int k) {
		// Total counts
		int[] count = new int[3];
		for (char c : s.toCharArray()) {
			count[c - 'a']++;
		}

		if (Math.min(Math.min(count[0], count[1]), count[2]) < k) {
			return -1;
		}

		// Sliding Window
		int res = Integer.MAX_VALUE;
		int l = 0;
		for (int r = 0; r < s.length(); r++) {
			count[s.charAt(r) - 'a']--;

			while (Math.min(Math.min(count[0], count[1]), count[2]) < k) {
				count[s.charAt(l) - 'a']++;
				l++;
			}
			res = Math.min(res, s.length() - (r - l + 1));
		}
		return res;
	}


}
