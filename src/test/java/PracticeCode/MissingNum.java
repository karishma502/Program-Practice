package PracticeCode;
/*
 * Problem : 268. Missing Number 
 */
public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums1 = {0,1,3};
		System.out.println(missingNumber(nums1));
		
		int [] nums2 = {0,1};
		System.out.println(missingNumber(nums2));
		
		int [] nums3 = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums3));
	}

	public static int missingNumber(int[] nums) {

		int allXOR =0;

		//XOR all no. in range[0,n]
		for(int i=0; i<= nums.length;i++){
			allXOR = allXOR ^ i;
		}

		//XOR all num in given array...
		for(int num : nums){
			allXOR = allXOR^num;
		}

		//missing num...
		return allXOR;

	}

}
