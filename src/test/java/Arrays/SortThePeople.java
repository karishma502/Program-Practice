package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] n1 = {"Mery" ,"John","Emma"};
		int [] h1 = {180,165,170};
		System.out.println(Arrays.toString(sortPeople(n1, h1)));

		String[] n2 = {"Karu","Bob","Bob"};
		int [] h2 = {155,150,170};
		System.out.println(Arrays.toString(sortPeople(n2, h2)));
	}

	public static String[] sortPeople(String[] names, int[] heights) {

		int k =0;;

		Map<Integer,String> map = new HashMap<>();
		for(int i =0; i<names.length;i++){
			map.put(heights[i],names[i]);
		}
		Arrays.sort(heights);
		for(int i=heights.length-1; i>=0; i--){
			names[k++] = map.get(heights[i]);
		}

		return names;

	}

}
