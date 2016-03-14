package com.amazon.interview.lastHuddle;
import com.amazon.interview.lastHuddle.TreeNode;

public class ValidBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		TreeNode root6 = new TreeNode(6);

		root4.left = root2;
		root2.left = root;
		root2.right = root3;

		root4.right = root5;
		root5.right = root6;

		System.out.println(isValidBST(root4));

	}

	public static boolean isValidBST(TreeNode root) {
		return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	public static boolean isBST(TreeNode root, int max, int min) {
		if (root == null) {
			return true;
		}
		return root.val > min && root.val < max && isBST(root.left,root.val, min) && isBST(root.right,max , root.val);
	}
}
