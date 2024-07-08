package PracticeCode_c;
/*
 * Time Complexity - O(n)
 * Space Complexity -O(1)
 */
public class FindtheWinneroftheCircularGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TC-1
		
		int n1 =5;
		int k1=2;
		System.out.println(findTheWinner(n1, k1));
		
		//TC-2
		
		int n2= 6;
		int k2= 3;
		System.out.println(findTheWinner(n2, k2));

	}
	
	public static int findTheWinner(int n,int k) {
		int ans = solve(n,k)+1;
		
		return ans;
		
	}
	
	public static int solve(int n,int k) {
		
		if(n==1) {
			return 0;
		}
		
		return (solve(n-1,k)+k)%n;
	}

}
