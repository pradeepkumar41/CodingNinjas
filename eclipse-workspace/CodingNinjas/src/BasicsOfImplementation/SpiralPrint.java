package BasicsOfImplementation;

public class SpiralPrint {

	public static void main(String[] args) {
		
		
		int arr[][]= {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		printSpiral(arr);
		
		
		
	}


	static void printSpiral(int arr[][])
	{
		int rowStart=0;
		int rowEnd=arr.length-1;
		int colStart=0;
		int colEnd=arr[0].length-1;
		
		//Putting Initial values: 
		
		int no_of_elements=arr.length*arr[0].length;
		int count=0;	//count the numbers it has printed
		//every spiral has four parts
		// row ,col,row,col



		//printing the spiral in four parts //every part of the spiral
		while(count<no_of_elements) 
		{
			for(int p=colStart;p<=colEnd;p++)		//loop to print first row
			{
				System.out.print(arr[rowStart][p]+" ");	count++;
			}

			
			rowStart++;	//condition affected by the printing the first row

			for(int p=rowStart;p<=rowEnd;p++)		//loop to print last column
			{
				System.out.print(arr[p][colEnd]+" ");	count++;
			}

			colEnd--;

			for(int p=colEnd;p>=colStart;p--)		//loop to print last row
			{

				System.out.print(arr[rowEnd][p]+" ");	count++;

			}

			rowEnd--;
		
			for(int p=rowEnd;p>=rowStart;p--)		//loop to print first column
			{
				System.out.print(arr[p][colStart]+" ");	count++;

			}
			
			colStart++;
			
			
			
			
			
		}



	}

}
