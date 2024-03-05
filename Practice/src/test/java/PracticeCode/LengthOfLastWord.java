package PracticeCode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Leet Code Problem : 58
		 */
		System.out.println(lastIndexLen("Hello Word"));
		System.out.println(lastIndexLen("Hello Welcome to my world "));

	}
	
	public static int lastIndexLen(String s) {
		
		int length=0;
		boolean foundWod=false;
		
		for(int i=s.length()-1;i>=0;i--) {
			char c= s.charAt(i);
			
			if(c != ' ') {
				length++;
				foundWod =true;
			}
			else if(foundWod) {
				break;
			}
		}
		
		return length;
		
	}

}
