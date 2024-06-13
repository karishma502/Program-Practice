package PracticeCode_a;

/*
 * Greatest Common Divisor of Strings
 * Time complexity: O(Math.max(L1,L2)
 * Space Complexity: O(Math.max(L1,L2)
 */
public class GreatestCommonDivisorOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="ABCABC";
		String str2="ABC";
		System.out.println(gcdOfStrings(str1, str2));


		String str3 ="ABABAB";
		String str4="ABAB";
		System.out.println(gcdOfStrings(str3, str4));


		String str5 ="LEET";
		String str6="CODE";
		System.out.println(gcdOfStrings(str5, str6));
	}

	public static String gcdOfStrings(String str1, String str2) {
		if(str2.length()>str1.length()){
			return gcdOfStrings(str2,str1);
		}
		if(str2.equals(str1)){
			return str1;
		}
		if(str1.startsWith(str2)){
			return gcdOfStrings(str1.substring(str2.length()),str2);

		}
		return "";

	}

}
