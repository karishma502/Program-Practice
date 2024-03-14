package PracticeCode;



/*
 * Problem : 125
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="A man, a plan, a canal: Panama";
		System.out.println(isPalidrome(s));
		
		String s1 ="race a car";
		System.out.println(isPalidrome(s1));
		
		String s3 ="";
		System.out.println(isPalidrome(s3));
	}
	
	public static boolean isPalidrome(String s) {
		
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

		int i=0;
		int j= s.length()-1;
		
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
