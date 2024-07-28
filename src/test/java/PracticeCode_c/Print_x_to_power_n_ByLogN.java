package PracticeCode_c;
/*
 * Print x^n (stack height =log n)
 */
public class Print_x_to_power_n_ByLogN {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =2;
		int n=5;
		int ans =calPower(x, n);
		System.out.println(ans);
	}

	public static int calPower(int x,int n) {

		if(n==0) { //base case 1
			return 1;
		}

		if(x == 0) {
			return 0;
		}



		//if n is even 
		if(n %2 ==0) {

			return calPower(x, n/2) * calPower(x, n/2);

		}else { //if n is odd 
			return calPower(x, n/2) * calPower(x, n/2) * x;

		}
	}



}


