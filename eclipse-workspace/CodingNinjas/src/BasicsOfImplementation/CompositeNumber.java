package BasicsOfImplementation;

import java.util.Scanner;

public class CompositeNumber {

	
	
	static int [] primeChecker(int N) {
		
		int [] array=new int[N];
		
		int p=0;
		int k=2; int i; int flag=0;
		while(k<N)
		{
			i=2;flag=0;
			while(i<k)
			{
			  if(k%i==0)	
				flag=1;
			   i++;	
			 }
			
			if(flag==1)
			{	
				
				array[p++]=k;			
			}
			
		 k++;	
	
		}
		
		return array;
	
	}
	
	static void pairsum(int [] compositeNumber,int N) {
		
		int i=0,j=0;
		int a,b;
		int k=0;int count=0;
		while(compositeNumber[k++]!=0) {
			count++;
		}
		
		
		
		for(i=0;i<count-1;i++) {
			
			a=compositeNumber[i];
			
			for(j=i+1;j<count;j++) {
				
				b=compositeNumber[j];
				if(a+b==N)
					System.out.println(a+" "+b);
				
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int [] compositeNumber=primeChecker(n);
		
		
		
		pairsum(compositeNumber, n);
	
	}

}
