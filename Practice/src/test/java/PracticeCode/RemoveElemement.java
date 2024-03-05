package PracticeCode;

import java.util.Arrays;

public class RemoveElemement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Leet Code Problem: 27
		 Example 1:
		
		Input: nums = [3,2,2,3], val = 3
		Output: 2, nums = [2,2,_,_]
		Explanation: Your function should return k = 2, with the first two elements of nums being 2.
		It does not matter what you leave beyond the returned k (hence they are underscores)
	*/	
		
		//CODE : 
		
		int[] nums = {1,3,4,6,7,7,8,9};
		int val = 7;
		
				
		int k =removeEle(nums, val);
        System.out.println("Modified Array : " + Arrays.toString(Arrays.copyOf(nums, k)));
		System.out.println("Length of array is/Expected Output : "+ k);



	}
	
	public static int removeEle(int[] nums, int val) {
		
		int len = nums.length;
		int index =0;
		
		for(int i=0;i<len;i++) {
			
			if(nums[i] != val) {
				
				nums[index]=nums[i];
				index++;
			}
		}
		return index;
	}
	


}
