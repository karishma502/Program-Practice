package PracticeCode_a;

import java.util.ArrayList;
import java.util.List;

/*
 * 1431. Kids With the Greatest Number of Candies
 * 
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
 *  they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
 */
public class KidsWithExtraCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] c1 = {2,4,5,6,6};
		int ec1 =3;
		System.out.println(KidsWithCandies(c1, ec1));

		int [] c2 = {1,1,5,2,3};
		int ec2 =2;
		System.out.println(KidsWithCandies(c2, ec2));

		int [] c3 = {12,1,12};
		int ec3 =3;
		System.out.println(KidsWithCandies(c3, ec3));

	}

	public static List<Boolean> KidsWithCandies(int[] candies,int extraCandies){

		int max =-1;
		for(int i : candies){
			if(i > max) {
				max = i;
			}
		}

		List<Boolean> res = new ArrayList<Boolean>();
		for(int i : candies) {
			if(i + extraCandies >= max) {
				res.add(true);
			}
			else {
				res.add(false);
			}
		}

		return res;

	}

}
