package PracticeCode_a;

import java.util.Arrays;

/*
 * Problem : 283. Move Zeroes
 * Two pointer approach
 */
public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums1 = {0,1,3,0,12};
		PushZeroesToEnd(nums1);
		System.out.println(Arrays.toString(nums1));

		int [] nums2 = {0};
		PushZeroesToEnd(nums2);
		System.out.println(Arrays.toString(nums2));

		int [] nums3 = {1,3,0,12,0,1};
		PushZeroesToEnd(nums3);
		System.out.println(Arrays.toString(nums3));
	}

	public static void PushZeroesToEnd(int [] nums) {

		int k = 0;
		for(int i = 0; i<nums.length;i++) {
			if(nums[i] !=0) {
				int temp =nums[k];
				nums[k] =nums[i];
				nums[i] =temp;
				k++;
			}
		}

	}

}
