
public class ReturnSubsetSumK {

static int[][] subSetSumToK(int[] input, int index, int k){
		
		if(input.length==index){
			if(k==0){
				int[][] ans = new int[1][0];
				return ans;
			}else{
				int[][] ans = new int[][0];
				return ans;
			}
		}
		int[][] smallAnsNotIncluded = subSetSumToK(input,index+1, k);


		int[][] smallAnsIncluded  = subSetSumToK(input,index+1, k -input[index]);

		int[][] result = new int[smallAnsIncluded.length+smallAnsNotIncluded.length][];

		int p=0;
		for(int i=0;i<smallAnsNotIncluded.length;i++){

			result[p++]=smallAnsNotIncluded[i];

		}


		for(int i=0;i<smallAnsIncluded.length;i++){

			result[p++]=smallAnsIncluded[i];
			
		}
		
		return result;
		
		///filling task
	}
	
	
	
public static void main(String[] args) {
	
	
	int []input= {2,4,5,6,7,8,9,10};
	int [][]result=subSetSumToK(input,0,15);
	
	for(int i=0;i<result.length;i++) {
		
		for(int j=0;j<result[i].length;j++)
		{	
			System.out.print(result[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
	
	
	
	
}
