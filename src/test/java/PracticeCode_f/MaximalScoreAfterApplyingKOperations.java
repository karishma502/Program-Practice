package PracticeCode_f;

import java.util.PriorityQueue;
/*
 * Time complexity :- O(n Log n)
 */
public class MaximalScoreAfterApplyingKOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {10,10,10,10,10};
		int k1 = 5;
		System.out.println(maxKelements(nums1, k1));

		int[] nums2 = {1,10,3,3,3};
		int k2 = 3;
		System.out.println(maxKelements(nums2, k2));
	}
	public static long maxKelements(int[] nums, int k) {
		PriorityQueue<Integer>pq = new PriorityQueue<>((a, b)->b-a);
		for(int x : nums)
			pq.offer(x);
		long score = 0; 
		while(!pq.isEmpty() && k>0)
		{
			score +=pq.peek();
			int x = (int)Math.ceil(pq.poll()/3.0);
			pq.add(x);
			k--;
		}
		return score;
	}


}
