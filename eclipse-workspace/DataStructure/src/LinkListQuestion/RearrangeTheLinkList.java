package LinkListQuestion;

import java.util.Scanner;



class node {
	public int data;
	public node next;
	public node(int data) {
		this.data=data;
		//	  	this.next = null;
	}
}

public class RearrangeTheLinkList {

	
	
	
	
	
	
	static node getTail(node head)
	{
		node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		return temp;
	}

	static node reverseIterativeHalf(node head)
	{
		node mid=getMidNode(head);
		node prev,current,next;
		prev=mid;
		current=mid.next;
		next=mid.next.next;

		while(current!=null)
		{ current.next=prev;
		prev=current;
		current=next;
		if(next!=null)
			next=next.next;
		}
		
		return  head;

		//link list is reversed now;
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

	static node getMidNode(node head)
	{
		node slow,fast;
		slow=head;
		fast=head;
	
		while(fast!=null)
		{if(fast.next==null || fast.next.next==null)
			break;
		fast=fast.next.next;
		//prev=slow;
		slow=slow.next;		//slow is going one step at each iteration
		}
		return slow;	//pointer to the mid node
	}
	
	
	public static node changelist(node head) {
		
		node mid=getMidNode(head);
		
		node head1=head;
		node head2=mid.next;
		mid.next=null;
		
		head2=reverseIterative(head2);
		
		return alternatePick(head1,head2);
		
	}
	static node alternatePick(node head1, node head2){
		node head,tail;
		head = tail = head1;
		head1 = head1.next;
		boolean flag = true;
		while(head1!=null&&head2!=null){
			if(flag){
				tail.next = head2;
				head2= head2.next;
				
			}else{
				tail.next = head1;
				head1= head1.next;
			}
			flag = !flag;
			tail = tail.next;
		}
		if(head1!=null){
			tail.next = head1;
		}
		if(head2!=null){
			tail.next = head2;
		}
		return head;
	}
	
	

	static node reverseIterative(node head)
	{
		node prev,current,next,temp=head;
		prev=null;
		current=temp;
		next=temp.next;

		while(current!=null)
		{	current.next=prev;
		prev=current;
		current=next;
		if(next!=null)
			next=next.next;
		}
		return prev;
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


	public static void main(String[] args) {
		
		node head=prepareLinkList();
		//head=changelist(head);
		
		head=changelist(head);
	
		printRecursively(head);
		

		
		
	}

	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
