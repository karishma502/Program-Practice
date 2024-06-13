package PracticeCode;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] ch1 = {'h','e','l','l','o'};
		reverseStr(ch1);
        System.out.println(Arrays.toString(ch1));
        
		char [] ch2 = {'I','N','D','I','A'};
		reverseStr(ch2);
		System.out.println(Arrays.toString(ch2));


	}
	
	public static void reverseStr(char [] ch) {
		
		int s =0;
		int len =ch.length-1;
		
		while(s<=len) {
			char temp = ch[s];
			ch[s] =ch[len];
			ch[len] =temp;
			s++;
			len--;
		}
		
	}

}
