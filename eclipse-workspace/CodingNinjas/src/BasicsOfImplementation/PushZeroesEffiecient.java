package BasicsOfImplementation;

public class PushZeroesEffiecient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2,6,0,9,8,7,0,1,2};
		pushZeroesGood(arr);
		
	}

	static void print(int [] input) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}

	
static void swap(int [] arr,int index1,int index2) {
		
		int temp;
		temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
}

static void pushZeroesGood(int [] arr) {
	
	int k=0,i=0,c=1;
	while(k<arr.length && i<arr.length) {
		if(arr[k]==0) {
			i=c;
			if(i<arr.length) {

				if(arr[i]!=0 ) {
					swap(arr,k,i);				
				}
				else {
					c++;
				}
			}
		}
		else {
			k++; c=k;
		}
	}

	print(arr);
	

}





	
	
}
