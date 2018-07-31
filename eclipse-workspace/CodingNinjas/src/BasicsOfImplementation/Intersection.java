package BasicsOfImplementation;

public class Intersection{
	
static int  linearSearch(int [] input,int key){
        
      for(int i=0;i<input.length;i++){
              
        if(key==input[i])
          return 1;
      } 
        return 0;
    
    }
  
  public static void intersection(int[] arr1, int[] arr2){
		
    int n1=arr1.length;
    int n2=arr2.length;
    int [] min;
    int [] max;
    int index=0;
    if(n1>n2)
    {
    	max=arr1;
    	min=arr2;
    
    	
    }
    else
    {
    	max=arr2;
    	min=arr1;
    	
    }
    
    
		 int k=0;
    	for(int i=0;i<min.length;i++ ){
          
          
          k=linearSearch(max,min[i]);
          if(k==1)
            System.out.println(min[i]);
          
    
  }
  
  
  }
  
  
}