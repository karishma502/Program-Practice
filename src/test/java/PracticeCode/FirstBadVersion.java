package PracticeCode;

/*
 * Problem :278 First Bad Version
 * Binary Search
 */
public class FirstBadVersion {

	private static int badVersion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 10;
		badVersion=6;
		System.out.println(firstBadVersion(n));

		int n1= 1;
		badVersion=1;
		System.out.println(firstBadVersion(n1));

		int n2= 8;
		badVersion=5;
		System.out.println(firstBadVersion(n2));
	}

	public static int firstBadVersion(int n) {

		int l =1;
		int r =n;
		int ans=0;
		while(l<=r){
			int mid = l + (r-l)/2;

			if(isBadVersion(mid)){
				ans= mid;
				r = mid-1;
			}
			else{
				l = mid +1;
			}
		}

		return ans;

	}

	private static boolean isBadVersion(int version) {
		return version >= badVersion;
	}

}
