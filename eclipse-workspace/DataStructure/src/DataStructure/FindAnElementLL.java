package DataStructure;

public class FindAnElementLL {

	public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
		
		LinkedListNode<Integer> temp=head;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==n)
				return index;
			temp=temp.next;
			index=index+1;		
		}
		return -1;	//element not present in the entire list		
	}
}
