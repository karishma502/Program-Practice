package PracticeCode_e;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "III";
		System.out.println(romanToInt(s1));
		
		String s2= "LVIII";
		System.out.println(romanToInt(s2));
		
		String s3= "MCMXCIV";
		System.out.println(romanToInt(s3));
		
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> m = new HashMap<>();

		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);

		int ans = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
				ans -= m.get(s.charAt(i));
			} else {
				ans += m.get(s.charAt(i));
			}
		}

		return ans;
	}


}
