package PracticeCode_f;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {0,10,20,30};
		System.out.println(Arrays.toString(arrayRankTransform(arr1)));

		int[] arr2= {100,100,100};
		System.out.println(Arrays.toString(arrayRankTransform(arr2)));
	}

	public static int[] arrayRankTransform(int[] arr) {
		Map<Integer,Integer> valueToRank = new HashMap<>();
		int[] sortUniqueNumbers =Arrays.stream(arr).distinct().sorted().toArray();

		for(int i=0;i<sortUniqueNumbers.length;i
				++){
			valueToRank.put(sortUniqueNumbers[i],i+1);
		}

		for(int i=0;i<arr.length;i++){
			arr[i] =valueToRank.get(arr[i]);
		}

		return arr;
	}

}
