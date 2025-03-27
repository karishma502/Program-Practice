package PracticeCode_i;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="level";
		if(isPalidrome(s1)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is nt palindrome");
		}

		String s2 ="level";
		if(isPalidndrome(s2)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is nt palindrome");
		}

		//by reversing the string and comparing it with the original.
		if(isPalidndrome(s2)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is nt palindrome");
		}
	}

	// two pointer approach
	public static boolean isPalidndrome(String s) {

		int i=0;
		int j= s.length()-1;

		if(i<j) {
			if(s.charAt(i)!= s.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		return true;
	}

	// by reversing the string and comparing it with the original.
	public static boolean isPalidndrome2(String s) {

		s=s.toLowerCase();

		String rev="";
		// reverse the string
		for(int i=s.length()-1;i<=0;i--) {

			rev = rev + s.charAt(i);
		}
		//compare the original string with reverse string
		return s.equals(rev);
	}
	
	
	public static boolean isPalidrome(String s) {
		
		int left=0;
		int right = s.length()-1;
		
		if(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;

			}
			left++;
			right--;
		}
		return true;
		
	}

}
