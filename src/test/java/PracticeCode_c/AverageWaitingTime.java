package PracticeCode_c;
/*
 * TC - O(n)
 * SC -O(1)
 */
public class AverageWaitingTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] cstmr = {{1,2},{2,5},{4,3}};
		System.out.println(averageWaitingTime(cstmr));

		int [][] cstmr2 = {{5,2},{5,4},{10,3},{20,1}};
		System.out.println(averageWaitingTime(cstmr2));
	}
	public static double averageWaitingTime(int[][] customers) {
		double sum = 0;
		for (int i = 0, finish = 0; i < customers.length; i++) {
			finish = Math.max(finish, customers[i][0]) + customers[i][1];
			sum += Math.max(0, finish - customers[i][0]);
		}
		return sum / customers.length;
	}

}
