package PracticeCode_a;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem :933. Number of Recent Calls
 * 
 */
public class NumberOfRecentCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberOfRecentCalls recentCall = new NumberOfRecentCalls();
		System.out.println(recentCall.ping(1));    
		System.out.println(recentCall.ping(100));  
		System.out.println(recentCall.ping(3001));
		System.out.println(recentCall.ping(6002));

	}

	Queue<Integer> queue ;

	public NumberOfRecentCalls() {

		queue = new LinkedList<>();

	}

	public int ping(int t) {
		if(queue.size()==0) {
			queue.add(t);
			return 1;
		}
		else if (t <= 3000) {
			queue.add(t);

		}
		else {
			int margin = t-3000;
			while(queue.size()!= 0 && queue.peek()<margin) {
				queue.poll();    			
			}
			queue.add(t);
		}
		return queue.size();
	}

}
