package Trees;


import java.util.Scanner;

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class BinaryTreePractise {

	static Scanner s = new Scanner(System.in);

	static BinaryTreeNode<Integer> constructTree() {
		int data = s.nextInt();
		if (data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		System.out.println(root.data);
		root.left = constructTree();
		root.right = constructTree();
		return root;
	}

	void formattedTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + ": ";
		if (root.left != null) {
			toBePrinted = toBePrinted + root.left.data + " , ";
		}
		if (root.right != null) {
			toBePrinted = toBePrinted + root.right.data;
		}
		System.out.println(toBePrinted);
		formattedTree(root.left);
		formattedTree(root.right);

	}

	int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}

	
	boolean search(BinaryTreeNode<Integer> root, int elem){
		if(root==null){
			return false;
		}
		if(root.data.equals(elem)){
			return true;
		}
		return search(root.left,elem)|| search(root.right,elem);
	
	
		Math.ab
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	int height1(BinaryTreeNode<Integer> root) {
		return root == null ? 0 : Math.max(height1(root.left),height1(root.right)) + 1;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		printTree(root.left);
		printTree(root.right);
		System.out.println(root.data);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = constructTree();
		printTree(root);
		// 2 5 9 -1 -1 6 -1 -1 7 -1 -1
//2 5 7 11 -1 -1 8 -1 -1 6 9 -1 -1 10 -1 -1
		// BinaryTreeNode<Integer> root = new BinaryTreeNode<>(2);
		// root.left = new BinaryTreeNode<>(5);
		// root.right = new BinaryTreeNode<>(7);
		// root.left.left = new BinaryTreeNode<>(9);
		// System.out.println();
	}
}
