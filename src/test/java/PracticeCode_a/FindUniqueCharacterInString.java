package PracticeCode_a;
/*
 * Problem: 387. First Unique Character in a String
 */
public class FindUniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="LeetCode";
		System.out.println(FindUnique(s1));

		String s2 ="loveleetcode";
		System.out.println(FindUnique(s2));

		String s3 ="aabb";
		System.out.println(FindUnique(s3));
	}

	public static int FindUnique(String s) {

		int len = s.length();
		for(int i=0; i<len;i++) {
			char ch = s.charAt(i);
			if(s.indexOf(ch)==s.lastIndexOf(ch)) {
				return i;
			}
		}
		return -1;
	}

}
