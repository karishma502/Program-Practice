package PracticeCode_f;
/*
 * Time Complexity -O(n)
 * Space Complexity -O(n)
 */
public class FindKthBitinNthBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 =3;
		int k1=1;
		System.out.println(findKthBit(n1, k1));

		int n2 =4;
		int k2=11;
		System.out.println(findKthBit(n2, k2));
	}
	public static char findKthBit(int n, int k) {
		
		if (n == 1) return '0';

		int length = (1 << n) - 1;

		int mid = length / 2 + 1;

		if (k == mid) return '1';

		if (k < mid) return findKthBit(n - 1, k);

		return findKthBit(n - 1, length - k + 1) == '0' ? '1' : '0';
	}


}
