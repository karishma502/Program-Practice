package PracticeCode_b;

import java.util.LinkedList;
import java.util.Queue;

import BaseClasses.TreeNode;

public class BinarySearchTreetoGreaterSumTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 Integer[] input1 = {4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};

	        // Build the tree from the input
	        TreeNode root1 = buildTree(input1);

	        System.out.println("Original BST level-order:");
	        levelOrderPrint(root1);
	        System.out.println();

	        // Convert BST to GST
	        bstToGst(root1);

	        System.out.println("Greater Sum Tree level-order:");
	        levelOrderPrint(root1);
	        System.out.println();

	        // Reset the static sum variable for the next example
	        sum = 0;

	        // Example 2: root = [0,null,1]
	        Integer[] input2 = {0, null, 1};

	        // Build the tree from the input
	        TreeNode root2 = buildTree(input2);

	        System.out.println("Original BST level-order:");
	        levelOrderPrint(root2);
	        System.out.println();

	        // Convert BST to GST
	        bstToGst(root2);

	        System.out.println("Greater Sum Tree level-order:");
	        levelOrderPrint(root2);
	        System.out.println();

	}

	private static int sum = 0;

	public static TreeNode bstToGst(TreeNode root) {  
		if (root != null) {
			bstToGst(root.right);  // Traverse the right subtree
			sum += root.val;  // Update the sum
			root.val = sum;  // Update the current node's value
			bstToGst(root.left);  // Traverse the left subtree
		}
		return root;
	}

    public static void levelOrderPrint(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                System.out.print(node.val + " ");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                System.out.print("null ");
            }
        }
    }
    
    public static TreeNode buildTree(Integer[] values) {
        if (values.length == 0) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode node = queue.poll();
            if (values[i] != null) {
                node.left = new TreeNode(values[i]);
                queue.add(node.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                node.right = new TreeNode(values[i]);
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }

}
