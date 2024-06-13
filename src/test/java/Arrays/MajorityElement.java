package Arrays;

import java.util.Arrays;
/*
 * Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
 * time complexity of this approach is O(n log n) 
 */
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []n1 = {3,2,3};
		System.out.println(majorityElement(n1));
		
		int []n2 = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(n2));
	}

	public static int majorityElement(int[] nums) {

		Arrays.sort(nums);
		int n = nums.length;
		return nums[n/2];

	}

}
