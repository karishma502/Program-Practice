package PracticeCode_e;

import java.util.Map;
import java.util.TreeMap;

public class MyCalendarI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(book(10, 20)); // true
		System.out.println(book(15, 25)); // false
		System.out.println(book(20, 30)); // true		
	}


	static TreeMap<Integer, Integer> calendar = new TreeMap<>();

	public MyCalendarI() {
		// Initialize the calendar with no events
	}

	public static boolean book(int start, int end) {
		// Find the next event that starts after 'start'
		Map.Entry<Integer, Integer> nextEvent = calendar.higherEntry(start);
		// Find the previous event that ends after or before 'start'
		Map.Entry<Integer, Integer> prevEvent = calendar.floorEntry(start);

		// Check if the current event conflicts with the previous or the next event
		if ((prevEvent != null && prevEvent.getValue() > start) || 
				(nextEvent != null && nextEvent.getKey() < end)) {
			return false; // There is an overlap
		}

		// No overlap, add the event
		calendar.put(start, end);
		return true;
	}
}





