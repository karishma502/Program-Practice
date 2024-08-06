package PracticeCode_d;

import java.util.HashMap;
/*
 * TC -O(n)
 * SC-O(n)
 */
public class KthDistinctStringinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"d","b","c","b","c","a"};
		int k=2;
		System.out.println(kthDistinct(arr, k));
		
		String[] arr2 = {"aaa","aa","a"};
		int k2=2;
		System.out.println(kthDistinct(arr2, k2));
		
		String[] arr3 = {"a","b","a"};
		int k3=2;
		System.out.println(kthDistinct(arr3, k3));
	}
	public static String kthDistinct(String[] arr, int k) {

		HashMap<String,Boolean> map = new HashMap<>();
		int count =0;
		for(int i =0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],false);
			} else{
				map.put(arr[i],true);
			}          
		}

		for(String item : arr){
			if(map.get(item)==true){
				count++;
				if(count ==k){
					return item;
				}
			}
		}
		return "";
	}

}
