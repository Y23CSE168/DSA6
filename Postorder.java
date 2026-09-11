package DSA6;

import DSA6.InorderTraversal.Node;

public class Postorder {
	static class Node {
		int data;
		Node left; 
		Node right;
		Node(int data) {
			this.data = data;
		}
	}
	static void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(70);
		root.left.left = new Node(20);
		root.left.right = new Node(40);
		root.left.right.left = new Node(35);
		root.right.left = new Node(60);
		root.right.right = new Node(80);
		System.out.println("postorder Traversal:");
		postorder(root);
	}

}
