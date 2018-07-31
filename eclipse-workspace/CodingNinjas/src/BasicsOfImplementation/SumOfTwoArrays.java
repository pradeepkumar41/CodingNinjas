package BasicsOfImplementation;

public class SumOfTwoArrays{	

	
	public static void main(String[] args) {
		
	int [] arr1= {8,5,2};
	int [] arr2= {1,3};
		sumOfTwoArrays(arr1, arr2);
		
		
	}
	
	static void print(int [] input) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}
	
	
  
  public static void sumOfTwoArrays(int[] arr1, int[] arr2){
	
	  int p=arr1.length;
	  int q=arr2.length;
	  int min,max;
	  if(p>q) {
		  max=p;
		  min=q;
	  }
	  else if(p<q) {
		  max=q;
		  min=p;
	  }
	  else {
		  min=p;
		  max=p;
	  }
	  int [] result =new int[max+1];
	  
	  int point1=p-1;
	  int point2=q-1;
	  int pointResult=result.length-1;
	  int sum=0,carry=0;
	  
	  for(int i=0;i<min;i++) {
		  sum=arr1[point1--]+arr2[point2--]+carry;
		  result[pointResult--]=sum%10;
		  carry=sum/10;
		  
	  }
	  
	  while(point1>=0) {
		  sum=arr1[point1--]+carry;
		  result[pointResult--]=sum%10;
		  carry=sum/10;
		  
	  }
	  
	  while(point2>=0) {
		  sum=arr2[point2--]+carry;
		  result[pointResult--]=sum%10;
		  carry=sum/10;
		  
	  }
	  result[pointResult]=carry;
	  
	  print(result);
	  
	}
}