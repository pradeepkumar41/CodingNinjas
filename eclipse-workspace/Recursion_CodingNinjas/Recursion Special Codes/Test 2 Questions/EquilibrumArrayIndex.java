


public class EquilibrumArrayIndex{	
	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){  
	
		int sum[]=new int[arr.length];
		int index=-1;
		sum[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			sum[i]=arr[i]+sum[i-1];				//creating sum array
			
		}
		
		for(int i=1;i<arr.length-1;i++)
		{	
			if(sum[i-1]==sum[arr.length-1]-sum[i])
				{
					index=i;
					break;
				
				}
			
		}
	
		if(index!=-1)
		{
			int value=sum[index]-sum[index-1];
			int elementIndex=0;
			for(int k=0;k<arr.length;k++)
			{
				if(arr[k]==value)
					elementIndex=k;
				
			}
			return elementIndex;
			
			
			
		}
		else
			return index;
	
	}
	
	public static void main(String[] args) {
		
		int [] arr= {-7,1,5,2,-4,3,0};
		System.out.println(arrayEquilibrium(arr));
		
	}
	
	
}