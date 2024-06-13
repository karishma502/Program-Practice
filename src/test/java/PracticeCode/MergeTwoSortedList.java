package PracticeCode;


import BaseClasses.ListNode;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Merge Two sorted list
		 * problem : 21
		 */
		
		//Code
		
		MergeTwoSortedList solution = new MergeTwoSortedList();
		
		ListNode l1=new ListNode(1);
		l1.next= new ListNode(2);
		l1.next.next= new ListNode(4);
		System.out.println("Input L1: ");
		printList(l1);
	
		
		ListNode l2=new ListNode(1);
		l2.next= new ListNode(3);
		l2.next.next= new ListNode(4);
		System.out.println("Input L2 : ");
		printList(l2);
		
		
		ListNode result = solution.merge(l1, l2);
		System.out.println("output : ");
		printList(result);
		
		
		// Example with empty lists
        ListNode list1 = null;
        ListNode list2 = null;

        System.out.println("Input:");
        System.out.print("List 1: ");
        printList(list1);
        System.out.print("List 2: ");
        printList(list2);
        
        ListNode mergedList = solution.merge(list1, list2);
        System.out.println("Output:");
        printList(mergedList);
        
     // Example with empty list 1 and non-empty list 2
        ListNode list3 = null;
        ListNode list4 = new ListNode(0);

        System.out.println("Input:");
        System.out.print("List 3: ");
        printList(list3);
        System.out.print("List 4: ");
        printList(list4);

        ListNode mergedList1 = solution.merge(list3, list4);
        System.out.println("Output:");
        printList(mergedList1);

		
	
	}
	
	public ListNode merge(ListNode l1,ListNode l2) {
		
		ListNode dummy=new ListNode(-1);
		ListNode current =dummy;
		
		while(l1 !=null && l2!=null) {
			
			if(l1.val <=l2.val) {
				
				current.next=l1;
				l1=l1.next;
			}
			else {
				
				current.next=l2;
				l2=l2.next;
			}
			
			current=current.next;
			
		}
        // Attach remaining nodes of l1 or l2

		   if (l1 != null) {
	            current.next = l1;
	        } else {
	            current.next = l2;
	        }
		   
		return dummy.next;
		
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
