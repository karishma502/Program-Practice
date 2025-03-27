package PracticeCode_i;


public class ReverseStringWithoutUsingBuiltInFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Karu";
		reverseStrUsingCharArray(s);
		reverseStrWithoutCharArray(s);
		String a =reverseStr(s);
		System.out.println(a);
	}
	
	//Using Char Array
	public static void reverseStrUsingCharArray(String s) {
		
		char [] arr = s.toCharArray();
		
		for(int i= arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	//Using loop without char Array
	public static void reverseStrWithoutCharArray(String s)
	{
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);
	}
	
	//Using Char Array - return type STRING

    public static String reverseStr(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }
	

}
