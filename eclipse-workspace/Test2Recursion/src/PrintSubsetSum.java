
public class PrintSubsetSum {


	static void printSubset(int input[])
	{
		int resultSoFar[]=new int[0];	
		printSubset1(input,resultSoFar,0);
	}

	static void printSubset1(int input[],int resultSoFar[],int index)
	{
		if(index==input.length)	//reached the end of the string
		{
			for(int i=0;i<resultSoFar.length;i++)
			{
				System.out.print(resultSoFar[i]+" ");
			}	
			System.out.println();
			return;

		}

		else
		{

			//element not added
			printSubset1(input,resultSoFar,index+1);

			int newResult[]=new int[resultSoFar.length+1];

			//copy the result so far in this and add the zeroth integer in this new array

			for(int i=0;i<resultSoFar.length;i++)
			{
				newResult[i]=resultSoFar[i];	
			}

			newResult[resultSoFar.length]=input[index];	//storing at the last index

			printSubset1(input,newResult,index+1);

		}
	}
	public static void main(String[] args) {

	int arr[]={1,2,3};
			printSubset(arr);


	}



}
