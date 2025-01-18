package PracticeCode_h;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MinCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = {{1,1,1,1},{2,2,2,2},{1,1,1,1},{2,2,2,2}};
		System.out.println(minCost(grid));
	}
	public static int minCost(int[][] grid) {
		int m=grid.length;
		int n=grid[0].length;

		int[][] minCost=new int[m][n];
		for(int i=0; i<m; i++){
			Arrays.fill(minCost[i], Integer.MAX_VALUE);
		}

		Deque<int[]> dque=new ArrayDeque<>();
		dque.offerFirst(new int[]{0,0});
		minCost[0][0]=0;

		int[][] direction={ {0,1}, {0,-1}, {1,0}, {-1,0} };

		while(!dque.isEmpty()){
			int[] arr=dque.pollFirst();
			int r=arr[0];
			int c=arr[1];

			//Visited adjacent cells
			for(int i=0; i<4; i++){
				int nr=r+direction[i][0];
				int nc=c+direction[i][1];
				int cost=(grid[r][c]!=(i+1))?1:0;

				if( nr>=0 && nr<m && nc>=0 && nc<n && minCost[r][c]+cost<minCost[nr][nc]){
					minCost[nr][nc]=minCost[r][c]+cost;

					if(cost==1){
						dque.offerLast(new int[]{nr,nc});
					}else{
						dque.offerFirst(new int[]{nr,nc});
					}                   
				}
			}
		}

		return minCost[m-1][n-1];
	}


}
