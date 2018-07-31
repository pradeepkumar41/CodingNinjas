package BasicsOfImplementation;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {10,20,30,40,50,60,70,80};
		int key=55;
		
		int index=binarySearch(arr, key, 0, arr.length-1);
	
		System.out.println(index);
	
	
	
	}
	
	
	static int binarySearch(int [] arr,int key,int left,int right) {
		
		while(left<right) {
			
			int mid=(left+right)/2;
			
			if(arr[mid]==key) {
				
				return mid;
				
			}
			
			else if(key>arr[mid-1] && key<=arr[mid]) {
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
		
		System.out.println("Nothing found in the array\n");
		return 99;
				
			
		 	
		
		}
		
	}
	
	
	


