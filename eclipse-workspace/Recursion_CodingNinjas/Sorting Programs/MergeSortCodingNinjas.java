
public class MergeSortCodingNinjas {

	
	static void mergeSort(int [] input){
		
		if(input.length==1)
		{return;
			
		}
		
		int [] leftPart=new int[input.length/2];
		int [] rightPart=new int[input.length-leftPart.length];
		
		for(int i=0;i<leftPart.length;i++) {
			leftPart[i]=input[i];
		}
		
		for(int i=0;i<rightPart.length;i++) {
			rightPart[i]=input[input.length/2+i];
			
		}
		
		
		
		
		
		
		
	
	}
	
	void merge(int [] arr1,int [] arr2,int [] result) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k++]=arr1[i++];
			}
			else {
				result[k++]=arr2[j++];
			}
			
		}
		
	}
	
		
		
		
		
		
		
		
	
	
	
	
	
	
}
