package LinkedList;


import BaseClasses.ListNode;
/*
 * Description : Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list
can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

 * Time Complexity -O(N)
 * Space Complexity -O(1)
 */
public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EX 1:

		ListNode head1 = new ListNode(3);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(0);
		head1.next.next.next = new ListNode(-4);

		// Create a cycle
		head1.next.next.next.next = head1.next; // Connect the tail to the 1st node

		System.out.println(hasCycle(head1)); 

		//EX 2 :

		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		// Create a cycle
		head2.next.next = head2; // Connect the tail to the 0th node
		System.out.println(hasCycle(head2));
		
		//EX 3 :
		
		ListNode head3 = new ListNode(1);
        // No cycle
        System.out.println(hasCycle(head3));



	}
	public static boolean hasCycle(ListNode head) {

		// start slow pointer and fast pointer
		ListNode slowPtr =head;
		ListNode fastPtr =head;

		while(slowPtr !=null && fastPtr !=null && fastPtr.next !=null){

			//move slow ptr by 1 and move fastPtr by 2
			slowPtr =slowPtr.next;
			fastPtr =fastPtr.next.next;

			// if they both meet, means we found loop....
			if(slowPtr == fastPtr){
				return true;
			}

		}
		return false;

	}

	public static void printList(ListNode head) {
		ListNode temp =head;
		while(temp != null) {
			System.out.println(temp.val + " ");
			temp =temp.next;
		}
		System.out.println();
	}

}
