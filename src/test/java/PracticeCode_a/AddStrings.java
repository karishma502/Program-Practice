package PracticeCode_a;
/*
 * Add Strings
 */
public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 ="11";
		String num2 ="123";
		System.out.println(addStrings(num1, num2));

		String num3 ="456";
		String num4 ="77";
		System.out.println(addStrings(num3, num4));

		String num5 ="0";
		String num6 ="0";
		System.out.println(addStrings(num5, num6));
	}

	public static String addStrings(final String num1, final String num2) {
		final StringBuilder sb = new StringBuilder();

		int i = num1.length() - 1, j = num2.length() - 1, c = 0;

		while(i >= 0 || j >= 0) {
			int s1 = 0, s2 = 0;

			if(i >= 0)
				s1 = num1.charAt(i--) - '0';

			if(j >= 0)
				s2 = num2.charAt(j--) - '0';

			int sum = s1 + s2 + c;

			if(sum > 9)
				c = 1;
			else
				c = 0;

			sb.append(sum % 10);
		}

		if(c == 1)
			sb.append(c);

		return sb.reverse().toString();
	}


}
