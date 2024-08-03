package PracticeCode_d;

import java.util.Arrays;

public class MakeTwoArraysEqualbyReversingSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] target1= {1,2,3,4};
		int[] arr1= {2,4,1,3};
		System.out.println(canBeEqual(target1, arr1)); //true
		System.out.println(canBeEqual1(target1, arr1)); //true
		
		int[] target2= {7};
		int[] arr2= {7};
		System.out.println(canBeEqual(target2, arr2)); //false
		System.out.println(canBeEqual1(target2, arr2)); //false
		
		int[] target3= {3,7,9};
		int[] arr3= {3,7,11};
		System.out.println(canBeEqual(target3, arr3)); //false
		System.out.println(canBeEqual1(target3, arr3)); //false
		
	}
	/*
	 * TC - O(n log n)
	 * SC - O(n)
	 */
	public static boolean canBeEqual(int[] target, int[] arr) {
		Arrays.sort(target);
		Arrays.sort(arr);
		for(int i=0;i<target.length;i++){
			if(target[i] != arr[i]){
				return false;
			}
		}

		return true;
	}
	
	/*
	 * TC - O(n)
	 * SC -(1)
	 */

	public static boolean canBeEqual1(int[] target, int[] arr) {
		int[] elementCounts = new int[1001];

		// Increment the count for each element in the target array
		for (int v : target) {
			++elementCounts[v];
		}

		// Decrement the count for each element in the arr array
		for (int v : arr) {
			--elementCounts[v];
		}
		// Check if all counts are zero
		for (int count : elementCounts) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}

}
