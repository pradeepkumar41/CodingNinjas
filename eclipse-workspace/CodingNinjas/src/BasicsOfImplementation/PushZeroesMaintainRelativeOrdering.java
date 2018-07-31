package BasicsOfImplementation;

public class PushZeroesMaintainRelativeOrdering {



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
		
		
		
		
		static void pushZeroesGood(int [] arr) {
			
			int k=0,i=0,c=0;
			while(k<arr.length && i<arr.length) {
				
				
				if(arr[k]==0) {
					i=c+1;
					if(arr[i]!=0) {
						
						swap(arr,k,i);
						
					}
					
					
					
					
				}
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	static void pushZeroes(int [] arr) {

	
			int q=lastNonZero(arr,0,arr.length-1);
			int l=0;
			for(int i=0;i<q;) {

				if(arr[i]==0) {
						
					for(int k=i+1;k<=q;k++) {
						arr[k-1]=arr[k];
					}
					arr[q]=0; q--;
				
				}
				
				if(arr[i]!=0)
					i++;


			}	//end of loop

			print(arr);
			
		} //end of pushzero function


	
	
	
	
	
}
