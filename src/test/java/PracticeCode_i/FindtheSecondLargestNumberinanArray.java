package PracticeCode_i;

public class FindtheSecondLargestNumberinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,36,2,3,47,46};
		System.out.println(getSecondLargest(arr));

		// another way
		System.out.println(getSecondLargest1(arr));
	}

	//Best Approach - Two pass search

	public static int getSecondLargest(int [] arr) {

		int n = arr.length;

		int largest =-1;
		int secondLargets =-1;

		// find the 1st largest
		for(int i=0;i<n;i++) {

			if(arr[i]>largest) {

				largest=arr[i];
			}
		}

		//find second largest
		for(int i =0; i<n;i++) {

			if(arr[i] > secondLargets && arr[i] != largest) {

				secondLargets=arr[i];

			}
		}

		return secondLargets;
	}


	// One pass search
	public static int getSecondLargest1(int [] arr) {

		int n = arr.length;

		int largest =-1;
		int secondlargest =-1;

		for(int i=0;i<n;i++) {

			// if arr[i] > largest then update secondlargest with largest
			// and largest with arr[i]

			if(arr[i]>largest) {
				secondlargest = largest;
				largest = arr[i];
			}
			// if arr[i] < largest and arr[i] >secondlargest
			//then updated secondlargest with arr[i]

			else if(arr[i]<largest && arr[i]>secondlargest) {
				secondlargest = arr[i];
			}
		}
		return secondlargest;

	}

}
