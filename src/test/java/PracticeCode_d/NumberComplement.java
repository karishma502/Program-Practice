package PracticeCode_d;
/*
 * TC - O(1)
 * SC - O(1)
 */
public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 5;
		System.out.println(findComplement(n1));
		

		int n2 = 1;
		System.out.println(findComplement(n2));
	}
	
    public static int findComplement(int num) {
        
        if(num == 0) return 1;
        int bitLength = Integer.toBinaryString(num).length();

        int mask = (1 << bitLength) - 1;
        return num ^ mask;

    }

}
