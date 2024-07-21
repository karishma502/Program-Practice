package PracticeCode_c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BuildaMatrixWithConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k1 = 3;
		int[][] row1 = {{1,2},{3,2}};
		int[][] col1 = {{2,1},{3,2}};

		int k2 = 3;
		int[][] row2 = {{1,2},{2,3},{3,1},{2,3}};
		int[][] col2 = {{2,1}};

		// Restore the matrix
		int[][] restoredMatrix1 = buildMatrix(k1, row1, col1);
		int[][] restoredMatrix2= buildMatrix(k2, row2, col2);

		System.out.println("Restored matrix 1");
		printMatrix(restoredMatrix1);

		System.out.println("Restored Matrix 2");
		printMatrix(restoredMatrix2);
	}

	public static int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
		List<Integer> order1 = GenerateTopologicalSort(rowConditions, k);
		List<Integer> order2 = GenerateTopologicalSort(colConditions, k);
		if (order1.size() < k || order2.size() < k) return new int[0][0];
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < k; i++) m.put(order2.get(i), i);
		int[][] ans = new int[k][k];
		for (int i = 0; i < k; i++)
			ans[i][m.get(order1.get(i))] = order1.get(i);
		return ans;
	}
	private static List<Integer> GenerateTopologicalSort(int[][] A, int k) {
		int[] deg = new int[k];
		List<Integer> order = new ArrayList<>();
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < k; i++) graph.add(new ArrayList<>());
		Queue<Integer> q = new LinkedList<>();
		for (int[] c: A) {
			graph.get(c[0] - 1).add(c[1] - 1);
			deg[c[1] - 1]++;
		}
		for (int i = 0; i < k; i++)
			if (deg[i] == 0) q.add(i);
		while(!q.isEmpty()) {
			int x = q.poll();
			order.add(x + 1);
			for (int y: graph.get(x)) 
				if (--deg[y] == 0) q.add(y);
		}
		return order;
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}

}
