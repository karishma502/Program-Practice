package PracticeCode_f;

import java.util.HashSet;
import java.util.Set;
/*
 * Time Complexity = O(n+m)
 * Space Complexity = O(1)
 */
public class JewelsandStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jewels1 ="aA";
		String stones1 ="aAAbbb";
		System.out.println(numJewelsInStones(jewels1, stones1));

		String jewels2 ="z";
		String stones2 ="ZZ";
		System.out.println(numJewelsInStones(jewels2, stones2));
	}

	public static int numJewelsInStones(String jewels, String stones) {
		int count=0;
		Set<Character> map=new HashSet<>();
		for(char i:jewels.toCharArray())
		{
			map.add(i);
		}
		for(char i:stones.toCharArray())
		{
			if(map.contains(i))
			{
				count++;
			}
		}
		return count;
	}

}
