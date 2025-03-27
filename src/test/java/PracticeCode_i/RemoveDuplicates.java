package PracticeCode_i;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates{
	
	public static void main(String[] args) {
		
		String s ="programming";
		System.out.println(removeDuplicate(s));
	}
	
	public static String removeDuplicate(String s) {
		
		Set<Character> unique = new LinkedHashSet<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(char ch : s.toCharArray()) {
            if (unique.add(ch)) {
				sb.append(ch);
				System.out.println(sb);
			}
		}
		

		return sb.toString();
	}

	

}
