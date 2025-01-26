package PracticeCode_h;
import java.util.*;

public class MaximumInvitations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] fav = {2,2,1,2};
		System.out.println(maximumInvitations(fav));
	}

	public static int maximumInvitations(int[] favorite) {
		int n = favorite.length;
		int[] inDeg = new int[n];
		int[] chainLen = new int[n];
		boolean[] visited = new boolean[n];
		Queue<Integer> q = new LinkedList<>();

		// Count how many people favor each employee
		for (int f : favorite) inDeg[f]++;

		// Start with employees no one favorites (chain starters)
		for (int i = 0; i < n; i++) 
			if (inDeg[i] == 0) q.add(i);

		// Process chains to calculate max chain lengths
		while (!q.isEmpty()) {
			int u = q.poll();
			visited[u] = true;
			int v = favorite[u];
			chainLen[v] = Math.max(chainLen[v], chainLen[u] + 1);
			if (--inDeg[v] == 0) q.add(v);
		}

		int maxCycle = 0, pairChains = 0;

		// Detect cycles and calculate results
		for (int i = 0; i < n; i++) {
			if (visited[i]) continue;

			int cycleLen = 0, current = i;
			// Measure cycle length
			while (!visited[current]) {
				visited[current] = true;
				current = favorite[current];
				cycleLen++;
			}

			if (cycleLen == 2) // Mutual pair
				pairChains += 2 + chainLen[i] + chainLen[favorite[i]];
			else 
				maxCycle = Math.max(maxCycle, cycleLen);
		}

		return Math.max(maxCycle, pairChains);
	}

}
