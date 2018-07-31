package BasicsOfImplementation;

public class PairSum{	

	public static void pairSum(int[] arr, int num){
		
      int a ,b,i,j;
      for( i=0;i<arr.length-1;i++){
        
        a=arr[i];
        
        for( j=i+1;j<=arr.length-1;j++){
          
          b=arr[j];
          
            if((a+b)==num){
            
             if(a>b)
              System.out.println(b+a);
             else
              System.out.println(a+b);
            
          }
          
        }
        
      }
      

	}
}