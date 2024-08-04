package PracticeCode_d;

import java.util.Arrays;

public class RangeSumofSortedSubarraySums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4};
		int n=4,left=1,right=5;
		System.out.println(rangeSum(nums, n, left, right));

		
	}
	    public static int rangeSum(int[] nums, int n, int left, int right) {
	        int [] arr = new int[n*(n+1)/2];
	        for(int i=0,k=0;i<n;++i){

	            int s =0;
	            for(int j=i;j<n;j++){
	                s += nums[j];
	                arr[k++] =s;
	            }
	        }
	        Arrays.sort(arr);
	        int ans =0;
	        final int mod = (int) 1e9 + 7;
	        for(int i = left -1; i<right;++i){
	            ans = (ans+arr[i])%mod;
	        }
	        return ans;
	    }
	

}
