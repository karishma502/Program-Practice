package PracticeCode_i;

import java.util.ArrayList;

public class CountNumofVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Iterative method 

		String s = "GeeksForGeeks";
		s = s.toLowerCase();
		int n = s.length()-1;
		int count =0;


		for(int i=0; i<n;i++) {

			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'
					|| s.charAt(i)=='o' || s.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);


		// call arrayList method
		vowelscount(s);
	}


	//Using ArrayList and contains() method

	public static void  vowelscount(String s) {

		s=s.toLowerCase();
		String vow ="aeiou";
		int count =0;

		ArrayList<Character> v = new ArrayList<Character>();

		for(int i=0;i<vow.length();i++) {

			v.add(vow.charAt(i));
		}

		for(int i=0;i<s.length();i++) {
			if(v.contains(s.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);

	}

}
