package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class GenericTreeNode<T>{

	T data;
	ArrayList<GenericTreeNode<T>> children;


	GenericTreeNode(T data){
		this.data=data;
		this.children=new ArrayList<>();	//children array list
	}

}

public class GenericTree {


	static Scanner s=new Scanner(System.in);
	// 3 3 4 3 9 0 2 0 3 0 5 0 7 0

	/*
	 * Question to finish
	 * 1.Count number of nodes
	 * 2.Sum of all Nodes
	 * 3.Largest data in tree
	 * 4.total No. of Nodes>k
	 * 5.height of the tree
	 * 
	 *
	 * 
	 * */






	static GenericTreeNode<Integer> constructTree(){

		System.out.println("Enter data");
		int data=s.nextInt();

		GenericTreeNode<Integer> root=new GenericTreeNode<>(data);

		System.out.println("Enter Number of children");
		int children=s.nextInt();

		for(int i=0;i<children;i++) {
			root.children.add(constructTree());
		}
		return root;
		
	
		
		
	}
	
	
	
	static void printTree1(GenericTreeNode<Integer> root)
	{
		System.out.println(root.data);
		
		for(int i=0;i<root.children.size();i++)
		{
			printTree1(root.children.get(i));
		}
	}
	
	
	
	//1. Count Number of Nodes in the tree
	static int countNodes(GenericTreeNode<Integer> root)
	{
		int count=0;	
		for(int i=0;i<root.children.size();i++)
		  count=count+countNodes(root.children.get(i));
		return count+1;	//count plus 1 for the root node itself
		
	}
	
	
	
	
	
	
	
	
	
	
	
	static  int sumOfAllNodes(GenericTreeNode<Integer> root)
	{
		int sum=0;	
		for(int i=0;i<root.children.size();i++)
		  sum=root.children.get(i).data + sumOfAllNodes(root.children.get(i));
		return sum+root.data;	//count plus 1 for the root node itself
		
	}
	

	
	static  GenericTreeNode<Integer> largestDataInTree(GenericTreeNode<Integer> root)
	{
		GenericTreeNode<Integer> largest=root;	
		
		for(int i=0;i<root.children.size();i++)
		  {
			GenericTreeNode<Integer> max=largestDataInTree(root.children.get(i));
			
			if(largest.data.compareTo(max.data)<0)
				largest=max;
		  }
		return largest;	//count plusor the root node itself
		
	}
	
	
	
	static int heightTree(GenericTreeNode<Integer> root)
	{
		int height=0;
		
		for(int i=0;i<root.children.size();i++)
		{  int currentHeight= heightTree(root.children.get(i));
			if(currentHeight>height)
				height=currentHeight;
		}
		return height+1;
	}
	
	
	//__________________________Breath First Search______________________
	
	void printGenericTreeLevel(GenericTreeNode<Integer> root)
	{
		LinkedList<GenericTreeNode<Integer>> queue=new LinkedList<>();
		
		queue.addLast(root);
		
		while(!queue.isEmpty()) {
			
			GenericTreeNode<Integer> node=queue.removeFirst();
			System.out.println(node.data);
			
			for(int i=0;i<node.children.size();i++) {
				queue.addLast(node.children.get(i));
			}
			
		}
		
		
		
		
		
	}
	
	//___________________________________________________________________
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		constructTree();
		
		
		
	}
	
	
	


}
