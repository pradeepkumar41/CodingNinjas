package BasicsOfImplementation;

import java.util.Scanner;

public class MergeFuntion {

	
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int s1=0,s2=0;
		s1=s.nextInt();
		
		int [] input1=new int[s1];
		
		for(int i=0;i<input1.length;i++) {
			input1[i]=s.nextInt();
		}
		
		s2=s.nextInt();
		int [] input2=new int[s2];
		
		for(int i=0;i<input2.length;i++) {
			input2[i]=s.nextInt();
		}
		
		
		merge(input1, input2);
		
		
		
		
		
	}
	
	
	
	public static void merge(int arr1[], int arr2[]){
		
	
    int size1=arr1.length; int size2=arr2.length;
	int i=0,j=0,k=0,index=0;
      
    int [] ans=new int[size1+size2];
      
	int []array=null ;
	while(true) {
		
      if(i<size1 && j<size2) {
			
			if(arr1[i]>arr2[j]) {
				ans[k++]=arr2[j++];
				
			}
        
        	else if(arr1[i]<=arr2[j]){
              ans[k++]=arr1[i++];
            }
        
			else {
				
				ans[k++]=arr1[i++];
			}
			
		}
		
		else {
			
			
			if(i==size1) {
				array=arr2;
				index=j; break;
			}
			else if(j==size2) {
				array=arr1;
				index=i; break;
			}
			
          	else
            {
              break;
            }
          
				
		}
		
		
	}//out of while
	  
	for(int z=index;z<array.length;z++)
	{
		ans[k++]=array[z];
	}
		
	
	
	
	
	
	for(int p=0;p<ans.length;p++) {
		System.out.print(ans[p]+" ");
	
    
    }
    
    
      
    //return ans;  
      
	  
}//end of function

}//end of class
	

