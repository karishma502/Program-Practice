package Arrays;

/*
 * Description: Given an array of integers nums, return the number of good pairs.
	A pair (i, j) is called good if nums[i] == nums[j] and i < j.
	
	Time Complexity - O(n);
	Space Complexity -O(1)
 */
public class NumberOfGoodPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] n1 = {1,2,3,1,1,3};
		System.out.println((numIdenticalPairs(n1)));
		
		int [] n2 = {1,1,1,1};
		System.out.println((numIdenticalPairs(n2)));
		
		int [] n3 = {1,2,3};
		System.out.println((numIdenticalPairs(n3)));
	}

	public static  int numIdenticalPairs(int[] nums) {

		int [] count = new int[102]; // frequency of each num.

		for(int num : nums){
			count[num]++;

		}
		int totalCount =0;

		// calculate total num of pair possible using nC2
		for(int i:count){
			totalCount +=((i)*(i-1))/2; 
		}

		return totalCount;


	}

}
