package PracticeCode_b;

public class DiamondPattern {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;

		//upper pattern
		//outer loop
		for(int i=1; i<=n; i++) {

			//space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}

			//print star 1st half
			for(int j=1;j<=i;j++) {
				System.out.print("*");

			}
			//print star 2nd half

			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}



			System.out.println();
		}

		// lower patter
		//outer loop
		for(int i=n; i>=1; i--) {

			//space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}

			//print star 1st half
			for(int j=1;j<=i;j++) {
				System.out.print("*");

			}
			//print star 2nd half

			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}

			System.out.println();
		}


	}



}
