package PracticeCode;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem : 20 
		 * 
		 * Example 1:
			Input: s = "()"
			Output: true
			
			Example 2:
			Input: s = "()[]{}"
			Output: true
			
			Example 3:

			Input: s = "(]"
			Output: false
		 */

		ValidParantheses vp = new ValidParantheses();
		
		boolean  s1= vp.isValid("()");
		System.out.println(s1);
		
		boolean  s2=vp.isValid("()[]{}");
		System.out.println(s2);
		
		boolean  s3=vp.isValid("(}");
		System.out.println(s3);
		
		
	}
	
	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<>();
		for(char ch: s.toCharArray()) {
			if(ch == '(') {
				stack.push(')');
			}
			else if(ch == '{') {
				stack.push('}');
			}
			else if(ch == '[') {
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop() != ch) {
				return false;

			}
		}
		
		return stack.isEmpty();
	}
	

}
