package PracticeCode_e;

public class FindtheStudentthatWillReplacetheChalkjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] chalk1 = {5,1,5};
		int k=22;
		System.out.println(chalkReplacer(chalk1, k));

		int [] chalk2 = {3,4,1,2,};
		int k2=25;
		System.out.println(chalkReplacer(chalk2, k2));
	}
	public static int chalkReplacer(int[] chalk, int k) {

		long sum=0;
		for(int i=0;i<chalk.length;i++){
			sum+=chalk[i];
		}

		int remainingChalks = (int)(k%sum);

		for(int i=0;i<chalk.length;i++){

			if(remainingChalks < chalk[i]){
				return i;
			}
			else{
				remainingChalks -= chalk[i];
			}
		}

		return -1;
	}

}
