
public class LastIndexOfNumber {

	public static int lastIndex(int input[], int x) {	
	     return lastIndex2(input,x,0);
		}
	static int lastIndex2(int input[],int x,int index)
	{	
		if(input.length==index)
		{
			return -1;		
		}
		else
		{
			int elementIndex=lastIndex2(input,x,index+1);	
			if(elementIndex==-1)
			{
				if(input[index]==x)
					return index;	
			}
			return elementIndex;
		
		}
		
	}
   
public static void main(String[] args) 
{
	
	int [] arr= {1,2,7,4,5,6,9,7,8,7};
	System.out.println(lastIndex(arr, 7));
	
}


}
	
	
