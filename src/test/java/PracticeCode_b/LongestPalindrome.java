/**
 * 
 */
package PracticeCode_b;

import java.util.HashSet;

/**
 * Desc : Given a string s which consists of lowercase or uppercase letters,
 *  return the length of the longest palindrome that can be built with those letters.
 *  Letters are case sensitive, for example, "Aa" is not considered a palindrome.
 */
public class LongestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abccccdd";
		System.out.println(longestPalindrome(s1));
		
		String s2 = "a";
		System.out.println(longestPalindrome(s2));
	}
	public static int longestPalindrome(String s) {
		HashSet<Character> set = new HashSet<>();
		int len =0;

		for(char c : s.toCharArray()){
			if(set.contains(c)){
				// If the character is already in the set, remove it and increase the length by 2
				set.remove(c);
				len +=2;
			}
			else{
				// If the character is not in the set, add it to the set

				set.add(c);
			}
		}

		if(!set.isEmpty()){
			len +=1;
		}

		return len;
	}

}
