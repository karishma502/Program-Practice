package PracticeCode;

import java.util.Arrays;

/*
 * Problem : 34
 * Binary Search
 * Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in non-decreasing order, 
 * find the starting and ending position of a given target value.
	If target is not found in the array, return [-1, -1].
 */
public class FindFirstnLastPositionOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(searchRange(nums, target)));

		int[] nums2 = {5, 7, 7, 8, 8, 10};
		int target2 = 6;
		System.out.println(Arrays.toString(searchRange(nums2, target2)));  

		int[] nums3 = {};
		int target3 = 0;
		System.out.println(Arrays.toString(searchRange(nums3, target3)));
	}
	public static int[] searchRange(int[] nums, int target) {
		int first = findLeft(nums,target); 
		int last = findRight(nums,target); 

		return new int []{first,last};


	}
	public static int findLeft(int [] nums, int target){
		int first =0;
		int last = nums.length-1;
		int idx = -1;

		while(first<=last){
			int mid =first + (last-first)/2;

			if(nums[mid] == target){
				idx =mid;
				last = mid -1;
			}

			else if(nums[mid] < target){
				first = mid + 1;
			}
			else{
				last = mid-1;
			}
		}

		return idx;

	}

	public static int findRight(int [] nums, int target){
		int first =0;
		int last = nums.length-1;
		int idx = -1;

		while(first<=last){
			int mid =first + (last-first)/2;

			if(nums[mid] == target){
				idx =mid;
				first = mid+1;
			}

			else if(nums[mid] < target){
				first = mid + 1;
			}else{
				last = mid-1;
			}
		}

		return idx;

	}

}
