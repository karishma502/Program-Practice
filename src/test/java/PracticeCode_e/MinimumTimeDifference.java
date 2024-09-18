package PracticeCode_e;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	 List<String> timePoints = "23:59,"00:00";
		 System.out.println((findMinDifference(timePoints)));
	}
	public static int findMinDifference(List<String> timePoints) {

		int[] minutes = new int[timePoints.size()];
		for(int i=0;i<timePoints.size();i++){
			String time = timePoints.get(i);
			int h = Integer.parseInt(time.substring(0,2));
			int m = Integer.parseInt(time.substring(3));
			minutes[i] = h*60+m;
		}

		Arrays.sort(minutes);

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < minutes.length - 1; i++) {
			ans = Math.min(ans, minutes[i + 1] - minutes[i]);
		}


		return Math.min(
				ans,
				24 * 60 - minutes[minutes.length - 1] + minutes[0]
				);
	}

}
