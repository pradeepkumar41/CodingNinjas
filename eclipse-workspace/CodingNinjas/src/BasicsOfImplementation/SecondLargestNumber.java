package BasicsOfImplementation;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] arr= {1,5,5,5,5,5};
		secondLargest(arr);
	
	
	}

	
static int maxElement(int [] arr) {
	
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
		
	}
	return max;
	
}
	
static void secondLargest(int [] arr) {

	  int max1=maxElement(arr);
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==max1) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	int max2=maxElement(arr);
	System.out.println(max2);
	
	
 }


}
