package PracticeCode_c;

import BaseClasses.ListNode;

/*
 * TimeComplexity - O(n)
 * SpaceComplexity-O(1)
 */
public class MergeNodesInBetweenZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EX 1:
		
		ListNode head = new ListNode(0);
		head.next=new ListNode(3);
		head.next.next =new ListNode(1);
		head.next.next.next=new ListNode(0);
		head.next.next.next.next=new ListNode(4);
		head.next.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next.next=new ListNode(2);
		head.next.next.next.next.next.next.next=new ListNode(0);

		System.out.println("Input :");
		printList(head);
		
		System.out.println("Output: ");
		ListNode ans = mergeNodes(head);
		printList(ans);
		
		// EX 2: 
		
		ListNode head1 = new ListNode(0);
		head1.next=new ListNode(1);
		head1.next.next =new ListNode(0);
		head1.next.next.next=new ListNode(3);
		head1.next.next.next.next=new ListNode(0);
		head1.next.next.next.next.next=new ListNode(2);
		head1.next.next.next.next.next.next=new ListNode(2);
		head1.next.next.next.next.next.next.next=new ListNode(0);

		System.out.println("Input :");
		printList(head1);
		
		System.out.println("Output: ");
		ListNode ans1 = mergeNodes(head1);
		printList(ans1);


	}
	
    public static ListNode mergeNodes(ListNode head) {
    	
    	ListNode OriginalHead =head;
    	ListNode currNode =head.next;
    	int s =0;
    	while(currNode !=null) {
    		
    		if(currNode.val ==0) {
    			head.val =s;
    			s=0;
    			if(currNode.next !=null) {
    				head=head.next;
    			}
    		}
    		s+=currNode.val;
    		currNode =currNode.next;
    	}
    	head.next=null;
    	return OriginalHead;
        
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
