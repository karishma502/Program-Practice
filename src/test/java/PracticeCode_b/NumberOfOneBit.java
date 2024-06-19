package PracticeCode_b;
/*
 * Desc : Write a function that takes the binary representation of a positive integer and returns the number of 
set bits
 it has (also known as the Hamming weight).
 */
public class NumberOfOneBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 11;
		System.out.println(hammingWeight(n1));
		
		int n2 = 128;
		System.out.println(hammingWeight(n2));
		
		int n3 = 2147483645;
		System.out.println(hammingWeight(n3));
	}
	
    public static int hammingWeight(int n) {

        int bits = 0;
        int mask =1;
        for(int i=0; i<32;i++){
            if((mask & n) !=0){
                bits ++;
            }
            mask <<=1;
        }

        return bits;
        
    }

}
