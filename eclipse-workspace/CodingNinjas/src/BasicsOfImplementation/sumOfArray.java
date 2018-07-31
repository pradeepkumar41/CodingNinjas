package BasicsOfImplementation;

public class sumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1= {9,9,9,9,9};
		int [] arr2= {9,9,9,9};
		
		sumOfArray(arr1, arr2);
		
	}
	
static void print(int [] input) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]);
		}			
	}

static void sumOfArray(int[] input1, int [] input2) {
	
	
	
	int length=input1.length>=input2.length?input1.length:input2.length ;
	
	int [] result=new int [length+1];
	int i=input1.length-1,j=input2.length-1,k=result.length-1;
	
	int sum=0,carry=0;
	while(i>=0 && j>=0) {
		
		sum=input1[i--]+input2[j--]+carry;
		result[k--]=sum%10;
		carry=sum/10;
		
		
	}
	
	
	while(i>=0) {
	
		sum=input1[i--]+carry;
		result[k--]=sum%10;
		carry=sum/10;
		
		
	}
	
	
	while(j>=0) {

		sum=input2[j--]+carry;
		result[k--]=sum%10;
		carry=sum/10;
	}
	result[k--]=carry;
	
	print(result);
	
}



}
