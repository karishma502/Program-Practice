package PracticeCode_c;

public class TowerOfHanoi {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2;
		towerofHanaoi(n, "S", "H", "D");

		
	}
	
	public static void towerofHanaoi(int n, String src, String helper, String dest) {
		
		if(n==1) {
			System.out.println("transfer disk "+ n +" from "+src +" to "+dest);
			return;

		}
		towerofHanaoi(n-1, src, dest, helper);
		System.out.println("transfer disk "+n +" from "+src +" to "+dest);
		towerofHanaoi(n-1 ,helper, src, dest);
	}

}
