package PracticeCode_g;

import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromtheRichestPile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] g= {25,64,9,4,100};
		int k= 4;
		System.out.println(pickGifts(g, k));
	}
	public static long pickGifts(int[] g, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for (int val : g)
			maxHeap.add(val);

		for (int i = 0; i < k && maxHeap.peek() > 1; i++) {
			int x = maxHeap.poll();
			maxHeap.add((int) Math.sqrt(x));
		}

		long sum = 0;
		for (int val : maxHeap)
			sum += val;

		return sum;
	}

}
