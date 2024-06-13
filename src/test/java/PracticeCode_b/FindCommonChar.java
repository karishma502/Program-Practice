/**
 * 
 */
package PracticeCode_b;

import java.util.ArrayList;
import java.util.List;

/**
 *  Desc: Given a string array words, return an array of all characters 
 *  that show up in all strings within the words (including duplicates). 
 *  You may return the answer in any order.
 */
public class FindCommonChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] words1 = {"bella","label","roller"};
		System.out.println(commonChars(words1));

		String [] words2 = {"cool","lock","cook"};
		System.out.println(commonChars(words2));
	}
	public static List<String> commonChars(String[] words) {
		int [] cntChar = count(words[0]);

		for(int i=1; i<words.length;i++){
			cntChar = intersection(cntChar,count(words[i]));
		}

		List<String> arr = new ArrayList<>();
		for(int i=0; i<26;i++){
			if(cntChar[i] !=0){
				char ch = (char) ('a' + i);
				String s = String.valueOf(ch);
				while(cntChar[i] >0){
					arr.add(s);
					cntChar[i] --;
				}
			}
		}
		return arr;

	}

	private static  int[] count(String str){
		int [] a = new int[26];
		for(char c : str.toCharArray()){
			a[c - 'a']++;
		}

		return a;
	}

	private static int[] intersection(int[] a, int[] b) {
		int[] t = new int[26];
		for (int i = 0; i < 26; i++) {
			t[i] = Math.min(a[i], b[i]);
		}
		return t;
	}
}
