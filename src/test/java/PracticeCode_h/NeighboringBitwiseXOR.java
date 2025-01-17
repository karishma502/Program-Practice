package PracticeCode_h;

public class NeighboringBitwiseXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,1,0};
		System.out.println(doesValidArrayExist(a));
	}
	public static boolean doesValidArrayExist(int[] derived) {
		int n=derived.length;
		int[] org=new int[n];

		//Populating the org array
		for(int i=1; i<n; i++){
			org[i]=derived[i-1]^org[i-1];
		}

		//Validating the rules for index i
		for(int i=0; i<n; i++){
			int idx=(i+1)%n;
			if(derived[i]!=(org[i]^org[idx])) return false;
		}

		return true;

	}
}
