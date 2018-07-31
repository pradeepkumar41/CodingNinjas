
public class WeirdNumberPattern {

	static int lastNonZero(int [] arr)
	{
		int i=0;
		while(arr[i]!=0)
		{
			i++;	
		}
		return i-1;
		
	}
	
	static int countContinuesFrequency(int [] arr,int start)
	{
		int freq=1;
		for(int i=start;i<=lastNonZero(arr);i++)
		{
			if(arr[start]==arr[i+1])
			 freq++;
			else
			{
				break;
				
			}
			
		}
		return freq;
		
		
		
		
		
	}
	
	
		public static void printPattern(int n) {
			// Write your code here


			int  arr[]=new int[100];
			arr[0]=1;
			
			for(int i=1;i<=n;i++)
			{
				
				//print Array
				int lastIndex=lastNonZero(arr);
				for(int k=0;k<=lastIndex;k++)
					System.out.print(arr[k]);
				
				int index=0;int q=0;
				int  temp[]=new int[100];
				for(int p=0;p<=lastIndex;p++)
				{
					int freq=countContinuesFrequency(arr, index);
					temp[q]=freq;
					temp[q+1]=arr[p];
					q++;
					index=index+freq;
					
					
				}
				
				arr=temp;
				
			
			System.out.println();
			}
	      
		}
	
		public static void main(String[] args) {
			printPattern(6);
			
		}


}

	
	

