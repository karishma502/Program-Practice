package PracticeCode;
/*
 * Power of 2
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        System.out.println(isPowerOfTwo(1));   
        System.out.println(isPowerOfTwo(16)); 
        System.out.println(isPowerOfTwo(3));   
	}
	
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

}
