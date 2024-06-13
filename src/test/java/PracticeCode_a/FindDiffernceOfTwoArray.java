package PracticeCode_a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 2215. Find the Difference of Two Arrays
 */
public class FindDiffernceOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {1, 2, 3};
		int[] nums2 = {2, 4, 6};

		System.out.println(findDifference(nums1, nums2));


		int[] nums3 = {1, 2, 3, 3};
		int[] nums4 = {1, 1, 2, 2};

		System.out.println(findDifference(nums3, nums4));
	}

	public static List<List<Integer>> findDifference(int [] num1, int [] num2){

		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();

		for (int i : num1) {
			s1.add(i);
		}

		for (int j : num2) {
			s2.add(j);
		}

		// Find distinct in nums1 which are not in nums2
		List<Integer> diff1 = new ArrayList<>();
		for (int num : s1) {
			if (!s2.contains(num)) {
				diff1.add(num);
			}
		}

		// Find distinct  in nums2 which are not in nums1
		List<Integer> diff2 = new ArrayList<>();
		for (int num : s2) {
			if (!s1.contains(num)) {
				diff2.add(num);
			}
		}

		List<List<Integer>> r = new ArrayList<>();
		r.add(diff1);
		r.add(diff2);

		return r;

	}

}
