package PracticeCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BaseClasses.TreeNode;

public class SortedArrayToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {-10, -3, 0, 5, 9};
		

		TreeNode nodeResult = ArrayToBST(nums1);
		System.out.println("Example 1 Output:");
		printTree(nodeResult);

		
		int[] nums2 = {1,3};
		TreeNode nodeResult2 = ArrayToBST(nums2);
		System.out.println("Example 2 Output:");
		printTree(nodeResult2);

	}

	public static TreeNode ArrayToBST(int[] nums) {
        if(nums.length ==0){
            return null;
        }
        return create(nums,0,nums.length-1);

	}

	public static TreeNode create(int [] nums,int start,int end) {
		if(start>end){
			return null;
		}
		int mid = start + (end-start)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left =create(nums,start,mid-1);
		node.right = create(nums,mid+1,end);
		return node;
	}

	private static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }
        
        List<List<String>> levels = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<String> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node == null) {
                    currentLevel.add("null");
                } else {
                    currentLevel.add(String.valueOf(node.val));
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            levels.add(currentLevel);
        }
        
        int lastIndex = levels.size() - 1;
        List<String> lastLevel = levels.get(lastIndex);
        int nullCount = 0;
        for (int i = lastLevel.size() - 1; i >= 0; i--) {
            if (lastLevel.get(i).equals("null")) {
                nullCount++;
            } else {
                break;
            }
        }
        lastLevel = lastLevel.subList(0, lastLevel.size() - nullCount);
        levels.set(lastIndex, lastLevel);
        
        // Print the tree
        StringBuilder result = new StringBuilder("[");
        for (List<String> level : levels) {
            for (String val : level) {
                result.append(val).append(",");
            }
        }
        result.setLength(result.length() - 1);
        result.append("]");
        System.out.println(result.toString());
    }

}
