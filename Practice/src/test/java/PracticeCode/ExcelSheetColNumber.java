package PracticeCode;

/*
 * Problem : 171
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, 
 * return its corresponding column number.
 */
public class ExcelSheetColNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Cvalue = "AB";
		System.out.println(titleToNumber(Cvalue));
		
		String Cvalue1 = "A";
		System.out.println(titleToNumber(Cvalue1));
		
		String Cvalue2 = "ZY";
		System.out.println(titleToNumber(Cvalue2));
	}
	
    public static int titleToNumber(String columnTitle){
    	
    	int result =0;
    	
    	for(int i=0; i<columnTitle.length();i++) {
    		result = result*26;
    		int c= columnTitle.charAt(i);
    		result += c -'A' + 1;
    	}
    	
    	return result;
    	
    }

}
