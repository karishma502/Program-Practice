package PracticeCode_a;

import BaseClasses.TreeNode;
/*
 * Problem : SearchInBinarySearchTree
 * You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. 
If such a node does not exist, return null.
 */
public class SearchInBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Example 1:
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);

		int val=2;

		TreeNode R1= searchBST(root, val);
		System.out.println(R1);

		if (R1 != null) {
			System.out.println("Output 1: [" + R1.val + ", " + 
					(R1.left != null ? R1.left.val : null) + ", " + 
					(R1.right != null ? R1.right.val : null) + "]");
		} else {
			System.out.println("Output 1: []");
		}

		// Example 2:
		int val2 = 5;
		TreeNode R2 = searchBST(root, val2);
		if (R2 != null) {
			System.out.println("Output 2: [" + R2.val + ", " + 
					(R2.left != null ? R2.left.val : null) + ", " + 
					(R2.right != null ? R2.right.val : null) + "]");
		} else {
			System.out.println("Output 2: []");
		}
	}

	public static TreeNode searchBST(TreeNode root, int val) {

		if (root == null){
			return null;
		}
		if (val > root.val){
			return searchBST(root.right, val);
		}
		else if(val < root.val) {
			return searchBST(root.left, val);
		}

		else{ 
			return root;
		}
	}

}
