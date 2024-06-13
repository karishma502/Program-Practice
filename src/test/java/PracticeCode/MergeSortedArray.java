package PracticeCode;

import java.util.Arrays;

/*
 * Problem : 88
 * You are given two integer arrays nums1 and nums2,
 *  sorted in non-decreasing order, and two integers m and n, representing
 *   the number of elements in nums1 and nums2 respectively.
 */

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ex:1
		int [] nums1 = {1,2,3,0,0,0};
		int m=3;
		int [] nums2 = {2,3,5};
		int n =3;
		merge(nums1, m, nums2, n);
        System.out.print("Output: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        
        //EX: 2
        
		int [] nums3 = {1};
		int p=1;
		int [] nums4 = {};
		int k =0;
		merge(nums3, p, nums4, k);
        System.out.print("Output: ");
        for (int num : nums3) {
            System.out.print(num + " ");
        }
        
       // Ex: 3
		int [] nums5 = {0};
		int r=0;
		int [] nums6 = {1};
		int s =1;
		merge(nums5, r, nums6, s);
        System.out.print("Output: ");
        for (int num : nums5) {
            System.out.print(num + " ");
        }
		
        	
		
	}

	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		 for(int i =m; i<nums1.length;i++) {
			 for(int j=0 ; j<n ;j++) {
				 nums1[i] =nums2[j];
				 i++;
			 }
		 }
		 
		 Arrays.sort(nums1);
	 }
}
