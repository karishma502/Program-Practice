package PracticeCode;

/*
 * Problems : 217. Contains Duplicate
 */
public class ContainsDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums1= {1,2,4,1};
		System.out.println(containsDuplicate(nums1));

		int [] nums2= {1,2,3,4};
		System.out.println(containsDuplicate(nums2));

		int [] nums3= {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums3));
	}

	public static boolean containsDuplicate(int[] nums) {
		int n = nums.length;

		for(int i=0; i<n-1;i++) {    		
			for(int j=i+1; j<n; j++) {
				if(nums[i]==nums[j]) {
					return true;
				}

			}
		}
		return false;
	}

}
