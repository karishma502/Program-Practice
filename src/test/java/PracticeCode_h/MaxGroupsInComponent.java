package PracticeCode_h;
import java.util.*;

public class MaxGroupsInComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 6;
		int[][] edges1 = {{1,2},{1,4},{1,5},{2,6},{2,3},{4,6}};
		System.out.println("Test Case 1 Output: " + magnificentSets(n1, edges1));  // Expected: 3
	}


	private static int[] color; // Tracks bipartition colors (0/1)
	private static List<List<Integer>> adj; // Adjacency list
	private static int n; // Number of nodes

	// DFS to check bipartiteness and collect component nodes
	private static boolean isBipartite(int node, int c, List<Integer> component) {
		color[node] = c;
		component.add(node);
		for (int nbr : adj.get(node)) {
			if (color[nbr] == c) return false; // Odd cycle detected
			if (color[nbr] == -1 && !isBipartite(nbr, 1 - c, component)) 
				return false;
		}
		return true;
	}

	// BFS to compute max depth (groups) for a component
	private static int maxGroupsInComponent(List<Integer> component) {
		int maxDepth = 0;
		for (int start : component) {
			int[] depth = new int[n];
			Arrays.fill(depth, -1);
			Queue<Integer> q = new LinkedList<>();
			q.add(start);
			depth[start] = 0;
			while (!q.isEmpty()) {
				int node = q.poll();
				for (int nbr : adj.get(node)) {
					if (depth[nbr] == -1) {
						depth[nbr] = depth[node] + 1;
						maxDepth = Math.max(maxDepth, depth[nbr]);
						q.add(nbr);
					}
				}
			}
		}
		return maxDepth + 1; // Depth to groups conversion
	}

	public static int magnificentSets(int n, int[][] edges) {
		color = new int[n];
		Arrays.fill(color, -1);
		adj = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
		}

		// Build adjacency list
		for (int[] edge : edges) {
			int u = edge[0] - 1, v = edge[1] - 1;
			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		List<List<Integer>> components = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (color[i] == -1) {
				List<Integer> component = new ArrayList<>();
				if (!isBipartite(i, 0, component)) 
					return -1; // Non-bipartite component
				components.add(component);
			}
		}

		int total = 0;
		for (List<Integer> comp : components) {
			total += maxGroupsInComponent(comp);
		}

		return total;
	}




}
