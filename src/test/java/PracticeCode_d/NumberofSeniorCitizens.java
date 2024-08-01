package PracticeCode_d;
/*
 * 	Time Complexity: O(n)
	Space Complexity: O(1)
 */
public class NumberofSeniorCitizens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] d1 = {"7868190130M7522","5303914400F9211","9273338290F4010"};
		System.out.println(countSeniors(d1));
		
		String[] d2 = {"1313579440F2036","2921522980M5644"};
		System.out.println(countSeniors(d2));
	}
	public static int countSeniors(String[] details) {
	    int ans = 0;
	    for (String x : details) {
	        // Check if the string is long enough
	        if (x.length() >= 13) {
	            try {
	                // Try to parse the substring as an integer
	                int age = Integer.parseInt(x.substring(11, 13));
	                if (age > 60) {
	                    ans++;
	                }
	            } catch (NumberFormatException e) {
	                // Handle the case where the substring is not a valid integer
	                System.out.println("Invalid age format in string: " + x);
	            }
	        } 
	    }
	    return ans;
	}



}
