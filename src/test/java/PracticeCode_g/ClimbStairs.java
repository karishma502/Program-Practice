package PracticeCode_g;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;
		System.out.println(climbStairs(n));

		int n2 = 4;
		System.out.println(climbStairs(n2));
	}
	public static int climbStairs(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];        
	}

}
