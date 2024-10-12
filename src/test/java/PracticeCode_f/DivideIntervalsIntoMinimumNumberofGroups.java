package PracticeCode_f;

import java.util.Arrays;

public class DivideIntervalsIntoMinimumNumberofGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] intervals1 = {{5,10},{6,8},{1,5},{2,3},{1,10}};
		System.out.println(minGroups(intervals1));
		
		int [][] intervals2 = {{1,3},{5,6},{8,10},{11,13}};
		System.out.println(minGroups(intervals2));
	}
	public static int minGroups(int[][] intervals) {
		int n = intervals.length;
		int[] start_times = new int[n];
		int[] end_times = new int[n];

		// Extract start and end times
		for (int i = 0; i < n; i++) {
			start_times[i] = intervals[i][0];
			end_times[i] = intervals[i][1];
		}

		// Sort start and end times
		Arrays.sort(start_times);
		Arrays.sort(end_times);

		int end_ptr = 0, group_count = 0;

		// Traverse through the start times
		for (int start : start_times) {
			if (start > end_times[end_ptr]) {
				end_ptr++;
			} else {
				group_count++;
			}
		}

		return group_count;
	}

}
