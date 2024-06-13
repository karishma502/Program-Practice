package PracticeCode;

public class RemoveDuplicateArray {
	
	/*
	 * Problem : remove duplicate array and write it 2 times if it is duplicate.
	 * 
	 * Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).



//Code :


	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,1,1,3,3,5};
		int k = removeduplicate(nums);
		System.out.println("output:"+ k + " num=[");
		
		for(int i=0;i<k;i++) {
			System.out.println(nums[i]);
			if(i<k-1) {
			System.out.println(", ");
			}
		}
		System.out.println("]");
	}

	public static int removeduplicate(int [] nums) {
        if (nums.length <= 2)
        	return nums.length;

		int index= 2;
		for(int i=2;i<nums.length;i++) {
			
			if(nums[i]!= nums[index-1] || nums[i]!=nums[index-2] ) {
				
				nums[index]=nums[i];
				index ++;

			}
		}
		return index;
	}
}


