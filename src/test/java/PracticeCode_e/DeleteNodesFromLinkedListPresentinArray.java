package PracticeCode_e;

import BaseClasses.ListNode;

public class DeleteNodesFromLinkedListPresentinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode modifiedList(int[] nums, ListNode head) {
		int max = -1;
		for(int num : nums ){
			max = num > max ? num : max;
		}
		boolean[] freq = new boolean[max+1];

		for(int num : nums) freq[num] = true;

		ListNode temp = new ListNode();
		ListNode current = temp;

		while(head != null){
			if( head.val >= freq.length || freq[head.val] == false){
				current.next = head;
				current = current.next;
			}
			head = head.next;
		}

		current.next = null;
		return temp.next;
	}

}
