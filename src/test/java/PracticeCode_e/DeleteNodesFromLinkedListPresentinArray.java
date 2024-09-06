package PracticeCode_e;

import BaseClasses.ListNode;

public class DeleteNodesFromLinkedListPresentinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);

	        // Array of values to be removed: [1, 2, 3]
	        int[] nums = {1, 2, 3};

	        System.out.println("Original list:");
	        printList(head);

	        // Calling the modifiedList method
	        ListNode modifiedHead = modifiedList(nums, head);

	        System.out.println("Modified list after removal:");
	        printList(modifiedHead);
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
	
    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }


}
