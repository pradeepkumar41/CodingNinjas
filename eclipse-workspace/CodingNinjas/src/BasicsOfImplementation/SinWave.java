package BasicsOfImplementation;

public class SinWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				
		};
		
		wavePrint(arr);
	}

	// input - input 2D array
	public static void wavePrint(int input[][]){
		
		int startrow=0,j=0;int n;
		for(int i=0;i<input[0].length;i++)
		{
			if(i%2==0) 
			{
				startrow=0;					//condition for even rows
			}
			else
				startrow=input.length-1;	//condition for odd rows
			
			j=startrow;						//initilising the j 	
			n=input.length;					//loop will run number of row times
			while(n>0) {
				if(i%2==0)								//printing top to bottom  
				{
					System.out.print(input[j++][i]+" ");
				}
				else									//printing bottom to top
					System.out.print(input[j--][i]+" ");
				
				n--;
			}
			
		}
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		

	}

	


	
}
