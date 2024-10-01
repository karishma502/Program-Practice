package PracticeCode_f;

import java.util.ArrayList;
import java.util.List;

public class CheckIfArrayPairsAreDivisiblebyk
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1 = {1,2,3,4,5,10,6,7,8,9};
		int k1=5;
		System.out.println(canArrange(n1, k1));

		int[] n2 = {1,2,3,4,5,6};
		int k2 =7;
		System.out.println(canArrange(n2, k2));

		int[] n3 = {1,2,3,4,5,6};
		int k3 =10;
		System.out.println(canArrange(n3, k3));

	}

	public static boolean canArrange(int[] arr, int k) {
		int [] freq = new int[k];
		for(int num: arr){
			int rem = num % k;
			if(rem < 0){
				rem = rem + k;
			}
			freq[rem]++;
		}
		if(freq[0] % 2 != 0){
			return false;
		}
		for(int i = 1;i <= k / 2;i++){
			if(freq[i] != freq[k-i]) {
				return false;
			}
		}
		return true;
	}



}
