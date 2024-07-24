package PracticeCode_c;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * TC -O(n * log n)
 * SC -O(n)
 */

public class SorttheJumbledNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mapping1 = {8,9,4,0,2,1,3,5,7,6};
		int[] nums1 = {991,338,38};
		System.out.println(Arrays.toString(sortJumbled(mapping1, nums1)));

		int[] mapping2 = {0,1,2,3,4,5,6,7,8,9};
		int[] nums2 = {789,456,123};
		System.out.println(Arrays.toString(sortJumbled(mapping2, nums2)));

	}
	public static int[] sortJumbled(int[] mapping, int[] nums) {

		Map<Integer,Integer> numberMapping = new HashMap<>();

		for(int num : nums){
			if(!numberMapping.containsKey(num)){
				numberMapping.put(num, translateInteger(num,mapping));
			}  
		}   

		Integer[] numsBoxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);

		Arrays.sort(numsBoxed, (a,b) -> Integer.compare(numberMapping.get(a),numberMapping.get(b)));
		for(int i=0; i< nums.length;i++){

			nums[i] = numsBoxed[i];
		}
		return nums;

	}

	private static int translateInteger(int num, int[] mapping){

		if(num==0){
			return mapping[0];
		}

		int res =0;
		int currMult = 1;
		while(num > 0){
			int digit = num %10;
			num /=10;
			res += mapping[digit] * currMult;
			currMult *= 10;
		}

		return res;
	}

}
