package PracticeCode;

/*
 * problem :704
 * Binary Search.
 */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,3,5,6,7};
		int target =7;
		System.out.println(search(nums, target));
	}

	public static int search(int nums [], int target) {
		
		int low =0;
		int n =nums.length;
		int high = n-1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			if(nums[mid] == target) {
				return mid ;
			}
			if(nums[mid]> target) {
				
				high= mid-1;
			}
			else {
				low =mid +1;
			}
		}
		return -1;
		
			}
}
