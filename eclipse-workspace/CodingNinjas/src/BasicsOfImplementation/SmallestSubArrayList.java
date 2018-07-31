package BasicsOfImplementation;

import java.util.ArrayList;

public class SmallestSubArrayList {

	public static void main(String[] args) {
	
		ArrayList <Integer> arr=new ArrayList();
		smallestSubArray(arr, 10);
		
	
	
	}

	static void print(ArrayList <Integer> arr,int start,int end) {
		for(int i=start;i<=end;i++) {
			System.out.print(arr.get(i));
		}
	
	
	}
	
	

	
	
	
	
static void smallestSubArray(ArrayList<Integer> arr,int x) {
	
	int min=0;
	int max=0;
	int length;
		int min_length=arr.lastIndexOf(arr); int sum=0;
	int l=0; int i=0 ,j=0;
	while(i<arr.lastIndexOf(arr) && j<arr.lastIndexOf(arr)) {
		if(!(i==j))
		  sum+=arr.get(j);
		else {
		  sum+=arr.get(i); 
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

	
	
