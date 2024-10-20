package PracticeCode_f;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {2,7,11,15};
		int target1= 9;
		System.out.println(Arrays.toString(twosum(nums1, target1)));

		int [] nums2 = {3,2,4};
		int target2= 6;
		System.out.println(Arrays.toString(twosum(nums2, target2)));
	}
	public static int[] twosum(int[] nums, int target) {

		Map<Integer,Integer> map= new HashMap<>();
		for(int i =0;i<nums.length;i++){
			map.put(nums[i],i);
		}

		for(int i = 0;i<nums.length;i++){
			int y = target - nums[i];
			if (map.containsKey(y) && map.get(y) != i) {
				return new int[] {i, map.get(y)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
