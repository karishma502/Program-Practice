package PracticeCode_e;

import java.util.Arrays;
/*
 * Time Complexity - O(m+n)
 * Space Complexity -O(1)
 */
public class FindMissingObservations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] rolls = {3,2,4,3};
		int mean =4;
		int n=2;
		System.out.println(Arrays.toString(missingRolls(rolls, mean, n)));


		int[] rolls1 = {1,5,6};
		int mean1 =3;
		int n1=6;
		System.out.println(Arrays.toString(missingRolls(rolls1, mean1, n1)));


		int[] rolls2 = {1,2,3,4};
		int mean2 =6;
		int n2=4;
		System.out.println(Arrays.toString(missingRolls(rolls2, mean2, n2)));
	}
	public static int[] missingRolls(int[] rolls, int mean, int n) {
		int m= rolls.length;
		int sum = mean *(m+n);
		for(int i=0;i<m;i++){
			sum -=rolls[i];
		}        
		if(sum<n || sum>6*n){
			return new int[0];
		}

		int avg =sum/n;
		int rem =sum%n;
		int res[] = new int[n];
		for(int i=0;i<n;i++){
			res[i] =avg;
			if(rem>0){
				res[i]++;
				rem--;
			}
		}

		return res;
	}

}
