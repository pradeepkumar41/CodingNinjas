package BasicsOfImplementation;

import java.util.Scanner;
public class Solution1 {

  public static void main(String[] args) {

    /*  Read input as specified in the question.
         * Print output as specified in the question.
         */
    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
    
      pattern(n);
      
  }
  
  
  // 1 5 9   / 2 5 8 // 3 5 7  4 5 6
  
  
  static void pattern(int n){
    
    int i=1,j=1;
    while(i<=n){
      j=1;
      
      
      while(j<=2*n+1){
      
        if(j==n+1){
          System.out.print("*");
        }
        else if(j==i || j==2*n+1-(i-1) )
       System.out.print("*");
        else
          System.out.print("0");
        
        
        
        j++;
      }
      System.out.println();
      i++;
    }
    
    
  }


}
