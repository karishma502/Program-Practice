package PracticeCode;

/*
 * Problem :1539 
 * Binary Search
 * o(n)
 * o(1)
 */
public class Kth_Missing_Positive_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {2, 3, 4, 7, 11};
		int k1 = 5;
		System.out.println(findKthPositive(arr1, k1)); 

		int[] arr2 = {1, 2, 3, 4};
		int k2 = 2;
		System.out.println(findKthPositive(arr2, k2)); 
	}

	public static int findKthPositive(int[] arr, int k) {

		int left= 0;
		int right = arr.length;

		while(left< right){
			int mid= left +(right -left)/2;
			if(arr[mid]-mid-1<k){
				left = mid+1;
			}
			else{
				right =mid;
			}
		}
		return left+k;
	}
}
