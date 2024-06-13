package PracticeCode_a;

import java.util.Stack;

/*
 * Given an encoded string, return its decoded string.
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */
public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "3[a]2[bc]";
		System.out.println(decodeString(s1));


		String s2= "3[a2[c]]";
		System.out.println(decodeString(s2));

		String s3= "2[abc]3[cd]ef";
		System.out.println(decodeString(s3));


	}
	public static String decodeString(String s) {
		Stack<Integer> num = new Stack<Integer>();
		Stack<String> stringStack = new Stack<String>();
		int k =0;

		for (char c : s.toCharArray()) {

			if (Character.isDigit(c)) {
				k = (k * 10) + (c - '0');
				continue;
			}

			if (c == '[') {
				num.push(k);
				k = 0;
				stringStack.push(String.valueOf(c));
				continue;
			}

			if (c != ']') {
				stringStack.push(String.valueOf(c));
				continue;
			}

			StringBuilder temp = new StringBuilder();
			while (!stringStack.peek().equals("[")) {
				temp.insert(0, stringStack.pop());
			}

			// remove the "["
			stringStack.pop();

			// get the new string.....
			StringBuilder replacement = new StringBuilder();

			int count = num.pop();
			for (int i = 0; i < count; i++)
				replacement.append(temp);

			// Add it to the stack.....
			stringStack.push(replacement.toString());

		}

		StringBuilder result = new StringBuilder();
		while (!stringStack.empty()) {
			result.insert(0, stringStack.pop());
		}
		return result.toString();
	}

}
