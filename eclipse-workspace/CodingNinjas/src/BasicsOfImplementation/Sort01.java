package BasicsOfImplementation;

public class Sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		int [] arr = {1,0,1,0,1,0,0,0,1};
		print(arr);
		System.out.println();
		sort01(arr);
		
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
	
	static void sort01(int [] arr) {
		int i=0;
		int nextZero =0;
		while(i<arr.length) {
			if(arr[i]==0) {
				swap(arr,i,nextZero);
				print(arr);System.out.println();
				nextZero++;
			}
			i++;	
		}
	}
	
	static void sort012(int [] arr) {
		
	}
	
	
	
	

}
