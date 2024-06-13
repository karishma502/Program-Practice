package PracticeCode;

/*
 * Problem :1351. Count Negative Numbers in a Sorted Matrix
 Binary search
 Used (Brute Force) - O(m * n)
 */
public class CountNegativeNumbersInSortedMatix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid1 = {
				{4, 3, 2, -1},
				{3, 2, 1, -1},
				{1, 1, -1, -2},
				{-1, -1, -2, -3}
		};
		System.out.println(countNegatives(grid1));

		int[][] grid2 = {
				{3, 2},
				{1, 0}
		};

		System.out.println(countNegatives(grid2));
	}


	public static int countNegatives(int[][] grid) {

		int m =grid.length;
		int n= grid[0].length;
		int result =0;        
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {

				if(grid[i][j] < 0)
					result++;

			}
		}

		return result;


	}


}
