package PracticeCode_c;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * Time Complexity : O(n long n + m long m)
 * Space Complexity : O(1)
 */
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1 = {1,2,2,1};
		int[] n2 = {2,2};
		System.out.println(Arrays.toString(intersect(n1, n2)));

		int[] m1 = {4,9,5};
		int[] m2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersect(m1, m2)));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		int[] Array=new int[1001];
		ArrayList<Integer> arl=new ArrayList<>();
		for(int i=0; i<nums1.length; i++){
			Array[nums1[i]]++;
		}
		for(int i=0; i<nums2.length; i++){
			if(Array[nums2[i]]>0) {
				arl.add(nums2[i]);
				Array[nums2[i]]--;
			}
		}
		int[] ans_array=new int[arl.size()];
		int x=0;
		for(int i:arl){
			ans_array[x++]=i;
		}
		return ans_array;
	}


}
