package DataStructure;

import LinkListQuestion.Node;

class Node {
	public int data;
	public node next;
	public node(int data) {
		this.data=data;
		//	  	this.next = null;
	}
}



public class AppendToNthElement {

	//1 2 3 4 5 6 7     //k=3
	//output: 5 6 7 1 2 3 4 


	static Node AppendKthElement(Node head,int k) {


		int length=length(head);

		int loop=length-k;				//length =5 k=3 reach 2 nd element
		Node tail=getTail(head);
		Node temp=head;
		Node prev=null;
		while(loop>0) {
			prev=temp;
			temp=temp.next;		
			loop--;
		}
		//pointer to the kth node is obtained
		Node current=temp;
		Node next=temp.next;	
		tail.next=head;	
		head=current;
		prev.next=null;

	}



	static node getTail(node head)
	{
		node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		return temp;
	}


	static int length(node head) {
		node  temp=head;
		int length=0;
		while(temp!=null) {
			temp=temp.next;length++;
		}
		return length;
	}












}
