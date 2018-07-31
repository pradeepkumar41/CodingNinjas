package BasicsOfImplementation;

public class PatternX {

	
public static void main(String[] args) {
	
	numberX(5);
	
	
	
}	


static void numberX(int n) {
	
	int numberOfRows=2*n-1;	//formula 
	
	int k=0;
	for(int i=1;i<=numberOfRows;i++) {
		
		if(i<=n)
			k++;
		else
			k--;
		
		for(int j=1;j<=numberOfRows;j++) {
			
			if((i==j) || (i+j)==numberOfRows+1)
			{
				System.out.print(k);
			}
			else
				System.out.print(" ");
		}
		
	
	System.out.println();
	}
	
}


}