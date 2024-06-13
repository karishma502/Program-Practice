package Arrays;
/*
 * Description: You are given an integer array nums.
 *  You are initially positioned at the array's first index, 
 *  and each element in the array represents your maximum jump length at that position.
 *  Return true if you can reach the last index, or false otherwise.
 *  
 *  Time Complexity - O(n);
	Space Complexity -O(1)
 */
public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] n1 = {2,3,1,1,4};
		System.out.println(canJump(n1));

		int [] n2 = {3,2,1,0,4};
		System.out.println(canJump(n2));

	}
	public static boolean canJump(int[] nums) {

		//initially final position is last index
		int finalPosition = nums.length-1;

		//start with last index
		for(int i=nums.length-2;i>=0;i--){
			if(i+nums[i] >=finalPosition){
				finalPosition=i;
			}
		}
		// if we can jump first index then we can make jump possible.
		return finalPosition==0;



	}

}
