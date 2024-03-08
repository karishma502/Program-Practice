package PracticeCode;

public class FindIndexOfFrstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Problem : 28
		 * 
		 * Find length of first occurences in string
		 * 
		 * Example 1:

			Input: haystack = "sadbutsad", needle = "sad"
			Output: 0
			Explanation: "sad" occurs at index 0 and 6.
			The first occurrence is at index 0, so we return 0.
	
		Example 2:

			Input: haystack = "leetcode", needle = "leeto"
			Output: -1
			Explanation: "leeto" did not occur in "leetcode", so we return -1.
 
		 *
		 */
		System.out.println(str("sadbutsad", "sad"));
		System.out.println(str("leetcode", "leeto"));

		
	}
	
	public static int str(String haystack, String needle) {
		
		for(int i=0; i<haystack.length()-needle.length();i++) {
			if(haystack.charAt(i)==needle.charAt(0)) {
				if(haystack.substring(i,needle.length()+i).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
		
	}
	

}
