package PracticeCode_i;

import java.util.HashMap;
import java.util.Map;

public class CountOccournceOfCharInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Karru";
		toFindOccurnce(s);
	}
	
	
	public static void toFindOccurnce(String s) {
		
		//Map<Integer,String> map = new HashMap<Integer,String>();
		
		int [] charCount = new int[256];
		
		for(char ch : s.toCharArray()) {
			charCount[ch]++;
		}
		
		for(int i=0;i<charCount.length;i++) {
			if(charCount[i]>0) {
				System.out.println((char)i + ":" +charCount[i]);
			}
		}
	}


}
