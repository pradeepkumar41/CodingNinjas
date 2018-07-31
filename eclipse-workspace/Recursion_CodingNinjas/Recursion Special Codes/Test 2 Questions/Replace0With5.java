import java.util.Scanner;

public class Replace0With5 {

	
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int count=0;
		int temp=n;
		while(temp>0)
		{
			count++;
			temp/=10;
			
		}
		
		
		int []arr=new int[count];
		int i=0;
		while(n>0)
		{
			if(n%10==0)
				arr[i++]=5;
			else
				arr[i++]=n%10;
			n/=10;
			
		}
		
		for(int j=arr.length-1;j>=0;j--)
			System.out.print(arr[j]);
		
	}
	
	
	
	
	
}
