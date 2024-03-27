package PracticeCode;

/*
 * Problem:345  Reverse Vowels of a String.
 * Binary Search.
 * 
*/

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello";
		System.out.println(reverseVowels(s1));
		
		String s2="LeetCode";
		System.out.println(reverseVowels(s2));
	}

	public static String reverseVowels(String s) {
		
		char arr[] = s.toCharArray();
		int start =0;
		int end =s.length()-1;
		String vowels ="aeiouAEIOU";
		
		while(start<end) {
			while(start<end) {
				char ch = arr[start];
				if(vowels.indexOf(ch)!=-1) {
					break;
				}
				start++;
			}
			while(start<end){
				char ch = arr[end];
				if(vowels.indexOf(ch)!=-1) {
					break;
				}
				end--;
			}
			if(start<end) {
				char temp = arr[start];
				arr[start]=arr[end];
				arr[end] =temp;
				
				start++;
				end--;
			}
		}
		return new String(arr);
		
	}
}
