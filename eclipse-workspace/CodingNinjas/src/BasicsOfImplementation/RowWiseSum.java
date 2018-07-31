package BasicsOfImplementation;

import java.util.Scanner;

public class RowWiseSum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int row,col;	int rowsum=0;
		row=s.nextInt();
		col=s.nextInt();
		int[][] arr=new int[row][col];
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[0].length;j++)
			{	arr[i][j]=s.nextInt();
				rowsum+=arr[i][j];
			}
			System.out.print(rowsum+" ");
			rowsum=0;
		}
		
	
		
		
        for(int i=0;i<arr.length;i++) 
        {	
			for(int j=0;j<arr[0].length;j++)
				rowsum+=arr[i][j];	
			System.out.print(rowsum+" ");
			rowsum=0;
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
