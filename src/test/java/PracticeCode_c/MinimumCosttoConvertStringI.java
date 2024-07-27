package PracticeCode_c;

import java.util.Arrays;

public class MinimumCosttoConvertStringI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EX 1
		String s1="abcd";
		String t1="acbe";
		char[] original1 = {'a','b','c','c','e','d'};
		char[] changed1 = {'b','c','b','e','b','e'};
		int[] cost1 = {2,5,5,1,2,20};
		System.out.println(minimumCost(s1, t1, original1, changed1, cost1));
		
		// EX 2
		String s2="aaaa";
		String t2="bbbb";
		char[] original2 = {'a','c'};
		char[] changed2 = {'c','b'};
		int[] cost2 = {1,2};
		System.out.println(minimumCost(s2, t2, original2, changed2, cost2));
		
		// EX 3
		String s3="abcd";
		String t3="abce";
		char[] original3 = {'a'};
		char[] changed3 = {'e'};
		int[] cost3 = {10000};
		System.out.println(minimumCost(s3, t3, original3, changed3, cost3));
	}


	public static long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
		int[][] dis = new int[26][26];
		for (int i = 0; i < 26; i++) {
			Arrays.fill(dis[i], Integer.MAX_VALUE);
			dis[i][i] = 0;
		}
		for (int i = 0; i < cost.length; i++) {
			dis[original[i] - 'a'][changed[i] - 'a'] = Math.min(dis[original[i] - 'a'][changed[i] - 'a'], cost[i]);
		}
		for (int k = 0; k < 26; k++) {
			for (int i = 0; i < 26; i++)
				if (dis[i][k] < Integer.MAX_VALUE) {
					for (int j = 0; j < 26; j++) {
						if (dis[k][j] < Integer.MAX_VALUE) {
							dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
						}
					}
				}
		}
		long ans = 0L;
		for (int i = 0; i < source.length(); i++) {
			int c1 = source.charAt(i) - 'a';
			int c2 = target.charAt(i) - 'a';
			if (dis[c1][c2] == Integer.MAX_VALUE) {
				return -1L;
			} else {
				ans += (long)dis[c1][c2];
			}
		}
		return ans;

	}
}