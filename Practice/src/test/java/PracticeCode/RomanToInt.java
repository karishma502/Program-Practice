package PracticeCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	
	
// Convert Roman to int value.
//	Leet Code problem: 13

	public int romantoint(String s) {

		Map<Character,Integer> m = new HashMap<Character, Integer>();
		int sum=0;

		m.put('I',1);
		m.put('V',5);
		m.put('X',10);
		m.put('L',50);
		m.put('C',100);
		m.put('D',500);
		m.put('M',1000);
		s=s.replace("IV","IIII");
		s=s.replace("IX","VIIII");
		s=s.replace("XL","XXXX");
		s=s.replace("XC","LXXXX");
		s=s.replace("CD","CCCC");
		s=s.replace("CM","DCCCC");
		for(int i=0;i<s.length();i++){
			sum = sum + (m.get(s.charAt(i)));
		}
		return sum;
	}
	
	public static void main(String args[]) {
		RomanToInt roman=new RomanToInt();
		System.out.println(roman.romantoint("IX"));
		System.out.println(roman.romantoint("XL"));
		System.out.println(roman.romantoint("CD"));


		
	}
}

