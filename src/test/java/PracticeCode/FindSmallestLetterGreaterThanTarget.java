package PracticeCode;

/*
 * Problem :744
 * Binary search problem
 * Find Smallest Letter Greater Than Target
 */
public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EX : 1
		char[] letters ={'c','f','j'};
		char target = 'a';
		
		System.out.println(nextGreatestLetter(letters, target));
		
		//EX: 2

		char[] letters1 ={'c','f','j'};
		char target1 = 'c';
		
		System.out.println(nextGreatestLetter(letters1, target1));
		
		//EX: 3

		char[] letters3 ={'x','x','y','y'};
		char target3 = 'z';
		
		System.out.println(nextGreatestLetter(letters3, target3));
	}
	
    public static char nextGreatestLetter(char[] letters, char target) {
    	
    	int n = letters.length;
    	int left = 0;
    	int right= n-1;
    	
    	if(letters[n-1] <= target || target < letters[0]){
    		return letters[0];
    	}
    	
    	while(left+1<right) {
    		int mid = left + (right - left)/2;
    		
    		if(letters[mid] < right) {
    			left = mid;
    		}
    		else {
    			right =mid;
    		}
    	}
    	return letters[right];
    }

}
