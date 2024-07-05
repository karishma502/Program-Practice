package PracticeCode_c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import BaseClasses.ListNode;
/*
 * Time Complexity: O(n) 
 * Space Complexity: O(n)
 */
public class FindtheMinimumandMaximumNumberofNodeBetweenCriticalPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Test case 1
        int[] arr1 = {3, 1};
        ListNode head1 = createLinkedList(arr1);
        int[] result1 = nodesBetweenCriticalPoints(head1);
        System.out.println("Input:"+Arrays.toString(arr1));
        System.out.println("Output: " + Arrays.toString(result1));
        
        // Test case 2
        int[] arr2 = {5, 3, 1, 2, 5, 1, 2};
        ListNode head2 = createLinkedList(arr2);
        int[] result2 = nodesBetweenCriticalPoints(head2);
        System.out.println("Input:"+Arrays.toString(arr2));
        System.out.println("Output: " + Arrays.toString(result2));
	}
	 public static int[] nodesBetweenCriticalPoints(ListNode head) {
	        if(head ==null || head.next == null || head.next.next ==null){
	            return new int [] {-1,-1};
	        }

	        List<Integer> cp = new ArrayList<>();
	        ListNode prev = head;
	        ListNode curr = head.next;

	        int index =1;

	        while(curr.next !=null){
	            if((curr.val>prev.val && curr.val >curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val)){

	                 cp.add(index);
	            }
	            prev =curr;
	            curr=curr.next;
	            index++;
	        }


	        if(cp.size()<2){
	            return new int[]{-1,-1};
	        }

	        int minDistance = Integer.MAX_VALUE;
	        int maxDistance = cp.get(cp.size()-1)-cp.get(0);

	        for(int i=1;i<cp.size();i++){
	            minDistance = Math.min(minDistance,cp.get(i)-cp.get(i-1));
	        }
	        return new int []{minDistance,maxDistance};
	    }

	    public static ListNode createLinkedList(int[] arr) {
	        if (arr == null || arr.length == 0) return null;
	        ListNode head = new ListNode(arr[0]);
	        ListNode current = head;
	        for (int i = 1; i < arr.length; i++) {
	            current.next = new ListNode(arr[i]);
	            current = current.next;
	        }
	        return head;
	    }
}
