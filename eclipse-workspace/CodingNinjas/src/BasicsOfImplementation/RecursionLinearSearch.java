package BasicsOfImplementation;

public class RecursionLinearSearch {

	static int search7(int [] arr,int index)
	{
	
		if(arr[index]==7)
		{	
			return index;
		}
	    if(index==arr.length)
			return -1;	
		return search7(arr,index+1);
		
	}
	public static void main(String[] args) {
			
		int [] arr= {1,6,7,6,5};
		System.out.println(search7(arr,0));
	
	}

}
