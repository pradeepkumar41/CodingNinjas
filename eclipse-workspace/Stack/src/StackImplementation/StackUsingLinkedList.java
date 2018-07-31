package StackImplementation;


class  Node<T>{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
	}
}



public class StackUsingLinkedList<T> {

	Node<T> top=null;
	int size=0;
	void push(T data) {
		Node<T> node =new Node<>(data);
		node.next=top;
		top=node;
		size++;
	}
	
	T pop() {
		
		Node <T>temp=top;
		top=top.next;
		size--;
	    return temp.data;
	}
	
	int size()
	{
		return size;
	}
	


}
