package PracticeCode_e;

public class LongestSubarrayWithMaximumBitwiseAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1 = {1,2,3,3,2,2};
		System.out.println(longestSubarray(n1));
		
		int[] n2 = {1,2,3,4};
		System.out.println(longestSubarray(n2));
	}
	public static int longestSubarray(int[] nums) {

		int maxValue =0;
		int streak = 0;
		int result =0;

		for(int num : nums){
			if(num > maxValue){
				maxValue =num;
				streak=0;
				result=0;
			}

			if(maxValue == num){
				streak ++;
			}else{
				streak = 0;
			}

			result = Math.max(result,streak);
		}

		return result;
	}


}
