package com.amazon.interview.lastHuddle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

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

		List<List<Integer>> resutl =levelOrderTraversal(root4);
		System.out.println(resutl);
	}

	public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
		if (root == null) {
			return null;
		}

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> tempArr = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode temp = q.poll();
				tempArr.add(temp.val);
				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}
			}
			result.add(tempArr);
		}
		return result;
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}