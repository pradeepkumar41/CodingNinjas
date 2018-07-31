package BasicsOfImplementation;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {3,6,8,1,2,5};
		insertionSort(arr);
	}

	
static void print(int [] input) {
		
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
			
	}
		
static void insertionSort(int [] arr) {
		
		// 5 4  6 2 9 8 
		
	for(int i=1;i<arr.length;i++) {
		
		for(int j=i;j>=1;j--) {
			if(arr[j]<arr[i])
			{
				
				
				
			}
			
			
		}
		
		
		
	}
		
		
		
		
	print(arr);	
		
		
	}
	
	
}
