package BasicsOfImplementation;

import java.util.ArrayList;

public class SmallestSubarrayWithRequiredSum {

	public static void main(String[] args) {
	
		int [] arr= {1,2,3,4,5,6,7,8};
		
		smallestSubArray(arr, 10);
		
	
	
	}

	static void print(int [] input,int start,int end) {
		for(int i=start;i<=end;i++) {
			System.out.print(input[i]+" ");
		}
	}
	
	
	
	
static void smallestSubArray(int []arr,int x) {
	
	int min=0;
	int max=0;
	int length;
		int min_length=arr.length; int sum=0;
	int l=0; int i=0 ,j=0;
	while(i<arr.length && j<arr.length) {
		if(!(i==j))
		  sum+=arr[j];
		else {
		  sum+=arr[i]; 
		}
		
		if(sum>x) {
			
			length=j-i+1;
			if(length<min_length) {
				min_length=length;
				min=i; max=j;
				i++;
				sum=0;
				j=i;
			}
			else {
				
				sum=0;
				i++;
				j=i;
				
			}
			
		}
		else
			{   j++;   }
		
	}
	
	print(arr, min, max);
	
}


}

	
	
