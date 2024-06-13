package PracticeCode_a;
/*
 * Single Num 
 *## XOR
 */
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num1 = {3,2,2};
		System.out.println(singleNum(num1));
		
		int [] num2 = {1};
		System.out.println(singleNum(num2));
	}

	public static int singleNum(int[] nums) {
		int XOR =0;
		for(int i=0;i<nums.length;i++) {
			XOR=XOR^nums[i];
		}

		return XOR;

	}

}
