package PracticeCode;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Problem : 67
		 * 
		 * Given two binary strings a and b, return their sum as a binary string.

 

		Example 1:

			Input: a = "11", b = "1"
			Output: "100"
		Example 2:

			Input: a = "1010", b = "1011"
			Output: "10101"
			
			
		 */
		
		//code
		
		String a = "11";
		String b = "1";
		
		System.out.println(addBinary(a, b));
		
		String c = "1010";
		String d = "1011";

		System.out.println(addBinary(c, d));

	}
	

	  public static String addBinary(String a, String b) 
	  {
	    StringBuilder s = new StringBuilder();
	    int carry = 0;
	    int i = a.length() - 1;
	    int j = b.length() - 1;

	    while (i >= 0 || j >= 0 || carry == 1) 
	    {
	      if(i >= 0)
	        carry += a.charAt(i--) - '0';
	      if(j >= 0)
	        carry += b.charAt(j--) - '0';
	      s.append(carry % 2);
	      carry =carry/2;
	    }
	    return s.reverse().toString();
	  }
}


