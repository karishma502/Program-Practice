package PracticeCode;

/*
 * 	Problem :374
 * Guess Number Higher or Lower
 * Algorithm = Binary Search
 */
public class GuessNumberHigherOrLower {

	private static int pick;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		pick=6;
		System.out.println(guessNumber(n));

		int n1 = 1;
		pick=1;
		System.out.println(guessNumber(n1));

		int n2 = 2;
		pick=1;
		System.out.println(guessNumber(n2));
	}


	public static int guessNumber(int n) {
		int l =1 ;
		int r =n;

		while(l<=r) {
			int mid = l+ (r-l)/2;

			int guessNum = guess(mid);
			if(guessNum ==0) {
				return mid;
			}
			else if(guessNum == 1) {
				l = mid+1;
			}
			else {
				r = mid-1;
			}
		}
		return -1;

	}

	private static int guess(int num) {
		if (num < pick) {
			return 1; // Your guess is lower than the number picked
		} else if (num > pick) {
			return -1; // Your guess is higher than the number picked
		} else {
			return 0; // Your guess is equal to the number picked
		}    	
	}

}
