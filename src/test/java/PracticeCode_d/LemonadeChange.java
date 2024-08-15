package PracticeCode_d;
/*
 * Time complexity: O(N)
 * Space complexity:O(1)
 */
public class LemonadeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] bills1 = {5,5,5,10,20};
		System.out.println(lemonadeChange(bills1));
		
		int [] bills2 = {5,5,10,10,20};
		System.out.println(lemonadeChange(bills2));
		
	}

	public static boolean lemonadeChange(int[] bills) {

		int five_dollars=0;
		int ten_dollars =0;
		for (int x : bills) {
			if (x == 5) {
				five_dollars++;
			} else if (x == 10) {
				if (five_dollars > 0) {
					five_dollars--;
					ten_dollars++;
				} else {
					return false;
				}
			} else {
				if (five_dollars > 0 && ten_dollars > 0) {
					five_dollars--;
					ten_dollars--;
				} else if (five_dollars > 2) {
					five_dollars -= 3;
				} else {
					return false;
				}
			}
		}

		return true;
	}

}
