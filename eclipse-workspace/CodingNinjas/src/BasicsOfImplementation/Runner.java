package BasicsOfImplementation;

import java.util.Scanner;
public class Runner {

	public static void main(String[] args) {
		// Write your code here
	
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
		
      pattern(n);
      
	}

static void pattern(int n){
  
  		int i=1,j=1;
  		int p;int c=0;
  while(i<=n){
    j=1;
    p=n;
    
    
    while(j<=n){
      
      if(j==n-c){
        System.out.print("*");
      	p--;  
      }
        else
        System.out.print(p--);
      j++;
    }
    System.out.println();
    c++;
    i++;    
  }
   
}

}
