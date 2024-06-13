package PracticeCode_a;

public class CalculateDigitSumOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "11111222223";
		int k1 = 3;
		System.out.println(digitSum(s1, k1));

		String s2 = "00000000";
		int k2 = 3;
		System.out.println(digitSum(s2, k2));
	}

	public static String digitSum(String s, int k) {

		int i=0;
		while(s.length()>k){
			i =0;
			String ans ="";
			while(i<s.length()){
				if(i+k>s.length()){
					ans += find(s.substring(i,s.length()));
				}
				else{
					ans += find(s.substring(i,i+k));
				}

				i+=k;
			}
			s=ans;

		}
		return s;

	}


	public static String find(String s){
		int i=0;
		int sum =0;
		while(i<s.length()){
			sum += s.charAt(i)-'0';
			i++;
		}

		return String.valueOf(sum);
	}


}
