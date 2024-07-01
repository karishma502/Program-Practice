package PracticeCode_c;
/*
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */
public class ThreeConsecutiveOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1= {2,4,6,1};
		System.out.println(threeConsecutiveOdds(arr1));
		
		int [] arr2 = {1,2,34,3,4,5,7,23,12};
		System.out.println(threeConsecutiveOdds(arr2));
	}
	
	public static boolean threeConsecutiveOdds(int[] arr) {

        int count =0;
        for(int i=0;i<arr.length;i++){

            if(arr[i] %2 != 0){
                count ++;
                if(count == 3){
                    return true;
                }
            }
            else{
                count =0;
            }
        }  

        return false;      
    }

}
