package PracticeCode_c;

import java.util.Arrays;
/*
 * Time Complexity : O(n long n)
 * space Complexity : O(1)
 */
public class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1 = {5,3,2,4};
		System.out.println(minDifference(n1));
		
		int[] n2 = {1,5,0,10,14};
		System.out.println(minDifference(n2));
		
		int[] n3 = {3,100,20};
		System.out.println(minDifference(n3));
	}

	public static int minDifference(int[] nums) {
		if(nums.length<=4){
			return 0;
		}
		Arrays.sort(nums);

		int ans = nums[nums.length - 1] - nums[0];
		for(int i = 0; i <= 3; i++) {
			ans = Math.min(ans, nums[nums.length - (3 - i) - 1] - nums[i]);
		}
		return ans;

	}

}
