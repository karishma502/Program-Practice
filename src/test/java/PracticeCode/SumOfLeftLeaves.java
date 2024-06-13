package PracticeCode;

import BaseClasses.TreeNode;

/*
 * Problem :404. Sum of Left Leaves
 */
public class SumOfLeftLeaves {

	public static void main(String args []) {
		// TODO Auto-generated constructor stub
		TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        int result = sumOfLeftLeaves(root);
        System.out.println("Sum of left leaves: " + result);
		
	}
	public static int sumOfLeftLeaves(TreeNode root) {
		if (root == null)
			return 0;
		
		int sum = 0;

		if (root.left != null && root.left.left == null && root.left.right == null)
			sum += root.left.val;

		sum += sumOfLeftLeaves(root.left);
		sum += sumOfLeftLeaves(root.right);

		return sum;
	}

}
