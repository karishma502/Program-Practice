package PracticeCode_c;

public class CountTotalPathInMazetoMove_00_to_nm {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int n=3, m=3;
			int totalcnt =countPath(0, 0, n, m);
			System.out.println(totalcnt);
		}
		
		public static int countPath(int i,int j, int n,int m) {
			if(i==n || j==m) {
				return 0;
			}
			if(i == n-1 && j==m-1) {
				return 1;
			}
			//move downwords
			int downPath = countPath(i+1, j, n, m);
			
			//move right
			int rightPath = countPath(i, j+1, n, m);
			
			return downPath + rightPath;
		}

	
}
