package PracticeCode_a;
/*
 * Description : Given a 0-indexed string word and a character ch,
 *  reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
 *  If the character ch does not exist in word, do nothing.
 */
public class ReversePrefixOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String w1 = "abcdefd";
		char c1 = 'd';
		System.out.println(reversePrefix(w1, c1));

		String w2 = "xyxzxe";
		char c2 = 'z';
		System.out.println(reversePrefix(w2, c2));

		String w3 = "abcd";
		char c3 = 'z';
		System.out.println(reversePrefix(w3, c3));
	}
	public static String reversePrefix(String word, char ch) {

		int index = word.indexOf(ch);
		if(index == -1){
			return word;
		}

		StringBuilder sb = new StringBuilder( word.substring(0,index+1)).reverse();

		if(index<word.length()){
			sb.append(word.substring(index+1));
		}
		return sb.toString();

	}
}
