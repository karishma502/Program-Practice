package PracticeCode_c;

import java.util.Arrays;
/*
 * TC- O(n log n)
 * SC- O(n)
 */
public class SortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {5,4,3,2,1};
		System.out.println(Arrays.toString(sortArray(nums)));
		

		int [] nums1 = {0,0,1,1,2,5};
		System.out.println(Arrays.toString(sortArray(nums1)));
	}

	public static int[] sortArray(int[] nums) {
		mergeSort(nums, 0, nums.length - 1);
		return nums;
	}

	private static void mergeSort(int[] array, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = low + (high - low) / 2;   //O(n log n)
		mergeSort(array, low, mid);
		mergeSort(array, mid + 1, high);
		merge(array, low, mid, high);
	}

	private static void merge(int[] array, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int[] leftPart = new int[n1]; //O(n)
		int[] rightPart = new int[n2]; //O(n)

		System.arraycopy(array, low, leftPart, 0, n1);
		System.arraycopy(array, mid + 1, rightPart, 0, n2);

		int p1 = 0, p2 = 0, writeInd = low;
		while (p1 < n1 && p2 < n2) {
			if (leftPart[p1] <= rightPart[p2]) {
				array[writeInd++] = leftPart[p1++];
			} else {
				array[writeInd++] = rightPart[p2++];
			}
		}

		while (p1 < n1) {
			array[writeInd++] = leftPart[p1++];
		}

		while (p2 < n2) {
			array[writeInd++] = rightPart[p2++];
		}
	}


}
