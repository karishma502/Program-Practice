package PracticeCode_a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a string paragraph and a string array of the banned words banned, 
 * return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned,
 *  and that the answer is unique.
The words in paragraph are case-insensitive and the answer should be returned in lowercase.
 */
public class MostCommonWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p1 ="Bob hit a ball, the hit BALL flew far after it was hit.";
		String [] b1 = {"hit"};

		System.out.println(mostCommonWord(p1, b1));


		String p2 ="a.";
		String [] b2 = {};

		System.out.println(mostCommonWord(p2, b2));
	}

	public static String mostCommonWord(String paragraph, String[] banned) {

		paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");
		String [] word = paragraph.split(" ");

		List bannedList = Arrays.asList(banned);
		HashMap<String,Integer> numOfWords = new HashMap<>();

		int maxNum =0;
		String maxString ="";

		for(String s : word){
			if(!s.equals("")){
				if(numOfWords.get(s)==null){
					numOfWords.put(s,1);
				}
				else{
					numOfWords.put(s,numOfWords.get(s)+1);
				}
			}
		}

		for(Map.Entry<String,Integer> set : numOfWords.entrySet())
		{
			int value = set.getValue();
			String key = set.getKey();
			if(value>maxNum && !bannedList.contains(key))
			{
				maxNum = value;
				maxString = key;
			}
		}

		return maxString;
	}

}
