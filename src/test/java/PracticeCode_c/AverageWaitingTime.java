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
		long busyUptill =0, n= customers.length, waitingTime = 0;

		for(int i=0; i<n;i++){
			long arrival= customers[i][0], time = customers[i][1];

			waitingTime += Math.max(arrival,busyUptill) + time - arrival;
			busyUptill = Math.max(arrival ,busyUptill) +time;
		}

		return (waitingTime *1.0)/n ;
	}

}
