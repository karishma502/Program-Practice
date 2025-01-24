package PracticeCode_h;

import java.util.ArrayList;
import java.util.List;

public class EventualSafeNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
		System.out.println(eventualSafeNodes(graph));
	}
	public static List<Integer> eventualSafeNodes(int[][] graph) {
		int n = graph.length;
		int[] state = new int[n]; // 0: unvisited, 1: visiting, 2: safe
		List<Integer> safe = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (dfs(graph, i, state)) {
				safe.add(i);
			}
		}

		return safe;
	}

	private static boolean dfs(int[][] graph, int node, int[] state) {
		if (state[node] > 0) return state[node] == 2; // Already safe

		state[node] = 1; // Mark as visiting

		for (int next : graph[node]) {
			if (state[next] == 1 || !dfs(graph, next, state)) {
				return false; // Cycle detected
			}
		}

		state[node] = 2; // Mark as safe
		return true;
	}


}
