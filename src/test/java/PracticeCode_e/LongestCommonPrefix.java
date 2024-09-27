package PracticeCode_e;

import java.util.Arrays;
/*
 * Time - O(O(n log n+m))
 * Space - O(1)
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
		
		String[] strs1 = {"dog","racecar","car"};
		System.out.println(longestCommonPrefix(strs1));
	}

	public static String longestCommonPrefix(String[] strs) {

		if(strs == null || strs.length==0){
			return "";
		}

		Arrays.sort(strs);

		String first = strs[0];
		String last = strs[strs.length-1];
		int minLength = Math.min(first.length(),last.length());
		int i = 0;
		// Find the common prefix between the first and last strings
		while(i < minLength && first.charAt(i) == last.charAt(i)){
			i++;
		}
		// Check if there's no common prefix
		if(i==0){
			return "";
		}

		return first.substring(0,i);

	}


}
