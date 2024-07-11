package PracticeCode_c;
/*
 * Using Recursion approach
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */
public class ReverseSubstringsBetweenEachPairofParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "(abcd)";
		System.out.println(reverseParentheses(s));
		
		String s1 = "(u(love)i)";
		System.out.println(reverseParentheses(s1));
		
		String s2 = "(ed(et(oc))el)";
		System.out.println(reverseParentheses(s2));
	}
	
	public static String processString(String str, int len, int [] idx, boolean  shouldReverse) {
		StringBuilder sb = new StringBuilder();
		
		while(idx[0]< len && str.charAt(idx[0]) != ')') {
			char currChar = str.charAt(idx[0]);
			if(currChar == '(') {
				idx[0]++;
				sb.append(processString(str, len, idx,true));
			}else {
				sb.append(currChar);
			}
			idx[0]++;
			
		}
		
		
        return shouldReverse ? sb.reverse().toString() : sb.toString();
		
	}
	
    public static String reverseParentheses(String s) {
    	
    	//StringBuilder sb = new StringBuilder();
    	int len = s.length();
    	int [] idx = {0};
    	return processString(s, len,idx, false);
    }

}
