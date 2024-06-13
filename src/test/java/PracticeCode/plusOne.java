package PracticeCode;

import java.util.Arrays;

public class plusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Problem : 66
		 * 
		 * Increment the large integer by one and return the resulting array of digits.

		 */
		
		int[] digits= {1,2,3};
		System.out.println(Arrays.toString(plus(digits)));
		
		int[] digits1= {9};
		System.out.println(Arrays.toString(plus(digits1)));
		
		int[] digits2= {4,3,2,1};
		System.out.println(Arrays.toString(plus(digits2)));

	}
	
	public static int[] plus(int[] digits) {
		
		int n= digits.length;
		for(int i=n-1; i>=0; i--) {
            // digits is less than 9
			if(digits[i]<9) {
				digits[i] ++;
				return digits;
				
			}
            // if digit is equal to 9, assign it to 0
			digits[i]=0;
			
		}
        //if it has only single 9 digit,then create a new array and assign 1 to 1st num.

		int[] newNum = new int[n+1];
		newNum[0]=1;
		return newNum;
		
		
	}

}
