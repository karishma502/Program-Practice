package PracticeCode_f;

import java.util.HashSet;
/*
 * TimeComplexity - O(n)
 * SpaceComplexity - O(n)
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {1,2,3,1};
		System.out.println(containsDuplicate(nums1));

		int[] nums2 = {1,2,3,4};
		System.out.println(containsDuplicate(nums2));
	}

	public static boolean containsDuplicate(int[] nums) {

		HashSet<Integer> hs = new HashSet<>();

		for(int val : nums){
			if(hs.contains(val)){
				return true;
			}
			hs.add(val);
		}
		return false;
	}

}
