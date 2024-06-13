package Arrays;

import java.util.Arrays;
/*
 * Description : Given an integer array nums of length n, you want to create an array ans of length
 *  2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
 */
public class ConcatenationofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] n1 = {1,2,3};
		System.out.println(Arrays.toString(getConcatenation(n1)));

		int [] n2 = {1,3,2,1};
		System.out.println(Arrays.toString(getConcatenation(n2)));
	}

	public static int[] getConcatenation(int[] nums) {

		int n = nums.length;
		int [] ans = new int [2 * n];
		for(int i =0; i<n;i++){
			ans[i] =nums[i];
			ans[i+n] = nums[i];
		}

		return ans;

	}

}
