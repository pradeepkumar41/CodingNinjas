
public class quickSort {

	static int getindex(int [] arr,int start,int end)
	{
//		int count=0; int pivot=arr[start];
//		for(int i=start+1;i<=end;i++) {
//			if(arr[i]<=pivot)
//				count++;
//		}
//		int temp=arr[start];
//		arr[start]=arr[start+count];
//		arr[start+count]=temp;
			
		if(start<end) {
		 int count=start;
		   for(int i=start+1;i<arr.length;i++)
		   {
			   if(arr[i]<arr[start])
				   count++;
		   }
		   int temp=arr[count];
		   arr[count]=arr[start];
		   arr[start]=temp;
  
		   int i=start,j=end;
		   while(i<count&&j>count)
		   {
			   if(arr[i]<arr[count])
				   i++;
			   else if(arr[j]>arr[count])
				   j--;
			   else
			   {
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=arr[i];
				   i++;
				   j--;
			   }
		   }
		    return count;
		}
		return -1;
		
	}
		
	static void quicksort(int [] arr,int start,int end) {
		
		if(start<end) {
			int q=getindex(arr,start,end);	
			
			//function placing the pivot at its correct position
			if(q!=-1)
			{quicksort(arr,start,q-1);
			quicksort(arr,q+1,end);	
			}
		}
		else
			return;
	}
	
	public static void main(String[] args) {	
		int [] arr= {5,4,3,2,1,9,10,11,12,13,-1,-2,1,2,1,2};
//		System.out.println(getindex(arr,0, arr.length-1));
		quicksort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
	}
	
	
	
	
}

