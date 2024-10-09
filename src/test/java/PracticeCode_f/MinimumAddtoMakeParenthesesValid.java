package PracticeCode_f;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumAddtoMakeParenthesesValid
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "())";
		System.out.println(minAddToMakeValid(s1));
		
		String s2 = "(((";
		System.out.println(minAddToMakeValid(s2));
	}

	public static int minAddToMakeValid(String s) {

		int open =0, close =0;
		for(int i =0; i<s.length();i++){
			char ch = (s.charAt(i));
			if(ch == '('){
				open++;
			}
			else{
				if(open <=0){
					close++;
				}else{
					open--;
				}
			}
		}     
		return (open + close);    
	}


}
