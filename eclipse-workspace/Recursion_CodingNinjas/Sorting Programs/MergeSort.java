package BasicsOfImplementation;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1= {10,20,30,40,50};
		int [] arr2= {15 ,25,35,45,65};
		
		merge(arr1, arr2);
		
	}
	
	
static void print(int [] input) {
		
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i]+" ");
		
		}
			
	}
	44
	static void merge(int [] arr1,int [] arr2)
	{
		int [] result=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			
			result[k++]= arr1[i] <= arr2[j] ? arr1[i++] :arr2[j++];
			
		}
		
		while(i<arr1.length) {
			
			result[k++]=arr1[i++];
			
		}
		
		while(j<arr2.length) {
			
			result[k++]=arr2[j++];
			
		}
		
	
	print(result);
	
	}
	
	

}
