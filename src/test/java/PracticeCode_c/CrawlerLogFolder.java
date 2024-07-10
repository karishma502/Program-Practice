package PracticeCode_c;
/*
 * Time Complexity - O(n)
 * Space Complexity -O(1)
 */
public class CrawlerLogFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TC -1

		String[] logs1 = {"d1/","d2/","../","d21/","./"};
		System.out.println(minOperations(logs1));

		//TC-2

		String[] logs2 = {"d1/","d2/","./","d3/","../","d31/"};
		System.out.println(minOperations(logs2));

		//TC-3

		String[] logs3 = {"d1/","../","../","../"};
		System.out.println(minOperations(logs3));
	}
	public static int minOperations(String[] logs) {

		int depth = 0;
		for(String log :  logs){
			if(log.equals("./")){
				continue;
			}
			else if( log.equals("../")){
				depth--;
				if(depth<0){
					depth =0;
				}
			}else{
				depth++;
			}

		}
		return depth;
	}


}
