package PracticeCode_f;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ransomNote ="aa";
		String magazine ="aab";
		System.out.println(canConstruct(ransomNote, magazine));
	}
	public static boolean canConstruct(String ransomNote, String magazine) {

		Map<Character,Integer> map= new HashMap<>();
		for(int i=0;i<magazine.length();i++){
			char ch = magazine.charAt(i); 
			// If the character is not present in the HashMap, add it with count 1
			if(!map.containsKey(ch)){
				map.put(ch,1);
			}else{
				map.put(ch,map.get(ch)+1);
			}
		}
		// Iterate through the characters in the ransom note
		for(int i=0;i<ransomNote.length();i++){
			char ch = ransomNote.charAt(i);
			if(map.containsKey(ch) && map.get(ch)>0){
				map.put(ch,map.get(ch)-1);
			}else{
				return false;
			}

		}

		return true;
	}


}
