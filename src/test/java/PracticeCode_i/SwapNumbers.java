package PracticeCode_i;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swapWithout3rdvariavle();
		swapUsing3rdvariavle();
		}
	
	//Swap two nums without 3rd variable
	public static void swapWithout3rdvariavle() {
		int a =5;
		int b=10;
		System.out.println("before swap a: "+a);
		System.out.println("before swap b: "+b);
		
		System.out.println();
		
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("After swap a: "+a);
		System.out.println("After swap b: "+b);
		System.out.println();



	}
	
	//using 3rd variable
	
	public static void swapUsing3rdvariavle() {
		int a= 30;
		int b=20;
		int temp;
		
		System.out.println("before swap a: "+a);
		System.out.println("before swap b: "+b);
		
		System.out.println();

		temp =a;
		a=b;
		b=temp;
		
		System.out.println("After swap a: "+a);
		System.out.println("After swap b: "+b);
		
	}
}
