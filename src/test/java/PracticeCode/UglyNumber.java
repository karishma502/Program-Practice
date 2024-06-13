package PracticeCode;

/*
 * Problem :263. Ugly Number
 */
public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		System.out.println(isUgly(n));


		int n2=1;
		System.out.println(isUgly(n2));


		int n3=14;
		System.out.println(isUgly(n3));


		int n5=15;
		System.out.println(isUgly(n5));
	}

	public static boolean isUgly(int n) {

		if(n<0){
			return false;
		}

		while(n!=1){

			if(n%2 ==0){
				n=n/2;
			}
			else if(n %3 ==0){
				n=n/3;
			}
			else if(n%5==0){
				n=n/5;
			}
			else{
				break;
			}
		}

		if(n==1){
			return true;
		}
		else{
			return false;
		}

	}

}
