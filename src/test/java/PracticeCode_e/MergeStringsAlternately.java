package PracticeCode_e;

/*
 * TC -O(n)
 * SC -O(n)
 */
public class MergeStringsAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String w1 ="abc";
		String w2 ="pqr";
		System.out.println(mergeAlternately(w1, w2));
		
		String w3 ="ab";
		String w4 ="pqrs";
		System.out.println(mergeAlternately(w3, w4));
		
		String w5 ="abcd";
		String w6 ="pq";
		System.out.println(mergeAlternately(w5, w6));
	}
	public static String mergeAlternately(String word1, String word2) {

		StringBuilder result = new StringBuilder();
		int i=0;

		while(i<word1.length() || i<word2.length()){
			if(i<word1.length()){
				result.append(word1.charAt(i));
			}
			if(i<word2.length()){
				result.append(word2.charAt(i));
			}
			i++;
		}
		return result.toString();
	}

}
