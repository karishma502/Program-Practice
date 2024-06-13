package PracticeCode;


/*
 * Problem : 168 Excel Sheet Column Title
 * 
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 * 
 */
public class ExcelSheetColTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int col1 =1;
		System.out.println(convertToTitle(col1));
		
		int col2 =28;
		System.out.println(convertToTitle(col2));
		
		int col3 =701;
		System.out.println(convertToTitle(col3));
	}
	
	
	public static String convertToTitle(int column) {
		
		StringBuilder result = new StringBuilder();
		
		while(column>0) {
			
			column--;
			int remainder= column%26;
			result.append((char)((remainder + 'A')));
			
			column /= 26;
		}
		return result.reverse().toString();
		
		
	}

}
