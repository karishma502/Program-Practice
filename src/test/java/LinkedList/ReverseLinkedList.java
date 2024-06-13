package LinkedList;

import BaseClasses.ListNode;

/*
 * Problem :206
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
*/
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//EX: 1
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(3);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = new ListNode(5);
		System.out.println("Input :");

		printList(head1);

		ListNode result = reverseList(head1);
		System.out.println("Output :");

		printList(result);
		
		//EX: 2
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		System.out.println("Input :");

		printList(head2);

		ListNode result2 = reverseList(head2);
		System.out.println("Output :");

		printList(result2);

		// EX: 3
		
		ListNode head3 =null;
		System.out.println("Input :");

		printList(head3);

		ListNode result3 = reverseList(head3);
		System.out.println("Output :");

		printList(result3);

		

	}


	public static ListNode reverseList(ListNode head) {

		ListNode prev=null;
		ListNode dummy =head;
		while(dummy != null) {
			ListNode x = dummy.next;
			dummy.next = prev;
			prev = dummy;
			dummy =x;
		}

		return prev;
	}

	public static void printList(ListNode head) {

		ListNode temp = head;
		while(temp != null) {

			System.out.println(temp.val+"");

			temp=temp.next ;
		}
		System.out.println();

	}
}

