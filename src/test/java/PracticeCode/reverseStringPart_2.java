package PracticeCode;

/*
 * Problem : 541. Reverse String II
 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, 
then reverse the first k characters and leave the other as original.
 */
public class reverseStringPart_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcdefg";
		int k1 = 2;
		System.out.println(reverseStr(s1, k1));

		String s2 = "abcd";
		int k2 = 2;
		System.out.println(reverseStr(s2, k2));
	}

	public static String reverseStr(String s, int k) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < s.length(); i += 2 * k) {
			reverseArray(chars, i, Math.min(i + k, s.length()) - 1);
		}
		return new String(chars);
	}


	private static void reverseArray(char[] chars, int start, int end) {
		while (start < end) {
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
	}

}
