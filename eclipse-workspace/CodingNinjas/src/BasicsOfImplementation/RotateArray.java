package BasicsOfImplementation;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,3,4,5,6};
		rotate(arr,3);
		
	}

static void print(int [] input) {

		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i]+" ");
		}
}
	
static void rotate(int [] arr,int d) {
	
	int temp;
	while(d>=1) {
		temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;	
		d--;
	}	
	print(arr);

}





}
