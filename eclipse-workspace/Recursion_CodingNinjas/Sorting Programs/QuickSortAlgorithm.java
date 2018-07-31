
public class QuickSortAlgorithm {

	static void quickSort(int [] input,int p,int r)
	{
		if(p<r)
		{
			int q=partition(input,p,r);
			quickSort(input,p,q-1);
			quickSort(input,q+1,r);	
		}	
	}

	static int partition(int [] input,int p,int r) {

		int i=p-1;
		int k=0;
		int pivot=input[r];	//pivot : last element
//algorithm from CLRS book 
		
		for( k=p;k<=r-1;k++) {
			if(input[k]<=pivot) {
				i++;	//increment i
				swap(input,i,k);	//swapping
			}	
		}
		swap(input,i+1,r);		//r is the position of pivot	i+1 is the right position for pivot element	
		return i+1;	//index where the pivot element is placed

	}



	static void swap(int [] arr,int index1,int index2) {	
		int temp;
		temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}


	static void print(int [] input) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		} }

	public static void main(String[] args) {

		int [] arr= {5,4,3,20,1};
		quickSort(arr, 0, arr.length-1);
		print(arr);
			

	}




}