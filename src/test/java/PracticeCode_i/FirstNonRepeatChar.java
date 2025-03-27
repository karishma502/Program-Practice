package PracticeCode_i;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "swiss";
		System.out.println(firstNonRepeating(s));
	}

	public static char firstNonRepeating(String s) {
		int[] count = new int[256];

		for(char ch : s.toCharArray()) {
			count[ch]++;
			System.out.println(count[ch]);

		}
		
		for(char ch: s.toCharArray()) {
			if(count[ch]==1) {
				System.out.println((char)ch +":" + count[ch]);
				return ch;
			}
		}
        return '_'; // If no unique character found
	}

}
