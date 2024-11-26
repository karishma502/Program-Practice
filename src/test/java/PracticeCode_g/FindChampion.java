package PracticeCode_g;

import java.util.Arrays;

public class FindChampion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =3;
		int [][] edges = {{0,1},{1,2}};
		System.out.println(findChampion(n, edges));
	}
	public static int findChampion(int n, int[][] edges) {
		boolean[] isUndefeated = new boolean[n];
		Arrays.fill(isUndefeated, true);

		for (int[] edge : edges) {
			int winner = edge[0];
			int loser = edge[1];
			isUndefeated[loser] = false;
		}

		int champion = -1;
		int championCount = 0;

		for (int team = 0; team < n; team++) {
			if (isUndefeated[team]) {
				champion = team;
				championCount++;
			}
		}

		return championCount == 1 ? champion : -1;
	}


}
