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
        String[] names1 = {"Mary", "John", "Emma"};
        int[] heights1 = {180, 165, 170};
        
        String[] sortedNames1 = sortPeople(names1, heights1);
        System.out.println(Arrays.toString(sortedNames1));
        
        String[] names2 = {"Alice", "Bob", "Bob"};
        int[] heights2 = {155, 185, 150};
        
        String[] sortedNames2 = sortPeople(names2, heights2);
        System.out.println(Arrays.toString(sortedNames2));
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
