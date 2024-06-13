package PracticeCode;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Problem :436. Find Right Interval
 * Binary Search
 */
public class FindRightInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] intervals1 = {{1, 2}};
		int[][] intervals2 = {{3, 4}, {2, 3}, {1, 2}};
		int[][] intervals3 = {{1, 4}, {2, 3}, {3, 4}};

		printArray(findRightInterval(intervals1));
		printArray(findRightInterval(intervals2));
		printArray(findRightInterval(intervals3)); 
	}

	public static int[] findRightInterval(int[][] intervals) {

		int n = intervals.length;
		int[] result = new int[n];
		Arrays.fill(result, -1);

		int[][] intervalsWithIndex = new int[n][3];
		for (int i = 0; i < n; i++) {
			intervalsWithIndex[i][0] = intervals[i][0]; 
			intervalsWithIndex[i][1] = intervals[i][1]; 
			intervalsWithIndex[i][2] = i;
		}

		Arrays.sort(intervalsWithIndex, Comparator.comparingInt(a -> a[0]));

		for (int i = 0; i < n; i++) {
			int end_i = intervals[i][1];
			int index = binarySearch(intervalsWithIndex, end_i);
			if (index < n) {
				result[i] = intervalsWithIndex[index][2]; 
			}
		}

		return result;


	}

	private static int binarySearch(int[][] intervalsWithIndex, int target) {
		int lo = 0, hi = intervalsWithIndex.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (intervalsWithIndex[mid][0] == target) return mid;
			else if (intervalsWithIndex[mid][0] < target) lo = mid + 1;
			else hi = mid - 1;
		}
		return lo;
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
