/**
 * 
 */
package PracticeCode_b;

/**
 * You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively.
 *  You are also given a positive integer k.
A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).

Return the total number of good pairs
 */
public class FindNumOfGoodPairs_I {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1 = {1,3,4};
		int[] n2 = {1,3,4};
		int k = 1;
		System.out.println(numberOfPairs(n1, n2, k));


		int[] n3 = {1,2,4,12};
		int[] n4 = {2,4};
		int k1 = 3;
		System.out.println(numberOfPairs(n3, n4, k1));



	}

	public static int numberOfPairs(int[] nums1, int[] nums2, int k) {

		int n = nums1.length;
		int m = nums2.length;
		int ct =0;
		for(int i =0;i<n;i++){
			for(int j=0; j<m ; j++){
				if((nums1[i] % (nums2[j]*k)) == 0) 
					ct++;
			}
		}
		return ct;

	}

}
