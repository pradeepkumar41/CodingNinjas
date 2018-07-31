package DataStructure;

import java.util.Scanner;

class Node{

	int data;
	Node next;

	Node(int d){
		data=d;

	}

}


public class LinkedList {


	static Node prepareLinkList() {

		Scanner s=new Scanner(System.in);

		int data=s.nextInt();
		Node head=null;
		Node tail=null;
		while(data!=-1) {

			Node newnode=new Node(data);

			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else
			{
				tail.next=newnode;			//tail is required to reduce the time compexity
				tail=tail.next;				//without tail order of n square
			}

			data=s.nextInt();		
		}
		
		return head;
	}
	
	static void print(Node head) {

		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +"-->");
			temp=temp.next;
		}
		System.out.print("null");

	}

	static void printRecursively(Node head) {
			
		if(head==null) {
			return;
		}
		else
		{
			System.out.print(head.data+" ");
			printRecursively(head.next);			
		}

	}
	
	static void printRecursivelyReverse(Node head) {
		
		if(head==null) {
			return;
		}
		else
		{
			
			 printRecursivelyReverse(head.next);			
			 System.out.print(head.data+"-->");
		}

	}
	
	
	
	
	
	

public static void main(String[] args) {
	
	Node head=prepareLinkList();
	//print(head);
	//System.out.println();
	//System.out.println("Using Recursion");
	
	//printRecursively(head);
	//System.out.println("Null");
	
	System.out.println("reverse order ");
	printRecursivelyReverse(head);
	
	
	
}
}
