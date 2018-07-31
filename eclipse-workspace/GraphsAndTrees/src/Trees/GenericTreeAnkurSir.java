package Trees;

public class GenericTreeAnkurSir {

}



package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class GenericTreeNode<T> {
	T data;
	ArrayList<GenericTreeNode<T>> children;

	GenericTreeNode(T data) {
		this.data = data;
		this.children = new ArrayList<>();
	
	Integer.MIN_VALUE;
	}
}

public class GenericTree {
	static Scanner s = new Scanner(System.in);
	//3 3 4 3 9 0 2 0 3 0 5 0 7 0 
	static GenericTreeNode<Integer> constructTree() {
		
		System.out.println("Enter data");
		int data = s.nextInt();
		GenericTreeNode<Integer> root = new GenericTreeNode<>(data);
		System.out.println("Enter no of children");
		int children = s.nextInt();
		for (int i = 0; i < children; i++) {
			root.children.add(constructTree());
		}
		return root;
	}
	
	
	
	void printGenericTreeLevel(GenericTreeNode<Integer> root){
		LinkedList<GenericTreeNode<Integer>> queue = new LinkedList<>();
		queue.addLast(root);
		
		while(!queue.isEmpty()){
			GenericTreeNode<Integer> node = queue.removeFirst();
			System.out.println(node.data);
			for(int i =0;i<node.children.size();i++){
				queue.addLast(node.children.get(i));
			}
		}
	}

	public static void main(String[] args) {

		
		MyQueue<Integer> queue = new MyQueue<>();
		queue.enqueue(8);
		queue.dequeue();
		
		
		
		
		GenericTreeNode<Integer> root = constructTree();
		printTree(root);

		// GenericTreeNode<Integer> root1 = new GenericTreeNode<>(1);
		// root1.children.add(new GenericTreeNode<>(2));
		// root1.children.add(new GenericTreeNode<>(3));
		// root1.children.add(new GenericTreeNode<>(4));
		// root1.children.get(0).children.add(new GenericTreeNode<>(5));
		// root1.children.get(0).children.add(new GenericTreeNode<>(6));

	}

	static void printTree(GenericTreeNode<Integer> root) {
		String str = root.data+": ";
		for (int i = 0; i < root.children.size(); i++) {
			str = str+ ", "+root.children.get(i).data;
		}
		System.out.println(str);
		for (int i = 0; i < root.children.size(); i++) {
			printTree(root.children.get(i));
		}
	}
	
	static void printTree1(GenericTreeNode<Integer> root) {
		System.out.println(root.data);
		for (int i = 0; i < root.children.size(); i++) {
			printTree1(root.children.get(i));
		}
	}
	
	
	
	
	static int countFunction(GenericTreeNode<Integer> root) {
		int count = 0;
		for (int i = 0; i < root.children.size(); i++) {
			int smallAns =  countFunction(root.children.get(i));
			count = count+smallAns;
		}
		return count+1;
	}
	
	
	
	
	static int height(GenericTreeNode<Integer> root) {
		int maxHeight = 0;
		for (int i = 0; i < root.children.size(); i++) {
			int curtentHeight =  height(root.children.get(i));
			if(maxHeight<curtentHeight){
				maxHeight = curtentHeight;
			}
		}
		return maxHeight+1;
	}
	
	
	
	
	
	
	
	static GenericTreeNode<Integer> largest(GenericTreeNode<Integer> root) {
		GenericTreeNode<Integer> currentLargest = root;
		for (int i = 0; i < root.children.size(); i++) {
			GenericTreeNode<Integer> smallAns =  largest(root.children.get(i));
			if(currentLargest.data.compareTo(smallAns.data)<0){
				currentLargest = smallAns;
			}
		}
		return currentLargest;
	}
	
	
	
	
	
	
	
	
	
	
	int secondLargest(GenericTreeNode<Integer> root){
		return secondLargest1(root).secondLargest;
	}
	
	
	
	SecondLargest secondLargest1(GenericTreeNode<Integer> root){
		SecondLargest result = new SecondLargest(root.data, Integer.MIN_VALUE);
		
		for(int i =0;i<root.children.size();i++){
			SecondLargest smallAns = secondLargest1(root.children.get(i));
			if(result.firstLargest<smallAns.firstLargest){
				int first = root.data;
				int second = smallAns.firstLargest;
			}else{
				if(root.data>smallAns.secondLargest){
					int first = smallAns.firstLargest;
					int second = root.data;
				}
			}
			
		}
	}
	
}


class SecondLargest{
	int firstLargest;
	int secondLargest;
	public SecondLargest(int firstLargest, int secondLargest) {
		this.firstLargest = firstLargest;
		this.secondLargest = secondLargest;	
	}
}