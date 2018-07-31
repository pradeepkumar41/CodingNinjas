package BasicsOfImplementation;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,0,0,2,1,2,1,0,0,0};
 		sort012(arr);
	
	
	}

	
	
	static void print(int [] input) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}

	
	
	
 static void sort012(int [] arr) {
	
	int count0=0,count1=0,count2=0;
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]==0)
			count0++;
		else if(arr[i]==1)
			count1++;
		else
			count2++;		
	}
	
	for(int k=0;k<arr.length;k++) {
		
		if(k<count0) {
			arr[k]=0;
		}
		else if(k>=count0 && k<count0+count1) {
			arr[k]=1;
		}
		
		else 
			arr[k]=2;
		
	}
	
	print(arr);
	
}








}
