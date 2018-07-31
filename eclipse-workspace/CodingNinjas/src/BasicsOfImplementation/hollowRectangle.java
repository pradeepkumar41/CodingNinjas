package BasicsOfImplementation;

public class hollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern(11);
	}



static void pattern(int n) {

	int k=0;
	for(int i=1;i<=n;i++) {
		
		
		if(i<=n/2+1)
		k++;
		else
			k--;
		
		
		for(int j=1;j<=n;j++) {
			
			if(j<=n/2+2-k ||j>=n/2+k ) {
				System.out.print("*");
				
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		
		System.out.println();
	
	}

}

}
