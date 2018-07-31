package BasicsOfImplementation;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		  
		int n;
		n=s.nextInt();
		int [] array=new int[n];
		

		for(int i=0;i<array.length;i++) {
			
			array[i]=s.nextInt();
			
		}
		
		
		//selectionSort(array);
		
		bubbleSort(array);
		
		
		
	}
	
	static int max(int [] input,int n) {
		
			
		int maximum=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<=n;i++) {
			if(maximum<input[i])
			{	maximum=input[i];
				index=i;
		    }
		
	  }
		return index;
	
	}
	
	static void swap(int [] arr,int index1,int index2) {	
		int temp;
		temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	
	static void print(int [] input) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		} }
	
	static void bubbleSort(int [] input) {
		
		for(int i=0;i<input.length;i++) {
			
			
			for(int j=0;j<input.length-1-i;j++) {
				
				if(input[j]>input[j+1]) {
					
					swap(input,j,j+1);
					
				}
				
			}
			
		}
		
	print(input);
	
	}
	
	static void selectionSort(int [] input) {
		
			
		int n=input.length;
		
		for(int i=0;i<input.length;i++) {
			
			int index=max(input, n-1);
			swap(input, index, n-1);
			n--;
			
		}
	
	
		print(input);
		
	}
	
}
