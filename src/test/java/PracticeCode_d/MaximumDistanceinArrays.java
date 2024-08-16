package PracticeCode_d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumDistanceinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<List<Integer>> arrays = new ArrayList<>();
	        arrays.add(Arrays.asList(1, 2, 3));
	        arrays.add(Arrays.asList(4, 5));
	        arrays.add(Arrays.asList(1, 2, 3));
	        
	        int result = maxDistance(arrays);
	        System.out.println("maximum distance: "+ result);
	        
			  List<List<Integer>> arrays1 = new ArrayList<>();
		        arrays1.add(Arrays.asList(1));
		        arrays1.add(Arrays.asList(1));
		        
		        int result1 = maxDistance(arrays1);
		        System.out.println("maximum distance: "+ result1);
	}
	public static int maxDistance(List<List<Integer>> arrays) {
		int smallest = arrays.get(0).get(0);
		int biggest = arrays.get(0).get(arrays.get(0).size() - 1);
		int maxDistance = 0;

		for (int i = 1; i < arrays.size(); i++) {
			maxDistance = Math.max(maxDistance, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - smallest));
			maxDistance = Math.max(maxDistance, Math.abs(biggest - arrays.get(i).get(0)));
			smallest = Math.min(smallest, arrays.get(i).get(0));
			biggest = Math.max(biggest, arrays.get(i).get(arrays.get(i).size() - 1));
		}

		return maxDistance;
	}

}
