package LinkedList;

import BaseClasses.ListNode;
/*
 * 328. Odd Even Linked List
 */
public class OddEvenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next =new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		System.out.println("Input: ");
		printList(head);

		System.out.println("Output: ");
		ListNode result = oddEvenList(head);
		printList(result);

		ListNode head1 = new ListNode(2);
		head1.next=new ListNode(1);
		head1.next.next=new ListNode(3);
		head1.next.next.next =new ListNode(5);
		head1.next.next.next.next=new ListNode(6);
		head1.next.next.next.next.next=new ListNode(4);
		head1.next.next.next.next.next.next=new ListNode(7);

		System.out.println("Input: ");
		printList(head1);

		System.out.println("Output: ");
		ListNode result1 = oddEvenList(head1);
		printList(result1);

	}
	public static ListNode oddEvenList(ListNode head) {

		if(head==null || head.next==null){
			return head;
		}
		ListNode odd =head;
		ListNode even = head.next;
		ListNode evenHead = even;

		while(even!=null && even.next!=null){
			odd.next=even.next;
			odd = odd.next;
			even.next=odd.next;
			even=even.next;
		}

		odd.next =evenHead;
		return head;

	}

	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

}
