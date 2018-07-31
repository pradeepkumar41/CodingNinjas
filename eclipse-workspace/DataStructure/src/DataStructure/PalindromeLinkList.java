package DataStructure;

class NodePalindrome {

	public int data;
	public NodePalindrome next;
	public NodePalindrome(int data) {
		this.data=data;
		//	  	this.next = null;
	}
}

public class PalindromeLinkList {

	static NodePalindrome getMidNode(NodePalindrome head)
	{	NodePalindrome slow,fast,prev;
	slow=head;
	fast=head;
	prev=null;
	while(fast!=null)
	{if(fast.next==null || fast.next.next==null)
		break;
	fast=fast.next.next;
	//prev=slow;
	slow=slow.next;		//slow is going one step at each iteration
	}
	return slow;	//pointer to the mid node
	}
	
	static void reverseIterativeHalf(NodePalindrome head)
	{
		NodePalindrome mid=getMidNode(head);
		NodePalindrome prev,current,next;
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
		//link list is reversed now;
	}
	static NodePalindrome getTail(NodePalindrome head)
	{
		NodePalindrome temp=head;
		while(temp.next!=null)
			temp=temp.next;
		return temp;
	}

	static int length(NodePalindrome head) {
		NodePalindrome  temp=head;
		int length=0;
		while(temp!=null) {
			temp=temp.next;
		}
		return length;
	}

	static boolean checkPalindrome(NodePalindrome head)
	{
		int length=length(head),loop;
		NodePalindrome start=head;
		NodePalindrome end=getTail(head);	//tail of the link list
		reverseIterativeHalf(head);	//half portion is reversed

		if(length%2!=0)		//if length is odd
			loop=length/2;
		else				// if length is even	
			loop=length/2-1;
		while(loop!=0) {
			if(start.data!=end.data)
				return false;
			start=start.next;
			end=end.next;
			if(start.equals(end))	//happens in the case of odd length
				return true;
			loop--;
		}	
		if(loop==0)					//happens in the case of even lengthjj
			if(start.data!=end.data)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		
	
		
	}





}
