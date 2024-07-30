package PracticeCode_c;
/*
 * TC -O(n)
 * SC -(1)
 */
public class MinimumDeletionstoMakeStringBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="aababbab";
		System.out.println(minimumDeletions(s1));

		String s2 ="bbaaaaabb";
		System.out.println(minimumDeletions(s2));
	}
	public static int minimumDeletions(String s) {

		int numOfDeletion =0;
		int prefix =0;
		int n = s.length();

		for(int i=0;i<n;i++){
			char ch = s.charAt(i);
			if(ch == 'b'){

				prefix++;

			}else if(ch =='a' && prefix > 0){
				prefix--;
				numOfDeletion++;
			}
		}

		return numOfDeletion;


	}

}
