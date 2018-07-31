package BasicsOfImplementation;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

      Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean dec=true;
        boolean ans=false;
        int flag=1;
		int prev=s.nextInt();
		int next;
		
		while(n-1>0) 
		{
			n--;
			 next=s.nextInt();
			
		

		 if(next<prev) {
			
			if(!dec) {
				ans= false;flag=0;break;
			}
		
		 }
		
		else if(prev<next) {
			
			ans= false;
           flag=0;
           break;
			
		}
		 
		else
			dec=false;
	
		prev=next;
	
	}	
	
	if(flag==1)
	  ans= true;
	System.out.print(ans);	
    
    }
      
	}

