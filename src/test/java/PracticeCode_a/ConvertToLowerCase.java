package PracticeCode_a;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="Hello";
		System.out.println(toLowerCase(s1));
		
		String s2 ="HELLO";
		System.out.println(toLowerCase(s2));
	}
	public static String toLowerCase(String s) {
		int len = s.length();
		StringBuilder str = new StringBuilder();
		for(int i = 0; i<len; i++){
			int ascii = (int)s.charAt(i);
			if(ascii >= 65 && ascii <= 90){
				ascii += 32;
				char a = (char)ascii;
				str.append(a);
			}else{
				char a = (char)ascii;
				str.append(a);
			}
		}
		return str.toString();
	}

}
