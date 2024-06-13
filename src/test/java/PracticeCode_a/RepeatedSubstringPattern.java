package PracticeCode_a;
/*
 * 459. Repeated Substring Pattern
 */
public class RepeatedSubstringPattern {
	public static void main(String[] args) {

		System.out.println(repeatedSubstringPattern("abab"));
		System.out.println(repeatedSubstringPattern("aba")); 
		System.out.println(repeatedSubstringPattern("abcabcabcabc")); 
	}

	public static boolean repeatedSubstringPattern(String s) {
		int n = s.length();
		for (int len = 1; len <= n / 2; len++) {
			if (n % len == 0) {
				String pattern = s.substring(0, len);
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < n / len; i++) {
					sb.append(pattern);
				}
				if (sb.toString().equals(s)) {
					return true;
				}
			}
		}
		return false;
	}


}

