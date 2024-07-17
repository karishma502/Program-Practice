package PracticeCode_c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import BaseClasses.TreeNode;
/*
 * TC -O(n)
 * SC- O(n)
 */
public class DeleteNodeAndReturnFores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		root1.right.left = new TreeNode(6);
		root1.right.right = new TreeNode(7);
		int[] to_delete1 = {3, 5};
		List<TreeNode> result1 = delNodes(root1, to_delete1);
		printForest(result1);

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(4);
		root2.left.right = new TreeNode(3);
		int[] to_delete2 = {3};
		List<TreeNode> result2 = delNodes(root2, to_delete2);
		printForest(result2);
	}

	public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
		Map<Integer, TreeNode> res = new HashMap<>();
		Set<Integer> to_delete_set = new HashSet<>();
		for (int val : to_delete) {
			to_delete_set.add(val);
		}
		res.put(root.val, root);

		recursion(null, root, false, res, to_delete_set);

		return new ArrayList<>(res.values());
	}

	private static void recursion(TreeNode parent, TreeNode cur_node, boolean isleft, Map<Integer, TreeNode> res, Set<Integer> to_delete_set) {
		if (cur_node == null) return;

		recursion(cur_node, cur_node.left, true, res, to_delete_set);
		recursion(cur_node, cur_node.right, false, res, to_delete_set);

		if (to_delete_set.contains(cur_node.val)) {
			res.remove(cur_node.val);

			if (parent != null) {
				if (isleft) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			}

			if (cur_node.left != null) {
				res.put(cur_node.left.val, cur_node.left);
			}
			if (cur_node.right != null) {
				res.put(cur_node.right.val, cur_node.right);
			}
		}
	}


	private static void printTree(TreeNode root) {
		if (root == null) return;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		List<String> result = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node != null) {
				result.add(String.valueOf(node.val));
				queue.add(node.left);
				queue.add(node.right);
			} else {
				result.add("null");
			}
		}

		// Remove trailing "null"s
		while (result.get(result.size() - 1).equals("null")) {
			result.remove(result.size() - 1);
		}

		System.out.println(String.join(" ", result));
	}

	private static void printForest(List<TreeNode> forest) {
		for (TreeNode root : forest) {
			printTree(root);
			System.out.println();
		}
	}

}
