package BasicsOfImplementation;

public class BlastArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2,0,-1};
		int count=blastArray(arr);
		System.out.println();
		System.out.println(count);
	
	}

	static void print(int [] input) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}
	
	static int min(int [] arr) {

		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min && arr[i]!=0)
				min=arr[i];

		}

		return min;
	}
	
	static int blastArray(int [] arr ) {

		int count=0,min_value;
		while(true) {

			min_value=min(arr);
			if(min_value==Integer.MAX_VALUE)
				break;
			
			count++;
			
			if(min_value>0)
			{
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=0) {

						if(arr[i]>0)
							arr[i]-=min_value;
						else
							arr[i]+=min_value;
					}
				}
			}	
			else if(min_value<0){
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=0) {		
						if(arr[i]>0)
							arr[i]+=min_value;
						else
							arr[i]+=(-1*min_value);			
					}
				}
			}
			

		
		
		
		}
		print(arr);
		return count;




	}





}
