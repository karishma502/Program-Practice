package PracticeCode;

public class SumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Leet code Problem 1: 
		Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

				You may assume that each input would have exactly one solution, and you may not use the same element twice.

				You can return the answer in any order.

				 

				Example 1:

				Input: nums = [2,7,11,15], target = 9
				Output: [0,1]
				Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		
		//Code
	*/	
		SumTwo sum= new SumTwo();
		int [] nums= {2,3,4,6};
		int target=10;
		int[] results=sum.twosum(nums, target);
		System.out.println("Output: ["+results[0]+","+results[1]+"]");
		
		
				
	}
	
	public int[] twosum(int[] nums,int target) {
		
		int n= nums.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n;j++) {
				if(nums[i]+nums[j]==target) {
					return new int [] {i,j};
				}
			}
		}
		return new int[] {};
		
	}

}
