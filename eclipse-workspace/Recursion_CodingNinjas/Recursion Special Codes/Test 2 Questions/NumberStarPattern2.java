import java.util.Scanner;

public class NumberStarPattern2 {

	public static void main(String[] args) {
		
		
		/*
		 * 
 1234554321
 1234**4321
 123****321
 12******21
 1********1*/
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=0;int c=0;int flag=0;
		for(int i=1;i<=n;i++)
		{
			p=1;
			
			for(int j=1;j<=2*n;j++)
			{
				
				
				
				
				if(j>=n-c && j<=n+1+c &&i!=1)
				{
					System.out.print("*");
				}
				else
				{
				
					
					
					if(j<=n)
					System.out.print(p++);
					else
						System.out.print(--p);
				
				
				
				
				}
			
				
				
			}
			System.out.println();
			if(i>=2)
				c++;
		}
		
		
	
		
		
		
		
		
		
		

	}

}
