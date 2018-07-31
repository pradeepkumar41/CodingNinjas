
public class AllIndicesOf7 {

	static int[] allIndicesOf7(int [] input,int index)
	{		
		if(index==input.length)
		{
			int arr[]=new int[0];
			return arr;			
		}
		//function calling
		int smallAns[]=allIndicesOf7(input,index+1);
		if(input[index]==7) {
			
			int finalAns[]=new int [smallAns.length+1 ];
			finalAns[0]=index;
			for(int i=0;i<smallAns.length;i++)
			{
				finalAns[i+1]=smallAns[i];
			}	
			return finalAns;
		}
			return smallAns;	
	}	
	
	
	public static void main(String[] args) {	
		int [] arr= {1,2,3,7,8,7,8,7};
		int [] answer=allIndicesOf7(arr, 0);
		for(int i=0;i<answer.length;i++)
		{
			System.out.print(answer[i]+" ");
		}

	}


	
	
	
	
	
}
