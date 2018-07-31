
public class SubsetSumToKPrint {

	
	
	static void subSetSumToK(int[] input,int index, int[] resultSoFar, int k){
		if(index==input.length){
			int sum = 0;
			for(int i=0;i<resultSoFar.length;i++){
				sum = sum+resultSoFar[i];
			}
			if(sum ==k){
				for(int i =0;i<resultSoFar.length;i++){
					System.out.print(resultSoFar[i]);
				}
				System.out.println();
			}
			return;
		}
		
		//not including the current pointer
		subSetSumToK(input,index+1, resultSoFar,k);

		int[] newResultSoFar = new int[resultSoFar.length+1];
		int i =0;
		for( ;i<resultSoFar.length;i++){
			newResultSoFar[i] = resultSoFar[i];
		}
		newResultSoFar[i] = input[index];


			//after including
		subSetSumToK(input,index+1, newResultSoFar,k);
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
