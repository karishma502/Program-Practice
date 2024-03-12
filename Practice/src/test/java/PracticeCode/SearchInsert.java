package PracticeCode;

public class SearchInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Problem : 35
		 * 
		 *  return the index if the target is found. If not, return the index where it would be if it were inserted in order.
		 *  
		 *  
		 */

		int [] nums1 = {1,3,5,6};
		int target1 = 5;
		System.out.println(srchInsert(nums1, target1));
		
		int [] nums2 = {1,3,5,6};
		int target2 = 2;
		System.out.println(srchInsert(nums2, target2));
		
		int [] nums3 = {1,3,5,6};
		int target3 = 7;
		System.out.println(srchInsert(nums3, target3));
	}
	
	public static int srchInsert(int[] nums, int target) {
		
		//using binary search to find solution.
		
		int l = 0;  //low value
		int h = nums.length-1;   // high value
		
		while(l<=h) {
			int mid =  l + (h-l)/2;   //mid of array.
			
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] >target) {
				
				h = mid -1;
			}else {
				l = mid +1;
			}
			
		}
		
		return l;
		
	}

}
