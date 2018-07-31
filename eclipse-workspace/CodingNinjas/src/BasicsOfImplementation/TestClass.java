package BasicsOfImplementation;


import java.util.*;
import java.util.Scanner;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		    
		}
		Arrays.sort(arr);
		
		
		
		
		int q=s.nextInt();
		int index;
		while(q--!=0){
		    
			int key=s.nextInt();
		
		    if(key==arr[0])
		    	System.out.println("0");
			
			
			else if(key>arr[n-1])
		    {
		    	
		    	
		    	System.out.println(n);
		    
		    }
		    else 
		     {
		       index=binarySearch(arr, key, 0, arr.length-1);
		       System.out.println(index);
		     }
		    
		    
		    
		}
		
	}
	
	
	static int binarySearch(int [] arr,int key,int left,int right) {
		
		int result=0;int flag=0;
		
		while(left<right) {
			
			int mid=(left+right)/2;
			
			
			if(arr[mid]==key) {
				
				result=mid; right=mid-1;
			
				
			}
			
			else if(mid>0 && key>arr[mid-1] && key<=arr[mid]) {
				return mid;
			}
			
			else if(key>arr[mid] && key<=arr[mid+1]) {
				return mid+1;
			}
			
			else if(key>arr[mid]) {
			   left=mid+1;
				
			}
			else if(key<arr[mid]) {
				right=mid-1;
			}
			
			else {
				
				return -1;
			}
				
			}
		
		
		return result;
				
			
		 	
		
		}
		
	}
	
	
	

	
