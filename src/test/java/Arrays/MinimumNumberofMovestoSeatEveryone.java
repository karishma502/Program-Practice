
package Arrays;

import java.util.Arrays;

/**
 * Time complexity - O(n log n)
 * Space Complexity -O(n)
 */
public class MinimumNumberofMovestoSeatEveryone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] seats1 = {3,1,5};
		int[] std1 = {2,7,4};
		System.out.println(minMovesToSeat(seats1,std1));
		
		int[] seats2 = {4,1,5,9};
		int[] std2 = {1,3,2,6};
		System.out.println(minMovesToSeat(seats2,std2));
	}
	
	public static int minMovesToSeat(int[] seats, int[] students) {

        Arrays.sort(seats);
        Arrays.sort(students);

        int r = 0;

        for(int i=0 ; i<seats.length; i++){
            r+= Math.abs(seats[i] - students[i]);
        }

        return r;
        
    }

}
