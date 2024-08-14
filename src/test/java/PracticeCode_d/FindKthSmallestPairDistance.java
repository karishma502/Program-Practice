package PracticeCode_d;

import java.util.Arrays;
/*
 * Time Complexity: O(nlogn+nlogW)
 * Space Complexity:O(1)
 */
public class FindKthSmallestPairDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1 = {1,3,1};
		int k1=1;
		System.out.println(smallestDistancePair(num1, k1));
		

		int[] num2 = {1,1,1};
		int k2=1;
		System.out.println(smallestDistancePair(num2, k2));
		

		int[] num3 = {1,6,1};
		int k3=3;
		System.out.println(smallestDistancePair(num3, k3));
	}


	public static int smallestDistancePair(int[] numbers, int k) {
		Arrays.sort(numbers);
		int minDistance = 0;
		int maxDistance = numbers[numbers.length - 1] - numbers[0];

		while (minDistance < maxDistance) {
			int midDistance = minDistance + (maxDistance - minDistance) / 2;
			int pairsCount = countPairsWithinDistance(numbers, midDistance);

			if (pairsCount < k) {
				minDistance = midDistance + 1;
			} else {
				maxDistance = midDistance;
			}
		}

		return minDistance;
	}

	private static int countPairsWithinDistance(int[] numbers, int targetDistance) {
		int count = 0;
		int left = 0;

		for (int right = 1; right < numbers.length; right++) {
			while (numbers[right] - numbers[left] > targetDistance) {
				left++;
			}
			count += right - left;
		}

		return count;
	}





}
