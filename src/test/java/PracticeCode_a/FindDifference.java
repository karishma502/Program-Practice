package PracticeCode_a;
/*
 * Find Difference in String.
 * You are given two strings s and t.

	String t is generated by random shuffling string s and then add one more letter at a random position.

	Return the letter that was added to 
 */
public class FindDifference {

	public static void main(String[] args) {

		String s1 ="abc";
		String t1="abcd";
		System.out.println(findTheDifference(s1, t1));

		String s2 ="";
		String t2="A";
		System.out.println(findTheDifference(s2, t2));

	}
	public static char findTheDifference(String s, String t) {

		int i,sum1=0,sum2=0;

		for(i=0;i<s.length();i++){
			sum1 =sum1 + s.charAt(i);
		}
		for(i=0;i<t.length();i++){
			sum2=sum2 + t.charAt(i);
		}
		return (char)(sum2-sum1);

	}
}
