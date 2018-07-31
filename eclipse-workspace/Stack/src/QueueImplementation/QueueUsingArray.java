package QueueImplementation;

import StackImplementation.main;

class queueFullException extends Exception{

}
class queueEmptyException extends Exception{
	
}
public class QueueUsingArray {


	private int arr[];

	public QueueUsingArray() {

		arr=new int[10];

	}

	public QueueUsingArray(int size) {

		arr=new int[size];

	}


	private int count=0;
	private int start=-1;
	private int end=-1;
	
	public void enqueue(int data) throws queueFullException {

		if(isFull()) {
			throw new queueFullException();
		}
		else 
		{
			if(start==-1)
				start++;
			end=(end+1)%arr.length;
			arr[end]=data;	
			count++;
			System.out.println("Enqueued"+data);
		}
	}
	
	public void  dequeue() throws queueEmptyException {
		int temp;
		if(isEmpty()) {
			throw new queueEmptyException();
		}
		else {
			 temp=arr[start];
			start=(start+1)%arr.length;
			count--;	//decrement the number of elements in the queue
			System.out.println("dequed"+temp);
		}
		
		if(count==0)				//if queue became empty then reInitialise the system
			start=end=-1;
		//return temp;
	}

	boolean isEmpty(){

		return count==0;
	}

	boolean isFull(){

		return count==arr.length;

	}

	
	public static void main(String[] args) {
		
		
		
		QueueUsingArray queue=new QueueUsingArray();
		
		for(int i=0;i<10;i++)
		{
			try {
				queue.enqueue(i);
			} catch (queueFullException e) {
				e.printStackTrace();
			}
			
		}
		
		for(int i=0;i<10;i++)
		{
			
			try {
				queue.dequeue();
			} catch (queueEmptyException e) {
				e.printStackTrace();
			}
		
	    }


	}
	

}
