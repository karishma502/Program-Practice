package PracticeCode_f;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1= {3,2,3};
		System.out.println(majorityElement(n1));
		
		int[] n2= {2,2,1,1,1,2,2};
		System.out.println(majorityElement(n2));
	}
	public static int majorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		n = n / 2;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > n) {
				return entry.getKey();
			}
		}

		return 0;
	}

}
