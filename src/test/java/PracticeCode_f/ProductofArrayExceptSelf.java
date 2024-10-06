package PracticeCode_f;

import java.util.Arrays;

/*
 * Time Complexity - O(n)
 * Space Complexity -O(n)
 */
public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []  num1 = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(num1)));

		int[] nums2 = {-1,1,0,-3,3};
		System.out.println(Arrays.toString(productExceptSelf(nums2)));
	}

	public static int[] productExceptSelf(int[] nums) {
		int [] output = new int[nums.length];
		for(int i = 0; i< nums.length;i++){
			output[i] = 1;
		}

		int left = 1;
		for(int i=0; i< nums.length;i++){
			output[i] *= left;
			left *=nums[i];
		}

		int right =1;
		for(int i = nums.length -1; i>=0; i--){
			output[i] *= right;
			right *= nums[i];
		}

		return output;
	}


}
