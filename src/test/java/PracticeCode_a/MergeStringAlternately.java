package PracticeCode_a;
/*
 * 1768. Merge Strings Alternately
 */
public class MergeStringAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 ="abc";
		String word2 ="pqr";
		System.out.println(mergeAlternately(word1, word2));

		String word3 ="ab";
		String word4 ="pqrs";
		System.out.println(mergeAlternately(word3, word4));
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
