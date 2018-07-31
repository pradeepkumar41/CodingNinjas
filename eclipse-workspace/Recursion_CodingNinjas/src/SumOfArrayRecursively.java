public class SumOfArrayRecursively {

	public static int sum(int input[]) {
		
     if(input.length==0){
       return 0;
     }
      else
      {
        int temp[] =new int[input.length-1];
        
        for(int i=0;i<input.length-1;i++)
        {
        	temp[i]=input[i+1];	
        }
        return input[0]+sum(temp);
          
      }
    
	}
	
	public static void main(String[] args) {
		
		int arr[]= {11,11,11,11,11,11,1,11,11,11,11,11,1};
		System.out.print(sum(arr));	
	}
	
}