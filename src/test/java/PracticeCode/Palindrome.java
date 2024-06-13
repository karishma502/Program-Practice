package PracticeCode;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Leet Code Problem : 9
		 */
		
		Palindrome p = new Palindrome();
		int x= 121;
		System.out.println(p.palidrome(x));
		
		

	}

	public boolean palidrome(int x) {
		
		if(x<0) {
			return false;
		}
		
		long reversed=0;
		long temp=x;
		
		while(temp !=0) {
			int digit =(int)(temp %10);
			reversed=reversed*10+digit;
			temp=temp/10;
		}
		
		
		return (reversed==x);
		
		
	}
}
