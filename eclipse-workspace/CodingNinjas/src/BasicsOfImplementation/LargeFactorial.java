package BasicsOfImplementation;

public class LargeFactorial {

	public static void main(String[] args) {

	
		
	System.out.println(5|10);
		
		//factorial(100);
		
		

	}
	
	static int multiply(int [] arr ,int x,int count) {
		
		
		int carry=0;
		int product;
		int loop=count;
		
		for(int i=0;i<loop;i++)
		{
			product=arr[i]*x+carry;
			
			arr[i]=product%10;
			carry=product/10;
			
			
		}
		while(carry>0) {
			arr[loop++]=carry%10;
			carry/=10;
			count++;
		}
		
		return count;
		
		
	}
	
static void print(int [] input,int length) {
		

		for(int i=length-1;i>-1;i--) {
			
			System.out.print(input[i]);
		
		
		}
		
		
	}
	
	
	
	
	
	static void factorial(int n) {
		
		int [] arr=new int[500];		//array storing the factorial
		
		arr[0]=1;
		int count=1;
		
		for(int i=2;i<=n;i++) {
			
			count=multiply(arr, i, count);
		
		}
		
	
		print(arr,count);
	
	}

}
