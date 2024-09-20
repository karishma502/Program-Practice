package PracticeCode_e;
/*
 * TC -O(n)
 * SC -O(n)
 */
public class ShortestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="aacecaaa";
		System.out.println(shortestPalindrome(s1));
		
		String s2 ="abcd";
		System.out.println(shortestPalindrome(s2));
	}
	public static  String shortestPalindrome(String s) {
		int count = kmp(new StringBuilder(s).reverse().toString(),s);
		return new StringBuilder(s.substring(count)).reverse().toString()  + s;

	}
	private  static int kmp(String txt, String patt){
		String newString = patt + '#' + txt;
		int [] pi = new int[newString.length()];

		int i=1,k=0;
		while(i< newString.length()){
			if(newString.charAt(i) == newString.charAt(k)){
				k++;
				pi[i] =k;
				i++;
			}
			else{
				if(k>0){
					k = pi[k-1];
				}else{
					pi[i] = 0;
					i++;
				}
			}
		}

		return pi[newString.length() -1];
	}

}
