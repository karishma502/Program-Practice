package PracticeCode_d;

public class RegionsCutBySlashes {


	public static class Solution {

	    // Making the DSU class static
	     class DSU {
	        int[] parent;

	        public DSU(int n) {
	            parent = new int[n];
	            for (int i = 0; i < n; i++) {
	                parent[i] = i;
	            }
	        }

	        public int find(int x) {
	            if (parent[x] != x) {
	                parent[x] = find(parent[x]);
	            }
	            return parent[x];
	        }

	        public void union(int x, int y) {
	            int rootX = find(x);
	            int rootY = find(y);
	            if (rootX != rootY) {
	                parent[rootX] = rootY;
	            }
	        }
	    }

	    public int regionsBySlashes(String[] grid) {
	        int n = grid.length;
	        DSU dsu = new DSU(4 * n * n);

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                int root = 4 * (i * n + j);
	                char val = grid[i].charAt(j);

	                if (val == '/') {
	                    dsu.union(root + 0, root + 1);
	                    dsu.union(root + 2, root + 3);
	                } else if (val == '\\') {
	                    dsu.union(root + 0, root + 3);
	                    dsu.union(root + 1, root + 2);
	                } else {
	                    dsu.union(root + 0, root + 1);
	                    dsu.union(root + 1, root + 2);
	                    dsu.union(root + 2, root + 3);
	                }

	                // Union with the right cell
	                if (j + 1 < n) {
	                    dsu.union(root + 1, root + 4 + 2);
	                }

	                // Union with the bottom cell
	                if (i + 1 < n) {
	                    dsu.union(root + 2, root + 4 * n + 0);
	                }
	            }
	        }

	        int regions = 0;
	        for (int i = 0; i < 4 * n * n; i++) {
	            if (dsu.find(i) == i) {
	                regions++;
	            }
	        }

	        return regions;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        String[] grid1 = {" /", "/ "};
	        System.out.println("Test Case 1: " + solution.regionsBySlashes(grid1)); // Output: 2

	        String[] grid2 = {" /", "  "};
	        System.out.println("Test Case 2: " + solution.regionsBySlashes(grid2)); // Output: 1

	        String[] grid3 = {"/\\", "\\/"};
	        System.out.println("Test Case 3: " + solution.regionsBySlashes(grid3)); // Output: 5

	        // Additional test cases
	        String[] grid4 = {"//", "/ "};
	        System.out.println("Test Case 4: " + solution.regionsBySlashes(grid4)); // Output: 3

	        String[] grid5 = {" /\\", "/\\ "};
	        System.out.println("Test Case 5: " + solution.regionsBySlashes(grid5)); // Output: 4
	    }
	}

	



}
