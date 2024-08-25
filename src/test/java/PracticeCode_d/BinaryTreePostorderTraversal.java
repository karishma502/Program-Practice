package PracticeCode_d;

import java.util.ArrayList;
import java.util.List;
import BaseClasses.TreeNode;
/*
 * TC O(n)
 * SC O(n)
 */
public class BinaryTreePostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		List<Integer> result = postorderTraversal(root);
		System.out.println(result);

		TreeNode root2 = null;

		List<Integer> result2 = postorderTraversal(root2);
		System.out.println(result2);

		TreeNode root3 = new TreeNode(1);

		List<Integer> result3 = postorderTraversal(root3);
		System.out.println(result3);


	}


	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		fun(root,result);
		return result;

	}

	private static void fun(TreeNode root, List<Integer> result){
		if(root != null){
			fun(root.left,result);
			fun(root.right,result);
			result.add(root.val);
		}
	}



}
