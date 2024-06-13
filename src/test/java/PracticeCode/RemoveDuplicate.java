package PracticeCode;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		Problem 26: Remove duplicates from array : 
		Example 1:

			Input: nums = [1,1,2]
			Output: 2, nums = [1,2,_]
			Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
			It does not matter what you leave beyond the returned k (hence they are underscores).
			Example 2:

			Input: nums = [0,0,1,1,1,2,2,3,3,4]
			Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
			Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
			It does not matter what you leave beyond the returned k (hence they are underscores).
		
*/		
//		Code :
		
		
		int [] ar = {1,1,3,3,5,6};
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+ " ");
		}
		int k= removeDuplicate(ar);
		System.out.println("output : "+ k);
		
		for(int i=0;i<k;i++) {
			System.out.println(ar[i]+" ");
		}

	}

	public static int removeDuplicate(int [] ar) {
		
		int rd=0;
		
		for(int i=1;i<ar.length;i++) {
			
			if(ar[rd] !=ar[i]) {
				rd++;
				ar[rd]=ar[i];
			}
		}
		
		return rd+1;
		
	}
	
		
}
