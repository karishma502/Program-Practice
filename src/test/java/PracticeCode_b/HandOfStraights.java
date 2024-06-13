package PracticeCode_b;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Desc : Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize,
 *  and consists of groupSize consecutive cards.
 *  Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize,
 *   return true if she can rearrange the cards, or false otherwise.
 */
public class HandOfStraights {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] hand1 = {1,2,3,6,2,3,4,7,8};
		int grpSze =3;
		System.out.println(isNStraightHand(hand1, grpSze));

		int [] hand2 = {1,2,3,4,5};
		int grpSze2 =4;
		System.out.println(isNStraightHand(hand2, grpSze2));

	}
	public static boolean isNStraightHand(int[] hand, int groupSize) {

		if(hand.length % groupSize !=0){
			return false;
		}

		Map<Integer,Integer> cnt = new HashMap<>();
		for(int card : hand){
			cnt.put(card,cnt.getOrDefault(card,0)+1);
		}

		int[] sortedKeys = new int[cnt.size()];
		int indx = 0;
		for (int key : cnt.keySet()) {
			sortedKeys[indx++] =key;
		}
		Arrays.sort(sortedKeys);

		for(int key : sortedKeys){
			if(cnt.get(key)>0){
				int startCnt = cnt.get(key);

				for(int i = key; i<key + groupSize;i++){
					if(cnt.getOrDefault(i,0)<startCnt){
						return false;
					}

					cnt.put(i,cnt.get(i)-startCnt);
				}
			}
		}

		return true;
	}

}
