package PracticeCode_a;

import java.util.Stack;

/*
 * Problem :Removing Stars From a String.
 */
public class RemoveStarsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "leet**cod*e";
		System.out.println(removeStars(s1));


		String s2 = "erase*****";
		System.out.println(removeStars(s2));
	}

	public static String removeStars(String s) {
		Stack<Character> stack = new Stack<>();
		StringBuilder result = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (c == '*') {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(c); 
			}
		}

		while (!stack.isEmpty()) {
			//result.reverse();
			result.insert(0, stack.pop()); //reverse
		}

		return result.toString();
	}




}
