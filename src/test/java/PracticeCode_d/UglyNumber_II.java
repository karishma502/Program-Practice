package PracticeCode_d;

import java.util.HashSet;
import java.util.PriorityQueue;

public class UglyNumber_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 =10;
		System.out.println(nthUglyNumber(n1));
		
		int n2 =1;
		System.out.println(nthUglyNumber(n2));
	}
	public static int nthUglyNumber(int n) {
		int[] primes = {2, 3, 5};
		PriorityQueue<Long> uglyHeap = new PriorityQueue<>();
		HashSet<Long> visited = new HashSet<>();

		uglyHeap.add(1L);
		visited.add(1L);

		long curr = 1L;
		for (int i = 0; i < n; i++) {
			curr = uglyHeap.poll();
			for (int prime : primes) {
				long new_ugly = curr * prime;
				if (!visited.contains(new_ugly)) {
					uglyHeap.add(new_ugly);
					visited.add(new_ugly);
				}
			}
		}
		return (int)curr;
	}


}
