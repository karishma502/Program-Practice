package LinkedList;

import BaseClasses.ListNode;

public class DuplicateDeleteFromSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * LeetCode Problem : 83
		 * Delete Duplicate from Sorted List
		 * Example 1: Input: head = [1,1,2]
						Output: [1,2]
						
		Example 2:
		Input: head = [1,1,2,3,3]
		Output: [1,2,3]
 
		 */
		DuplicateDeleteFromSortedLinkedList dd = new DuplicateDeleteFromSortedLinkedList();
		
		//Example 1
		ListNode head =new ListNode(1);
		head.next =new ListNode(1);
		head.next.next =new ListNode(2);
		System.out.println("Input : ");
		printList(head);
		
		ListNode result = dd.DeleteDuplicate(head);
		System.out.println("output: ");
		printList(head);
		
		//Example 2 :
		ListNode head2 =new ListNode(1);
		head2.next =new ListNode(1);
		head2.next.next= new ListNode(2);
		head2.next.next.next=new ListNode(2);
		head2.next.next.next.next=new ListNode(3);
		head2.next.next.next.next.next=new ListNode(3);
		System.out.println("Input :");
		
		printList(head2);
		
		ListNode result2 = dd.DeleteDuplicate(head2);
		System.out.println("output :");
		printList(head2);
		
		
		
	}

	public ListNode DeleteDuplicate(ListNode head) {
		
		ListNode temp = head;
		while(temp != null && temp.next !=null) {
			if(temp.val == temp.next.val) {
				temp.next = temp.next.next;
			}
			else {
				temp =temp.next;
			}
		}
		return head;
		
		
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
