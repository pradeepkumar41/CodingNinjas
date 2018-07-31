package BasicsOfImplementation;

public class StarFIeld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		pattern(20);
		
	}

	
	static void pattern(int n) {
		int c=0;
		
		for(int i=0;i<n;i++) {
			
//			System.out.print("         ");
			
			if(i>n/2) {
				c++;
			}
			
			for(int j=0;j<n;j++) {
				
				if(i<n/2) {
					if(  j>=i+1 &&j<n-1-i) {
						System.out.print(" ");	
					}
					else
					{
						if( true)
						 System.out.print("*");
						else
						{
							System.out.print(" ");
						}
					
					}
					
				
				}
				
				else
				{    
					
					if(  j>=n/2-1-c && j<n/2+1+c ) {
						System.out.print(" ");	
					}
					else
						System.out.print("*");
					
					
					
					
					
					
				}
				
			
			
			
			}
		
			
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
