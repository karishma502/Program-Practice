package PracticeCode_a;


/*
 * You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. 
If it is, return the index of the largest element, or return -1 otherwise.


 */
public class LargestNumAtLeastTwiceOthers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {3, 6, 1, 0};	
		System.out.println(dominantIndex(nums1));

		int[] nums2 = {1, 2, 3, 4};
		System.out.println(dominantIndex(nums2));


	}


	public static int dominantIndex(int[] nums) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int maxIndex = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] > max) {
				secondMax = max;
				max = nums[i];
				maxIndex = i;
			}
			else if (nums[i] > secondMax) {
				secondMax = nums[i];
			}
		}
		if (2 * secondMax > max) {
			return -1;
		}
		/*for (int i=0; i<nums.length; i++) {
	            if (nums[i] == max) {
	                continue;
	            }
	            else if (2 * nums[i] > max) {
	                return -1;
	            }
	        }*/
		return maxIndex;
	}


}
