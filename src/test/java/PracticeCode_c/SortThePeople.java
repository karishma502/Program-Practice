package PracticeCode_c;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
 * TC - O( n log n)
 * SC - O(n)
 */
public class SortThePeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Merry","Cherry","Carry"};
		int[] ht = {160,180,175};


		String[] sortedNames = sortPeople(names, ht);

		// Print the sorted names
		System.out.println("Sorted names by descending height:");
		for (String name : sortedNames) {
			System.out.println(name);
		}	
	}
	public static String[] sortPeople(String[] names, int[] heights) {

		Map<Integer,String>  map = new HashMap<>();

		for(int i =0;i<names.length;i++){

			map.put(heights[i],names[i]);
		}

		Arrays.sort(heights);

		String [] sortedArray = new String[names.length];
		int index = 0;
		for(int i=names.length-1; i>=0; i--){

			sortedArray[index] = map.get(heights[i]);
			index ++;
		}

		return sortedArray;
	}


}
