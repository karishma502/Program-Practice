package PracticeCode;

public class SquareRootOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Problem  69 Sqrt(x)
		 * 
		 * Example 1:

			Input: x = 4
			Output: 2
			Explanation: The square root of 4 is 2, so we return 2.
			
			Example 2:

			Input: x = 8
			Output: 2
			Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
		 */
		
        System.out.println(mySqrt(4)); // Output: 2
        System.out.println(mySqrt(8)); // Output: 2
        System.out.println(mySqrt(16)); // Output: 4
        System.out.println(mySqrt(32)); // Output: 5



	}
	
	public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        // Initialize the search range for the square root.
        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {
       
          mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x) {
                end = mid - 1;
                }
            else if (mid * mid == x) {

                return mid;
            }
            else
                  start = mid + 1;
        }
        return Math.round(end);
    }

}
