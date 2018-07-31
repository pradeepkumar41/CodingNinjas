package BasicsOfImplementation;

public class NumberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stutt
		
		pattern(6);

	}

	
	
	public static void pattern(int n) {
		
		int flag,i,j,a,b,p;
		
		 a=n;b=n+1;
		for( i=1;i<=n;i++) {
			
			flag=0;
			p=1;
			for(j=1;j<=2*n;j++) {
				if((j>=a && j<=b )&& i!=1) {
					System.out.print("*");flag=1;
				}
				else
				{
					if(flag==0 && j<=n)
						System.out.print(p++);
					else
						System.out.print(--p);
					
				}
				
				
			}
			if(i!=1) {

				a=a-1;
				b=b+1;
			}
			
			System.out.println();
		}
		
	}
	
}







