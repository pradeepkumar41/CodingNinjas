//1. subset,subsequence, permutation


public class PrintSubSet {
static void printSubSet(int[] input,int [] resultSoFar,int index) {
	
	
	if(index==input.length) {
		for(int i=0;i<resultSoFar.length;i++) {
			System.out.print(resultSoFar[i]);		
		}
		System.out.println();
		return;
	}
	
	printSubSet(input,resultSoFar,index+1);
	
	int [] newResultSoFar=new int[resultSoFar.length+1];
	for(int i=0;i<resultSoFar.length;i++ )
	{
		newResultSoFar[i]=resultSoFar[i];	
	}
	newResultSoFar[resultSoFar.length]=input[index];
	printSubSet(input,newResultSoFar,index+1);	
}
public static void main(String[] args) {
	
	int[] input= {1,2,3,4,5};
	int [] resultSoFar=new int[0];
	
	printSubSet(input, resultSoFar, 0);

}





}


