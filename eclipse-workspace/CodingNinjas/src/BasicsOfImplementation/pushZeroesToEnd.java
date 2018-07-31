package BasicsOfImplementation;

import java.util.Arrays;

public class pushZeroesToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2 ,0 ,4 ,1 ,3 ,0 ,28};
		pushZeroes(arr);
		
		
		
		
		
		
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


		}


	}





	static int lastNonZero(int [] arr,int l,int r) {

		int index=r;
		int q=-1;
		while(index>=l) {
			if(arr[index]!=0) {
				q=index;
				break;
			}
			else
				index--;

		}

		return q;

	}

static void pushZeroes(int [] arr) {

		Arrays.sort(arr);
		int q=lastNonZero(arr,0,arr.length-1);

		for(int i=0;i<q;i++) {

			if(arr[i]==0) {
				if(arr[q]!=0) 
				{  swap(arr, i, q);
				q--;
				}
				else {
					int index=lastNonZero(arr, i, q);
					if(index==-1) {
						break;
					}
					else {
						swap(arr, i, index);
					}	
				}
			}


		}	//end of loop

		print(arr);
		
	} //end of pushzero function


}	//end of class



