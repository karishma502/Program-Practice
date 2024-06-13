package PracticeCode_a;

import java.util.Arrays;

/*
 * Time Complexity: 0(n)
 *  Space Complexity: 0(1)
 */
public class NumberOfLinesToWriteString {
	
	public static void main(String[] args) {
        int[] widths1 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        int[] result1 = numberOfLines(widths1, s1);
        System.out.println(Arrays.toString(result1));  

        int[] widths2 = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s2 = "bbbcccdddaaa";
        int[] result2 = numberOfLines(widths2, s2);
        System.out.println(Arrays.toString(result2));  
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int numOfLines = 1;

        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];

            if (sum + width <= 100) {
                sum += width;
            } else {
                numOfLines++;
                sum = width;
            }
        }

        return new int[]{numOfLines, sum};
    }
}
