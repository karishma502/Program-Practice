package PracticeCode_e;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1 = {0,1,2,4,5,7};
		System.out.println(summaryRanges(n1));
		
		int[] n2 = {0,2,3,4,6,8,9};
		System.out.println(summaryRanges(n2));
	}

	public static List<String> summaryRanges(int[] nums) {
		int n = nums.length;
		List<String> ans = new ArrayList<>();
		if (n == 0) return ans;  // Edge case: empty array

		int start = 0;

		for (int end = 1; end <= n; end++) {
			if (end == n || nums[end] != nums[end - 1] + 1) {
				if (start == end - 1) {
					ans.add(String.valueOf(nums[start]));
				} else {
					ans.add(nums[start] + "->" + nums[end - 1]);
				}
				start = end;  // Update start to the new range
			}
		}

		return ans;
	}


}
