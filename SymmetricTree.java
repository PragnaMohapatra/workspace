package com.amazon.interview.lastHuddle;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SymmetricTree {
	public static void main(String... args) {
		TreeNode root = new TreeNode(7);
		TreeNode root11 = new TreeNode(-64);
		TreeNode root12 = new TreeNode(-64);

		root.left = root11;
		root.right = root12;

		TreeNode root21 = new TreeNode(-6);
		TreeNode root22 = new TreeNode(-90);
		root11.left = root21;
		root11.right = root22;

		TreeNode root23 = new TreeNode(-90);
		TreeNode root24 = new TreeNode(-6);
		root12.left = root23;
		root12.right = root24;

		TreeNode root31 = new TreeNode(88);
		TreeNode root32 = new TreeNode(-44);
		root21.left=root31;
		root21.right = root32;
		
		TreeNode root33 = new TreeNode(68);
		TreeNode root34 = new TreeNode(-65);
		root22.left=root33;
		root22.right = root34;
		
		TreeNode root35 = new TreeNode(-76);
		TreeNode root36 = new TreeNode(-68);
		root23.left=root35;
		root23.right = root36;
		
		TreeNode root37 = new TreeNode(-44);
		TreeNode root38 = new TreeNode(88);
		root24.left = root37;
		root24.right= root38;
		

		System.out.println(isSymmetric(root));
	}

	// [7,-64,-64,-6,-90,-90,-6,88,-44,68,-65,-76,68,-44,88]

	public static boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null) {
			return true;
		}
		List<String> result = new ArrayList<String>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);

		while (!q.isEmpty()) {
			int size = q.size();
			StringBuffer s = new StringBuffer();
			for (int i = 0; i < size; i++) {
				TreeNode temp = q.poll();
				if (temp.left == null && temp.right != null) {
					return false;
				} else if (temp.left != null && temp.right == null) {
					return false;
				} else {
					s.append(Math.abs(temp.val));
					if (temp.left != null)
						q.add(temp.left);
					if (temp.right != null)
						q.add(temp.right);
				}
			}
			result.add(s.toString());
		}
		boolean finalResult = false;
		for (String str : result) {
			if (str.length() == 1) {
				continue;
			}
			char[] charTemp = str.toCharArray();
			Stack tempStack = new Stack<>();
			tempStack.push(charTemp[0]);
			for (int i = 1; i < charTemp.length; i++) {
				if ((char) tempStack.peek() == charTemp[i]) {
					tempStack.pop();
				} else {
					tempStack.push(charTemp[i]);
				}
			}
			if (tempStack.size() != 1 && tempStack.isEmpty()) {
				finalResult = true;
			} else {
				finalResult = false;
			}
		}

		return finalResult;
	}
}
