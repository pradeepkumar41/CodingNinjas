package LinkListQuestion;

import java.util.Scanner;

//class node {
	public int data;
	public node next;
	public node(int data) {
		this.data=data;
		//	  	this.next = null;
	}
}

public class AppendNthElement {


	//1 2 3 4 5 6 7     //k=3
	//output: 5 6 7 1 2 3 4 


	static node AppendKthElement(node head,int k) {

		int length=length(head);
if(k==0 || k>length)
	return head;
else
{
	int loop=length-k;				//length =5 k=3 reach 2 nd element
	node tail=getTail(head);
	node temp=head;
	node prev=null;
	while(loop>0) {
		prev=temp;
		temp=temp.next;		
		loop--;
	}
	//pointer to the kth node is obtained
	node current=temp;
	//node next=temp.next;	
	tail.next=head;	
	head=current;
	prev.next=null;
}
		return head;
	}
	
	static node getTail(node head)
	{
		node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		return temp;
	}


	static node prepareLinkList() {
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		node head=null;
		node tail=null;
		while(data!=-1) {
			node newnode= new node(data);
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
		s.close();
		
		return head;
	}

	static void printRecursively(node head) {
		if(head==null) {
			return;
		}
		else
		{
			System.out.print(head.data+" ");
			printRecursively(head.next);			
		}
	}
	
	
	
	static int length(node head) {
		node  temp=head;
		int length=0;
		while(temp!=null) {
			temp=temp.next;length++;
		}
		return length;
	}
	
public static void main(String[] args) {
	
	node head=prepareLinkList();
	node finalhead=AppendKthElement(head,3);
	printRecursively(finalhead);
	
}
	
	
	
	
	
	
}






