package LinkedList;

import BaseClasses.ListNode;

/*
 * Problem :203
 * Given the head of a linked list and an integer val,
 *  remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */

public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EX:1
		
		ListNode head= new ListNode(1);
		head.next =new ListNode(2);
		head.next.next= new ListNode(6);
		head.next.next.next=new ListNode(3);
		head.next.next.next.next=new ListNode(4);
		head.next.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

		System.out.println("Input : ");
		printList(head);
		int val = 6;
		ListNode result =removeElements(head, val);
		System.out.println("output : ");
		printList(result);
		
		//Ex:2
		
		ListNode head1 =null;
		System.out.println("Input : ");
		printList(head1);
		int val1 = 1;
		ListNode result1 =removeElements(head1, val1);
		System.out.println("output : ");
		printList(result1);
		
		//Ex: 3
		
	    ListNode head3 = new ListNode(7);
	    head3.next = new ListNode(7);
	    head3.next.next = new ListNode(7);
	    head3.next.next.next = new ListNode(7);
		System.out.println("Input : ");
		printList(head3);
		int val2 = 7;
		ListNode result2 =removeElements(head3, val2);
		System.out.println("output : ");
		printList(result2);
		

	}
	
    public static ListNode removeElements(ListNode head, int val) {
    	
    	
    	ListNode temp = new ListNode(0);
    	ListNode current = temp;
    	temp.next=head;
    	
    	while(current.next != null) {
    		if(current.next.val == val) {
    			current.next=current.next.next;
    		}
    		else {
    			current=current.next;
    		}
    	}
    	
		return temp.next;
    }
	
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
