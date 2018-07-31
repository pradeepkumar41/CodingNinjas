package BasicsOfImplementation;



import java.util.Scanner;

public class TriangleofNumbersVersion2 {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int c=-1;
      int ns=n-1;
	  int lc_s,lc_n;
      int row_no=1;
      
      while(row_no<=n){
        //space printing
        lc_s=0;
        while(lc_s<=ns){
          System.out.print(" ");
          lc_s++;
        }
                
        //pattern printing
        c+=2;
        int k=row_no-1;
        lc_n=1;
        while(lc_n<=c){
          
          if(lc_n<=c/2+1){
            System.out.print(++k);
            
          }
          else{
            System.out.print(--k);
            
            
          }
          
          lc_n++;
          
        }
        
         ns--;
        row_no++;
       System.out.println();
        
        
        
      }
    
    }
}
