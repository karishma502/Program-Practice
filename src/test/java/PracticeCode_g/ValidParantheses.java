package PracticeCode_g;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="()";
		System.out.println(isValid(s));
		
		String s2 ="(}";
		System.out.println(isValid(s2));
	}
	public static boolean isValid(String s) {

		Stack<Character> stack=new Stack<Character>();
		for(char c : s.toCharArray()){
			if(c=='(' || c=='[' || c=='{'){
				stack.push(c);
			}else{
				if(stack.isEmpty()){
					return false;
				}
				char top = stack.peek();
				if((c == ')' && top=='(') || (c ==']' && top =='[')|| (c == '}' && top == '{')){
					stack.pop();
				}else{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
