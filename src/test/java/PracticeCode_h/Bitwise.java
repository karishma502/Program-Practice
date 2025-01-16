package PracticeCode_h;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1= {2,1,3};
		int[] n2= {10,2,5,0};
		System.out.println(xorAllNums(n1, n2));
	}
	public static int xorAllNums(int[] nums1, int[] nums2) {
		int c1 = nums1.length;
		int c2 = nums2.length;
		int x1 = 0, x2 = 0;

		if (c1 % 2 != 0) {
			for (int num : nums2) {
				x2 ^= num;
			}
		}
		if (c2 % 2 != 0) {
			for (int num : nums1) {
				x1 ^= num;
			}
		}
		return x1 ^ x2;
	}

}