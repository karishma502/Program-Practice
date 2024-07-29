package PracticeCode_c;
/*
 * TC- O(n^2)
 * SC -O(1)
 */
public class CountNumberofTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] r1 = {2,5,3,4,1};
		System.out.println(numTeams(r1));


		int[] r2 = {2,1,3};
		System.out.println(numTeams(r2));

		int[] r3 = {1,2,3,4};
		System.out.println(numTeams(r3));
	}
	public static  int numTeams(int[] rating) {
		int total = 0;
		int n = rating.length;

		for (int i = 0; i < n; i++) {
			int rightLess = 0, rightMore = 0, leftLess = 0, leftMore = 0;

			// Count soldiers after i
			for (int j = i + 1; j < n; j++) {
				if (rating[j] < rating[i]) rightLess++;
				else if (rating[j] > rating[i]) rightMore++;
			}

			// Count soldiers before i
			for (int j = 0; j < i; j++) {
				if (rating[j] < rating[i]) leftLess++;
				else if (rating[j] > rating[i]) leftMore++;
			}

			// Calculate the total number of valid teams
			total += rightLess * leftMore + rightMore * leftLess;
		}

		return total;
	}


}
