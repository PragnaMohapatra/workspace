package com.amazon.interview;

public class LeastCommonAncestor {

	public static void main(String[] args) {

		
		TreeNode TreeNode6= new TreeNode(6);
		TreeNode TreeNode2= new TreeNode(2);
		TreeNode TreeNode8= new TreeNode(8);
		TreeNode TreeNode0= new TreeNode(0);
		TreeNode TreeNode4= new TreeNode(4);
		TreeNode TreeNode7= new TreeNode(7);
		TreeNode TreeNode9= new TreeNode(9);
		TreeNode TreeNode3= new TreeNode(3);
		TreeNode TreeNode5= new TreeNode(5);
	
		TreeNode6.left = TreeNode2;
		TreeNode6.right = TreeNode8;
		TreeNode2.left = TreeNode0;
		TreeNode2.right = TreeNode4;
		TreeNode8.left =TreeNode7;
		TreeNode8.right = TreeNode9;
		TreeNode4.left =TreeNode3;
		TreeNode4.right=TreeNode5;
		
		
		
		

		System.out.println(lowestCommonAncestor(TreeNode6,TreeNode5,TreeNode3).data);
		
	}
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null) {
			return null;
		}
		if (p == null && q == null) {
			return null;
		}
		if (p.data < root.data && q.data < root.data) {
			return root = lowestCommonAncestor(root.left,p,q);
		} else if (p.data > root.data && q.data > root.data) {
			return root = lowestCommonAncestor(root.right,p,q);
		}
		return root;
	}
}

class TreeNode {

	int data;
	TreeNode left, right;

	TreeNode(int item) {
		data = item;
		left = right = null;
	}
}