package PracticeCode_c;

/*
 * TimeComplexity : O(n)
 * SpaceComplexity:  O(1)
 */
public class PassThePillow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test case 1
		int n=4;
		int time=5;
		System.out.println(passThePillow(n,time));
		
		//Test case 2
		int n2=3;
		int time2=2;
		System.out.println(passThePillow(n2,time2));
	}
	
	public static int passThePillow(int n, int time) {
		
		int round = time/(n-1);
		int ans= 0;
		if(round %2 ==0) {
			ans = (1+time%(n-1));
		}else {
			ans =(n-time%(n-1));
		}
		return ans;
				
	}

}
