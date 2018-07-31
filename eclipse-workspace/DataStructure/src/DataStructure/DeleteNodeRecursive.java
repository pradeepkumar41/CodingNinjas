package DataStructure;


	/*************** 
	 * Following is the Node class already written 
	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}
	 ***************/

	public class DeleteNodeRecursive {

		public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int pos){

			return deleteIthNode1(head, head, 0, pos);
		}
		public static LinkedListNode<Integer> deleteIthNode1(LinkedListNode<Integer> head,LinkedListNode<Integer> temp,int currentpos, int pos){

			if(head==null){	//if head is null
				return head;
			}

			if(pos==1){			//if position to be deleted is first
				head=head.next;
				return head;
			}
			
			if(temp.next!=null)
			{
				if(currentpos==pos-1){

					temp.next=temp.next.next;		//deleting the node
					return head;
				}
				return deleteIthNode1(head, temp.next, currentpos+1, pos);

			} 
			return head;		


		}
	}

