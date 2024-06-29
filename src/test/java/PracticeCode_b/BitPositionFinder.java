package PracticeCode_b;

public class BitPositionFinder {
	
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int result = findBitPosition(n, pos);
        System.out.println("Bit at position " + pos + " is: " + result);
    }

    public static int findBitPosition(int n, int pos) {
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
            return 0;
        } else {
            System.out.println("Bit was one");
            return 1;
        }
    }
}

