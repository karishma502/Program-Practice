package PracticeCode_b;
/*
 * Time Complexity -= O(sqrt(n)
 * Space Complexity = O(1)
 */
public class SumOfSquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=5;
		System.out.println(judgeSquareSum(c));
		
		int c1=3;
		System.out.println(judgeSquareSum(c1));

	}

	public static boolean judgeSquareSum(int c) {
		int i = 0 ;
		int j = (int) Math.sqrt(c);

		while(i <= j){
			long sum = (long) i*i + (long) j*j;

			if(sum == c){
				return true;
			}
			else if(sum > c){
				j--;
			}
			else{
				i++;
			}
		}
		return false;

	}

}
