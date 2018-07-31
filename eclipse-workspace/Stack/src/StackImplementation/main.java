package StackImplementation;

public class main {

	
	

public static void main(String[] args)
{
	
//	Stack st=new Stack();
//	
//	for(int i=0;i<10;i++)		//pushing elements
//		st.push(i);
//	
//	for(int i=0;i<10;i++)		//pop elements
//		System.out.println(st.pop());
	
	
	StackUsingLinkedList<Character> S=new StackUsingLinkedList<>();
	
	char ch='A';
	for(int i=0;i<10;i++)
		S.push(ch++);
	
	for(int i=0;i<10;i++)
		System.out.println(S.pop());

	
}


}
