package PracticeCode;
/*
 * 292. Nim Game
 * Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false.
 */
public class NimGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 =4;
		System.out.println(canWinNim(n1));

		int n2 =1;
		System.out.println(canWinNim(n2));

		int n3 =2;
		System.out.println(canWinNim(n3));

		int n4 =3;
		System.out.println(canWinNim(n4));

		int n5 =8;
		System.out.println(canWinNim(n5));

	}

	public static boolean canWinNim(int n) {

		// only multiple of 4 will be having chances to lose.
		if(n%4==0) {
			return false;
		}
		return true;
	}

}
