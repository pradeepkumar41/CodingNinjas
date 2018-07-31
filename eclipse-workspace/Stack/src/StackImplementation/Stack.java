package StackImplementation;

//
//stack implement using link list

class node{

	int data;
	node next;
	node(int data)
	{
		this.data=data;
	}

}


public class Stack{

 node top=null;

 void push(int data){

	//create node
	node newnode=new node(data);

//stack is empty
	if(top==null){
		top=newnode;
	}
	else{

		newnode.next=top;
		top=newnode;
	}
}

 int pop()
{
	if(top==null)
		isEmpty();
	node temp=top;
	top=top.next;
	return temp.data;
	
}

public void isEmpty() throws StackOverflowError{

if(top==null)
	throw new StackOverflowError();
}


}
