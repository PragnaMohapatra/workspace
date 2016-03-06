package com.amazon.interview;

public class LeastCommonAncestor {

	public static void main(String[] args) {

		
		Node Node1= new Node(30);
		Node Node2= new Node(25);
		Node Node3= new Node(40);
		Node Node4= new Node(40);
		Node Node5= new Node(22);
		Node Node6= new Node(27);
		Node Node7= new Node(35);
		Node Node8= new Node(45);

		Node1.left=Node2;
		Node1.right = Node3;
		Node2.right=Node6;
		Node2.left = Node5;
		
		Node3.right=Node7;
		Node3.left = Node8;

		System.out.println(lca(Node1,Node5,Node8).data);
		
	}

	public static Node lca(Node root, Node n1, Node n2) {

		if (root == null) {
			return null;
		}
		if (n1 == null && n2 == null) {
			return null;
		}
		if (n1.data < root.data && n2.data < root.data) {
			return root = root.left;
		} else if (n1.data > root.data && n2.data > root.data) {
			return root = root.right;
		}
		return root;
	}
}

class Node {

	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}