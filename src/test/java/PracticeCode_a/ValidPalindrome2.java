package PracticeCode_a;

/*
 * Given a string s, return true if the s can be palindrome 
 * after deleting at most one character from it.
 */
public class ValidPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aba";
		System.out.println(validPalindrome(s1));

		String s2 = "abca";
		System.out.println(validPalindrome(s2));

		String s3 = "abc";
		System.out.println(validPalindrome(s3));
	}

	public static boolean validPalindrome(String s) {

		int left =0;
		int right =s.length()-1;

		while(left<=right){
			if(s.charAt(left)==s.charAt(right)){
				left++;
				right--;
			}
			// try delete 1 char 
			else{
				return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
			}
		}

		return true;

	}

	public static boolean isPalindrome(String s,int left,int right){
		while(left<=right){
			if(s.charAt(left)== s.charAt(right)){
				left++;
				right--;
			}
			else{
				return false;
			}
		}

		return true;
	}

}
