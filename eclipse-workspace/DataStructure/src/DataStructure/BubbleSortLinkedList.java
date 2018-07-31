package DataStructure;

public class BubbleSortLinkedList {


	static int length(LinkedListNode<Integer> head) {

		LinkedListNode<Integer> temp=head;

		int length=0;
		while(temp!=null) {
			temp=temp.next;
			length++;	
		}
		return length;
	}




	static LinkedListNode<Integer> deleteIth(LinkedListNode<Integer> head,int i)
	{
		if(i==0) {			
			head=head.next;		
			return head;
		}
		else {
			LinkedListNode<Integer> node,temp=head;
			int loop;
			loop=i-1; 
			while(loop!=0)
			{
				temp=temp.next;
				loop--;
			}
			node=temp.next;			//saving the address of  first Node
			temp.next=temp.next.next;
			return node;
		}	
	}

	static LinkedListNode<Integer> InsertIth(LinkedListNode<Integer> head,LinkedListNode<Integer> node,int i){

		if(i==0) {	
			node.next=head;
			head=node;
			return head;
		}
		else {

			LinkedListNode<Integer>temp=head;
			int loop;
			loop=i-1;
			while(loop!=0) {
				temp=temp.next;
				loop--;
			}
			node.next=temp.next;
			temp.next=node;

			return head;
		}

	}

	static LinkedListNode swap(LinkedListNode head,int i,int j)
	{

		//delete ith node
		LinkedListNode node1,node2;

		node1=deleteIth(head, i); //delete and save i			//saving the address of  first Node

		node2=deleteIth(head, j);	//delete and save j

		head=InsertIth(head, node1, i);

		head=InsertIth(head, node2, i);

		return head;
	}


	
	
	
	static LinkedListNode bubbleSort(LinkedListNode head)
	{

		int n=length(head);
		int k=0,l=0;
		for(int i=0;i<n;i++) 
		{

			k=0;l=1;
			LinkedListNode previous=null,next=head.next,current=head;
			LinkedListNode first= head;
			LinkedListNode second=head.next;
			for(int j=0;j<n-i;j++) 
			{
				if(first.data.compareTo(second.data)<0)
				{
					//update


					k++;
					first=second;		//update the pointers
					second=second.next;  	

				}
				else {
										
					first=second;		//update the pointers
					second=second.next;  	
					k++;
				}
			}
		}
	}
	
	

	
	
}
