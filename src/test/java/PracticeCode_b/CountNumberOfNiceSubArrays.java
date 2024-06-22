/**
 * 
 */
package PracticeCode_b;

/**
 * Desc : Given an array of integers nums and an integer k.
 *  A continuous subarray is called nice if there are k odd numbers on it.
 *  Return the number of nice sub-arrays.
 */
public class CountNumberOfNiceSubArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] n1 = {1,1,2,1,1};
		int k=3;
		System.out.println(numberOfSubarrays(n1, k));

		int [] n2 = {2,4,6};
		int k2=1;
		System.out.println(numberOfSubarrays(n2, k2));

		int [] n3 = {2,2,2,1,2,2,1,2,2,2};
		int k3=2;
		System.out.println(numberOfSubarrays(n3, k3));
	}



	public static int numberOfSubarrays(int[] nums, int k) {
		
		return atmostK(nums,k) -atmostK(nums,k-1);

	}
	private static int atmostK(int[] nums,int k){
		int start = 0;
		int ans =0;
		int cnt = 0;

		for(int end =0;end<nums.length;end++){
			if(nums[end]%2!=0)
			{
				cnt++;
			}
			while(start<=end && cnt>k){
				if(nums[start++]%2!=0){
					cnt--;
				}
			}
			ans+= (end-start+1);

		}

		return ans;

	}


}
