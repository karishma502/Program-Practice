package Arrays;

import java.util.Arrays;
/*
 * You are given an m x n matrix grid consisting of positive integers.
Perform the following operation until grid becomes empty:
Delete the element with the greatest value from each row.
If multiple such elements exist, delete any of them.
Add the maximum of deleted elements to the answer.
 */
public class DeleteGreatesValueInEachRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] grid1 = {{1,2,4},{3,3,1}};
		System.out.println(deleteGreatestValue(grid1));

		int [][] grid2 = {{10}};
		System.out.println(deleteGreatestValue(grid2));
	}

	public static  int deleteGreatestValue(int[][] grid) {

		int r = 0;
		for(int[] row : grid){
			Arrays.sort(row);
		}

		for(int i=grid[0].length-1;i>=0;--i){
			int max=1;
			for(int[] row : grid){
				max= Math.max(row[i],max);
			}

			r += max;
		}

		return r;
	}

}
