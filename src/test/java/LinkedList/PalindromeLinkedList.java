package LinkedList;

import BaseClasses.ListNode;
/*
 * Problem :234. Palindrome Linked List
 */
public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ex 1
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(2);
		head1.next.next.next = new ListNode(1);
		printList(head1);
		System.out.println(isPalindrome(head1));

		// Ex 2
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		printList(head2);
		System.out.println(isPalindrome(head2));
	}


public static boolean isPalindrome(ListNode head) {

	ListNode fast =head , slow =head;

	while(fast != null && fast.next!= null){

		fast = fast.next.next;
		slow= slow.next;
	}
	if(fast != null)
	{
		slow = slow.next;
	}

	//reverse second half...

	slow = reverseList(slow);
	fast =head;

	//start comparing...

	while(slow != null){
		if(fast.val !=slow.val){
			return false;
		}

		fast = fast.next;
		slow =slow.next;
	}

	return true;
}


public static ListNode reverseList(ListNode head) {
	ListNode prev = null;
	ListNode current = head;
	while (current != null) {
		ListNode nextNode = current.next;
		current.next = prev;
		prev = current;
		current = nextNode;
	}
	return prev;
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
