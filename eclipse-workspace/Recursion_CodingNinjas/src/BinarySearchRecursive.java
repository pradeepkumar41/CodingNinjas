
public class BinarySearchRecursive {
		// element - number to be searched
	public static void binarySearch(int input[], int element) {
			
		System.out.println(binarySearch1(input, 0, input.length-1, element));
	}
	
	static int binarySearch1(int [] input,int l,int r,int element )
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			if(input[mid]==element)
				return mid;
			else if(input[mid]>element)
				return binarySearch1(input, l, mid-1, element);
			else
				return binarySearch1(input,mid+1,r,element);		
		}
		return -1;
		
	}

public static void main(String[] args) {
	
	int [] arr= {1,2,3,4,5,6,7,8,9};
	binarySearch(arr, 2);
	
}

}

	
	

