package Arrays;

import java.util.ArrayList;
import java.util.List;
/*
 * Description: You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.
 */
public class FindWordsContainingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] w1 = {"abc","bac","ccc"};
		char x1 ='a';
		System.out.println(findWordsContaining(w1, x1));
		
		String [] w2 = {"abc","bcd","aaaa","cbc"};
		char x2 ='a';
		System.out.println(findWordsContaining(w2, x2));
		
		String [] w3 = {"abc","bcd","aaaa","cbc"};
		char x3 =' ';
		System.out.println(findWordsContaining(w3, x3));

	}

	public static List<Integer> findWordsContaining(String[] words, char x) {

		List<Integer> r = new ArrayList<>();
		for(int i=0;i<words.length;i++){
			for(int j = 0; j < words[i].length(); j++){
				if(words[i].charAt(j) == x){
					r.add(i); 
					break; 
				}

			}

		}

		return r;

	}

}
