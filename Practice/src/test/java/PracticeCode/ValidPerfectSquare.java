package PracticeCode;

/*
 * Problem : 367 Valid Perfect Square.
 * Binary Search
 */
public class ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 16;
		System.out.println(isvalidSqur(num1));


		int num2 = 15;
		System.out.println(isvalidSqur(num2));


		int num3 = 14;
		System.out.println(isvalidSqur(num3));
	}

	public static boolean isvalidSqur(int num) {
		long start =1;
		long end =num;

		while(start<=end) {
			long mid = start + (end-start)/2;
			if(mid*mid <num) {
				start = mid+1;
			}
			else if(mid*mid >num) {
				end = mid-1;
			}
			else {
				return true;
			}
		}

		return false;

	}

}
