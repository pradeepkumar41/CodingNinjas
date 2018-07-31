package DataStructure;



class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}




public class MergeLLRecusively {

	
static LinkedListNode<Integer>getMidNode(LinkedListNode<Integer> head){
	
	LinkedListNode<Integer> slow=head,fast=head,prev=null;
	
	while(fast!=null) {
	
		if(fast.next==null || fast.next.next==null)
			break;
		fast=fast.next.next;
		prev=slow;
		slow=slow.next;	
		
	}
	return prev;	//pointer to the mid node 
}
	

static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head)
{
		
	//break after mid
	//create head2
	//rec on head
	//rec on head2
	
	if(head==null || head.next==null)
	{
		return null;
	}
	
	
	LinkedListNode<Integer> mid=getMidNode(head);
		LinkedListNode<Integer> head2=mid.next;
		mid.next=null;
		head=mergeSort(head);	//left part
		head2=mergeSort(head2);	//right part
		
		LinkedListNode<Integer> finalNode=merge(head,head2);
		return finalNode;

}

static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2)
{	

	LinkedListNode<Integer> head=null,tail=null;
	if(head1.data.compareTo(head2.data)>0) {
		head=tail=head2;
		head2=head2.next;
	}
	else
	{
		head=tail=head1;
		head1=head1.next;
	}
	
	while(head1!=null && head2!=null) {
		if(head1.data.compareTo(head2.data)>0)
		{
			tail.next=head2;
			head2=head2.next;
			
		}
		else {
			tail.next=head1;
			head1=head1.next;
			
		}
		tail=tail.next;
	}
	
	if(head1!=null) {
		tail.next=head1;
	}
	
	if(head2!=null) {
		tail.next=head2;
	}
	
	return head;
}
	
	
	
	
	
	
	
}
