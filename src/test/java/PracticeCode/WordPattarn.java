package PracticeCode;

import java.util.HashMap;

/*
 * 290. Word Pattern
 */
public class WordPattarn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String p1 = "abba";
		String s1 ="dog cat cat dog";
		System.out.println(wordPattern(p1, s1));

		String p2 = "abba";
		String s2 ="dog cat cat fish";
		System.out.println(wordPattern(p2, s2));

		String p3 = "aaaa";
		String s3 ="dog cat cat dog";
		System.out.println(wordPattern(p3, s3));
	}

	public static  boolean wordPattern(String pattern, String s) {

		String [] arr = s.split(" ");
		if(pattern.length() != arr.length){
			return false;
		}

		HashMap<Character,String> hm = new HashMap<Character,String>();

		for(int i=0; i< pattern.length(); i++){
			char ch = pattern.charAt(i);

			boolean containsKey= hm.containsKey(ch);
			if(hm.containsValue(arr[i]) && !containsKey){
				return false;
			}
			if(containsKey && ! hm.get(ch).equals(arr[i])){
				return false;
			}
			else{
				hm.put(ch, arr[i]);
			}

		}
		return true;

	}

}
