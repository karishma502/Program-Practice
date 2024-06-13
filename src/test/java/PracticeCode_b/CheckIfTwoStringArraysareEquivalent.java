/**
 * 
 */
package PracticeCode_b;

/**
 * Desc : Given two string arrays word1 and word2, return true if the two arrays represent the same string,
 *  and false otherwise.
 *  A string is represented by an array if the array elements concatenated in order forms the string.
 *  
 * Approach: Two pointer approach.
 */
public class CheckIfTwoStringArraysareEquivalent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] w1= {"ab", "c"};
		String[] w2= {"a","bc"};
		System.out.println(arrayStringsAreEqual(w1, w2));

		String[] w3= {"a", "cb"};
		String[] w4= {"cb","d"};
		System.out.println(arrayStringsAreEqual(w3, w4));

		String[] w5= {"abc", "d", "defg"};
		String[] w6= {"abcddefg"};
		System.out.println(arrayStringsAreEqual(w5, w6));

	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		int ptr1 =0; // Pointer for word1
		int ptr2 =0; // Pointer for word2
		int idx1 =0;
		int idx2 =0;

		while(ptr1<word1.length && ptr2 <word2.length){
			char char1= word1[ptr1].charAt(idx1);
			char char2= word2[ptr2].charAt(idx2);


			if(char1 != char2){
				return false;
			}

			idx1++;
			idx2++;

			if(idx1 == word1[ptr1].length()){
				idx1 =0 ;  // move to next word in word1.
				ptr1++;
			}

			if(idx2 == word2[ptr2].length()){
				idx2 =0 ;  // move to next word in word2.
				ptr2++;
			}
		} 

		// Check if both pointers have reached the end of their respective arrays

		return ptr1 == word1.length && ptr2 == word2.length;


	}
}
