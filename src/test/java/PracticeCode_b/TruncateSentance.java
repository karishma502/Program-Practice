package PracticeCode_b;

/**
 * Desc : A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 *  Each of the words consists of only uppercase and lowercase English letters (no punctuation).
	For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words.
 Return s​​​​​​ after truncating it
 */
public class TruncateSentance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello how are you dear?";
		int k = 4;
		System.out.println(truncateSentence(s1, k));

		String s2 = "What is the solution to this problem";
		int k2 = 4;
		System.out.println(truncateSentence(s2, k2));

		String s3 = "Nothing happens without any reason...";
		int k3 = 5;
		System.out.println(truncateSentence(s3, k3));

	}

	public static String truncateSentence(String s, int k) {

		String [] arr = s.split(" ");
		StringBuilder sb = new StringBuilder("");

		for(int i=0;i<k;i++){
			sb.append(arr[i]);
			if(i+1 != k){
				sb.append(" ");
			}
		}

		return sb.toString();

	}

}
