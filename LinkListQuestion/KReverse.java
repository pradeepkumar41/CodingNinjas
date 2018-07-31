package LinkListQuestion;

import java.util.Scanner;

class nodekreverse {
	public int data;
	public nodekreverse next;
	public nodekreverse(int data) {
		this.data=data;
		//	  	this.next = null;
	}
}
public class KReverse {

	static nodekreverse reverseK(nodekreverse head,int k)
	{

		
	nodekreverse prev=null;
	nodekreverse curr=head;
	int l=k;
	while(curr!=null && l>0){
		l--;
		nodekreverse next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;

	}
	if(curr!=null)
	 head.next=reverseK(curr,k);	//attaching the head of with the output of the recursion
	return prev;

	}
	
	public static void main(String[] args) {
		
		nodekreverse head=prepareLinkList();
		 head=reverseK(head,4);
		 printRecursively(head);
		
	}
	
	


	static void printRecursively(nodekreverse head) {
		if(head==null) {
			return;
		}
		else
		{
			System.out.print(head.data+" ");
			printRecursively(head.next);			
		}
	}


	static nodekreverse prepareLinkList() {
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		nodekreverse head=null;
		nodekreverse tail=null;
		while(data!=-1) {
			nodekreverse newnode= new nodekreverse(data);
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










}
