package PracticeCode_b;
/*
 * Desc : You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.


 */
public class ScoreOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hello";
		System.out.println(scoreOfString(s1));


		String s2="KATE";
		System.out.println(scoreOfString(s2));
	}

	public static int scoreOfString(String s) {

		int ans =0;
		for(int i=0;i<s.length()-1;i++){
			ans+=Math.abs(s.charAt(i)-s.charAt(i+1));
		}
		return ans;
	}


}
