package PracticeCode_b;

public class InvertedRoatedHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =4;

		//outer loop - rows
		for(int i=1;i<=n;i++) {

			// inner loop - space

			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}

			// inner loop - start print 

			for(int j=1;j<=i;j++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}



}
