package DataStructure;

import java.util.Scanner;



class mergeNode {
	int data;
	mergeNode next;

	public mergeNode(int data) {
		this.data = data;
	}
}


public class MergeTwoLL {

	//Supporting Function for Creating Link List


	//Merge Function 
	public static mergeNode mergeTwoList(mergeNode head1, mergeNode head2) {


		mergeNode mergehead=null,current=null;	//variables for new LL	

		mergeNode temp1,temp2;		
		temp1=head1;
		temp2=head2;

		//step to initilse the final linked list
		if(temp1.data>temp2.data) {

			mergehead=temp2;
			temp2=temp2.next;

		}
		else
		{
			mergehead=temp1;
			temp1=temp1.next;

		} 

		current=mergehead;

		while(temp1!=null && temp2!=null)
		{	
			if(temp1.data>temp2.data)
			{
				current.next=temp2;
				temp2=temp2.next;	//increment the LL 2 pointer
			}
			else
			{
				current.next=temp1;
				temp1=temp1.next;	//increment the LL 2 pointer	
			}
			current=current.next;	//increment the current pointer

		}

		if(temp1!=null)
		{
			current.next=temp1;

		}
		else
		{
			current.next=temp2;
		}
		return mergehead;
	}



	//Supporting Functions
	static void printRecursively(mergeNode head) {
		if(head==null) {
			return;
		}
		else
		{
			System.out.print(head.data+" ");
			printRecursively(head.next);			
		}
	}

	static mergeNode prepareLinkList() {

		Scanner s=new Scanner(System.in);

		int data=s.nextInt();
		mergeNode head=null;
		mergeNode tail=null;
		while(data!=-1) {

			mergeNode newnode=new mergeNode(data);

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


	public static void main(String[] args) {

		mergeNode head1=prepareLinkList();
		mergeNode head2=prepareLinkList();

		mergeNode head3=mergeTwoList(head1, head2);		
		printRecursively(head3);



	}



}






