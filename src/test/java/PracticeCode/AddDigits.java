package PracticeCode;

/*
 * Problem 258 : Add Digits -
 */
public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 =38;
		System.out.println(add(num1));

		int num2 =0;
		System.out.println(add(num2));

		int num3 =11;
		System.out.println(add(num3));

		int num4 =9;
		System.out.println(add(num4));

		int num5 =383;
		System.out.println(add(num5));
	}

	public static int add(int num) {

		if(num == 0) {
			return 0;
		}
		else if(num %9 ==0) {
			return 9;
		}
		else {
			return num % 9;
		}

	}
}
