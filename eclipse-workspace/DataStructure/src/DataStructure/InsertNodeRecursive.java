package DataStructure;

import LinkListQuestion.Node;

//* Following is the Node class already written 

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}

}

public class InsertNodeRecursive {

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
	
public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){
				
	
	     			return insertR1(head, head, data , pos,0);				
		
}

static LinkedListNode<Integer> insertR1(LinkedListNode<Integer> head,LinkedListNode<Integer> temp, int data, int pos,int currentpos){

	if(pos==0) {
		LinkedListNode<Integer> newnode=new LinkedListNode(data);
		newnode.next=head;
		head=newnode;
		return head;
	}
	
	if(temp!=null)
	{
		if(currentpos==pos-1) {
		LinkedListNode<Integer> newnode=new LinkedListNode(data);
		newnode.next=temp.next;
		temp.next=newnode;
		return head;
	
	}
		return insertR1(head, temp.next, data, pos, currentpos+1);

	}
	else {
		return head;
	}

 }

}
	

